/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.tura.model.designer.repository.domain.metabase.ConfigHashAggregator;
import org.tura.model.designer.repository.domain.metabase.ConfigVariableAggregator;
import org.tura.model.designer.repository.domain.metabase.GenerationHintAggregator;
import org.tura.model.designer.repository.domain.metabase.RootST;
import org.tura.model.designer.repository.domain.metabase.TypesAggregator;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RegistryAware;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstractSearchService;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaObjectRegistry.SpaRegistry;

public class DomainSearchService extends AbstractSearchService implements RegistryAware {

	private String registryName;
	private SpaObjectRegistry spaRegistry;
	private Registry registry;

	public DomainSearchService(SpaObjectRegistry spaRegistry, String registryName, Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
	}

	@Override
	protected <T> SearchResult<T> serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException {

		RepositoryHelper helper = new RepositoryHelper(registry);

		try {
			
			if ( ConfigHashAggregator.class.getName().equals(objectClass.getName())
					|| ConfigVariableAggregator.class.getName().equals(objectClass.getName())
					|| GenerationHintAggregator.class.getName().equals(objectClass.getName())
				) {
				   SearchCriteria sc = helper.extractAndRemove(Constants.PARENT_TECH_LEAF_ID, searchCriteria);
					if (sc != null) {
						String pk = (String) sc.getValue();
						ArrayList<T> array = new ArrayList<T>();
						array.add(buildClass(pk, objectClass));
						return new SearchResult<T>(array, 1);
					} 
			}
			if ( TypesAggregator.class.getName().equals(objectClass.getName())
					|| RootST.class.getName().equals(objectClass.getName())
				) {
				String pk = UUID.randomUUID().toString();
				ArrayList<T> array = new ArrayList<T>();
				array.add(buildClass(pk, objectClass));
				return new SearchResult<T>(array, 1);
			}
			
			return new SearchResult<T>(new ArrayList<T>(), 0);


		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	protected <T> T serviceCall(Object pk, Class<T> objectClass) throws RepositoryException {
		return buildClass((String) pk, objectClass);
	}

	public String getRegistryName() {
		return registryName;
	}

	public void setRegistryName(String registryName) {
		this.registryName = registryName;
	}

	@Override
	protected SpaRegistry getSpaRegistry() {
		return spaRegistry.getRegistry(registryName);
	}

	@Override
	public Registry getRegistry() {
		return registry;
	}

	@SuppressWarnings("unchecked")
	private <T> T buildClass(String pk, Class<T> objectClass) {

		if (ConfigHashAggregator.class.getName().equals(objectClass.getName())) {
			ConfigHashAggregator obj = new ConfigHashAggregator();
			obj.setUid(pk);
			obj.setParentTechLeafId(pk);
			return (T) obj;
		}

		if (ConfigVariableAggregator.class.getName().equals(objectClass.getName())) {
			ConfigVariableAggregator obj = new ConfigVariableAggregator();
			obj.setUid(pk);
			obj.setParentTechLeafId(pk);
			return (T) obj;
		}

		if (GenerationHintAggregator.class.getName().equals(objectClass.getName())) {
			GenerationHintAggregator obj = new GenerationHintAggregator();
			obj.setUid(pk);
			obj.setParentTechLeafId(pk);
			return (T) obj;
		}
		
		if (TypesAggregator.class.getName().equals(objectClass.getName())) {
			TypesAggregator obj = new TypesAggregator();
			obj.setUid(pk);
			return (T) obj;
		}
		
		if (RootST.class.getName().equals(objectClass.getName())) {
			RootST obj = new RootST();
			obj.setUid(pk);
			return (T) obj;
		}
		
		
		
		return null;

	}

}
