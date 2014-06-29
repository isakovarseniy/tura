/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.transaction.TransactionManager;

import org.apache.commons.collections.map.MultiKeyMap;
import org.tura.platform.datacontrol.command.Command;

public class CommandStack {

	private TransactionManager trx;

	private ArrayList<Command> transaction = new ArrayList<Command>();
	private MultiKeyMap annotation = new MultiKeyMap();
	private HashMap<Object, Object> updatedObjects = new HashMap<Object, Object>();
	private HashMap<Object, Object> createdObjects = new HashMap<Object, Object>();
	private HashMap<Object, Object> removedObjects = new HashMap<Object, Object>();
	private HashMap<Object, Object> ghostObjectsControls = new HashMap<Object, Object>();

	public void addUpdatedObjects(Object t, DataControl<?> dc) {
		Object key = dc.getPager().getObjectKey(t);
		this.updatedObjects.put(key, t);
	}

	public void addCreatedObjects(Object t, DataControl<?> dc) {
		this.createdObjects.put(dc.getPager().getObjectKey(t), t);
	}

	public void addRemovedObjects(Object t, DataControl<?> dc) {
		this.removedObjects.put(dc.getPager().getObjectKey(t), t);
	}

	public void addGhostObjectsControls(String uuid, DataControl<?> dc) {
		this.ghostObjectsControls.put(uuid, dc);
	}

	public void removeGhostObjectsControls(String uuid) {
		this.ghostObjectsControls.remove(uuid);
	}

	public MultiKeyMap getAnnotation() {
		return annotation;
	}

	public HashMap<Object, Object> getUpdatedObjects() {
		return updatedObjects;
	}

	public HashMap<Object, Object> getCreatedObjects() {
		return createdObjects;
	}

	public HashMap<Object, Object> getRemovedObjects() {
		return removedObjects;
	}

	public void cleaner() throws Exception {
		updatedObjects = new HashMap<Object, Object>();
		createdObjects = new HashMap<Object, Object>();
		removedObjects = new HashMap<Object, Object>();

		Iterator<?> itr = ghostObjectsControls.values().iterator();
		while (itr.hasNext()) {
			DataControl<?> obj = (DataControl<?>) itr.next();
			obj.cleanGhostObjects();
		}
		ghostObjectsControls = new HashMap<Object, Object>();
	}

	public void rallbackCommand() throws Exception {
		Iterator<?> itrG = ghostObjectsControls.values().iterator();
		while (itrG.hasNext()) {
			DataControl<?> obj = (DataControl<?>) itrG.next();
			obj.forceRefresh();
		}

		Iterator<Command> itr = transaction.iterator();
		while (itr.hasNext()) {
			Command cmd = itr.next();
			cmd.getDatacontrol().forceRefresh();
		}
		cleaner();
		transaction = new ArrayList<Command>();
	}

	public void commitCommand() throws Exception {
		Iterator<Command> itr = transaction.iterator();

		try {
			trx.begin();
			while (itr.hasNext()) {
				Command cmd = itr.next();
				cmd.execute();
			}
			trx.commit();

			Iterator<?> itrG = ghostObjectsControls.values().iterator();
			while (itrG.hasNext()) {
				DataControl<?> obj = (DataControl<?>) itrG.next();
				obj.forceRefresh();
			}

			itr = transaction.iterator();
			while (itr.hasNext()) {
				Command cmd = itr.next();
				cmd.getDatacontrol().forceRefresh();
			}

			cleaner();
			transaction = new ArrayList<Command>();

		} catch (Exception e) {
			trx.rollback();
			throw new Exception(e);
		}
	}

	public TransactionManager getTrx() {
		return trx;
	}

	public void setTrx(TransactionManager trx) {
		this.trx = trx;
	}

}
