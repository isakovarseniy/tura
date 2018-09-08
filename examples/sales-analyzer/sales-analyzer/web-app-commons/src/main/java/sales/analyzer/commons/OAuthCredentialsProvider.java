package sales.analyzer.commons;

import java.util.Enumeration;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpHeaders;
import org.kie.server.client.CredentialsProvider;

public class OAuthCredentialsProvider implements CredentialsProvider{
	
	@Override
	public String getHeaderName() {
		return HttpHeaders.AUTHORIZATION;
	}

	@Override
	public String getAuthorization() {
		Enumeration<String> header = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getHeaders(HttpHeaders.AUTHORIZATION);
		String token = header.nextElement();
		return "Bearer "+token;
	}

}
