package sales.analyzer.process.commons;

import org.jbpm.services.api.ProcessService;
import org.kie.server.services.api.KieServerExtension;
import org.kie.server.services.api.KieServerRegistry;
import org.kie.server.services.impl.KieServerImpl;
import org.kie.server.services.impl.KieServerLocator;

import sales.analyzer.process.commons.model.MonthlyFileRuleModel;

public class ProcessLauncher {

	private ProcessService processService;

	public ProcessLauncher() {
		KieServerImpl server = KieServerLocator.getInstance();
		KieServerRegistry registry = server.getServerRegistry();
		KieServerExtension extension =  registry.getServerExtension("jBPM");
		processService =  extension.getAppComponents(ProcessService.class);
	}

	public MonthlyFileRuleModel startProcess(MonthlyFileRuleModel model) {
		try {
			processService.startProcess(Constants.CONTAINER_ID, Constants.CASE_INVESTIGATION_PROCESS);
		} catch (Exception e) {
			model.setException(true);
		}
		return model;
	}

}
