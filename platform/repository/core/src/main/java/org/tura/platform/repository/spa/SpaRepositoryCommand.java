/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.core.KeyMapperHelper;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.persistence.PersistanceMapper;

public abstract class SpaRepositoryCommand extends SpaRepositoryHelper {

	private static final long serialVersionUID = 613281003437954850L;
	protected Map<String, SearchProvider> providerHash = new HashMap<>();
	protected List<String> knownObjects = new ArrayList<>();
	protected Map<String, Object> params;
	protected SpaRepositoryData spaRepositoryData;

	public SpaRepositoryCommand(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry, spaRegistry);
	}

	public SpaRepositoryData getSpaRepositoryData() {
		return spaRepositoryData;
	}

	public void setSpaRepositoryData(SpaRepositoryData spaRepositoryData) {
		this.spaRepositoryData = spaRepositoryData;
	}

	public List<String> getListOfKnownObjects() {
		return knownObjects;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public void addSearchProvider(String className, SearchProvider provider) {
		providerHash.put(className, provider);
	}

	protected List<SpaControl> createNOPcontrol(RepoObjectKey pk, String type, String persistancType) throws RepositoryException {
		try {
			SearchProvider sp = this.providerHash.get(persistancType);
			PersistanceMapper mapper = findPersistanceMapper(Class.forName(type));
			Object persistanceObject = sp.find(mapper.getPKey(pk), Class.forName(persistancType));
			SpaControl control = new SpaControl(persistanceObject, mapper.getPKey(pk), OperationLevel.NOP, registryName);
			List<SpaControl> list = new ArrayList<>();
			list.add(control);

			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}


	public Object mapPk(String type, Object obj, Object oldPk) throws RepositoryException {
		return new KeyMapperHelper(this, spaRepositoryData.getKeyMapper()).mapPk(type, obj, oldPk);
	}

	public Object findPK(Object oldPK, String type) {
		return new KeyMapperHelper(this, spaRepositoryData.getKeyMapper()).findPK(oldPK, type);
	}

	public Object findReversePK(Object newPK, String type) {
		return new KeyMapperHelper(this, spaRepositoryData.getKeyMapper()).findReversePK(newPK, type);
	}

	public abstract boolean checkCommand(RepositoryCommandType cmdType, Object... parameters)
			throws RepositoryException;

	public abstract List<SpaControl> prepare() throws RepositoryException;

}
