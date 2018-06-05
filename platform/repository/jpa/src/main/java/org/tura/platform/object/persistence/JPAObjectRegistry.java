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
package org.tura.platform.object.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.object.persistence.operation.JPAOperation;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PostQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class JPAObjectRegistry {


	private static JPAObjectRegistry instance = new JPAObjectRegistry();
	private static Map<String,JpaRegistry> hash = new HashMap<>();
	
	

	private JPAObjectRegistry() {

	}

	public static JPAObjectRegistry getInstance() {
		return instance;
	}
	
	public static JPAObjectRegistry newInstance() {
		 hash = new HashMap<>();
		return instance;
	}

	public JpaRegistry getRegistry(String name){
		JpaRegistry r = hash.get(name);
		if (r == null ){
			r = new JpaRegistry(name);
			hash.put(name, r);
		}
		return r;
	}
	
	public class JpaRegistry {

		private Map<String, PostCreateTrigger> postCreateTriggers = new HashMap<>();
		private Map<String, PreQueryTrigger> preQueryTriggers = new HashMap<>();
		private Map<String, PostQueryTrigger> postQueryTriggers = new HashMap<>();
		private List<Class<?>> jpaClasses = new ArrayList<>();
		private Map<String, PersistanceMapper> mappers = new HashMap<>();
		private List<JPAOperation> externalCommands = new ArrayList<>();
		private String registry;

		
		JpaRegistry(String registry){
			this.registry = registry;
		}

		
		public void addExternalCommand(JPAOperation cmd){
			cmd.setRegistry(registry);
			externalCommands.add(cmd);
		}

		
		public void addMapper(String repositoryClass, String persistanceClass, PersistanceMapper mapper) {
			mappers.put(persistanceClass + "2" + repositoryClass, mapper);
		}

		
		public void addJpaClass(String jpaClass) throws Exception {
			jpaClasses.add(Class.forName(jpaClass));
		}

		public void addJpaClass(Class<?> jpaClass) throws Exception {
			jpaClasses.add(jpaClass);
		}

		public void addTrigger(String repositoryClass, Object trigger) {
			if (trigger instanceof PostCreateTrigger) {
				postCreateTriggers.put(repositoryClass, (PostCreateTrigger) trigger);
			}
			if (trigger instanceof PreQueryTrigger) {
				preQueryTriggers.put(repositoryClass, (PreQueryTrigger) trigger);
			}

			if (trigger instanceof PostQueryTrigger) {
				postQueryTriggers.put(repositoryClass, (PostQueryTrigger) trigger);
			}
		}

		public PostCreateTrigger findPostCreateTrigger(String repositoryClass) {
			return postCreateTriggers.get(repositoryClass);
		}

		public PreQueryTrigger findPreQueryTrigger(String repositoryClass) {
			return preQueryTriggers.get(repositoryClass);
		}

		public PostQueryTrigger findPostQueryTrigger(String repositoryClass) {
			return postQueryTriggers.get(repositoryClass);
		}

		public boolean isClassRegistered(String jpaClass) throws Exception {
			return jpaClasses.contains(Class.forName(jpaClass));
		}

		public boolean isClassRegistered(Class<?> jpaClass) throws Exception {
			return jpaClasses.contains(jpaClass);
		}

		public PersistanceMapper findMapper(String persistanceClass, String repositoryClass) {
			return mappers.get(persistanceClass + "2" + repositoryClass);
		}
		
		public List<Object> findCommand(RepositoryCommandType cmdType, Object ...parameters) throws RepositoryException{
			List<Object> list = new ArrayList<>();
			for (JPAOperation cmd : externalCommands){
				if (cmd.checkCommand( cmdType, parameters)){
					list.add(cmd);
				}
			}
			return list;
		}
		
		
		
	}
}
