/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.spa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.AdapterLoaderAware;
import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.RegistryAware;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.persistence.PersistanceMapper;

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

		private List<Class<?>> spaClasses = new ArrayList<>();
		private Map<Class<?>, Class<? extends CRUDProvider>> crudProviders = new HashMap<>();
		private Map<String, PersistanceMapper> mappers = new HashMap<>();
		private Map<Class<?>, Class<? extends SearchProvider>> searchProviders = new HashMap<>();
		private List<Class<? extends SpaRepositoryCommand>> externalCommands = new ArrayList<>();
		private String registry;
		private Map<String, AdapterLoader> loaders = new HashMap<>();
		private List<Instantiator> instantiators = new ArrayList<>(); 
		private Map<Class<?>,Map<String,String >> fieldMapper = new HashMap<Class<?>, Map<String,String>>(); 
		

		SpaRegistry(String registry) {
			this.registry = registry;
		}

		
		public void addInstantiator(Instantiator instantiator){
			instantiators.add(instantiator);
		}
		
		
		public void addExternalCommand(Class<? extends SpaRepositoryCommand> cmd) {
			externalCommands.add(cmd);
		}

		public void addMapper(String repositoryClass, String persistanceClass, PersistanceMapper mapper) {
			mappers.put(persistanceClass + "2" + repositoryClass, mapper);
		}

		public void addCRUDProvider(Class<?> clazz, Class<? extends CRUDProvider> provider) {
			crudProviders.put(clazz, provider);
		}

		public void addSearchProvider(Class<?> clazz, Class< ? extends SearchProvider> provider) {
			searchProviders.put(clazz, provider);
		}

		public void addSpaClass(String spaClass) throws Exception {
			spaClasses.add(Class.forName(spaClass));
		}

		public void addSpaClass(Class<?> spaClass) throws Exception {
			spaClasses.add(spaClass);
		}
		
		
		public void addSpaClassFieldMapper(Class<?> spaClass, String field,  String persistentField) throws Exception {
			Map<String,String>  map = fieldMapper.get(spaClass);
			if ( map == null) {
                  map = new HashMap<String, String>();
                  fieldMapper.put(spaClass,map);
			}
			if ( field != null &&  persistentField != null) {
				map.put(field.toLowerCase(), persistentField);
			}
		}
		
		public String findFieldMapping( Class<?> spaClass, String field){
			Map<String,String>  map = fieldMapper.get(spaClass);
			if( map != null && field != null) {
				return map.get(field.toLowerCase());
			}
			return null;
		}
		
		
		public String findFieldMapping( String spaClassName, String field) throws Exception{
			Class<?> spaClass = Class.forName(spaClassName);
			return findFieldMapping(spaClass,field);
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
			Class <? extends CRUDProvider> providerClass = crudProviders.get(clazz);
			if (providerClass == null){
				return null;
			}
			
			Instantiator init = findInstantiator(providerClass);
			if (init == null){
				return null;
			}
			CRUDProvider provider =  (CRUDProvider) init.newInstance(providerClass);
			if (provider != null) {
				provider.setAdapterLoader(loaders.get(clazz.getName()));
				if (RegistryAware.class.isAssignableFrom(provider.getClass())) {
					((RegistryAware) provider).setRegistry(registry);
				}
			}
			return provider;
		}

		public SearchProvider findSearchProvider(String className) throws Exception {
			Class<?> clazz = Class.forName(className);
			return findSearchProvider(clazz);
		}

		public SearchProvider findSearchProvider(Class<?> clazz) {
			Class<? extends SearchProvider> providerClass = searchProviders.get(clazz);
			if (providerClass == null){
				return null;
			}
			
			Instantiator init = findInstantiator(providerClass);
			if (init == null){
				return null;
			}
			SearchProvider provider = (SearchProvider) init.newInstance(providerClass) ;
			if (provider != null) {
				provider.setAdapterLoader(loaders.get(clazz.getName()));
				if (RegistryAware.class.isAssignableFrom(provider.getClass())) {
					((RegistryAware) provider).setRegistry(registry);
				}
			}
			return provider;
		}

		public List<Object> findCommand(  SpaRepositoryData spaRepositoryData, Map<String,Object> params, RepositoryCommandType cmdType, Object... parameters)
				throws RepositoryException {
			List<Object> list = new ArrayList<>();
			for (Class<? extends SpaRepositoryCommand> cmdClass : externalCommands) {
				Instantiator init = findInstantiator(cmdClass);
				SpaRepositoryCommand cmd = init.newInstance(cmdClass);
				cmd.setRegistryName(this.registry);
				cmd.setParams(params);
				cmd.setSpaRepositoryData(spaRepositoryData);
				if (cmd.checkCommand(cmdType, parameters)) {
					list.add(cmd);
				}
			}
			return list;
		}

		public void addLoader(String className, AdapterLoader loader) {
			this.loaders.put(className, loader);
		}

		public Instantiator findInstantiator( Class<?> clazz){
			return findInstantiator(clazz.getName());
		}

		public Instantiator findInstantiator( String className){
			for (Instantiator init :   instantiators){
				if (init.check(className)){
					return init;
				}
			}
			return null;
		}
	}
	
}
