package sales.analyzer.process;

import org.jbpm.ruleflow.instance.RuleFlowProcessInstance;
import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.jbpm.process.core.context.variable.VariableScope;
import org.jbpm.process.instance.context.variable.VariableScopeInstance;

import sales.analyzer.process.commons.Constants;

public class SalesAnalyzerProcessEventListener implements  ProcessEventListener{

	@Override
	public void afterNodeLeft(ProcessNodeLeftEvent event) {
		
	}

	@Override
	public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
		
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
					String state = (String) variableScopeInstance.getVariable(Constants.VAR_STATE); 
					String product = (String) variableScopeInstance.getVariable(Constants.VAR_PRODUCT); 
					String city = (String) variableScopeInstance.getVariable(Constants.VAR_CITY); 
					
					CaseDetails caseDetails = new CaseDetails();
					caseDetails.setProduct(product);
					caseDetails.setState(state);
					caseDetails.setCity(city);
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
