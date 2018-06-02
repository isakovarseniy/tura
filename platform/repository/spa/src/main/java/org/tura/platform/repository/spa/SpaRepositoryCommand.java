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

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.operation.PathHelper;

public abstract class SpaRepositoryCommand extends RepositoryHelper{

	protected Map<String, SearchProvider> providerHash = new HashMap<>();
	protected List<String> knownObjects = new ArrayList<>();
	protected String registry;

	public List<String> getListOfKnownObjects() {
		return knownObjects;
	}

	public void addSearchProvider(String className, SearchProvider provider) {
		providerHash.put(className, provider);
	}

	protected PersistanceMapper findPersistanceMapper(Class<?> repositoryClass) throws RepositoryException {
		String persistanceClassName = Registry.getInstance().findPersistanceClass(repositoryClass.getName());

		PersistanceMapper mapper = SpaObjectRegistry.getInstance().getRegistry(registry)
				.findMapper(persistanceClassName, repositoryClass.getName());
		if (mapper == null) {
			throw new RepositoryException(
					"PersistanceMapper not found from " + persistanceClassName + " to " + repositoryClass.getName());
		}
		return mapper;
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
		this.registry = registry;
	}
	

	protected Object getExtendedObject(RepoKeyPath extendedPk, Object persistanceObject) throws Exception {
		return PathHelper.getPathValue(extendedPk, 1, persistanceObject);
	}

	

	public abstract boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException;

	public abstract List<SpaControl> prepare() throws RepositoryException;

}
