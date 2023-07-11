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

package org.tura.platform.repository.cpa.operation;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RelationType;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class CpaDisconnectDetailFromMasterOperation extends SpaRepositoryCommand {

	private static final long serialVersionUID = -973059409190305616L;
	protected RepoObjectKey masterPk;
	protected RepoKeyPath extendedMasterPk;
	protected String masterProperty;
	protected RepoObjectKey detailPk;
	protected RepoKeyPath extendedDetailPk;
	protected String detailProperty;
	protected String masterType;
	protected String masterPersistanceType;
	protected String detailType;
	protected String detailPersistanceType;
	protected String extendedMasterType ;
	protected String extendedDetailType ;
	

	public CpaDisconnectDetailFromMasterOperation(Registry registry, SpaObjectRegistry spaRegistry){
		super(registry,spaRegistry);
	}
	
	
	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try {
			
			SearchProvider spDetail = this.providerHash.get(detailPersistanceType);
			PersistanceMapper detailMapper = findPersistanceMapper(Class.forName(detailType));

			Object persistanceDetailObject = spDetail.find(detailMapper.getPKey(detailPk),Class.forName(detailPersistanceType));
			if (persistanceDetailObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + detailPk.toString());
			}
			Object extendedPersistanceDetailObject = getExtendedObject(extendedDetailPk,persistanceDetailObject);
			

			SearchProvider spMaster = this.providerHash.get(masterPersistanceType);
			PersistanceMapper masterMapper = findPersistanceMapper(Class.forName(masterType));
			Object persistanceMasterObject = spMaster.find(masterMapper.getPKey(masterPk),Class.forName(masterPersistanceType));

			if (persistanceMasterObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + masterPk.toString());
			}
			
			Object extendedPersistanceMasterObject = getExtendedObject(extendedMasterPk,persistanceMasterObject);
			String relationId = findRelationId(extendedDetailPk, detailProperty);
			RelationType relationType = findRelationType(extendedDetailPk, detailProperty);

			CpaControl connectControl = new CpaControl( persistanceDetailObject,detailMapper.getPKey(detailPk), OperationLevel.DISCONNECT,registryName);
			connectControl.setDetailObject(persistanceMasterObject);
			connectControl.setDetailPk(masterMapper.getPKey(masterPk));
			connectControl.setMasterProperty(detailProperty);
			connectControl.setDetailProperty(masterProperty);
			connectControl.setRelationId(relationId);
			connectControl.setCpaRelationType(relationType);
			connectControl.setExtendedMasterObject(extendedPersistanceDetailObject);
			connectControl.setExtendedDetailObject(extendedPersistanceMasterObject);

			List<SpaControl> list= new ArrayList<>();
			list.add(connectControl);
			
			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}


	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		extendedMasterPk = (RepoKeyPath) parameters[0];
		masterPk = extendedMasterPk.getPath().get(0);
		masterProperty = (String) parameters[1];
		extendedDetailPk = (RepoKeyPath) parameters[2];
		detailPk = extendedDetailPk.getPath().get(0);
		detailProperty = (String) parameters[3];

		masterType = masterPk.getType();
		detailType = detailPk.getType();
		
		detailPersistanceType =  registry.findPersistanceClass(detailType);
		masterPersistanceType =  registry.findPersistanceClass(masterType);

		extendedMasterType = extendedMasterPk.getPath().get(extendedMasterPk.getPath().size()-1).getType();
		extendedDetailType = extendedDetailPk.getPath().get(extendedDetailPk.getPath().size()-1).getType();
		
		
		this.knownObjects.add(detailPersistanceType);
		this.knownObjects.add(masterPersistanceType);
		return true;
	}

}

