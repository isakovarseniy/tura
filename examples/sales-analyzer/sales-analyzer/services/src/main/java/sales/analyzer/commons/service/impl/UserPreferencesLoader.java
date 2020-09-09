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

package sales.analyzer.commons.service.impl;

import java.util.ArrayList;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.salesanalyzer.serialized.db.CityRefeence;
import org.tura.salesanalyzer.serialized.db.CountryReference;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;
import org.tura.salesanalyzer.serialized.db.StateReference;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.UserPreferencesProvider;
import sales.analyzer.user.UserPreferences;

public class UserPreferencesLoader implements UserPreferencesProvider {

	private Repository repository;

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	@Override
	public UserPreferences getUserPreferences(String userName) {
		ArrayList<SearchCriteria> search = new ArrayList<>();
		SearchCriteria sc = new SearchCriteria();
		sc.setName(Constants.VAR_USERNAME);
		sc.setComparator(Operator.EQ.name());
		sc.setValue(userName);
		search.add(sc);
		
		SearchResult result;
		try {
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, User.class.getName());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		User user = (User) result.getSearchResult().get(0);

		UserPreferences pref = new UserPreferences();
		
		if ( user.getPreferences() == null || user.getPreferences().getSuperAdmin() == null) {
			pref.setSuperAdmin(false);
		}else {
			pref.setSuperAdmin(user.getPreferences().getSuperAdmin());
		}

		pref.setCities(new ArrayList<>());
		pref.setCitiesForAdmin(new ArrayList<>());
		for (CityRefeence cityRef : user.getCityRefeence()) {
			pref.getCities().add(cityRef.getCityId());
		}
		for (CityRefeence cityRef : user.getCityRefeence()) {
			if (cityRef.getAdmin()) {
			 pref.getCitiesForAdmin().add(cityRef.getCityId());
			}
		}
		
		

		pref.setStates(new ArrayList<>());
		pref.setStatesForAdmin(new ArrayList<>());
		for (StateReference stateRef : user.getStateReference()) {
			pref.getStates().add(stateRef.getStateId());
		}
		for (StateReference stateRef : user.getStateReference()) {
			if (stateRef.getAdmin()) {
			 pref.getStatesForAdmin().add(stateRef.getStateId());
			}
		}

		
		
		pref.setCountries(new ArrayList<>());
		pref.setCountriesForAdmin(new ArrayList<>());
		for (CountryReference cntRef : user.getCountryReference()) {
			pref.getCountries().add(cntRef.getCountryId());
		}
		for (CountryReference cntRef : user.getCountryReference()) {
			if (cntRef.getAdmin()) {
				pref.getCountriesForAdmin().add(cntRef.getCountryId());
			}
		}

		
		
		pref.setPermissions(new ArrayList<>());
		for (RoleReference roleRef : user.getRoleReference()) {
			Role role = roleRef.getRole();
			for (PermissionReferences permRef : role.getPermissionReferences()) {
				pref.getPermissions().add(permRef.getPermission().getName());
			}
		}

		return pref;
	}

}

