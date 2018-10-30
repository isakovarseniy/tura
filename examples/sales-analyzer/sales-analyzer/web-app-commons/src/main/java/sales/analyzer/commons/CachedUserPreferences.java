package sales.analyzer.commons;

import javax.inject.Inject;

import org.infinispan.Cache;

import sales.analyzer.commons.service.impl.UserPreferencesLoader;
import sales.analyzer.user.UserPreferences;

public class CachedUserPreferences  {
	
	@Inject
	UserPreferencesLoader loader;
	
	@SuppressWarnings("rawtypes")
	@Inject
	Cache cache;

	
	@SuppressWarnings("unchecked")
	public UserPreferences getUserPreferences(String username) {
		UserPreferences pref = (UserPreferences) cache.get(username);
		if (pref == null ) {
			pref = loader.getUserPreferences(username);
			cache.put(username, pref);
		}
		return pref;
	}
	
}
