/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.operation.PathHelper;

public abstract class SpaRepositoryCommand extends RepositoryHelper{

	protected Map<String, SearchProvider> providerHash = new HashMap<>();
	protected List<String> knownObjects = new ArrayList<>();
	protected String registryName;
	protected SpaObjectRegistry spaRegistry;
	
	public SpaRepositoryCommand(Registry registry,SpaObjectRegistry spaRegistry){
		super(registry);
		this.spaRegistry = spaRegistry;
	}

	public List<String> getListOfKnownObjects() {
		return knownObjects;
	}

	public void addSearchProvider(String className, SearchProvider provider) {
		providerHash.put(className, provider);
	}

	protected PersistanceMapper findPersistanceMapper(Class<?> repositoryClass) throws RepositoryException {
		String persistanceClassName = registry.findPersistanceClass(repositoryClass.getName());

		PersistanceMapper mapper = spaRegistry.getRegistry(registryName)
				.findMapper(persistanceClassName, repositoryClass.getName());
		if (mapper == null) {
			SpaRepository repository =  (SpaRepository) registry.findProvider(repositoryClass.getName());
			if (repository != null){
				mapper = spaRegistry.getRegistry(repository.getRegistryName()).findMapper(persistanceClassName, repositoryClass.getName());
				if (mapper != null){
					return mapper;
				}
			}
			throw new RepositoryException(
					"PersistanceMapper not found from " + persistanceClassName + " to " + repositoryClass.getName());
		}
		return mapper;
	}

	protected PersistanceMapper findPersistanceMapper(String repositoryClass) throws RepositoryException {
		try {
			return findPersistanceMapper(Class.forName(repositoryClass));
		} catch (ClassNotFoundException e) {
			throw new RepositoryException(e);
		}
	}

	
	
	protected boolean beckwardProperty(Object persistanceDetailObject, String detailProperty) {
		try {
			Class<?> clazz = persistanceDetailObject.getClass();
			String methodName = "get" + WordUtils.capitalize(detailProperty);
			clazz.getMethod(methodName);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void setRegistry(String registry) {
		this.registryName = registry;
	}
	

	protected Object getExtendedObject(RepoKeyPath extendedPk, Object persistanceObject) throws Exception {
		return PathHelper.getPathValue(extendedPk, 1, persistanceObject);
	}

	protected Object getJpaPrimaryKey(RepoKeyPath pk) throws RepositoryException {
		RepoObjectKey objKey = pk.getPath().get(0);
		String repositoryClass = objKey.getType();
		PersistanceMapper mapper = findPersistanceMapper(repositoryClass);
		return mapper.getPKey(objKey);

	}

	protected String getJpaPersistanceClassName(RepoKeyPath pk) throws RepositoryException {
		String repositoryClass = pk.getPath().get(0).getType();
		return registry.findPersistanceClass(repositoryClass);
	}

	protected String getJpaRelationType(RepoKeyPath pk, String property) throws Exception {
		String className = pk.getPath().get(0).getType();
		Class<?> clazz = Class.forName(className);
		String methodName = "get" + WordUtils.capitalize(property);
		Method m = clazz.getMethod(methodName, new Class<?>[] {});
		Annotation a = m.getAnnotation(Association.class);
		if (a == null) {
			a = m.getAnnotation(Internal.class);
		}
		if (a == null) {
			throw new RepositoryException("Method is not annootated");
		}
		String relationType = null;
		if (a instanceof Association) {
			relationType = ((Association) a).type();
		}
		if (a instanceof Internal) {
			relationType = ((Internal) a).type();
		}
		if ("One2Many".equals(relationType)) {
			if (findAnnotationType(m)) {
				return "One2Many";
			} else {
				return "Many2One";
			}
		}
		return relationType;
	}

	private boolean findAnnotationType(Method method) {
		boolean one2many = true;
		Type returnType = method.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			if (((Class<?>) type.getRawType()).getName().equals(Collection.class.getName())
					|| ((Class<?>) type.getRawType()).getName().equals(List.class.getName())) {
				one2many = true;
			} else {
				one2many = false;
			}
		} else {
			one2many = false;
		}
		return one2many;

	}


	public abstract boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException;

	public abstract List<SpaControl> prepare() throws RepositoryException;

}
