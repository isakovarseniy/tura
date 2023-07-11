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

package org.tura.platform.repository.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;

import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.data.CloneableCommand;
import org.tura.platform.repository.data.CommandStackData;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class CommandStack implements Serializable {

	private static final long serialVersionUID = 4088238807395031890L;
	private Stack<SavePoint> savePoints;
	private String id = UUID.randomUUID().toString();
	private Map<String, ProxyCommandStackEventListener> listeners = new HashMap<>();

	public void addProxyCommandStackEventListener(String id, ProxyCommandStackEventListener listener) {
		if (!listeners.containsKey(id)) {
			listeners.put(id, listener);
		}
	}

	public void removeProxyCommandStackEventListener(String id) {
		listeners.remove(id);
	}

	public CommandStack() {
	}

	public boolean isSavePoint() {
		if (savePoints.size() == 1) {
			return false;
		} else {
			return true;
		}
	}

	private CommandStackData getCommandStackData() {
		if (this.savePoints == null || this.savePoints.peek().getData().get(id) == null) {
			initSavePoint();
		}
		return (CommandStackData) this.savePoints.peek().getData().get(id);
	}

	public void addCommand(Object cmd) throws Exception {
		getCommandStackData().getTransaction().add(cmd);
	}

	public void addCommands(List<Object> cmd) throws Exception {
		getCommandStackData().getTransaction().addAll(cmd);
	}

	public void rallbackCommand() throws Exception {
		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.beforeRallback();
		}

		initSavePoint();

		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.afterRallback();
		}

	}

	public synchronized void rallbackSavePoint() throws Exception {

		if (savePoints.size() == 1) {
			throw new TuraException("No savepoint");
		}

		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.beforeRallbackSavePoint();
		}

		savePoints.pop();

		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.afterRallbackSavePoint();
		}
	}

	public synchronized void commit() throws Exception {
		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.beforeCommit();
		}

		commitSavePoint();

		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.afterCommit();
		}
	}

	public synchronized void clear() throws TuraException {
		initSavePoint();
	}

	private void initSavePoint() {
		savePoints = new Stack<SavePoint>();
		SavePoint sp = new SavePoint();
		sp.getData().put(id, new CommandStackData());
		savePoints.push(sp);
	}

	private void commitSavePoint() {
		SavePoint sp = savePoints.peek();
		savePoints = new Stack<SavePoint>();
		sp.getData().put(id, new CommandStackData());
		savePoints.push(sp);
	}

	public List<Object> getListOfCommand() {
			List<Object> array = new ArrayList<>();
			for (Object obj : getCommandStackData().getTransaction()) {
				array.add(((CloneableCommand) obj).cloneCmd());
			}
			return array;
	}

	public Object getData(String id) {
		if (this.savePoints == null) {
			initSavePoint();
		}
		return this.savePoints.peek().getData().get(id);
	}

	public void addData(String id, Object obj) {
		if (this.savePoints == null) {
			initSavePoint();
		}
		this.savePoints.peek().getData().put(id, obj);
	}

	public void removeData(String id) {
		if (this.savePoints == null) {
			initSavePoint();
		}
		this.savePoints.peek().getData().remove(id);
	}

	public synchronized void savePoint() throws TuraException {
		if (this.savePoints == null) {
			initSavePoint();
		}

		SavePoint sp = savePoints.peek();
		SavePoint newSp = new SavePoint(sp);
		savePoints.push(newSp);
	}

	public String getId() {
		return id;
	}

	public class SavePoint implements Serializable {

		private static final long serialVersionUID = -1418145643685114319L;
		private HashMap<String, Object> data = new HashMap<>();

		SavePoint() {

		}

		SavePoint(SavePoint sp) throws TuraException {
			try {
				for (String key : sp.getData().keySet()) {
					Object obj = sp.getData().get(key);
					Object nObj = Reflection.callTyped(obj, "factory", Object.class, obj);
					data.put(key, nObj);
				}
			} catch (Exception e) {
				throw new TuraException(e);
			}
		}

		public HashMap<String, Object> getData() {
			return data;
		}

	}

}
