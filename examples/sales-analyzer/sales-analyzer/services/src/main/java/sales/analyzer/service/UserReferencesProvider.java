package sales.analyzer.service;

import sales.analyzer.user.UserPreferences;

public interface UserReferencesProvider {
	
	UserPreferences getUserPreferences(String userName) ;

}

