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

import java.util.ArrayList;
import java.util.List;

import org.tura.jpa.test.W4;
import org.tura.jpa.test.W5;
import org.tura.jpa.test.W6;

public class W4Adapter extends W4 {

	private W4Source w4Source;

	public W4Adapter(Object obj) {
		this.w4Source = (W4Source) obj;
		w5DirectMapping = false;
		w6DirectMapping = false;
		parentIdDirectMapping = false;
	}

	public W4Source getObj(){
		return w4Source;
	}
	
	@Override
	public Object getObject(String event) {
		return w4Source;
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
	protected W5 delegateGetW5() {
		return new W5Adapter( w4Source.getHash().get("W5"));
	}

	@Override
	protected void delegateSetW5(W5 w5) {
		W5Adapter w = (W5Adapter) w5;
		w4Source.getHash().put("W5",w.getObj());
	}

	@Override
	protected void delegateAddW6(int i, W6 obj) {
		W6Adapter w = (W6Adapter) obj;
		@SuppressWarnings("unchecked")
		List<W6Source> w6SourceList =    (List<W6Source>) w4Source.getHash().get("W6");
		if (w6SourceList == null){
			w6SourceList = new ArrayList<>();
			w4Source.getHash().put("W6",w6SourceList);
		}
		w6SourceList.add(w.getObj());
	}

	@Override
	protected W6 delegateRemoveW6(int i) {
		@SuppressWarnings("unchecked")
		List<W6Source> w6SourceList =    (List<W6Source>) w4Source.getHash().get("W6");
		return new W6Adapter(w6SourceList.remove(i));
	}

	@Override
	protected W6 delegateGetW6(int i) {
		@SuppressWarnings("unchecked")
		List<W6Source> w6SourceList =    (List<W6Source>) w4Source.getHash().get("W6");
		return new W6Adapter(w6SourceList.get(i));
	}

	@Override
	protected int delegateGetW6Size() {
		@SuppressWarnings("unchecked")
		List<W6Source> w6SourceList =    (List<W6Source>) w4Source.getHash().get("W6");
		if (w6SourceList == null){
			return 0;
		}
		return w6SourceList.size();
	}

	@Override
	protected void delegateSetParentId(Long parentId) {
		w4Source.getHash().put("parentId", parentId);
		
	}

	@Override
	protected Long delegateGetParentId() {
		return (Long) w4Source.getHash().get("parentId");
	}

	@Override
	protected boolean delegateEquals(Object o) {
		if (o instanceof W4){
			Object pk1 =  ((W4) o).getObjId();
			Object pk2 =  this.getObjId();
			return pk1.equals(pk2);
		}
		return false;
	}


}
