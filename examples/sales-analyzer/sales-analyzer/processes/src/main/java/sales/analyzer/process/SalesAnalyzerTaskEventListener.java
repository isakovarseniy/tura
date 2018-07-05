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

				TaskExtendedInfo taskInfo = new TaskExtendedInfo();
				taskInfo.setProcessId(processInstance.getId());
				taskInfo.setTaskId(event.getTask().getId());
				BusinessInfo info = new BusinessInfo();
				info.setProduct(product);
				info.setState(state);
				info.setCity(city);
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
