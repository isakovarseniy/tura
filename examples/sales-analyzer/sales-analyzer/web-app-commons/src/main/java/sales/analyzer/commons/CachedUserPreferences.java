package sales.analyzer.commons;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.infinispan.Cache;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;

import sales.analyzer.commons.service.impl.UserPreferencesLoader;
import sales.analyzer.user.UserPreferences;

public class CachedUserPreferences  {
	
	@Inject
	UserPreferencesLoader loader;
	
	@SuppressWarnings("rawtypes")
	@Inject
	Cache cache;

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public UserPreferences getUserPreferences(String username) {
		HttpServletRequest request = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest());
		KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
		username = p.getName();
		
		UserPreferences pref = (UserPreferences) cache.get(username);
		if (pref == null ) {
			pref = loader.getUserPreferences(username);
			cache.put(username, pref);
		}
		return pref;
	}
	
}
