package sales.analyzer.service.keycloak;

import java.util.List;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstaractSearchService;

public class KeyCloakSearchService extends AbstaractSearchService{

	public KeyCloakSearchService(){
//		Keycloak keycloak = KeycloakBuilder.builder() //
//				.serverUrl(serverUrl) //
//				.realm(realm) //
//				.grantType(OAuth2Constants.PASSWORD) //
//				.clientId(clientId) //
//				.clientSecret(clientSecret) //
//				.username("idm-admin") //
//				.password("admin") //
//				.build();
	}
	
	@Override
	protected Object serviceCall(Object pk, String objectClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected SearchResult serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, String objectClass) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

}
