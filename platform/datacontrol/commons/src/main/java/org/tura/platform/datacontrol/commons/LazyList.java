package org.tura.platform.datacontrol.commons;

import java.util.AbstractList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LazyList<T> extends AbstractList<T> {

	private Map<Integer, T> loaded;

	private long numResults;

	public LazyList(List<T> data, long numResults, int startIndex) {
		this();
		this.numResults=numResults;
		for (int j = 0; j < data.size(); j++) {
			loaded.put(startIndex + j, data.get(j));
		}

	}
	
	public Set<Integer> getKeys(){
		return loaded.keySet();
	}

	public LazyList() {
		loaded = new HashMap<Integer, T>();
	}

	@Override
	public void add(int index, T t) {
		Map<Integer, T> map = new HashMap<Integer, T>();
		for (Integer i : loaded.keySet()) {
			T obj = loaded.get(i);
			if (i >= index)
				map.put(i + 1, obj);
			else
				map.put(i, obj);
		}
		map.put(index, t);
		numResults++;
		loaded = map;
	}

	@Override
	public T set(int index, T t) {
		loaded.put(index, t);
		return t;
	}

	
	
	@Override
	public T remove(int index) {
        get(index);		
		
		Map<Integer, T> map = new HashMap<Integer, T>();
		T result = null;
		for (Integer i : loaded.keySet()) {
			T obj = loaded.get(i);

			if (i == index) {
				result = obj;
				continue;
			}
			if (i > index)
				map.put(i - 1, obj);
			else
				map.put(i, obj);
		}
		loaded = map;
		numResults--;
		return result;

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
}
