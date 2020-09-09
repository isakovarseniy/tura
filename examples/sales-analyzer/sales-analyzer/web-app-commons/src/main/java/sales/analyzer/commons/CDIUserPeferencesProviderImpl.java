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


import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;

import sales.analyzer.service.UserPreferencesProvider;
import sales.analyzer.user.UserPreferences;

public class CDIUserPeferencesProviderImpl implements UserPreferencesProvider{
	
	
	@Override
	public UserPreferences getUserPreferences(String userName) {
		CachedUserPreferences cup = getCachedUserPreferences();
		return cup.getUserPreferences(userName);
	}
	
	public static CachedUserPreferences getCachedUserPreferences(){
		
		BeanManager bm = CDI.current().getBeanManager();
		@SuppressWarnings("unchecked")
		Bean<CachedUserPreferences> bean = (Bean<CachedUserPreferences>) bm.getBeans(CachedUserPreferences.class).iterator().next();
		CreationalContext<?> ctx = bm.createCreationalContext(bean);
		CachedUserPreferences cup = (CachedUserPreferences) bm.getReference(bean, CachedUserPreferences.class, ctx);
		
		return cup;

	}
}