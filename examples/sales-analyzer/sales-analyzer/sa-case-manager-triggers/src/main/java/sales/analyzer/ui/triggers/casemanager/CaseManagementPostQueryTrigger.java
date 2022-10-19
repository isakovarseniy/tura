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

package sales.analyzer.ui.triggers.casemanager;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.CaseManagerArtifitialFieldsAdapter;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.db.State;
import org.tura.salesanalyzer.serialized.jbpm.CaseProcess;



@Alternative
@Priority(10)
@Selector("analysis.casemanager")
@PostQuery("caseManager")

public class CaseManagementPostQueryTrigger  implements PostQueryTrigger{

	private static final long serialVersionUID = 3744745396980765972L;
	@Inject
	ELResolver elResolver;

	
	@SuppressWarnings("rawtypes")
	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		
		IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		
		CaseProcess process = (CaseProcess) obj;
		CaseManagerArtifitialFieldsAdapter adapter = new CaseManagerArtifitialFieldsAdapter((ObjectControl) process);

		DataControl dc = (DataControl) bf.getCity();
		bf.setCityId(process.getCity());
		dc.forceRefresh();
		City city =   (City) dc.getCurrentObject();

		adapter.setCityName(city.getName());
		
		dc = (DataControl) bf.getState();
		bf.setStateId(process.getStates());
		dc.forceRefresh();
		State state =   (State) dc.getCurrentObject();
		adapter.setStateName(state.getName());
		
		adapter.setStatus(process.getActiveUserTasks().get(0).getName());
		
		adapter.setAssignTo(process.getActiveUserTasks().get(0).getActualOwner());
		
	}

}
