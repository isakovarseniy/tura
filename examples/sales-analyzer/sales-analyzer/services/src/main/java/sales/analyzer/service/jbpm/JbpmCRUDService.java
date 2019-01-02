package sales.analyzer.service.jbpm;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.task.model.Status;
import org.kie.server.api.model.instance.TaskInstance;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.UserTaskServicesClient;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

import sales.analyzer.api.model.impl.AssignInfo;
import sales.analyzer.api.model.impl.ETLProcessInstance;
import sales.analyzer.api.model.impl.EtlMLPMessage;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.api.model.impl.TaskComletion;
import sales.analyzer.api.model.impl.TerminateProcessEvent;
import sales.analyzer.process.commons.Constants;

public class JbpmCRUDService implements CRUDProvider {

	private KieServicesClient client;

	public JbpmCRUDService(KieServicesClient client) {
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
		if (control.getObject() instanceof AssignInfo) {
			assignActor((AssignInfo) control.getObject());
		}
		if (control.getObject() instanceof TerminateProcessEvent) {
			terminateFlow((TerminateProcessEvent) control.getObject());
		}
		if (control.getObject() instanceof TaskComletion) {
			completeTask((TaskComletion) control.getObject());
		}
		if (control.getObject() instanceof EtlMLPMessage) {
			completeTask((EtlMLPMessage) control.getObject());
		}
	}

	private void completeTask(EtlMLPMessage obj) {
		UserTaskServicesClient taskClient = client.getServicesClient(UserTaskServicesClient.class);
		TaskInstance task = taskClient.getTaskInstance(Constants.CONTAINER_ID, obj.getTaskId());
		
		if (Status.Ready.name().equals(task.getStatus())) {
			taskClient.claimTask(Constants.CONTAINER_ID, obj.getTaskId(), null);
			taskClient.startTask(Constants.CONTAINER_ID, obj.getTaskId(), null);
		}

		if (Status.Reserved.name().equals(task.getStatus())) {
			taskClient.startTask(Constants.CONTAINER_ID, obj.getTaskId(), null);
		}
		Map<String, Object> params = new HashMap<>();
		if (obj.getDirection() != null) {
			params.put("direction", obj.getDirection());
		}
		if (obj.getLoadingDate() != null) {
			params.put("dateOfFile", obj.getLoadingDate());
		}

		taskClient.completeTask(Constants.CONTAINER_ID, obj.getTaskId(), null, params);
		
	}

	private void terminateFlow(TerminateProcessEvent obj) {
		ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
		processClient.signalProcessInstance(Constants.CONTAINER_ID, obj.getProcessId(), Constants.SIGNAL_TERMINATE,
				obj);
	}

	private void assignActor(AssignInfo obj) {
		ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
		processClient.signalProcessInstance(Constants.CONTAINER_ID, obj.getProcessId(), Constants.SIGNAL_ASSIGN, obj);
	}

	private void completeTask(TaskComletion obj) {
		UserTaskServicesClient taskClient = client.getServicesClient(UserTaskServicesClient.class);
		TaskInstance task = taskClient.getTaskInstance(Constants.CONTAINER_ID, obj.getTaskId());
		if (Status.Reserved.name().equals(task.getStatus())) {
			taskClient.startTask(Constants.CONTAINER_ID, obj.getTaskId(), null);
		}
		Map<String, Object> params = new HashMap<>();
		if (obj.getDirection() != null) {
			params.put("direction", obj.getDirection());
		}

		taskClient.completeTask(Constants.CONTAINER_ID, obj.getTaskId(), null, params);
	}

	private void insert(SpaControl control) throws Exception {
		if (control.getObject() instanceof SalesAnalyzerProcessInstance) {
			insertProcess(control);
		}
		if (control.getObject() instanceof SalesAnalyzerTaskInstance) {
			insertTask(control);
		}
		if (control.getObject() instanceof ETLProcessInstance) {
			insertProcess(control);
		}
		
	}

	private void update(SpaControl control) throws Exception {
		if (control.getObject() instanceof SalesAnalyzerProcessInstance) {
			updateProcess(control);
		}
		if (control.getObject() instanceof SalesAnalyzerTaskInstance) {
			updateTask(control);
		}
	}

	private void delete(SpaControl control) throws Exception {
		if (control.getObject() instanceof SalesAnalyzerProcessInstance) {
			deleteProcess(control);
		}
		if (control.getObject() instanceof SalesAnalyzerTaskInstance) {
			deleteTask(control);
		}
	}

	private void insertProcess(SpaControl control) {
		if (control.getObject() instanceof SalesAnalyzerProcessInstance) {
			SalesAnalyzerProcessInstance pi = (SalesAnalyzerProcessInstance) control.getObject();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(Constants.VAR_STATE, pi.getState());
			map.put(Constants.VAR_CITY, pi.getCity());
			map.put(Constants.VAR_PRODUCT, pi.getProduct());
			map.put(Constants.VAR_CASE_ID, pi.getCaseId());

			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
			processClient.startProcess(Constants.CONTAINER_ID, pi.getProcessId(), map);
			return;
		}
		
		if (control.getObject() instanceof ETLProcessInstance) {
			ETLProcessInstance pi = (ETLProcessInstance) control.getObject();
			Map<String, Object> map = new HashMap<String, Object>();

			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
			processClient.startProcess(Constants.CONTAINER_ID, pi.getProcessId(), map);
			return;
		}
		throw new UnsupportedOperationException("Unsuported object" + control.getObject().getClass().getName());

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
