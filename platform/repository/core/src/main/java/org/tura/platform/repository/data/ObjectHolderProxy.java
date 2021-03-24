/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.operation.AddLinkOperation;
import org.tura.platform.repository.operation.UpdateObjectOperation;
import org.tura.platform.repository.proxy.ArtificialFieldWrapperProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyObjectUpdateListener;

import com.rits.cloning.Cloner;

public class ObjectHolderProxy extends ObjectHolder implements ObjectControl, Serializable {

	private static final long serialVersionUID = 1615387366288L;

	private ObjectHolder object;

	private Map<String, Object> attributes = new HashMap<String, Object>();

	private ArrayList<ProxyObjectUpdateListener> listeners = new ArrayList<ProxyObjectUpdateListener>();

	public boolean forcePKupdate = false;

	private ArtificialFieldWrapperProvider artificialFieldWrapper;

	private ProxyCommadStackProvider stackProvider;

	private AddLinkOperation linkOperation;

	private Object viewModelId1;

	private Object viewModelId2;

	public ObjectHolderProxy(ObjectHolder object, ProxyCommadStackProvider stackProvider) {
		this.object = object;
		this.stackProvider = stackProvider;
		this.object.setSerializationid(java.util.UUID.randomUUID().toString());
	}

	public void addListener(org.tura.platform.repository.proxy.ProxyObjectUpdateListener listener) {
		listeners.add(listener);
	}

	public void setStackProvider(org.tura.platform.repository.proxy.ProxyCommadStackProvider stackProvider) {
		this.stackProvider = stackProvider;
	}

	public Boolean getAttached() {
		return object.getAttached();
	}

	public void setForcePKupdate(boolean forcePKupdate) {
		this.forcePKupdate = forcePKupdate;
	}

	public Object getArtificialFieldWrapper() {
		if (artificialFieldWrapper != null) {
			return artificialFieldWrapper.wrap(this);
		}
		return this;
	}

	public void addArtificialFieldWrapperProvider(
			org.tura.platform.repository.proxy.ArtificialFieldWrapperProvider artificialFieldWrapper) {
		this.artificialFieldWrapper = artificialFieldWrapper;
	}

	public ArtificialFieldWrapperProvider getArtificialFieldWrapperProvider() {
		return this.artificialFieldWrapper;
	}

	public void setLinkOperation(org.tura.platform.repository.operation.AddLinkOperation linkOperation) {
		this.linkOperation = linkOperation;
	}

	public AddLinkOperation getLinkOperation() {
		AddLinkOperation lnk = this.linkOperation;
		if (lnk == null) {
			lnk = (AddLinkOperation) this.attributes
					.get(org.tura.platform.datacontrol.commons.Constants.LINK_OPERATION);
		}
		if (lnk != null) {
			lnk.setDetail(this);
			return lnk;
		} else {
			return null;
		}
	}

	public ObjectHolderProxy clone() {
		Cloner c = new Cloner();
		return new ObjectHolderProxy(c.deepClone(object), stackProvider);
	}

	protected void notifyListner(org.tura.platform.repository.core.ObjectControl obj, String property)
			throws Exception {
		for (ProxyObjectUpdateListener lst : listeners) {
			lst.listener(obj, property);
		}
	}

	public void notifyListner() throws Exception {
		notifyListner(this, null);
	}

	public ObjectHolder getWrappedObject() {
		return object;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof ObjectHolderProxy) {
			return this.getKey().equals(((ObjectHolderProxy) o).getKey());
		} else {
			return false;
		}
	}

	@Override
	public void setViewModelId1(Object viewModelId1) {
		this.viewModelId1 = viewModelId1;
	}

	@Override
	public Object getViewModelId1() {
		return this.viewModelId1;
	}

	@Override
	public void setViewModelId2(Object viewModelId2) {
		this.viewModelId2 = viewModelId2;
	}

	@Override
	public Object getViewModelId2() {
		return this.viewModelId2;
	}

	public String getKey() {
		StringBuffer key = new StringBuffer();
		key.append(object.getObjId());
		key.append("org.tura.platform.repository.data.ObjectHolder");
		return key.toString();
	}

	public RepoObjectKey getPrimaryKey() throws Exception {
		RepoObjectKey key = new RepoObjectKey();
		key.setType("org.tura.platform.repository.data.ObjectHolder");
		return key;
	}

	public static ArrayList<FieldValue> getPrimaryKeyFields() throws Exception {
		ArrayList<FieldValue> fields = new ArrayList<FieldValue>();
		FieldValue field = null;
		field = new FieldValue("Id", "java.lang.String", null);
		fields.add(field);
		return fields;
	}

	public RepoKeyPath getPath() throws Exception {
		RepoKeyPath path = new RepoKeyPath();
		path.addRepoObjectKey("ObjectHolder", getPrimaryKey());
		return path;
	}

	@Override
	public String toString() {
		String str = "";
		str = str + " id = " + getWrappedObject().getObjId();
		return str;
	}

	@Override
	public void setAttached(Boolean attachment) {
		this.object.setAttached(true);
	}


	@Override
	public String getObjId() {
		return object.getObjId();
	}

	@Override
	public void setObjId(java.lang.String id) {
		if (object.getAttached() == null || !object.getAttached()) {
			object.setObjId(id);
		} else {
			if (forcePKupdate) {
				try {
					UpdateObjectOperation command = new UpdateObjectOperation();
					command.setProxy(this);
					command.setNewValue(id);
					command.setOldValue(object.getObjId());
					command.setProperty("Id");
					command.setStackProvider(stackProvider);
					if (command.prepare()) {
						object.setObjId(id);
						notifyListner(this, "id");
					}
					return;
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			throw new RuntimeException("Could  not modify primary key on attached object");
		}
	}

}
