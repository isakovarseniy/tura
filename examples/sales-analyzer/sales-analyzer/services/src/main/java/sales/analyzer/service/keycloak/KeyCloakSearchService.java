package sales.analyzer.service.keycloak;

import java.util.ArrayList;
import java.util.List;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.RoleRepresentationPK;
import org.keycloak.representations.idm.UserRepresentation;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstaractSearchService;
import org.tura.salesanalyzer.persistence.keycloak.User;

import sales.analyzer.process.commons.Constants;

public class KeyCloakSearchService extends AbstaractSearchService {


	private Keycloak keycloak;
	private String managedRealm;

	public KeyCloakSearchService(String serverUrl, String adminRealm, String adminClientId, String clientSecret,
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

	@Override
	protected Object serviceCall(Object pk, String objectClass) {
		if (User.class.getName().equals(objectClass)) {
			return keycloak.realm(managedRealm).users().get((String) pk).toRepresentation();
		}
		if (RoleRepresentation.class.getName().equals(objectClass)) {
			RoleRepresentationPK objPK = (RoleRepresentationPK) pk;
			return keycloak.realm(managedRealm).roles().get(objPK.getName()).toRepresentation();
		}
		throw new RuntimeException("Unknown object" + objectClass);
	}

	@Override
	protected SearchResult serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, String objectClass) throws RepositoryException {
		if (User.class.getName().equals(objectClass)) {
			RepositoryHelper helper = new RepositoryHelper(null);
			boolean criteria = false;

			String username = null;
			SearchCriteria sc = helper.checkSearchParam(Constants.VAR_USERNAME, searchCriteria);
			if (sc != null) {
				username = (String) sc.getValue();
				criteria = true;
			}

			String firstName = null;
			sc = helper.checkSearchParam(Constants.VAR_FIRSTNAME, searchCriteria);
			if (sc != null) {
				firstName = (String) sc.getValue();
				criteria = true;
			}

			String lastName = null;
			sc = helper.checkSearchParam(Constants.VAR_LASTNAME, searchCriteria);
			if (sc != null) {
				lastName = (String) sc.getValue();
				criteria = true;
			}

			String email = null;
			sc = helper.checkSearchParam(Constants.VAR_EMAIL, searchCriteria);
			if (sc != null) {
				email = (String) sc.getValue();
				criteria = true;
			}
			if(criteria) {
				List<UserRepresentation> ls = keycloak.realm(managedRealm).users().search(username, firstName, lastName,
						email, 0, 500);
				ArrayList<UserRepresentation> list =   new ArrayList<UserRepresentation>();
				int y = Math.min(ls.size(), endIndex);
				for (int i = startIndex ; i < y; i++) {
					list.add(ls.get(i));
				}
				return new SearchResult(list, ls.size());
				
			}else {
				List<UserRepresentation> ls = keycloak.realm(managedRealm).users().search(username, firstName, lastName,
						email, startIndex, endIndex-startIndex);
				return new SearchResult(ls, keycloak.realm(managedRealm).users().count());
			}

		}
		if (RoleRepresentation.class.getName().equals(objectClass)) {
			List<RoleRepresentation> ls = keycloak.realm(managedRealm).roles().list();
			return new SearchResult(ls, ls.size());
		}
		throw new RuntimeException("Unknown object" + objectClass);
	}

}

