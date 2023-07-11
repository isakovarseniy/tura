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

package org.tura.platform.repository.cpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.data.ProxyData;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.RemoveTopObjectData;
import org.tura.platform.repository.data.UpdateObjectData;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.platform.repository.spa.SpaRepositoryData;
import org.tura.platform.repository.spa.SpaRepositoryHelper;

public class CommandPostTransformation extends SpaRepositoryHelper {

	private static final long serialVersionUID = 8614698367621678059L;
	private ProxyFactory factory;

	
	public CommandPostTransformation(SpaObjectRegistry spaRegistry, Registry registry) {
		super(registry, spaRegistry);
	}
	
	public void setFactory(ProxyFactory factory) {
		this.factory = factory;
	}



	public List<Object> postProcessing(List<Object> commands) throws RepositoryException {
		List<Object> c = filterByRemovedObjects(commands);
		includeCorrectionIndicator(c);
		return c;
	}
	
	public Object transformation(Object command) throws RepositoryException {
	      return adjustRemoveCommand(command);	
	}
	
	

	private void includeCorrectionIndicator(List<Object> commands) {
		for (Object c : commands) {
			if (c instanceof ProxyData) {
				ProxyData d = (ProxyData) c;
				Map<String, Object> param = d.getParams();
				if (param == null) {
					param = new HashMap<>();
				}
				param.put(Constants.UPDATE_CPA_STORAGE, true);
				param.put(Constants.CPA_MODIFICATION_SOURCE, UUID.randomUUID().toString());
				
			}
			if (c instanceof UpdateObjectData) {
				UpdateObjectData d = (UpdateObjectData) c;
				Map<String, Object> param = d.getParams();
				if (param == null) {
					param = new HashMap<>();
				}
				param.put(Constants.UPDATE_CPA_STORAGE, true);
			}
			
		}
	}

	private List<Object> filterByRemovedObjects(List<Object> commands) {
		List<RepoKeyPath> pkCollection = collectPkForDeletedObjects(commands);
		List<Object> array = new ArrayList<>();
		for (Object cmd : commands) {
			if (cmd instanceof UpdateObjectData) {
				if (!pkCollection.contains(((UpdateObjectData) cmd).getPk())) {
					array.add(cmd);
				}
			} else {
				array.add(cmd);
			}
		}
		return array;
	}

	private List<RepoKeyPath> collectPkForDeletedObjects(List<Object> commands) {
		List<RepoKeyPath> pkCollection = new ArrayList<>();
		for (Object cmd : commands) {
			if (cmd instanceof RemoveTopObjectData) {
				pkCollection.add(((RemoveTopObjectData) cmd).getPk());
			}
		}
		return pkCollection;
	}

	private Object adjustRemoveCommand(Object cmd) throws RepositoryException {
		try {
				if (cmd instanceof RemoveContainmentObjectData) {
					RemoveContainmentObjectData rmCmd = (RemoveContainmentObjectData) cmd;
					return processRemoveContainmentObjectData(rmCmd);
			}
			return cmd;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}
	
	
	private RemoveContainmentObjectData processRemoveContainmentObjectData(RemoveContainmentObjectData  rmCmd) throws Exception {
		RepoKeyPath extendedMasterPk = rmCmd.getMasterPk().clone();
		RepoObjectKey masterPk = extendedMasterPk.getPath().get(0);
		String masterType = masterPk.getType();
		String masterPersistanceType = registry.findPersistanceClass(masterType);
		String masterProperty = rmCmd.getMasterProperty();
		Object detailObject  = rmCmd.getObject();
		
		PersistanceMapper masterMapper = findPersistanceMapper(masterType);
		SpaRepository sp = (SpaRepository) registry.findProvider(masterType);
		sp.setSpaRepositoryData(new SpaRepositoryData());

		Object persistanceMasterObject = sp.find(masterMapper.getPKey(masterPk),
				Class.forName(masterPersistanceType));
		
		ObjectControl proxyMaster  = (ObjectControl) factory.factory(persistanceMasterObject, masterPersistanceType);
        Map<Object,Object> context = new HashMap<>();
        proxyMaster.add2Boundaries(context);

		extendedMasterPk.addRepoObjectKey(masterProperty, findRepoObjectKey(detailObject));  ;
		Object persistanceDetailObject = getExtendedObject(extendedMasterPk,proxyMaster);
		
		ObjectControl oc  = (ObjectControl) persistanceDetailObject;
		oc = (ObjectControl) oc.inMemory();
		
		rmCmd.setObject(oc.deepClone(context));
		return rmCmd;
	}

}
