package sales.analyzer.commons;

import java.lang.reflect.Method;

import org.tura.platform.repository.core.ObjectGraphProfile;

public class AllowEverythingProfile  extends ObjectGraphProfile {

	public boolean skipRelation(Object repositoryObject, Method method) {
		return false;
	}
	
	
}
