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

package sales.analyzer.service.jbpm.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.tura.platform.repository.core.Registry;
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
import org.tura.salesanalyzer.serialized.jbpm.CaseProcess;

import sales.analyzer.api.model.impl.AssignInfo;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;

public class AssignActorsCaseProcessCommand extends SpaRepositoryCommand {

	private static final long serialVersionUID = -1273552070053984329L;
	private RepoObjectKey pk;
	private RepoKeyPath extendedPk;
	private String property;
	private Object value;
	private String objectType;
	private String persistanceType;
	private static String ANALYST_ACTOR = "AnalystActor";
	private static String MANAGER_ACTOR = "ManagerActor";

	public AssignActorsCaseProcessCommand(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry, spaRegistry);
	}

	
	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		if (!RepositoryCommandType.update.equals(cmdType)) {
			return false;
		}
		extendedPk = (RepoKeyPath) parameters[0];
		pk = extendedPk.getPath().get(0);
		property = (String) parameters[1];
		value = parameters[2];

		objectType = pk.getType();
		RepoObjectKey updatedObjPk = extendedPk.getPath().get(extendedPk.getPath().size()-1);
		String updatedObjType = updatedObjPk.getType();
		if (CaseProcess.class.getName().equals(updatedObjType)) {
			if (property.equals(ANALYST_ACTOR)  || property.equals(MANAGER_ACTOR )) {
				persistanceType = registry.findPersistanceClass(objectType);
				this.knownObjects.add(persistanceType);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	
	
	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try {

			SearchProvider sp = this.providerHash.get(persistanceType);
			PersistanceMapper mapper = findPersistanceMapper(Class.forName(objectType));

			Object persistanceObject = sp.find(mapper.getPKey(pk), Class.forName(persistanceType));
			if (persistanceObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + pk.toString());
			}
			Object extendedPersistanceMasterObject = getExtendedObject(extendedPk,persistanceObject);
			
			SalesAnalyzerProcessInstance process = (SalesAnalyzerProcessInstance) extendedPersistanceMasterObject;
			SalesAnalyzerTaskInstance task = process.getActiveUserTasks().iterator().next();
			
			AssignInfo info = new AssignInfo();
			info.setId(task.getId());
			info.setProcessId(process.getId());
			if (ANALYST_ACTOR.equals(property)) {
				info.setAnalyst((String) value);
			}
			if (MANAGER_ACTOR.equals(property)) {
				info.setManager((String) value);
			}

			SpaControl control = new SpaControl(info, UUID.randomUUID().toString(), OperationLevel.OPERATION,registryName);
			control.setOriginalObject(persistanceObject);

			List<SpaControl> list = new ArrayList<>();
			list.add(control);
			return list;

		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

}
