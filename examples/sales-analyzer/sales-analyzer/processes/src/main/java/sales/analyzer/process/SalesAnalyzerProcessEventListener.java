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

package sales.analyzer.process;

import org.jbpm.process.core.context.variable.VariableScope;
import org.jbpm.process.instance.context.variable.VariableScopeInstance;
import org.jbpm.ruleflow.instance.RuleFlowProcessInstance;
import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;

import sales.analyzer.process.commons.Constants;

public class SalesAnalyzerProcessEventListener implements  ProcessEventListener{

	@Override
	public void afterNodeLeft(ProcessNodeLeftEvent event) {
		
	}

	@Override
	public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
		if (event.getNodeInstance().getNodeName().equals(Constants.ASSIGN_ACTOR)) {
			VariableScopeInstance variableScopeInstance = (VariableScopeInstance) ((RuleFlowProcessInstance ) event.getProcessInstance()).getContextInstance(VariableScope.VARIABLE_SCOPE);
			if (variableScopeInstance != null) {
				CaseDetails caseDetails = (CaseDetails) variableScopeInstance.getVariable(Constants.VAR_CASEDETAILS);
				String analystActor = (String) variableScopeInstance.getVariable (Constants.VAR_ANALYSTACTOR);
				String managerActor = (String) variableScopeInstance.getVariable (Constants.VAR_MANAGERACTOR);
				caseDetails.getInfo().setAnalystActor(analystActor);
				caseDetails.getInfo().setManagerActor(managerActor);
			    variableScopeInstance.setVariable(Constants.VAR_CASEDETAILS, caseDetails);
			}
		}
	}

	@Override
	public void afterProcessCompleted(ProcessCompletedEvent event) {
		
	}

	@Override
	public void afterProcessStarted(ProcessStartedEvent event) {
		
	}

	@Override
	public void afterVariableChanged(ProcessVariableChangedEvent event) {
		
	}

	@Override
	public void beforeNodeLeft(ProcessNodeLeftEvent event) {
		
	}

	@Override
	public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
		if ( Constants.CASE_INVESTIGATION_PROCESS.equals( event.getProcessInstance().getProcessId() )) {
			if (event.getNodeInstance().getNodeName().equals(Constants.PROCESS_CONSTRUCTOR)) {
				VariableScopeInstance variableScopeInstance = (VariableScopeInstance) ((RuleFlowProcessInstance ) event.getProcessInstance()).getContextInstance(VariableScope.VARIABLE_SCOPE);
				if (variableScopeInstance != null) {
					Integer state = (Integer) variableScopeInstance.getVariable(Constants.VAR_STATE); 
					String product = (String) variableScopeInstance.getVariable(Constants.VAR_PRODUCT); 
					Integer city = (Integer) variableScopeInstance.getVariable(Constants.VAR_CITY); 
					String caseId = (String) variableScopeInstance.getVariable(Constants.VAR_CASE_ID);
					
					
					if (caseId == null || caseId.equals("")) {
						caseId = new Long(event.getProcessInstance().getId()).toString();
					}
					CaseDetails caseDetails = new CaseDetails();
					BusinessInfo info = new BusinessInfo();
					info.setProduct(product);
					info.setState(state);
					info.setCity(city);
					info.setCaseId(caseId);
					
					caseDetails.setInfo(info);
				    variableScopeInstance.setVariable(Constants.VAR_CASEDETAILS, caseDetails);
				}				
			}
		}
	}

	@Override
	public void beforeProcessCompleted(ProcessCompletedEvent event) {
		
	}

	@Override
	public void beforeProcessStarted(ProcessStartedEvent event) {
		
	}

	@Override
	public void beforeVariableChanged(ProcessVariableChangedEvent event) {
		
	}

}
