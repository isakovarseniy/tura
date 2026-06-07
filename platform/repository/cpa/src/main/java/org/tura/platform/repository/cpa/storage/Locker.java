/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.repository.cpa.storage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RepoKeyPath;

public class Locker {

	public static final ThreadLocal<AtomicReference<Map<String, LockData>>> lockKeeper = ThreadLocal
			.withInitial(AtomicReference::new);

	public static final ThreadLocal<AtomicReference<ReferenceQueue<? super ObjectControl>>> reaped = ThreadLocal
			.withInitial(AtomicReference::new);

	public static final ThreadLocal<AtomicReference<Map<Reference<ObjectControl>, RepoKeyPath>>> lockMap = ThreadLocal
			.withInitial(AtomicReference::new);

	public static final ThreadLocal<AtomicReference<Map<String, String>>> internalCpaIdMapping = ThreadLocal
			.withInitial(AtomicReference::new);

	public static final ThreadLocal<AtomicReference<Map<String, List<String>>>> sharedLockers = ThreadLocal
			.withInitial(AtomicReference::new);

	public static final ThreadLocal<AtomicReference<List<String>>> externalLockers = ThreadLocal
			.withInitial(AtomicReference::new);

	public static final ThreadLocal<AtomicReference<String>> sesssionId = ThreadLocal.withInitial(AtomicReference::new);

	public static void setSessionId(String id) {
		sesssionId.get().set(id);
	}

	public static String getSessionId() {
		return sesssionId.get().get();
	}

	public static Map<String, String> getInternalCpaIdMapping() {
		Map<String, String> m = internalCpaIdMapping.get().get();
		if (m == null) {
			m = new HashMap<>();
			internalCpaIdMapping.get().set(m);
		}
		return m;
	}

	public static List<String> getExternalLock() {
		List<String> m = externalLockers.get().get();
		if (m == null) {
			m = new ArrayList<String>();
			externalLockers.get().set(m);
		}
		return m;
	}
	
	public static Map<String, LockData> getLockKeeper() {
		Map<String, LockData> m = lockKeeper.get().get();
		if (m == null) {
			m = new HashMap<>();
			lockKeeper.get().set(m);
		}

		return m;
	}

	public static ReferenceQueue<? super ObjectControl> getReaped() {
		ReferenceQueue<? super ObjectControl> m = reaped.get().get();
		if (m == null) {
			m = new ReferenceQueue<ObjectControl>();
			reaped.get().set(m);
		}
		return m;
	}

	public static Map<Reference<ObjectControl>, RepoKeyPath> getLockMap() {
		Map<Reference<ObjectControl>, RepoKeyPath> m = lockMap.get().get();
		if (m == null) {
			m = new HashMap<>();
			lockMap.get().set(m);
		}
		return m;
	}

	public static void restoreLock(ObjectControl oc, RepoKeyPath cpaPath) throws Exception {
		if (!PlatformConfig.READ_WRITE_MODE) {
			return;
		}
		Map<Reference<ObjectControl>, RepoKeyPath> _lockMap = getLockMap();
		ReferenceQueue<? super ObjectControl> _reaped = getReaped();

		Reference<ObjectControl> ref = new WeakReference<ObjectControl>(oc, _reaped);
		_lockMap.put(ref, cpaPath);

		lock(cpaPath);

	}

	public static void lock(ObjectControl oc) throws Exception {
		restoreLock(oc, oc.getCpaPath());
	}

	@SuppressWarnings("unchecked")
	public static void unlockQueue() throws Exception {
		Map<Reference<ObjectControl>, RepoKeyPath> _lockMap = getLockMap();
		ReferenceQueue<? super ObjectControl> _reaped = getReaped();
		Reference<ObjectControl> rf = (Reference<ObjectControl>) _reaped.poll();
		while (rf != null) {
			RepoKeyPath path = _lockMap.get(rf);
			_lockMap.remove(rf);
			unlock(path);
			rf = (Reference<ObjectControl>) _reaped.poll();
		}
	}

	private static void lock(RepoKeyPath path) {
		Map<String, LockData> _lockKeeper = getLockKeeper();
		String cpaid = path.getPath().get(0).getKey().iterator().next().getValue();
		LockData lock = _lockKeeper.get(cpaid);
		if (lock == null) {
			lock = new LockData(cpaid);
			_lockKeeper.put(cpaid, lock);
		}
		lock.increment();
	}

	private static void unlock(RepoKeyPath path) {
		Map<String, LockData> _lockKeeper = getLockKeeper();

		String cpaid = path.getPath().get(0).getKey().iterator().next().getValue();
		LockData lock = _lockKeeper.get(cpaid);
		if (lock == null) {
			String maserCpaId = getInternalCpaIdMapping().get(cpaid);
			if (maserCpaId == null) {
				throw new RuntimeException("Object is not locked");
			}
			lock = _lockKeeper.get(maserCpaId);
			if (lock == null) {
				throw new RuntimeException("Object is not locked");
			}
		}
		lock.decrement();
		if (lock.getLock() == 0) {
			_lockKeeper.remove(cpaid);
		}
	}

}
