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

package org.tura.platform.repository.proxy.access;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RelationType;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.cpa.storage.TimeStampAware;
import org.tura.platform.repository.proxy.shift.ShiftControl;
import org.tura.platform.repository.proxy.shift.data.ShiftControlData;

public abstract class ListOfObjects<T> extends AbstractList<T> implements SearchableList<T>,Serializable {

	private static final long serialVersionUID = -9208125887892329987L;
	private Class<T> objectType;
	private CpaRepository repository;
	protected CpaStorageProvider storageProvider;
	protected RelationType cpaRelationType;
	protected ListOfObjectsData listData;
	protected ShiftControlData shiftData;

	protected abstract SearchResult<T> search(int index) throws Exception;

	protected abstract RepoKeyPath getParentKeyPath();

	protected abstract String getProperty();

	public ListOfObjects() {
	}

	public ListOfObjects(Class<T> objectType, CpaStorageProvider storageProvider, CpaRepository repository,
			RelationType cpaRelationType) {
		this.objectType = objectType;
		this.repository = repository;
		this.storageProvider = storageProvider;
		this.cpaRelationType = cpaRelationType;
	}

	protected ListOfObjectsData getListOfObjectsData() throws Exception {
		if (listData == null) {
			listData = new ListOfObjectsData();
		}
		return listData;
	}

	public List<SearchCriteria> getSearchCriteria() throws Exception {
		return getListOfObjectsData().getSearchCriteria();
	}

	public void setSearchCriteria(List<SearchCriteria> searchCriteria) throws Exception {
		getListOfObjectsData().setSearchCriteria(searchCriteria);
	}

	public List<OrderCriteria> getOrderCriteria() throws Exception {
		return getListOfObjectsData().getOrderCriteria();
	}

	public void setOrderCriteria(List<OrderCriteria> orderCriteria) throws Exception {
		getListOfObjectsData().setOrderCriteria(orderCriteria);
	}

	public Class<T> getObjectType() {
		return objectType;
	}

	public void setObjectType(Class<T> objectType) {
		this.objectType = objectType;
	}

	public ShiftControl getShifter() throws Exception {
		if (getListOfObjectsData().getShifter() == null) {
			createShifter();
		}
		return getListOfObjectsData().getShifter();
	}

	private void createShifter() throws Exception {
		ShiftControl shifter = new ShiftControl() {

			private static final long serialVersionUID = 1130124536333006156L;

			@Override
			public ShiftControlData getShiftControlData() throws Exception {
				if  ( shiftData == null) {
					shiftData = new ShiftControlData();
				}
				return shiftData;
			}

			@Override
			public void removeShiftControlData() throws Exception {
				shiftData.close();
				shiftData  =  null;
			}
		};
		getListOfObjectsData().setShifter(shifter);
	}

