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

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RelationType;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Internal;
import org.tura.platform.repository.persistence.PersistanceMapper;

public  class SpaRepositoryHelper extends RepositoryHelper {

	private static final long serialVersionUID = 1L;
	protected SpaObjectRegistry spaRegistry;
	protected String registryName;
	
	
	public  SpaRepositoryHelper(Registry registry, SpaObjectRegistry spaRegistry  ) {
		super(registry);
		this .spaRegistry = spaRegistry;
	}

	
	public void setRegistryName(String registryName) {
		this.registryName = registryName;
	}

	public String getRegistryName() {
		return this.registryName;
	}
	
	
	protected PersistanceMapper findPersistanceMapper(Class<?> repositoryClass) throws RepositoryException {
		String persistanceClassName = registry.findPersistanceClass(repositoryClass.getName());

		PersistanceMapper mapper = spaRegistry.getRegistry(registryName).findMapper(persistanceClassName,
				repositoryClass.getName());
		if (mapper == null) {
			SpaRepository repository = (SpaRepository) registry.findProvider(repositoryClass.getName());
			if (repository != null) {
				mapper = spaRegistry.getRegistry(repository.getRegistryName()).findMapper(persistanceClassName,
						repositoryClass.getName());
				if (mapper != null) {
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

	protected String getJpaRepositoryClassName(RepoKeyPath pk) throws RepositoryException {
		return pk.getPath().get(0).getType();
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

	public String findRelationId(RepoKeyPath pk, String property) throws Exception {
		int idx = pk.getPath().size() - 1;
		String className = pk.getPath().get(idx).getType();
		Class<?> clazz = Class.forName(className);
		String methodName = "get" + WordUtils.capitalize(property);
		Method masterMethod = clazz.getMethod(methodName, new Class<?>[] {});

		Association association = masterMethod.getAnnotation(Association.class);
		if (association != null) {
			return association.id();
		}

		Internal internal = masterMethod.getAnnotation(Internal.class);
		if (internal != null) {
			return internal.id();
		}
		return null;
	}

	public RelationType findRelationType(RepoKeyPath pk, String property) throws Exception {
		int idx = pk.getPath().size() - 1;
		String className = pk.getPath().get(idx).getType();
		Class<?> clazz = Class.forName(className);
		String methodName = "get" + WordUtils.capitalize(property);
		Method masterMethod = clazz.getMethod(methodName, new Class<?>[] {});

		Association association = masterMethod.getAnnotation(Association.class);
		if (association != null) {
			return association.direction();
		}
		return null;
	}
	
	
	public boolean isLazy(RepoKeyPath pk, String property) throws Exception {
		int idx = pk.getPath().size() - 1;
		String className = pk.getPath().get(idx).getType();
		Class<?> clazz = Class.forName(className);
		String methodName = "get" + WordUtils.capitalize(property);
		Method masterMethod = clazz.getMethod(methodName, new Class<?>[] {});

		Association association = masterMethod.getAnnotation(Association.class);
		if (association != null) {
			return association.lazy();
		}
		return false;
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

	
}
