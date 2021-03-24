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

package org.tura.platform.repository.jpa.operation;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class JpaAddObjectOperation extends SpaRepositoryCommand {

	private static final long serialVersionUID = -2462362979960187509L;
	Object object;
    String repositoryType;
	String persistanceType;

    public JpaAddObjectOperation(Registry registry,SpaObjectRegistry spaRegistry){
    	super(registry,spaRegistry);
    }
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public void execute() throws Exception {
	}

	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {

		Object repositoryObject_ = parameters[0];

		PersistanceMapper mapper = findPersistanceMapper(repositoryObject_.getClass().getName());
		Object persistanceObject = mapper.copyFromRepository2Persistence(repositoryObject_);
		setObject(persistanceObject);
		persistanceType = persistanceObject.getClass().getName();
        repositoryType = repositoryObject_.getClass().getName();
        
		this.knownObjects.add(persistanceType);

		
        return true;
    }

    @Override
    public List<SpaControl> prepare() throws RepositoryException {
//        JpaSearchService sp = (JpaSearchService) this.providerHash.get(persistanceType);
//        sp.getEm().merge(getObject());

        Mapper p2rMapper = findMapper(repositoryType);
        
        SpaControl masterControl = new SpaControl(object,p2rMapper.getPrimaryKey(object), OperationLevel.INSERT,registryName);
        
        List<SpaControl> list= new ArrayList<>();
        list.add(masterControl);
        return list;
        
        
	}

}
