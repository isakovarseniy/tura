package org.sales.analyzer.services.impl;

import java.util.ArrayList;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;
import org.tura.salesanalyzer.serialized.db.CityRefeence;
import org.tura.salesanalyzer.serialized.db.CountryReference;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;
import org.tura.salesanalyzer.serialized.db.ProxyRepository;
import org.tura.salesanalyzer.serialized.db.StateReference;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.UserReferencesProvider;
import sales.analyzer.user.UserPreferences;

public class UserPreferencesLoader implements UserReferencesProvider {

	private ProxyRepository repository;

	public void setRepository(ProxyRepository repository) {
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

		pref.setCities(new ArrayList<>());
		pref.setCitiesForAdmin(new ArrayList<>());
		for (CityRefeence cityRef : user.getCityRefeence()) {
			pref.getCities().add(cityRef.getCity().getObjId());
		}

		pref.setStates(new ArrayList<>());
		pref.setStatesForAdmin(new ArrayList<>());
		for (StateReference stateRef : user.getStateReference()) {
			pref.getStates().add(stateRef.getState().getObjId());
		}

		pref.setCountries(new ArrayList<>());
		pref.setCountriesForAdmin(new ArrayList<>());
		for (CountryReference cntRef : user.getCountryReference()) {
			pref.getCountries().add(cntRef.getCountry().getObjId());
		}

		pref.setPermissions(new ArrayList<>());
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

