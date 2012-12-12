/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.datacontrol.ins;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.elsoft.platform.datacontrol.Pager;



public class ObjectIterator<T> implements Iterator<T>, List<T>{

	private InsModeDataControl<T> datacontrol;
	private boolean start;
	private Pager <T> pager ;
	
	public ObjectIterator(InsModeDataControl<T> dataControl, Pager <T> pager){
		this.datacontrol=dataControl;
		this.pager=pager;
		this.start=true;
	}
	

	public boolean hasNext() {
		if (!start)
			datacontrol.nextObject();
			
		if (datacontrol.getCurrentObject() == null)
			return false;
		else
			return true;
	}

	public T next() {
		start=false;
		T obj = datacontrol.getCurrentObject();
		return obj;
	}

	public void remove() {
		this.pager.remove(datacontrol.getCurrentPosition());
	}


	public int size() {
		return 0;
	}


	public boolean isEmpty() {
		return false;
	}


	public boolean contains(Object o) {
		return false;
	}


	public Iterator<T> iterator() {
		return this;
	}


	public Object[] toArray() {
		return null;
	}


	@SuppressWarnings("hiding")
	public <T> T[] toArray(T[] a) {
		return null;
	}


	public boolean add(T e) {
		return false;
	}


	public boolean remove(Object o) {
		return false;
	}


	public boolean containsAll(Collection<?> c) {
		return false;
	}


	public boolean addAll(Collection<? extends T> c) {
		return false;
	}


	public boolean addAll(int index, Collection<? extends T> c) {
		return false;
	}


	public boolean removeAll(Collection<?> c) {
		return false;
	}


	public boolean retainAll(Collection<?> c) {
		return false;
	}


	public void clear() {
	}


	public T get(int index) {
		return this.datacontrol.getObject(index);
	}


	public T set(int index, T element) {
		return null;
	}


	public void add(int index, T element) {
	}


	public T remove(int index) {
		return null;
	}


	public int indexOf(Object o) {
		return -1;
	}


	public int lastIndexOf(Object o) {
		return -1;
	}


	public ListIterator<T> listIterator() {
		return null;
	}


	public ListIterator<T> listIterator(int index) {
		return null;
	}


	public List<T> subList(int fromIndex, int toIndex) {
		return null;
	}
}
