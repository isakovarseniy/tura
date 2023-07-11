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

package org.tura.platform.repository.proxy.access;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RelationType;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.operation.CpaConnectOperation;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public abstract class LazyList<T> extends ListOfObjects<T> implements Closeable {

	private static final long serialVersionUID = -1801686816138325861L;
	private ProxyCommadStackProvider localStackProvider = getLocalStackProvider();
	private String id = UUID.randomUUID().toString();

	public abstract List<OrderCriteria> getLazyObjectOrderCriteria();

	public abstract List<SearchCriteria> getLazyObjectSearchCriteria();

	public abstract RepoKeyPath getParentKeyPath();

	public abstract String getProperty();

	public LazyList() {
	}

	public LazyList(Class<T> objectType, CpaStorageProvider storageProvider, CpaRepository repository,
			RelationType cpaRelationType) {
		super(objectType, storageProvider, repository, cpaRelationType);
	}

	@Override
	public void add(int index, T element) {
		super.add(index, element);
	}

	@Override
	public T remove(int index) {
		super.remove(index);
		return null;
	}

	@Override
	public SearchResult<T> search(int index) throws Exception {
		getListOfObjectsData().setStartIndex(index);

		if (getListOfObjectsData().getStartIndex() < 0) {
			getListOfObjectsData().setStartIndex(0);
		}

		getListOfObjectsData()
				.setEndIndex(getListOfObjectsData().getStartIndex() + getListOfObjectsData().getLoadStep());

		List<SearchCriteria> search = combineSearchCriteria();
		List<OrderCriteria> order = combineOrderCriteria();

		disconnect();
		SearchResult<T> result = this.getRepository().find(search, order, getListOfObjectsData().getStartIndex(),
				getListOfObjectsData().getEndIndex(), getObjectType());
		connect(result);

		return result;
	}

	private List<OrderCriteria> combineOrderCriteria() throws Exception {
		List<OrderCriteria> order = new ArrayList<>();
		List<OrderCriteria> ord = getLazyObjectOrderCriteria();
		if (ord != null) {
			order.addAll(ord);
		}
		ord = getOrderCriteria();
		if (ord != null) {
			order.addAll(ord);
		}
		return order;
	}

	private List<SearchCriteria> combineSearchCriteria() throws Exception {
		List<SearchCriteria> search = new ArrayList<>();
		List<SearchCriteria> sch = getLazyObjectSearchCriteria();
		if (sch != null) {
			search.addAll(sch);
		}
		sch = getSearchCriteria();
		if (sch != null) {
			search.addAll(sch);
		}
		return search;
	}

	@SuppressWarnings("unchecked")
	private void disconnect() throws Exception {
		if (getListOfObjectsData().getLoaded() == null) {
			return;
		}
		for (Integer k : getListOfObjectsData().getLoaded().keySet()) {
			disconnect((T) getListOfObjectsData().getLoaded().get(k));
		}
	}

	private void connect(SearchResult<T> result) throws Exception {
		if (getParentKeyPath() == null) {
			return;
		}

		for (T t : result.getSearchResult()) {
			connect(t);
		}
	}

	public void connect(T t) throws Exception {

		RepoKeyPath cpaPath = getParentKeyPath();
		String relation = getProperty();

		Object obj = storageProvider.getStorage().getObject(cpaPath);
		ObjectControl m = (ObjectControl) getRepository().factory(obj, obj.getClass().getName());

		RepositoryHelper helper = new RepositoryHelper();
		Map<RelationType, String> props = helper.findRelationByIdAndType(cpaPath, relation, cpaRelationType);

		ObjectControl master = m;
		ObjectControl detail = (ObjectControl) t;
		if (RelationType.Opposite.equals(cpaRelationType)) {
			master = (ObjectControl) t;
			detail = m;
		}
		String masterProperty = props.get(RelationType.Direct);
		String detailProperty = props.get(RelationType.Opposite);

		CpaConnectOperation command = new CpaConnectOperation();
		command.setMaster(master);
		command.setDetail(detail);
		command.setMasterProperty(masterProperty);
		command.setDetailProperty(detailProperty);
		command.setStackProvider(localStackProvider);
		if (command.prepare()) {
			localStackProvider.get().commit();
		}
	}

	public void disconnect(T t) {
	}

	private ProxyCommadStackProvider getLocalStackProvider() {
		if (localStackProvider == null) {
			localStackProvider = new LocalCommadStackProvider();
			localStackProvider.get().addProxyCommandStackEventListener(id, new LocalRepositoryCommitListener());
		}
		return localStackProvider;
	}

	@Override
	public void close() throws IOException {
		beforeLoad();
		listData.setShifter(null);
	}

	@Override
	public void beforeLoad() {
		if (listData.getLoaded() == null) {
			return;
		}
		listData.setLoaded(null);
		if (PlatformConfig.TEST_MODE) {
			System.gc();
		}
	}

	@Override
	public void afterLoad() {
	}

	private class LocalRepositoryCommitListener extends ProxyCommandStackEventListener {

		private static final long serialVersionUID = 1250886870752203187L;

		public void beforeCommit() throws Exception {
			List<Object> changes = localStackProvider.get().getListOfCommand();
			getRepository().getLocalRepository().applyChanges(changes);
		}
	}

}
