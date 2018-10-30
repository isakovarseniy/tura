package sales.analyzer.commons;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpHeaders;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.kie.server.client.CredentialsProvider;

public class OAuthCredentialsProvider implements CredentialsProvider{
	
	@Override
	public String getHeaderName() {
		return HttpHeaders.AUTHORIZATION;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String getAuthorization() {
		HttpServletRequest request = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest());
		KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
		String token = p.getKeycloakSecurityContext().getTokenString();

		return "Bearer "+token;
	}

}
