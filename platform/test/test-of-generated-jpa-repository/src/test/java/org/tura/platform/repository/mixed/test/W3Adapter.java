/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.mixed.test;

import org.tura.jpa.test.W1;
import org.tura.jpa.test.W3;
import org.tura.platform.repository.core.Adapter;

public class W3Adapter extends W3 implements Adapter {

	private W3Source w3Source;

	public W3Adapter(Object obj) {
		this.w3Source = (W3Source) obj;
		objIdDirectMapping = false;
		w1DirectMapping = false;
	}

	public W3Source getObj() {
		return w3Source;
	}

	@Override
	public Object getObject(String event) {
		return w3Source;
	}

	@Override
	protected Long delegateGetObjId() {
		return (Long) w3Source.getHash().get("objId");
	}

	@Override
	protected void delegateSetObjId(Long objId) {
		w3Source.getHash().put("objId", objId);
	}

	@Override
	protected W1 delegateGetW1() {
		if (w3Source.getHash().get("W1") == null) {
			return null;
		}
		return new W1Adapter(w3Source.getHash().get("W1"));
	}

	@Override
	protected void delegateSetW1(W1 w1) {
		W1Adapter w = (W1Adapter) w1;
		if (w1 != null) {
			w3Source.getHash().put("W1", w.getObj());
		}else{
			w3Source.getHash().remove("W1");
		}
	}

	@Override
	public String getObjectType() {
		return null;
	}

	@Override
	protected boolean delegateEquals(Object o) {
		if (o instanceof W3){
			Object pk1 =  ((W3) o).getObjId();
			Object pk2 =  this.getObjId();
			return pk1.equals(pk2);
		}
		return false;
	}
	
}