	public T create() throws RepositoryException {
		return getRepository().create(objectType);
	}
	
	
	@Override
	public Object InternalSearch(RepoKeyPath key) throws Exception{
		Map<Integer, Object> loaded = getListOfObjectsData().getLoaded();
		for ( Object  obj : loaded.values()) {
			ObjectControl  oc = (ObjectControl) obj;
			if(  oc.isRemoved()) {
				continue;
			}
			if (key.equals(oc.getPath())) {
				  return obj;
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		ObjectControl obj = null;

		boolean removed = false;
		try {
			loadNewObject(getObjectType(), index);
			do {
				obj = (ObjectControl) getObject(index);
				removed = false;
				if (obj != null) {
					removed = obj.isRemoved();
					if (removed ) {
					   getShifter().remove(index);
						if (index >= getShifter().getActualRowNumber()) {
							obj = null;
							break;
						}
					}
				}
			} while (obj != null && removed);

			return (T) obj;
		} catch (Exception e) {
			throw exceptionWrapper(e);
		}
	}

	@SuppressWarnings("unchecked")
	private void loadNewObject(Class<T> objectType, int index) throws Exception {
		List<SearchCriteria> search = new ArrayList<>();
		search.addAll(getSearchCriteria());
		long startTimeStamp = getListOfObjectsData().getCurrentTimeStamp() + 1;

		List<StorageControl> result = null;

		if (getParentKeyPath() != null) {
			result = storageProvider.getStorage().findDependencies(getParentKeyPath(), getProperty(), startTimeStamp,
					Long.MAX_VALUE, Arrays.asList(new String[] { ObjectStatus.Inserted.name() }), this.cpaRelationType);
		} else {
			result = storageProvider.getStorage().find(objectType, startTimeStamp, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
		}

		for (StorageControl sc : result) {
			if (startTimeStamp < sc.getTimeStamp()) {
				startTimeStamp = sc.getTimeStamp();
			}
			getListOfObjectsData().setCurrentTimeStamp(startTimeStamp);
			T proxy = (T) repository.factory(sc.getObject(), sc.getObject().getClass().getName());
			getShifter().add(index, proxy);
		}
	}

	@SuppressWarnings("unchecked")
	private T getObject(int index) {
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		}

		Object obj = null;
		try {
			if (getShifter().getActualRowNumber() == -1) {
				load(0);
			}
			if (index >= getShifter().getActualRowNumber()) {
				throw new IndexOutOfBoundsException();
			}

			obj = getShifter().getObject(index);
			if (obj == int.class) {
				index = (int) obj;
			}
			if (obj instanceof Integer) {
				index = (int) obj;
			}

			if (obj == int.class || obj instanceof Integer) {
				if (getListOfObjectsData().getLoaded() != null) {
					obj = getListOfObjectsData().getLoaded().get(index);
				}
				if (obj == null) {
					load(index);
					obj = getListOfObjectsData().getLoaded().get(index);
				}

			}
		} catch (Exception e) {
			throw exceptionWrapper(e);
		}
		return (T) obj;
	}

	@Override
	public int size() {
		try {
			if (getShifter().getActualRowNumber() == -1) {
				loadNewObject(getObjectType(), 0);
				load(0);
			}
			return Math.toIntExact(getShifter().getActualRowNumber());
		} catch (Exception e) {
			throw exceptionWrapper(e);
		}
	}

	public void reset() throws Exception {
		shiftData.close();
		listData.close();
		shiftData = null;
		listData = null;
	}

	@SuppressWarnings("unchecked")
	protected void load(int index) {
		try {
			beforeLoad();
			SearchResult<T> result = this.search(index);
			getShifter().setActualRowNumber(result.getNumberOfRows());
			long startTimeStamp = getListOfObjectsData().getCurrentTimeStamp() + 1;

			HashMap<Integer, Object> map = new HashMap<>();

			for (int i = 0; i < result.getSearchResult().size(); i++) {
				int ni = i + getListOfObjectsData().getStartIndex();
				TimeStampAware tsa = (TimeStampAware) result.getSearchResult().get(i);
				if (startTimeStamp < tsa.getStorageControlTimeStamp()) {
					startTimeStamp = tsa.getStorageControlTimeStamp();
				}
				T proxy = (T) tsa;
				map.put(Integer.valueOf(ni), proxy);
			}
			getListOfObjectsData().setLoaded(map);
			getListOfObjectsData().setCurrentTimeStamp(startTimeStamp);
			afterLoad();
		} catch (Exception e) {
			throw exceptionWrapper(e);
		}

	}

	public void beforeLoad() {
		
	}

	public void afterLoad() {
		
	}

	@Override
	public T remove(int index) {
		try {
			getShifter().remove(index);
			return null;
		} catch (Exception e) {
			throw exceptionWrapper(e);
		}
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(int index, T element) {
		try {
			this.loadNewObject(getObjectType(), index);
		} catch (Exception e) {
			this.exceptionWrapper(e);
		}
	}

	public CpaRepository getRepository() {
		return repository;
	}

	public void setRepository(CpaRepository repository) {
		this.repository = repository;
	}

	protected Mapper getMapper(T t) throws RepositoryException {
		RepositoryHelper helper = new RepositoryHelper(this.repository.getRegistry());
		return helper.findMapper(((ObjectControl) t).getProxyClazz());
	}

	protected RuntimeException exceptionWrapper(Exception e) {
		if (e instanceof RuntimeException) {
			return (RuntimeException) e;
		} else {
			return new RuntimeException(e);
		}
	}

	@Override
    public Iterator<T> iterator() {
        return new Itr();
    }	
	
    private class Itr implements Iterator<T> {
        int cursor = 0;

        @SuppressWarnings("unused")
		int lastRet = -1;

        int expectedModCount = modCount;

        public boolean hasNext() {
            if( cursor != size()) {
            	if ( ListOfObjects.this.get(cursor) != null) {
            		return true;
            	}else {
            		return false;
            	}
            }else {
            	return false;
            }
            
        }

        public T next() {
            checkForComodification();
            try {
                int i = cursor;
                T next = get(i);
                lastRet = i;
                cursor = i + 1;
                return next;
            } catch (IndexOutOfBoundsException e) {
                checkForComodification();
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public void remove() {
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }	
	
	
}
