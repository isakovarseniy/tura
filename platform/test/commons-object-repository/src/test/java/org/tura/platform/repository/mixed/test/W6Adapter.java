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

package org.tura.platform.repository.mixed.test;

import org.tura.jpa.test.W4;
import org.tura.jpa.test.W6;
import org.tura.platform.repository.core.Adapter;

public class W6Adapter extends W6 implements Adapter {

	private W6Source w6Source;

	public W6Adapter(Object obj) {
		this.w6Source = (W6Source) obj;
		objIdDirectMapping = false;
		w4DirectMapping = false;
	}

	public W6Source getObj() {
		return w6Source;
	}

	@Override
	public Object getObject(String event) {
		return w6Source;
	}

	@Override
	protected Long delegateGetObjId() {
		return (Long) w6Source.getHash().get("objId");
	}

	@Override
	protected void delegateSetObjId(Long objId) {
		w6Source.getHash().put("objId", objId);
	}

	@Override
	protected W4 delegateGetW4() {
		if (w6Source.getHash().get("W4") == null) {
			return null;
		}
		return new W4Adapter(w6Source.getHash().get("W4"));
	}

	@Override
	protected void delegateSetW4(W4 w1) {
		W4Adapter w = (W4Adapter) w1;
		if (w1 != null) {
			w6Source.getHash().put("W4", w.getObj());
		}else{
			w6Source.getHash().remove("W4");
		}
	}


	@Override
	protected boolean delegateEquals(Object o) {
		if (o instanceof W6){
			Object pk1 =  ((W6) o).getObjId();
			Object pk2 =  this.getObjId();
			return pk1.equals(pk2);
		}
		return false;
	}
	
}
