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

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.JOSQLExpressionBuilder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RelationType;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;

import com.octo.java.sql.query.SelectQuery;

public abstract class EagerInternalList<T> extends AbstractList<T>
		implements Serializable, SearchableList<T>, Closeable {

	private static final long serialVersionUID = -2700310211839081675L;
	@SuppressWarnings("unused")
	protected Class<T> objectType;
	protected CpaRepository repository;
	protected CpaStorageProvider storageProvider;
	protected RelationType cpaRelationType;
	protected ListOfObjectsData listData;

	protected abstract RepoKeyPath getParentKeyPath();

	protected abstract String getProperty();

	public EagerInternalList(Class<T> objectType, CpaStorageProvider storageProvider, CpaRepository repository,
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

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		try {
			Object obj = getList().get(index);
			ObjectControl oc = (ObjectControl) repository.factory(obj, obj.getClass().getName());
			return (T) oc;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Object InternalSearch(RepoKeyPath key) throws Exception {
		Map<Integer, Object> loaded = getListOfObjectsData().getLoaded();
		if (loaded != null) {
			for (Object obj : loaded.values()) {
				ObjectControl oc = (ObjectControl) obj;
				if (key.equals(oc.getPath())) {
					return obj;
				}
			}
		}
		return null;
	}

	@Override
	public int size() {
		try {
			return getList().size();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	private List<T> getList() throws Exception {

		RepoKeyPath parentPath = getParentKeyPath();

		T t = storageProvider.getStorage().getObject(parentPath);
		List<T> list = (List<T>) InternalObjectHelper.getValue(t, getProperty());
		if (list == null) {
			return new ArrayList<>();
		}

		SelectQuery select = DefaulQueryFactory.builder(getSearchCriteria(), getOrderCriteria(), objectType);
		String strQuery = select.toSql(new JOSQLExpressionBuilder());
		Map<String, Object> p = select.getParams();
		Query query = new Query();
		query.parse(strQuery);
		for (String var : p.keySet()) {
			if ("null".equals(p.get(var))) {
				query.setVariable(var, null);
				continue;
			}
			query.setVariable(var, p.get(var));
		}

		QueryResults queryResults = query.execute(list);

		return queryResults.getResults();
	}

	@Override
	public void add(int index, T t) {
		try {
			List<T> list = this.getList();
			T obj = list.remove(list.size() - 1);
			list.add(index, obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected DelStruc isRemovable(T t) {
		try {
			DelStruc response = new DelStruc();
			List<T> list = this.getList();
			int i = list.indexOf(t);
			if (i != -1) {
				response.setRemovable(true);
				response.setIndex(i);
			}
			return response;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public T remove(int index) {
		return null;
	}

	@Override
	public void close() throws IOException {
	}
}
