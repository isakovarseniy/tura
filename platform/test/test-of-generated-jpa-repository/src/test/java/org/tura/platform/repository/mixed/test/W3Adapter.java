/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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

public class W3Adapter extends W3{

	private W3Source w3Source;
	public W3Adapter( Object obj){
		this.w3Source = (W3Source) obj;
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
        throw new RuntimeException();
	}

	@Override
	protected void delegateSetObjId(Long objId) {
        throw new RuntimeException();
	}

	@Override
	protected W1 delegateGetW1() {
		return  new W1Adapter( w3Source.getHash().get("W1"));
	}

	@Override
	protected void delegateSetW1(W1 w1) {
		W1Adapter w = (W1Adapter) w1;
		w3Source.getHash().put("W1",w.getObj());
	}


}
