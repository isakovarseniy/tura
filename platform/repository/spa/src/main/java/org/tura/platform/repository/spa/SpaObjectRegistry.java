/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.spa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.AdapterLoaderAware;
import org.tura.platform.repository.core.RegistryAware;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class SpaObjectRegistry implements Serializable {

	private static final long serialVersionUID = 1L;

	private Map<String, SpaRegistry> hash = new HashMap<>();

	public SpaObjectRegistry() {

	}

	public SpaRegistry getRegistry(String name) {
		SpaRegistry r = hash.get(name);
		if (r == null) {
			r = new SpaRegistry(name);
			hash.put(name, r);
		}
		return r;
	}

	public class SpaRegistry {

		private Map<Class<?>, PostCreateTrigger> postCreateTriggers = new HashMap<>();
		private Map<Class<?>, PreQueryTrigger> preQueryTriggers = new HashMap<>();
		private Map<Class<?>, PostQueryTrigger> postQueryTriggers = new HashMap<>();
		private List<Class<?>> spaClasses = new ArrayList<>();
		private Map<Class<?>, CRUDProvider> crudProviders = new HashMap<>();
		private Map<String, PersistanceMapper> mappers = new HashMap<>();
		private Map<Class<?>, SearchProvider> searchProviders = new HashMap<>();
		private List<SpaRepositoryCommand> externalCommands = new ArrayList<>();
		private String registry;
		private EntityManagerProvider entityManagerProvider;
		private Map<String, AdapterLoader> loaders = new HashMap<>();

		private boolean initialized = false;

		public void initialized() {
			this.initialized = true;
		}

		public boolean isInitialized() {
			return this.initialized;
		}

		public EntityManagerProvider getEntityManagerProvider() {
			return entityManagerProvider;
		}

		public void setEntityManagerProvider(EntityManagerProvider entityManagerProvider) {
			this.entityManagerProvider = entityManagerProvider;
		}

		SpaRegistry(String registry) {
			this.registry = registry;
		}

		public void addExternalCommand(SpaRepositoryCommand cmd) {
			externalCommands.add(cmd);
		}

		public void addMapper(String repositoryClass, String persistanceClass, PersistanceMapper mapper) {
			mappers.put(persistanceClass + "2" + repositoryClass, mapper);
		}

		public void addCRUDProvider(Class<?> clazz, CRUDProvider provider) {
			if (RegistryAware.class.isAssignableFrom(provider.getClass())) {
				((RegistryAware) provider).setRegistry(registry);
			}
			crudProviders.put(clazz, provider);
		}

		public void addSearchProvider(Class<?> clazz, SearchProvider provider) {
			if (RegistryAware.class.isAssignableFrom(provider.getClass())) {
				((RegistryAware) provider).setRegistry(registry);
			}
			searchProviders.put(clazz, provider);
		}

		public void addSpaClass(String spaClass) throws Exception {
			spaClasses.add(Class.forName(spaClass));
		}

		public void addSpaClass(Class<?> spaClass) throws Exception {
			spaClasses.add(spaClass);
		}

		public void addTrigger(Class<?> clazz, Object trigger) {

			if (trigger instanceof PostCreateTrigger) {
				postCreateTriggers.put(clazz, (PostCreateTrigger) trigger);
			}
			if (trigger instanceof PreQueryTrigger) {
				preQueryTriggers.put(clazz, (PreQueryTrigger) trigger);
			}

			if (trigger instanceof PostQueryTrigger) {
				postQueryTriggers.put(clazz, (PostQueryTrigger) trigger);
			}
		}

		public PostCreateTrigger findPostCreateTrigger(String repositoryClass) throws Exception {
			Class<?> clazz = Class.forName(repositoryClass);
			return postCreateTriggers.get(clazz);
		}

		public PostCreateTrigger findPostCreateTrigger(Class<?> clazz) {
			return postCreateTriggers.get(clazz);
		}

		public PreQueryTrigger findPreQueryTrigger(String repositoryClass) throws Exception {
			Class<?> clazz = Class.forName(repositoryClass);
			return preQueryTriggers.get(clazz);
		}

		public PostQueryTrigger findPostQueryTrigger(String repositoryClass) throws Exception {
			Class<?> clazz = Class.forName(repositoryClass);
			return postQueryTriggers.get(clazz);
		}

		public boolean isClassRegistered(String jpaClass) throws Exception {
			return spaClasses.contains(Class.forName(jpaClass));
		}

		public boolean isClassRegistered(Class<?> jpaClass) throws Exception {
			return spaClasses.contains(jpaClass);
		}

		public PersistanceMapper findMapper(String persistanceClass, String repositoryClass) {
			PersistanceMapper m = mappers.get(persistanceClass + "2" + repositoryClass);
			if (m instanceof AdapterLoaderAware) {
				((AdapterLoaderAware) m).setAdapterLoader(loaders.get(persistanceClass));
			}
			return m;
		}

		public CRUDProvider findCRUDProvider(Class<?> clazz) {
			CRUDProvider provider = crudProviders.get(clazz);
			if (provider != null) {
				provider.setAdapterLoader(loaders.get(clazz.getName()));
			}
			return provider;
		}

		public SearchProvider findSearchProvider(String className) throws Exception {
			Class<?> clazz = Class.forName(className);
			return findSearchProvider(clazz);
		}

		public SearchProvider findSearchProvider(Class<?> clazz) {
			SearchProvider provider = searchProviders.get(clazz);
			if (provider != null) {
				provider.setAdapterLoader(loaders.get(clazz.getName()));
			}
			return provider;
		}

		public List<Object> findCommand(RepositoryCommandType cmdType, Object... parameters)
				throws RepositoryException {
			List<Object> list = new ArrayList<>();
			for (SpaRepositoryCommand cmd : externalCommands) {
				if (cmd.checkCommand(cmdType, parameters)) {
					list.add(cmd);
				}
			}
			return list;
		}

		public void addLoader(String className, AdapterLoader loader) {
			this.loaders.put(className, loader);
		}
	}
}
