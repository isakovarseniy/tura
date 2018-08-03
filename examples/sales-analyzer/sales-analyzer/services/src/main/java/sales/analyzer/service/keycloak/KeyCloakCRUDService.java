package sales.analyzer.service.keycloak;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.salesanalyzer.persistence.keycloak.User;

public class KeyCloakCRUDService implements CRUDProvider{

	private AdapterLoader loader;
	private Keycloak keycloak;
	private String managedRealm;
	
	public KeyCloakCRUDService(String serverUrl, String adminRealm, String adminClientId, String clientSecret,
			String adminUser, String adminPassword , String managedRealm) {

		this.managedRealm = managedRealm;

		keycloak = KeycloakBuilder.builder()
					.serverUrl(serverUrl)
					.realm(adminRealm)
					.clientId(adminClientId)
					.grantType(OAuth2Constants.PASSWORD)
					.clientSecret(clientSecret)
					.username(adminUser)
					.password(adminPassword)
					.build();

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
		keycloak.realm(managedRealm).roles().create(role);
	}
	
	private void insertUser(SpaControl control) throws Exception {
		UserRepresentation user = (UserRepresentation) loader.unWrapObject(control.getObject());
		keycloak.realm(managedRealm).users().create(user);
	}
	
	private void  updateRole(SpaControl control) throws Exception {
		RoleRepresentation role = (RoleRepresentation) control.getObject();
		keycloak.realm(managedRealm).roles().get(role.getName()).update(role);;

	}
	
	private void  updateUser(SpaControl control) throws Exception {
		UserRepresentation user = (UserRepresentation) loader.unWrapObject(control.getObject());
		keycloak.realm(managedRealm).users().get(user.getId()).update(user);
	}
	
	private void  deleteRole(SpaControl control) throws Exception {
		RoleRepresentation role = (RoleRepresentation) control.getObject();
		keycloak.realm(managedRealm).roles().deleteRole(role.getName());
	}
	
	private void  deleteUser(SpaControl control) throws Exception {
		UserRepresentation user = (UserRepresentation) loader.unWrapObject(control.getObject());
		keycloak.realm(managedRealm).users().delete(user.getId());
	}
}
