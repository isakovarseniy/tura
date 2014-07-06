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

import org.tura.platform.datacontrol.command.Command;
import org.tura.platform.datacontrol.commons.TuraException;

public abstract class CommandStack {


	private ArrayList<Command> transaction = new ArrayList<Command>();
	private HashMap<String, Object> updatedObjects = new HashMap<String, Object>();
	private HashMap<String, Object> createdObjects = new HashMap<String, Object>();
	private HashMap<String, Object> removedObjects = new HashMap<String, Object>();
	
	
	public void addUpdatedObjects(Object t, Command cmd) throws TuraException {
		String key = cmd.getDatacontrol().getObjectKey(t);
		this.updatedObjects.put(key, t);
		this.transaction.add(cmd);
	}

	public void addCreatedObjects(Object t, Command cmd) throws TuraException {
		String key = cmd.getDatacontrol().getObjectKey(t);
		this.createdObjects.put(key, t);
		this.transaction.add(cmd);
	}

	public void addRemovedObjects(Object t, Command cmd) throws TuraException {
		String key = cmd.getDatacontrol().getObjectKey(t);
		this.removedObjects.put(key, t);
		this.transaction.add(cmd);
	}
	
	public void rallbackCommand() throws Exception {

		Iterator<Command> itr = transaction.iterator();
		while (itr.hasNext()) {
			Command cmd = itr.next();
			cmd.getDatacontrol().forceRefresh();
		}
		transaction = new ArrayList<Command>();
		updatedObjects = new HashMap<String, Object>();
		createdObjects = new HashMap<String, Object>();
		removedObjects = new HashMap<String, Object>();
	}

	public void commitCommand() throws TuraException {
		Iterator<Command> itr = transaction.iterator();

		try {
			beginTransaction();
			while (itr.hasNext()) {
				Command cmd = itr.next();
				cmd.delayedExecution();
			}
			commitTransaction();

			itr = transaction.iterator();
			while (itr.hasNext()) {
				Command cmd = itr.next();
				cmd.getDatacontrol().forceRefresh();
			}

			transaction = new ArrayList<Command>();
			updatedObjects = new HashMap<String, Object>();
			createdObjects = new HashMap<String, Object>();
			removedObjects = new HashMap<String, Object>();

		} catch (Exception e) {
			rallbackTransaction();
			throw new TuraException(e);
		}
	}

	public boolean isEmpty() {
		return transaction.isEmpty();
	}

	public abstract void beginTransaction();
	public abstract void commitTransaction();
	public abstract void rallbackTransaction();

	public HashMap<String, Object> getUpdatedObjects() {
		return updatedObjects;
	}

	public HashMap<String, Object> getCreatedObjects() {
		return createdObjects;
	}

	public HashMap<String, Object> getRemovedObjects() {
		return removedObjects;
	}
	
	
}