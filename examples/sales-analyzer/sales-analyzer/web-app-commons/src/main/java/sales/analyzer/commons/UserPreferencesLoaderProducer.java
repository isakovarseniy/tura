/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;

import sales.analyzer.commons.service.impl.UserPreferencesLoader;

@Alternative
@Priority(0)
public class UserPreferencesLoaderProducer {

	@Inject
	private Repository repository;

	@SuppressWarnings("rawtypes")
	private  List commandStack = new ArrayList<>();

	
	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider() {

		private static final long serialVersionUID = -5759908640189884229L;

		@SuppressWarnings("unchecked")
		@Override
		public void addCommand(Object cmd) throws Exception {
			commandStack.add(cmd);

		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Object> getListOfCommand() throws Exception {
			return commandStack;
		}

		@Override
		public void clear() throws Exception {
			commandStack.clear();

		}

	};
	
	@Produces
	public UserPreferencesLoader getUserPreferencesLoader(InjectionPoint injectionPoint) throws Exception {

		UserPreferencesLoader loader = new UserPreferencesLoader();
		ProxyRepository proxyRepository = new ProxyRepository(repository, stackProvider);
		proxyRepository.setProfile(AllowEverythingProfile.class.getName());
		loader.setRepository(proxyRepository);

		return loader;
	}

}
