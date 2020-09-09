/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.infinispan.Cache;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.tura.platform.uuiclient.cdi.BeansLocal;

import com.fasterxml.jackson.databind.ObjectMapper;

import sales.analyzer.commons.service.impl.UserPreferencesLoader;
import sales.analyzer.user.UserPreferences;

public class CachedUserPreferences {

	private transient Logger logger = Logger.getLogger(CachedUserPreferences.class.getName());
	
	@Inject
	UserPreferencesLoader loader;

	@SuppressWarnings("rawtypes")
	@Inject
	Cache cache;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public UserPreferences getUserPreferences(String username) {
		HttpServletRequest request = BeansLocal.getReference(BeansLocal.getManager(), HttpServletRequest.class);
		KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
		username = p.getName();

		String str = (String) cache.get(username);
		UserPreferences pref = null;
		ObjectMapper mapper = new ObjectMapper();

		try {
			if (str == null) {
				pref = loader.getUserPreferences(username);
				str = mapper.writeValueAsString(pref);
				cache.put(username, str);
			} else {
				pref = mapper.readValue(str.getBytes(), UserPreferences.class);
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return pref;
	}

	public void clearAll() {
		cache.clear();
	}

}
