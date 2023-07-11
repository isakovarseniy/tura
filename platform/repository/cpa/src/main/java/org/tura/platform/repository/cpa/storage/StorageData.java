/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageData implements Serializable {

	private static final long serialVersionUID = 6108715941421960154L;
	private ObjectDataBase db = new ObjectDataBase();
	private Map<ObjectRef, Map<RelationControl, List<Ref>>> connactions = new HashMap<>();
	private Map<Class<?>, Long> currentTimeStemp = new HashMap<>();
	private long session;
	private TypeInheritance typeInheritance;

	public static Object factory(Object obj) {
		if (obj == null)
			return new StorageData();
		if (obj instanceof StorageData) {
			try {
				return new StorageData((StorageData) obj);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}

	public StorageData() {

	}

	public StorageData(TypeInheritance  typeInheritance) throws Exception {
		this.typeInheritance =  typeInheritance;
		this.db = new ObjectDataBase(typeInheritance);
	}
	
	
	public StorageData(StorageData s) throws Exception {
		this.typeInheritance = s.typeInheritance;
		
		this.currentTimeStemp.putAll(s.currentTimeStemp);
		this.db = new ObjectDataBase(s.db);

		for (ObjectRef cpaId : s.connactions.keySet()) {
			Map<RelationControl, List<Ref>> relations = s.connactions.get(cpaId);
			Map<RelationControl, List<Ref>> conn = new HashMap<>();
			ObjectRef nCpaid = new ObjectRef(cpaId);
			this.connactions.put(nCpaid, conn);
			for (RelationControl control : relations.keySet()) {
				RelationControl newControl = new RelationControl(control);
				List<Ref> newListRef = new ArrayList<>();
				conn.put(newControl, newListRef);
				for (Ref r : relations.get(control)) {
					Ref newRef = new Ref(r);
					newListRef.add(newRef);
				}
			}
		}

	}

	
	public long getSession() {
		return session;
	}

	public void setSession(long session) {
		this.session = session;
	}
	
	public ObjectDataBase getDb() {
		return db;
	}

	public long getCurrentTimeStemp(Class<?> clazz) {
		Long currentTime = currentTimeStemp.get(clazz);
		if (currentTime == null) {
			currentTimeStemp.put(clazz, 0L);
			return 0L;
		}
		return currentTime;
	}

	public void setCurrentTymeStemp(long newTime, Class<?> clazz) {
		currentTimeStemp.put(clazz, newTime);
	}

	public Map<ObjectRef, Map<RelationControl, List<Ref>>> getConnections() {
		return this.connactions;
	}
}
