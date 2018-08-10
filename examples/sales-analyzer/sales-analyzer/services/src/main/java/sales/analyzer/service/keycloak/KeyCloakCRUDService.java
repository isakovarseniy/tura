package sales.analyzer.service.keycloak;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.salesanalyzer.persistence.keycloak.User;

public class KeyCloakCRUDService implements CRUDProvider{

	private AdapterLoader loader;
	private RealmResource realmResource;
	
	public KeyCloakCRUDService(RealmResource realmResource) {
		this.realmResource = realmResource;
	}
	
	
	public void setAdapterLoader(AdapterLoader loader) {
		this.loader = loader;
	}

	@Override
	public void execute(SpaControl control) throws Exception {
		if (control.getLevel().equals(OperationLevel.INSERT)) {
			insert(control);
			return;
		}
		if (control.getLevel().equals(OperationLevel.UPDATE)) {
			update(control);
			return;
		}
		if (control.getLevel().equals(OperationLevel.DELETE)) {
			delete(control);
			return;
		}
		throw new Exception("Unknown operation");
		
	}

	private void insert(SpaControl control) throws Exception {
		if (control.getObject() instanceof RoleRepresentation ) {
			insertRole(control);
		}
		if (control.getObject() instanceof User ) {
			insertUser(control);
		}
	}
	
	private void update(SpaControl control) throws Exception {
		if (control.getObject() instanceof RoleRepresentation ) {
			updateRole(control);
		}
		if (control.getObject() instanceof User ) {
			updateUser(control);
		}
	}
	
	private void delete(SpaControl control) throws Exception {
		if (control.getObject() instanceof RoleRepresentation ) {
			deleteRole(control);
		}
		if (control.getObject() instanceof User ) {
			deleteUser(control);
		}
	}
	
	
	private void insertRole(SpaControl control) throws Exception {
		RoleRepresentation role = (RoleRepresentation) control.getObject();
		realmResource.roles().create(role);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void insertUser(SpaControl control) throws Exception {
		Map<String,Object> map = (Map) loader.unWrapObject(control.getObject());
		UserRepresentation user = (UserRepresentation) map.get("userRef");
		realmResource.users().create(user);
	}
	
	private void updateRole(SpaControl control) throws Exception {
		RoleRepresentation role = (RoleRepresentation) control.getObject();
		realmResource.roles().get(role.getName()).update(role);

	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void updateUser(SpaControl control) throws Exception {
		Map<String,Object> map = (Map) loader.unWrapObject(control.getObject());
		UserRepresentation user = (UserRepresentation) map.get("userRef");
		List<String>addRoles = (List<String>) map.get("addRole");
		List<String>removeRoles = (List<String>) map.get("removeRole");
		realmResource.users().get(user.getId()).update(user);
		
		List <RoleRepresentation> add = new ArrayList<>();
		for ( String role : addRoles) {
			add.add(realmResource.roles().get(role).toRepresentation() );
		}
		
		List <RoleRepresentation> remove = new ArrayList<>();
		for ( String role : removeRoles) {
			remove.add(realmResource.roles().get(role).toRepresentation() );
		}
		realmResource.users().get(user.getId()).roles().realmLevel().add(add);
		realmResource.users().get(user.getId()).roles().realmLevel().remove(remove);
	}
	
	private void deleteRole(SpaControl control) throws Exception {
		RoleRepresentation role = (RoleRepresentation) control.getObject();
		realmResource.roles().deleteRole(role.getName());
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void deleteUser(SpaControl control) throws Exception {
		Map<String,Object> map = (Map) loader.unWrapObject(control.getObject());
		UserRepresentation user = (UserRepresentation) map.get("userRef");
		realmResource.users().delete(user.getId());
	}
}
