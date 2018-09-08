package sales.analyzer.commons;


import sales.analyzer.service.UserReferencesProvider;
import sales.analyzer.user.UserPreferences;

//TODO replase it
public class TemporaryUserPeferencesProviderImpl implements UserReferencesProvider{
	
	@Override
	public UserPreferences getUserPreferences(String userName) {
		UserPreferences pref  = new UserPreferences();
		pref.setSuperAdmin(true);
		return pref;
	}
	
}