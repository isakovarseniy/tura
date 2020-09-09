/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import org.tura.jpa.test.W4;
import org.tura.jpa.test.W5;
import org.tura.platform.repository.core.Adapter;

public class W5Adapter extends W5 implements Adapter{
	
	private W5Source w5Source;
	
	public W5Adapter( Object obj){
		this.w5Source = (W5Source) obj;
	    w4DirectMapping = false;
	    objIdDirectMapping = false;
		
	}
	
	public W5Source getObj() {
		return w5Source;
	}

	@Override
	public Object getObject(String event) {
		return w5Source;
	}

	@Override
	protected Long delegateGetObjId() {
		return (Long) w5Source.getHash().get("objId");
	}

	@Override
	protected void delegateSetObjId(Long objId) {
		 w5Source.getHash().put("objId", objId);
	}

	@Override
	protected W4 delegateGetW4() {
		if (w5Source.getHash().get("W4") == null) {
			return null;
		}
		return  new W4Adapter( w5Source.getHash().get("W4"));
	}

	@Override
	protected void delegateSetW4(W4 w4) {
		W4Adapter w = (W4Adapter) w4;
		w5Source.getHash().put("W4",w.getObj());
	}

	@Override
	public String getObjectType() {
		return W5.class.getName();
	}

	
	@Override
	protected boolean delegateEquals(Object o) {
		if (o instanceof W5){
			Object pk1 =  ((W5) o).getObjId();
			Object pk2 =  this.getObjId();
			return pk1.equals(pk2);
		}
		return false;
	}


}
