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
package org.tura.platform.datacontrol.commons;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LazyList<T> extends java.util.AbstractList<T> {

	private Map<Integer, T> loaded;

	private long numResults;
	private int startIndex;
	private long actualRowNumber;

	public LazyList(List<T> data, long numResults, int startIndex) {
		this();
		this.numResults=numResults;
		this.actualRowNumber=numResults;
		this.startIndex=startIndex;
		for (int j = 0; j < data.size(); j++) {
			loaded.put(startIndex + j, data.get(j));
		}

	}
	
	public void reindex(int index){
		HashMap<Integer, T>	map  = new HashMap<Integer, T>();

		for (Integer i : loaded.keySet()){
			int ni = i-startIndex+index;
			map.put(new Integer(ni), loaded.get(i));
		}
		loaded=map;
	}
	
	public Set<Integer> getKeys(){
		return loaded.keySet();
	}

	public LazyList() {
		loaded = new HashMap<Integer, T>();
		numResults=-1;
		actualRowNumber=-1;
	}

	@Override
	public void add(int index, T t) {
		throw new RuntimeException("Unsupported operation");
	}

	@Override
	public T set(int index, T t) {
		loaded.put(index, t);
		return t;
	}

	
	
	@Override
	public T remove(int index) {
		throw new RuntimeException("Unsupported operation");
	}

	@Override
	public T get(int index) {
		T obj = loaded.get(index);
		if (obj == null)
			throw new IndexOutOfBoundsException();

		return obj;
	}

	@Override
	public int size() {
		return (int) numResults;
	}

	public void correctRowsNumber(int correction){
		numResults = numResults + correction;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getFragmentSize() {
		return loaded.size();
	}

	public long getActualRowNumber() {
		return actualRowNumber;
	}
}
