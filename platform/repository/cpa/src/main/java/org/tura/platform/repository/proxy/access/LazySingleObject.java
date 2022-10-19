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

import java.io.IOException;
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

public abstract class LazySingleObject<T> extends EagerSingleObject<T> {

	private static final long serialVersionUID = 3550211935954666716L;
	private int loadStep = PlatformConfig.LOADSTEP;

	protected abstract List<OrderCriteria> getLazyObjectOrderCriteria();

	protected abstract List<SearchCriteria> getLazyObjectSearchCriteria();

	private ProxyCommadStackProvider localStackProvider = getLocalStackProvider();
	
	private String id = UUID.randomUUID().toString();

	public LazySingleObject(Class<T> objectType, CpaStorageProvider storageProvider, CpaRepository repository,
			RelationType cpaRelationType) {
		super(objectType, storageProvider, repository, cpaRelationType);
	}

	public T get(RepoKeyPath cpaPath, String relation) {
		T t = super.get(cpaPath, relation);
		if (t == null) {
			try {
				SearchResult<T> result = repository.find(getLazyObjectSearchCriteria(), getLazyObjectOrderCriteria(), 0,
						loadStep, getObjectType());
				if (result.getNumberOfRows() != 0) {
					t = result.getSearchResult().get(0);
					Object obj = storageProvider.getStorage().getObject(cpaPath);
					ObjectControl m = (ObjectControl) repository.factory(obj, obj.getClass().getName());
					
					RepositoryHelper helper =  new RepositoryHelper();
					Map<RelationType, String> props = helper.findRelationByIdAndType(cpaPath,relation, cpaRelationType);
					
					ObjectControl master =  m;
					ObjectControl detail = (ObjectControl) t;
					if (  RelationType.Opposite.equals(cpaRelationType) ) {
						 master =  (ObjectControl) t;
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
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return t;
	}
	
	@Override
	public void close() throws IOException {
	}
	

	private ProxyCommadStackProvider getLocalStackProvider() {
		if (localStackProvider == null) {
			localStackProvider = new LocalCommadStackProvider();
			localStackProvider.get().addProxyCommandStackEventListener(id,new LocalRepositoryCommitListener());
		}
		return localStackProvider;
	}

	private class LocalRepositoryCommitListener extends ProxyCommandStackEventListener {

		private static final long serialVersionUID = 410193059498295946L;

		public void beforeCommit() throws Exception {
			List<Object> changes = localStackProvider.get().getListOfCommand();
			repository.getLocalRepository().applyChanges(changes);
		}
	}

}
