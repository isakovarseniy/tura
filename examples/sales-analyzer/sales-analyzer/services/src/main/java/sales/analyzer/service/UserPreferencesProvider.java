package sales.analyzer.service;

import sales.analyzer.user.UserPreferences;

public interface UserPreferencesProvider {
	
	UserPreferences getUserPreferences(String userName) ;

}

