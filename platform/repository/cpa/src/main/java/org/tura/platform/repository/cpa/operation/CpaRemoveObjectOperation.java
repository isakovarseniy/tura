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

package org.tura.platform.repository.cpa.operation;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.cpa.operation.NotificationObjectControl.NotificationType;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class CpaRemoveObjectOperation extends CpaAbstractOperation{

	private static final long serialVersionUID = -502654482830498361L;
	private Object object;
	private String objectType;
	
	
	
	public CpaRemoveObjectOperation(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry,spaRegistry);
	}
	
	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try {
			
			PersistanceMapper mapper = findPersistanceMapper(object.getClass());
			Object persistancelObject = mapper.copyFromRepository2Persistence(object);
			Mapper p2rMapper = findMapper(object.getClass());
		
			SpaControl control = this.unloadOperation(p2rMapper, persistancelObject);
			if  (control == null ) {
				 control = new SpaControl(persistancelObject,p2rMapper.getPrimaryKey(persistancelObject), OperationLevel.DELETE,registryName);
			}
			List<SpaControl> list= new ArrayList<>();
			list.add(control);
			
			SpaControl notiificatioinControl = this.notificationOperation(mapper, persistancelObject, NotificationType.DELETE);
			if (  notiificatioinControl != null) {
				list.add(notiificatioinControl);
			}
			
			return list;
			
			
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}


	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		object = parameters[0];

		objectType = object.getClass().getName();
		String persistanceType =  registry.findPersistanceClass(objectType);
		
		this.knownObjects.add(persistanceType);
		return true;
	}

}