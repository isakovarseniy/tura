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

package sales.analyzer.user;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.kie.api.remote.Remotable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Remotable
public class UserPreferences {

	private boolean superAdmin;
	private List<Integer> statesForAdmin;
	private List<Integer> citiesForAdmin;
	private List<Integer> countriesForAdmin;
	private List<String> permissions;
	private List<Integer> states;
	private List<Integer> cities;
	private List<Integer> countries;
	
	public boolean checkIfAdminForCountries() {
		if (countriesForAdmin != null && countriesForAdmin.size() > 0) {
			return true;
		};
		return false;
	}
	
	public boolean checkIfAdminForStates() {
		if (statesForAdmin != null && statesForAdmin.size() > 0) {
			return true;
		};
		return false;
	}

	public boolean checkIfAdminForCity() {
		if (citiesForAdmin != null && citiesForAdmin.size() > 0) {
			return true;
		};
		return false;
	}
	public List<Integer> getStatesForAdmin() {
		return statesForAdmin;
	}
	public void setStatesForAdmin(List<Integer> statesForAdmin) {
		this.statesForAdmin = statesForAdmin;
	}
	public List<Integer> getCitiesForAdmin() {
		return citiesForAdmin;
	}
	public void setCitiesForAdmin(List<Integer> citiesForAdmin) {
		this.citiesForAdmin = citiesForAdmin;
	}
	public boolean isSuperAdmin() {
		return superAdmin;
	}
	public void setSuperAdmin(boolean superAdmin) {
		this.superAdmin = superAdmin;
	}
	public List<String> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	public boolean isPermissionEnabled(String permissionName) {
		return permissions.contains(permissionName);
	}
	public List<Integer> getStates() {
		return states;
	}
	public void setStates(List<Integer> states) {
		this.states = states;
	}
	public List<Integer> getCities() {
		return cities;
	}
	public void setCities(List<Integer> cities) {
		this.cities = cities;
	}
	public List<Integer> getCountriesForAdmin() {
		return countriesForAdmin;
	}
	public void setCountriesForAdmin(List<Integer> countriesForAdmin) {
		this.countriesForAdmin = countriesForAdmin;
	}
	public List<Integer> getCountries() {
		return countries;
	}
	public void setCountries(List<Integer> countries) {
		this.countries = countries;
	}
	
}

