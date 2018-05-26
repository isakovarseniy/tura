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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class SpaObjectRegistry {


	private static SpaObjectRegistry instance = new SpaObjectRegistry();
	private static Map<String,SpaRegistry> hash = new HashMap<>();
	
	

	private SpaObjectRegistry() {

	}

	public static SpaObjectRegistry getInstance() {
		return instance;
	}
	
	public static SpaObjectRegistry newInstance() {
		 hash = new HashMap<>();
		return instance;
	}

	public SpaRegistry getRegistry(String name){
		SpaRegistry r = hash.get(name);
		if (r == null ){
			r = new SpaRegistry();
			hash.put(name, r);
		}
		return r;
	}
	
	public class SpaRegistry {

		private Map<Class<?>, PostCreateTrigger> postCreateTriggers = new HashMap<>();
		private Map<Class<?>, PreQueryTrigger> preQueryTriggers = new HashMap<>();
		private Map<Class<?>, PostQueryTrigger> postQueryTriggers = new HashMap<>();
		private List<Class<?>> spaClasses = new ArrayList<>();
		private Map<Class<?>,CRUDProvider> crudProviders = new HashMap<>();
//		private Map<Class<?>, PersistanceMapper> mappers = new HashMap<>();
		private Map<Class<?>, SearchProvider> searchProviders = new HashMap<>();
		private List<SpaRepositoryCommand> externalCommands = new ArrayList<>();

		
		public void addExternalCommand(SpaRepositoryCommand cmd){
			externalCommands.add(cmd);
		}
		
		public void addMapper(String repositoryClass, String persistanceClass, PersistanceMapper mapper) {
			mappers.put(persistanceClass + "2" + repositoryClass, mapper);
		}
		
		public void addCRUDProvider(Class<?> clazz, CRUDProvider provider){
			crudProviders.put(clazz, provider);
		}
		
		public void addSearchProvider(Class<?> clazz, SearchProvider provider){
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
			return postCreateTriggers.get(repositoryClass);
		}
		public PostCreateTrigger findPostCreateTrigger(Class<?> clazz) {
			return postCreateTriggers.get(clazz);
		}

		public PreQueryTrigger findPreQueryTrigger(String repositoryClass) {
			return preQueryTriggers.get(repositoryClass);
		}

		public PostQueryTrigger findPostQueryTrigger(String repositoryClass) {
			return postQueryTriggers.get(repositoryClass);
		}

		public boolean isClassRegistered(String jpaClass) throws Exception {
			return spaClasses.contains(Class.forName(jpaClass));
		}

		public boolean isClassRegistered(Class<?> jpaClass) throws Exception {
			return spaClasses.contains(jpaClass);
		}

		public PersistanceMapper findMapper(String persistanceClass, String repositoryClass) {
			return mappers.get(persistanceClass + "2" + repositoryClass);
		}
		
		public CRUDProvider findCRUDProvider( Class<?> clazz) {
			return crudProviders.get(clazz);
		}

		public SearchProvider findSearchProvider( String  className) throws Exception {
			Class<?> clazz = Class.forName(className);
			return findSearchProvider(clazz);
		}

		
		public SearchProvider findSearchProvider( Class<?> clazz) {
			return searchProviders.get(clazz);
		}
		
		public List<Object> findCommand(RepositoryCommandType cmdType, Object ...parameters){
			List<Object> list = new ArrayList<>();
			for (SpaRepositoryCommand cmd : externalCommands){
				if (cmd.checkCommand( cmdType, parameters)){
					list.add(cmd);
				}
			}
			return list;
		}
	}
}
