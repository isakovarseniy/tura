package sales.analyzer.user;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

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
	
	
	public boolean isAdminForCountries() {
		if (countriesForAdmin != null && countriesForAdmin.size() > 0) {
			return true;
		};
		return false;
	}
	public boolean isAdminForStates() {
		if (statesForAdmin != null && statesForAdmin.size() > 0) {
			return true;
		};
		return false;
	}
	public boolean isAdminForCity() {
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

