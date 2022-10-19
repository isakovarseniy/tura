/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.mixed.test;

import org.tura.jpa.test.W1;
import org.tura.jpa.test.W2;
import org.tura.platform.repository.core.Adapter;

public class W2Adapter extends W2 implements Adapter{
	
	private W2Source w2Source;
	public W2Adapter( Object obj){
		this.w2Source = (W2Source) obj;
	    w1DirectMapping = false;
	    objIdDirectMapping = false;
		
	}
	
	public W2Source getObj() {
		return w2Source;
	}

	@Override
	public Object getObject(String event) {
		return w2Source;
	}

	@Override
	protected Long delegateGetObjId() {
		return (Long) w2Source.getHash().get("objId");
	}

	@Override
	protected void delegateSetObjId(Long objId) {
		 w2Source.getHash().put("objId", objId);
	}

	@Override
	protected W1 delegateGetW1() {
		return  new W1Adapter( w2Source.getHash().get("W1"));
	}

	@Override
	protected void delegateSetW1(W1 w1) {
		W1Adapter w = (W1Adapter) w1;
		w2Source.getHash().put("W1",w.getObj());
	}

	@Override
	public String getObjectType() {
		return W2.class.getName();
	}

	
	@Override
	protected boolean delegateEquals(Object o) {
		if (o instanceof W2){
			Object pk1 =  ((W2) o).getObjId();
			Object pk2 =  this.getObjId();
			return pk1.equals(pk2);
		}
		return false;
	}


}
