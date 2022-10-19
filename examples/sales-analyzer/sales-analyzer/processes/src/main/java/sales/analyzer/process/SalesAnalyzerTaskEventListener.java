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

package sales.analyzer.process;

import org.jbpm.process.core.context.variable.VariableScope;
import org.jbpm.process.instance.context.variable.VariableScopeInstance;
import org.jbpm.workflow.instance.WorkflowProcessInstance;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.api.task.TaskEvent;
import org.kie.api.task.TaskLifeCycleEventListener;

import sales.analyzer.process.commons.Constants;

public class SalesAnalyzerTaskEventListener implements TaskLifeCycleEventListener {

	private RuntimeManager runtimeManager;

	public SalesAnalyzerTaskEventListener(RuntimeManager runtimeManager) {
		this.runtimeManager = runtimeManager;
	}

	@Override
	public void afterTaskActivatedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskAddedEvent(TaskEvent event) {
		RuntimeEngine engine = runtimeManager.getRuntimeEngine(null);
		KieSession ksession = engine.getKieSession();

		WorkflowProcessInstance processInstance = (WorkflowProcessInstance) ksession.getProcessInstance(event.getTask().getTaskData().getProcessInstanceId());

		if (Constants.CASE_INVESTIGATION_PROCESS.equals(processInstance.getProcessId())) {

			VariableScopeInstance variableScopeInstance = (VariableScopeInstance) processInstance.getContextInstance(VariableScope.VARIABLE_SCOPE);
			if (variableScopeInstance != null) {
				Integer state = (Integer) variableScopeInstance.getVariable(Constants.VAR_STATE);
				String product = (String) variableScopeInstance.getVariable(Constants.VAR_PRODUCT);
				Integer city = (Integer) variableScopeInstance.getVariable(Constants.VAR_CITY);
				String caseId = (String) variableScopeInstance.getVariable(Constants.VAR_CASE_ID);

				if (caseId == null || caseId.equals("")) {
					caseId = new Long(processInstance.getId()).toString();
				}
				
				TaskExtendedInfo taskInfo = new TaskExtendedInfo();
				taskInfo.setProcessId(processInstance.getId());
				taskInfo.setTaskId(event.getTask().getId());
				BusinessInfo info = new BusinessInfo();
				info.setProduct(product);
				info.setState(state);
				info.setCity(city);
				info.setCaseId(caseId);
				taskInfo.setInfo(info);

				variableScopeInstance.setVariable("VAR" + event.getTask().getId().toString(), taskInfo);

			}
		}
	}

	@Override
	public void afterTaskClaimedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskCompletedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskDelegatedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskExitedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskFailedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskForwardedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskNominatedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskReleasedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskResumedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskSkippedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskStartedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskStoppedEvent(TaskEvent event) {

	}

	@Override
	public void afterTaskSuspendedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskActivatedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskAddedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskClaimedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskCompletedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskDelegatedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskExitedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskFailedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskForwardedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskNominatedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskReleasedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskResumedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskSkippedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskStartedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskStoppedEvent(TaskEvent event) {

	}

	@Override
	public void beforeTaskSuspendedEvent(TaskEvent event) {

	}

}
