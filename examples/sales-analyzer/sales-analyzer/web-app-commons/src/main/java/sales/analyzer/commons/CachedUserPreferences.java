package sales.analyzer.commons;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.infinispan.Cache;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import sales.analyzer.commons.service.impl.UserPreferencesLoader;
import sales.analyzer.user.UserPreferences;

public class CachedUserPreferences {

	private transient Logger logger = Logger.getLogger(CachedUserPreferences.class.getName());
	
	@Inject
	UserPreferencesLoader loader;

	@SuppressWarnings("rawtypes")
	@Inject
	Cache cache;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public UserPreferences getUserPreferences(String username) {
		HttpServletRequest request = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest());
		KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
		username = p.getName();

		String str = (String) cache.get(username);
		UserPreferences pref = null;
		ObjectMapper mapper = new ObjectMapper();

		try {
			if (str == null) {
				pref = loader.getUserPreferences(username);
				str = mapper.writeValueAsString(pref);
				cache.put(username, str);
			} else {
				pref = mapper.readValue(str.getBytes(), UserPreferences.class);
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return pref;
	}

	public void clearAll() {
		cache.clear();
	}

}
