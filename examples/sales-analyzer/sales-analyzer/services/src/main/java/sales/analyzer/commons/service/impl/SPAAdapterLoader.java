package sales.analyzer.commons.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.UserRepresentation;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.salesanalyzer.persistence.keycloak.RoleRef;
import org.tura.salesanalyzer.persistence.keycloak.User;

public class SPAAdapterLoader implements AdapterLoader {

	
	private RealmResource realmResource;
	public SPAAdapterLoader(RealmResource realmResource) {
		this.realmResource = realmResource;
	}
	
	@Override
	public Object newAdapter(Class<?> clazz) {
		if (User.class.equals(clazz)) {
			return new UserAdapter(new UserRepresentation(),realmResource);
		}
		if (RoleRef.class.equals(clazz)) {
			return new RoleRefAdapter(null);
		}

		throw new RuntimeException("Unsupportable class " + clazz);
	}

	@Override
	public Object wrapObject(Object obj) {
		if (obj instanceof UserRepresentation) {
			return new UserAdapter((UserRepresentation) obj,realmResource);
		}
		if (obj instanceof String) {
			return new RoleRefAdapter((String) obj);
		}

		throw new RuntimeException("Unsupportable class " + obj.getClass().getName());
	}

	@Override
	public Object unWrapObject(Object obj) {
		if (obj instanceof UserAdapter) {
			HashMap<String ,Object> map = new HashMap<>();
			map.put("userRef", ((UserAdapter) obj).getObj());
			
			List<String> addRole = new ArrayList<>();
			for (RoleRef r : ((UserAdapter) obj).getAddRoles()) {
				addRole.add(r.getRoleRef());
			}
			List<String> removeRole = new ArrayList<>();
			for (RoleRef r : ((UserAdapter) obj).getRemoveRoles()) {
				removeRole.add(r.getRoleRef());
			}
			map.put("addRole", addRole);
			map.put("removeRole", removeRole);
			
			return map;
		}
		if (obj instanceof RoleRefAdapter) {
			return ((RoleRefAdapter) obj).getObj();
		}

		throw new RuntimeException("Unsupportable class " + obj.getClass().getName());
	}

}

