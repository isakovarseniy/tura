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

package org.tura.platform.repository.spa.operation;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.persistence.PersistanceRelationBuilder;
import org.tura.platform.repository.persistence.RelOperation;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;
import org.tura.platform.repository.spa.priority.LinkControl;

public class SpaDisconnectDetailFromMasterOperation extends SpaRepositoryCommand {

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
	

	public SpaDisconnectDetailFromMasterOperation(Registry registry, SpaObjectRegistry spaRegistry){
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
			
//			if (!beckwardProperty(extendedPersistanceDetailObject,detailProperty)){
//				return new ArrayList<>();
//			}

			SearchProvider spMaster = this.providerHash.get(masterPersistanceType);
			PersistanceMapper masterMapper = findPersistanceMapper(Class.forName(masterType));
			Object persistanceMasterObject = spMaster.find(masterMapper.getPKey(masterPk),Class.forName(masterPersistanceType));

			if (persistanceMasterObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + masterPk.toString());
			}
			Object extendedPersistanceMasterObject = getExtendedObject(extendedMasterPk,persistanceMasterObject);

			
//			RelOperation relation = PersistanceRelationBuilder.build(extendedPersistanceDetailObject.getClass(), detailProperty,
//					extendedPersistanceMasterObject.getClass(), masterProperty);
			
		    RelOperation relation = PersistanceRelationBuilder.build(Class.forName(extendedDetailType), detailProperty);
			
			relation.disconnect(extendedPersistanceDetailObject, extendedPersistanceMasterObject);

			SpaControl detailControl = new SpaControl(persistanceDetailObject,detailMapper.getPKey(detailPk), OperationLevel.UPDATE,registryName);

			LinkControl  linkControl = new LinkControl(persistanceMasterObject, masterMapper.getPKey( masterPk), OperationLevel.UNLINK, registryName);
			linkControl.setMasterPk( masterMapper.getPKey( masterPk));
			linkControl.setMasterType(persistanceMasterObject);
			linkControl.setDetailPk(detailMapper.getPKey(detailPk));
			linkControl.setDetailType(persistanceDetailObject);
			linkControl.setExtendedMasterPk(extendedMasterPk);
			linkControl.setExtendedDetailPk(extendedDetailPk);
			linkControl.setOposit(true);
			
			List<SpaControl> list= new ArrayList<>();
			list.add(detailControl);
			list.add(linkControl);
			
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

