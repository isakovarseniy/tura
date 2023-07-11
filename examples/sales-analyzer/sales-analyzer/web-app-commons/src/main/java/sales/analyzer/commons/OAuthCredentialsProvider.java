/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sales.analyzer.commons;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpHeaders;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.kie.server.client.CredentialsProvider;
import org.tura.platform.uuiclient.cdi.BeansLocal;

public class OAuthCredentialsProvider implements CredentialsProvider{
	
	@Override
	public String getHeaderName() {
		return HttpHeaders.AUTHORIZATION;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String getAuthorization() {
		
		HttpServletRequest request = BeansLocal.getReference(BeansLocal.getManager(), HttpServletRequest.class);
		KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
		String token = p.getKeycloakSecurityContext().getTokenString();

		return "Bearer "+token;
	}

}
