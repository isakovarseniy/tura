package sales.analyzer.commons;


import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;

import sales.analyzer.service.UserPreferencesProvider;
import sales.analyzer.user.UserPreferences;

public class CDIUserPeferencesProviderImpl implements UserPreferencesProvider{
	
	
	@Override
	public UserPreferences getUserPreferences(String userName) {
		CachedUserPreferences cup = getCachedUserPreferences();
		return cup.getUserPreferences(userName);
	}
	
	public static CachedUserPreferences getCachedUserPreferences(){
		
		BeanManager bm = CDI.current().getBeanManager();
		@SuppressWarnings("unchecked")
		Bean<CachedUserPreferences> bean = (Bean<CachedUserPreferences>) bm.getBeans(CachedUserPreferences.class).iterator().next();
		CreationalContext<?> ctx = bm.createCreationalContext(bean);
		CachedUserPreferences cup = (CachedUserPreferences) bm.getReference(bean, CachedUserPreferences.class, ctx);
		
		return cup;

	}
}