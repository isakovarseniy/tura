package sales.analyzer.service.jbpm;

import java.util.HashMap;
import java.util.Map;

import org.kie.server.client.KieServicesClient;
import org.kie.server.client.ProcessServicesClient;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

import sales.analyzer.api.model.impl.AssignInfo;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.api.model.impl.TerminateProcessEvent;
import sales.analyzer.process.commons.Constants;

public class JbpmCRUDService implements CRUDProvider{

	private KieServicesClient client;
	
	
	public JbpmCRUDService(KieServicesClient client ) {
		this.client = client;
	}

	
	public void setAdapterLoader(AdapterLoader loader) {
	}

	
	@Override
	public void execute(SpaControl control) throws Exception {
		if (control.getLevel().equals(OperationLevel.INSERT)) {
			insert(control);
			return;
		}
		if (control.getLevel().equals(OperationLevel.UPDATE)) {
			update(control);
			return;
		}
		if (control.getLevel().equals(OperationLevel.DELETE)) {
			delete(control);
			return;
		}
		
		if (control.getLevel().equals(OperationLevel.OPERATION)) {
			executeOperation(control);
			return;
		}
		
		throw new Exception("Unknown operation");
		
	}

	private void executeOperation(SpaControl control) {
		if ( control.getObject() instanceof  AssignInfo) {
			assignActor((AssignInfo) control.getObject() );
		}
		if ( control.getObject() instanceof  TerminateProcessEvent) {
			terminateFlow((TerminateProcessEvent) control.getObject() );
		}
		
	}


	private void terminateFlow(TerminateProcessEvent obj) {
		ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
		processClient.signalProcessInstance(Constants.CONTAINER_ID, obj.getProcessId(), Constants.SIGNAL_TERMINATE, obj);
	}


	private void assignActor(AssignInfo obj) {
		ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
		processClient.signalProcessInstance(Constants.CONTAINER_ID, obj.getProcessId(), Constants.SIGNAL_ASSIGN, obj);
	}


	private void insert(SpaControl control) throws Exception {
		if (control.getObject() instanceof SalesAnalyzerProcessInstance ) {
			insertProcess(control);
		}
		if (control.getObject() instanceof SalesAnalyzerTaskInstance ) {
			insertTask(control);
		}
	}
	


	private void update(SpaControl control) throws Exception {
		if (control.getObject() instanceof SalesAnalyzerProcessInstance ) {
			updateProcess(control);
		}
		if (control.getObject() instanceof SalesAnalyzerTaskInstance ) {
			updateTask(control);
		}
	}
	


	private void delete(SpaControl control) throws Exception {
		if (control.getObject() instanceof SalesAnalyzerProcessInstance ) {
			deleteProcess(control);
		}
		if (control.getObject() instanceof SalesAnalyzerTaskInstance ) {
			deleteTask(control);
		}
	}

	
	private void insertProcess(SpaControl control) {
		SalesAnalyzerProcessInstance pi = (SalesAnalyzerProcessInstance) control.getObject();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(Constants.VAR_STATE, pi.getState());
		map.put(Constants.VAR_CITY, pi.getCity());
		map.put(Constants.VAR_PRODUCT, pi.getProduct());
		map.put(Constants.VAR_CASE_ID,pi.getCaseId());
		
		ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
		processClient.startProcess(Constants.CONTAINER_ID, pi.getProcessId(), map );
		
	}

	private void insertTask(SpaControl control) {
		throw new UnsupportedOperationException("Task cannot be created manually");
	}



	private void updateProcess(SpaControl control) {
		throw new UnsupportedOperationException("Process cannot be modified manually");
		
	}


	private void updateTask(SpaControl control) {
		throw new UnsupportedOperationException("Task cannot be modified manually");
	}
	
	

	private void deleteProcess(SpaControl control) {
		throw new UnsupportedOperationException("Process cannot be deleted manually");
		
	}


	private void deleteTask(SpaControl control) {
		throw new UnsupportedOperationException("Task cannot be deleted manually");
	}
	
	
}

