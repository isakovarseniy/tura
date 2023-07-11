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

package sales.analyzer.service.keycloak;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.NotFoundException;

import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstractSearchService;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaObjectRegistry.SpaRegistry;
import org.tura.salesanalyzer.persistence.keycloak.User;

import sales.analyzer.process.commons.Constants;

public class KeyCloakSearchService extends AbstractSearchService {

	private RealmResource realmResource;
	private String registryName;
	private SpaObjectRegistry spaRegistry;
	@SuppressWarnings("unused")
	private Registry registry;

	public KeyCloakSearchService(RealmResource realmResource,SpaObjectRegistry spaRegistry,String registryName,Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
		
		this.realmResource = realmResource;

	}


	@SuppressWarnings("unchecked")
	@Override
	protected  <T>  T serviceCall(Object pk, Class<T> objectClass) throws RepositoryException{
		if (User.class.getName().equals(objectClass.getName())) {
			String objPk = (String) pk;
			UserRepresentation ls = null;
			try {
				ls = realmResource.users().get(objPk).toRepresentation();
				return (T) ls;
			} catch (javax.ws.rs.NotFoundException e) {
				return null;

			}
		}
		if (RoleRepresentation.class.getName().equals(objectClass.getName())) {
			String objPK = (String) pk;
			return (T) realmResource.rolesById().getRole(objPK);
		}
		throw new RuntimeException("Unknown object" + objectClass.getName());
	}

	@Override
	protected  <T>SearchResult<T> serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException{
		if (User.class.getName().equals(objectClass.getName())) {
			RepositoryHelper helper = new RepositoryHelper(null);
			boolean criteria = false;

			String username = null;
			SearchCriteria sc = helper.checkSearchParam(Constants.VAR_USERNAME, searchCriteria);
			if (sc != null) {
				username = (String) sc.getValue();
				criteria = true;
			}

			String firstName = null;
			sc = helper.checkSearchParam(Constants.VAR_FIRSTNAME, searchCriteria);
			if (sc != null) {
				firstName = (String) sc.getValue();
				criteria = true;
			}

			String lastName = null;
			sc = helper.checkSearchParam(Constants.VAR_LASTNAME, searchCriteria);
			if (sc != null) {
				lastName = (String) sc.getValue();
				criteria = true;
			}

			String email = null;
			sc = helper.checkSearchParam(Constants.VAR_EMAIL, searchCriteria);
			if (sc != null) {
				email = (String) sc.getValue();
				criteria = true;
			}
			if (criteria) {
				List<UserRepresentation> ls = realmResource.users().search(username, firstName, lastName, email, 0,
						500);
				ArrayList<UserRepresentation> list = new ArrayList<UserRepresentation>();
				int y = Math.min(ls.size(), endIndex);
				for (int i = startIndex; i < y; i++) {
					list.add(ls.get(i));
				}
				return new SearchResult(list, ls.size());

			} else {
				List<UserRepresentation> ls = realmResource.users().search(username, firstName, lastName, email,
						startIndex, endIndex - startIndex);
				return new SearchResult(ls, realmResource.users().count());
			}

		}
		if (RoleRepresentation.class.getName().equals(objectClass.getName())) {
			RepositoryHelper helper = new RepositoryHelper(null);
			List<RoleRepresentation> ls = null;

			SearchCriteria sc = helper.checkSearchParam(Constants.VAR_ROLE_NAME, searchCriteria);
			if (sc != null) {
				try {
					RoleRepresentation role = realmResource.roles().get((String) sc.getValue()).toRepresentation();
					ls = new ArrayList<>();
					ls.add(role);
				} catch (NotFoundException e) {
					ls = new ArrayList<>();
				}
				return new SearchResult(ls, ls.size());
			}
			sc = helper.checkSearchParam(Constants.VAR_ROLE_ID, searchCriteria);
			if (sc != null) {
				try {
					RoleRepresentation role = realmResource.rolesById().getRole((String) sc.getValue());
					ls = new ArrayList<>();
					ls.add(role);
				} catch (NotFoundException e) {
					ls = new ArrayList<>();
				}
				return new SearchResult(ls, ls.size());
			}
			ls = realmResource.roles().list();
			return new SearchResult(ls, ls.size());
		}
		throw new RuntimeException("Unknown object" + objectClass.getName());
	}

	@Override
	protected SpaRegistry getSpaRegistry() {
		return spaRegistry.getRegistry(registryName);
	}


	@Override
	protected Registry getRegistry() {
		return registry;
	}
	
	
	
}
