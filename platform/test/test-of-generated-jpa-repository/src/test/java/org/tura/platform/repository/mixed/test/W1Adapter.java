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

import org.tura.jpa.test.W1;
import org.tura.jpa.test.W2;
import org.tura.jpa.test.W3;

public class W1Adapter extends W1 {

	private W1Source w1Source;

	public W1Adapter(Object obj) {
		this.w1Source = (W1Source) obj;
		w2DirectMapping = false;
		w3DirectMapping = false;
		parentIdDirectMapping = false;
	}

	public W1Source getObj(){
		return w1Source;
	}
	
	@Override
	public Object getObject(String event) {
		return w1Source;
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
	protected W2 delegateGetW2() {
		return new W2Adapter( w1Source.getHash().get("W2"));
	}

	@Override
	protected void delegateSetW2(W2 w2) {
		W2Adapter w = (W2Adapter) w2;
		w1Source.getHash().put("W2",w.getObj());
	}

	@Override
	protected void delegateAddW3(int i, W3 obj) {
		W3Adapter w = (W3Adapter) obj;
		@SuppressWarnings("unchecked")
		List<W3Source> w3SourceList =    (List<W3Source>) w1Source.getHash().get("W3");
		if (w3SourceList == null){
			w3SourceList = new ArrayList<>();
			w1Source.getHash().put("W3",w3SourceList);
		}
		w3SourceList.add(w.getObj());
	}

	@Override
	protected W3 delegateRemoveW3(int i) {
		@SuppressWarnings("unchecked")
		List<W3Source> w3SourceList =    (List<W3Source>) w1Source.getHash().get("W3");
		return new W3Adapter(w3SourceList.remove(i));
	}

	@Override
	protected W3 delegateGetW3(int i) {
		@SuppressWarnings("unchecked")
		List<W3Source> w3SourceList =    (List<W3Source>) w1Source.getHash().get("W3");
		return new W3Adapter(w3SourceList.get(i));
	}

	@Override
	protected int delegateGetW3Size() {
		@SuppressWarnings("unchecked")
		List<W3Source> w3SourceList =    (List<W3Source>) w1Source.getHash().get("W3");
		if (w3SourceList == null){
			return 0;
		}
		return w3SourceList.size();
	}

	@Override
	protected void delegateSetParentId(Long parentId) {
		w1Source.getHash().put("parentId", parentId);
		
	}

	@Override
	protected Long delegateGetParentId() {
		return (Long) w1Source.getHash().get("parentId");
	}

	@Override
	protected boolean delegateEquals(Object o) {
		if (o instanceof W1){
			Object pk1 =  ((W1) o).getObjId();
			Object pk2 =  this.getObjId();
			return pk1.equals(pk2);
		}
		return false;
	}


}
