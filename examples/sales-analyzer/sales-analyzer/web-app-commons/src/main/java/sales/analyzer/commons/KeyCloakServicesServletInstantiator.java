package sales.analyzer.commons;

import java.util.Arrays;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.tura.platform.repository.core.Instantiator;

import sales.analyzer.service.keycloak.KeyCloakCRUDService;
import sales.analyzer.service.keycloak.KeyCloakSearchService;

public class KeyCloakServicesServletInstantiator implements Instantiator{

	private RealmResource realmResource;
	private String serverUrl;
	private String adminRealm;
	private String adminClientId;
	private String clientSecret;
	@SuppressWarnings("unused")
	private String adminUser;
	@SuppressWarnings("unused")
	private String adminPassword ;
	private String managedRealm;
	
	public KeyCloakServicesServletInstantiator(String serverUrl, String adminRealm, String adminClientId, String clientSecret,
						String adminUser, String adminPassword , String managedRealm) {
		
		this.serverUrl=serverUrl;
		this.adminRealm=adminRealm;
		this.adminClientId=adminClientId;
		this.clientSecret=clientSecret;
		this.adminUser=adminUser;
		this.adminPassword=adminPassword ;
		this.managedRealm=managedRealm;


	}
	
	
	private static String[] knownObjects = new String[] { 
			KeyCloakCRUDService.class.getName(),
			KeyCloakSearchService.class.getName()
			};

	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <T> T newInstance(Class<T> clazz) {
		if (realmResource == null) {
			HttpServletRequest request = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest());
			KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
	          
			String token = p.getKeycloakSecurityContext().getTokenString();

			Keycloak keycloak = KeycloakBuilder.builder()
					.serverUrl(serverUrl)
					.realm(adminRealm)
					.clientId(adminClientId)
					.clientSecret(clientSecret)
					.authorization(token)
					.build();
	         realmResource = keycloak.realm(managedRealm);
			
		}
		
		
		if (KeyCloakCRUDService.class.equals(clazz)){
			return (T) new KeyCloakCRUDService(realmResource);
		}
		if (KeyCloakSearchService.class.equals(clazz)) {
			return (T) new KeyCloakSearchService(realmResource);
		}

		return null;
	}

	@Override
	public boolean check(Class<?> clazz) {
		return check(clazz.getName());
	}

	@Override
	public boolean check(String clazzName) {
		return Arrays.asList(knownObjects).contains(clazzName);
	}

}
