/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.cli.sa.kieserver;

import java.util.Collections;

import org.apache.http.impl.client.HttpClients;
import org.keycloak.authorization.client.AuthzClient;
import org.keycloak.authorization.client.Configuration;


public class CommonActions {

	
	public static String getToken(String clientId, String clientSecret , String username, String password, String kc_host_port , String realm) {
		
	    final Configuration configuration = new Configuration(kc_host_port, 
	    		    realm, 
	    		    clientId, 
	                Collections.singletonMap("secret", clientSecret), 
	                HttpClients.createDefault());

	    try {

	        return AuthzClient.create(configuration).obtainAccessToken(username, password).getToken(); 
	    } catch (Exception e) {
	        throw new IllegalArgumentException("Token can't be obtained", e);
	    }
	}	
	
}
