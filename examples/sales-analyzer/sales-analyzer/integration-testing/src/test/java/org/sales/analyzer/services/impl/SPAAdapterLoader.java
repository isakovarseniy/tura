package org.sales.analyzer.services.impl;

import org.keycloak.representations.idm.UserRepresentation;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.salesanalyzer.persistence.keycloak.RoleRef;
import org.tura.salesanalyzer.persistence.keycloak.User;

public class SPAAdapterLoader implements AdapterLoader {

	@Override
	public Object newAdapter(Class<?> clazz) {
		if (User.class.equals(clazz)) {
			return new UserAdapter(new UserRepresentation());
		}
		if (RoleRef.class.equals(clazz)) {
			return new RoleRefAdapter(null);
		}

		throw new RuntimeException("Unsupportable class " + clazz);
	}

	@Override
	public Object wrapObject(Object obj) {
		if (obj instanceof UserRepresentation) {
			return new UserAdapter((UserRepresentation) obj);
		}
		if (obj instanceof String) {
			return new RoleRefAdapter((String) obj);
		}

		throw new RuntimeException("Unsupportable class " + obj.getClass().getName());
	}

	@Override
	public Object unWrapObject(Object obj) {
		if (obj instanceof UserAdapter) {
			return ((UserAdapter) obj).getObj();
		}
		if (obj instanceof RoleRefAdapter) {
			return ((RoleRefAdapter) obj).getObj();
		}

		throw new RuntimeException("Unsupportable class " + obj.getClass().getName());
	}

}
