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

import java.util.Map;

import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.cpa.operation.NotificationObjectControl.NotificationType;
import org.tura.platform.repository.cpa.storage.CpaMapper;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public abstract class CpaAbstractOperation extends SpaRepositoryCommand{

	private static final long serialVersionUID = 6455834764736167995L;


	public CpaAbstractOperation(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry, spaRegistry);
	}

	
	@SuppressWarnings("unchecked")
	protected CpaUpdateStorageControl statusCorrection(Mapper p2rMapper , Object persistancelObject ) throws Exception {
		
		CpaUpdateStorageControl control = null;			
		if ( params != null && params.get(Constants.CPA_OPERATION)  != null) {
			String operation = (String) params.get(Constants.CPA_OPERATION);
			if ( OperationLevel.CREATE.name().equals(operation)) {
				control = new CpaUpdateStorageControl( persistancelObject  ,p2rMapper.getPrimaryKey(persistancelObject), OperationLevel.OPERATION,registryName);
				control.setProperty( Constants.STORAGE_CONTROL_STATUS);
				control.setValue(ObjectStatus.Created.name());
			}
			if ( OperationLevel.LOAD.name().equals(operation)) {
				Map<Object,Map<Object, String>>  collected =  (Map<Object, Map<Object, String>>) params.get(Constants.CPA_ID_MAPPERS);
				if (collected != null && collected.size() != 0) {
					Object pk = p2rMapper.getPath(persistancelObject).toString();
					Map<Object, String> mp = collected.get(pk);
					if ( mp != null) {
						CpaMapper cpaMapper = (CpaMapper) p2rMapper;
						cpaMapper.replaceCpaIds(persistancelObject, mp);
					}
				}
				Class<?> loadedBy =  (Class<?>) params.get(Constants.CPA_LOADED_BY);
				control = new CpaUpdateStorageControl( persistancelObject  ,p2rMapper.getPrimaryKey(persistancelObject), OperationLevel.OPERATION,registryName);
				control.setProperty( Constants.STORAGE_CONTROL_STATUS);
				control.setValue(ObjectStatus.Loaded.name());
				control.setLoadedBy(loadedBy);
			}
		}
		return control;
	}
	
	protected SpaControl unloadOperation(Mapper p2rMapper , Object persistancelObject ) throws Exception {
		SpaControl control = null;
		if ( params != null && params.get(Constants.CPA_OPERATION)  != null) {
			String operation = (String) params.get(Constants.CPA_OPERATION);
			if ( OperationLevel.UNLOAD.name().equals(operation)) {
				control = new SpaControl(persistancelObject,p2rMapper.getPrimaryKey(persistancelObject), OperationLevel.UNLOAD,registryName);
			}			
		}
		return control;
	}
	
	protected SpaControl notificationOperation(PersistanceMapper p2rMapper , Object persistancelObject,  NotificationType notificationType ) throws Exception {
		NotificationObjectControl control = null;
		if ( params != null && params.get(Constants.CPA_MODIFICATION_SOURCE)  != null) {
			String sourceId = (String) params.get(Constants.CPA_MODIFICATION_SOURCE);
			control = new  NotificationObjectControl(persistancelObject,p2rMapper.getPrimaryKeyFromRepositoryObject(persistancelObject), OperationLevel.NOTIFICATION,registryName);
			control.setSourceId(sourceId);
			control.setNotificationSourceObject(persistancelObject);
			control.setNotificationType(notificationType);
		}
		return control;
	}	
	
	
	protected boolean isUpdateStorageCommand() {
		if ( params != null && params.get(Constants.UPDATE_CPA_STORAGE)  != null) {
			return true;
		}		
		return false;
	}
	
}
