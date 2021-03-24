/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Connection;
import org.tura.platform.repository.persistence.ConnectionProcessor;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class SpaExternalConnectMasterToDetailOperation extends SpaConnectMasterToDetailOperation{

	private static final long serialVersionUID = -7419164235363434789L;
	private boolean NOP;

	public SpaExternalConnectMasterToDetailOperation(Registry registry,SpaObjectRegistry spaRegistry) {
		super(registry,spaRegistry);
	}
	
	
	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		if (NOP){
			return new ArrayList<>();
		}
		return super.prepare();
	}	

	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		try {
			
			if (!RepositoryCommandType.connectMasterToDetail.equals(cmdType) ){
				return false;
			}
			
			super.checkCommand(cmdType, parameters);
			String methodName = "get" + WordUtils.capitalize(masterProperty);
			Class<?> masterClass = Class.forName(extendedMasterType);
			Method m = masterClass.getMethod(methodName);
			Connection connection = m.getAnnotation(Connection.class);
			if (connection != null) {
				Association association = m.getAnnotation(Association.class);
				Class<?> detailClass = Class.forName(extendedDetailType);

				Repository masterProvider =   findProvider(masterClass.getName());
				Repository detailProvider =   findProvider(detailClass.getName());
				if (masterProvider.equals(detailProvider)){
					return false;
				}
				
				
				ConnectionProcessor relation = new ConnectionProcessor(connection, association);
				Map<String, Class<?>> h = relation.sortObject(masterClass, detailClass);
				
				if (masterClass.equals(h.get(ConnectionProcessor.DETAIL))){
					
					this.knownObjects.add(masterPersistanceType);
					this.knownObjects.add(detailPersistanceType);
					NOP = false;
					return true;
				}else{
					NOP = true;
					return true;
				}
			}else{
				return false;
			}
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}
	
	
}
