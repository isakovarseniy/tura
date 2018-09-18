package sales.analyzer.service.keycloak;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.NotFoundException;

import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstaractSearchService;
import org.tura.salesanalyzer.persistence.keycloak.User;
import org.tura.salesanalyzer.persistence.keycloak.UserPK;

import sales.analyzer.process.commons.Constants;

public class KeyCloakSearchService extends AbstaractSearchService {


	private RealmResource realmResource;

	public KeyCloakSearchService(RealmResource realmResource) {

		this.realmResource = realmResource;

	}

	@Override
	protected Object serviceCall(Object pk, String objectClass) {
		if (User.class.getName().equals(objectClass)) {
			UserPK objPk = (UserPK) pk;
			List<UserRepresentation> ls = realmResource.users().search(objPk.getUsername());
			if (ls != null && ls.size() > 0) {
				return ls.get(0);
			}else {
				return null;
			}
		}
		if (RoleRepresentation.class.getName().equals(objectClass)) {
			String objPK = (String) pk;
			return realmResource.rolesById().getRole(objPK);
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
				List<UserRepresentation> ls = realmResource.users().search(username, firstName, lastName,
						email, 0, 500);
				ArrayList<UserRepresentation> list = new ArrayList<UserRepresentation>();
				int y = Math.min(ls.size(), endIndex);
				for (int i = startIndex ; i < y; i++) {
					list.add(ls.get(i));
				}
				return new SearchResult(list, ls.size());
				
			}else {
				List<UserRepresentation> ls = realmResource.users().search(username, firstName, lastName,
						email, startIndex, endIndex-startIndex);
				return new SearchResult(ls, realmResource.users().count());
			}

		}
		if (RoleRepresentation.class.getName().equals(objectClass)) {
			RepositoryHelper helper = new RepositoryHelper(null);
			List<RoleRepresentation> ls=null;

			SearchCriteria sc = helper.checkSearchParam(Constants.VAR_ROLE_NAME, searchCriteria);
			if ( sc != null) {
				try {
					RoleRepresentation role = realmResource.roles().get((String) sc.getValue()).toRepresentation();
					ls = new ArrayList<>();
					ls.add(role);
				}catch(NotFoundException e) {
					ls = new ArrayList<>();
				}
				return new SearchResult(ls, ls.size());
			}
			sc = helper.checkSearchParam(Constants.VAR_ROLE_ID, searchCriteria);
			if ( sc != null) {
				try {
					RoleRepresentation role = realmResource.rolesById().getRole((String) sc.getValue());
					ls = new ArrayList<>();
					ls.add(role);
				}catch(NotFoundException e) {
					ls = new ArrayList<>();
				}
				return new SearchResult(ls, ls.size());
			}
			ls = realmResource.roles().list();
			return new SearchResult(ls, ls.size());
		}
		throw new RuntimeException("Unknown object" + objectClass);
	}

}

