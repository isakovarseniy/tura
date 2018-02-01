package sales.analyzer.process.commons.rule.impl;

import java.util.ArrayList;
import java.util.List;

import org.drools.core.command.impl.GenericCommand;
import org.drools.core.command.runtime.BatchExecutionCommandImpl;
import org.drools.core.command.runtime.rule.FireAllRulesCommand;
import org.drools.core.command.runtime.rule.InsertObjectCommand;
import org.kie.api.runtime.ExecutionResults;
import org.kie.server.services.api.KieServerRegistry;
import org.kie.server.services.drools.RulesExecutionService;
import org.kie.server.services.impl.KieContainerInstanceImpl;
import org.kie.server.services.impl.KieServerImpl;
import org.kie.server.services.impl.KieServerLocator;

import sales.analyzer.process.commons.Constants;
import sales.analyzer.process.commons.model.MonthlyFileRuleModel;

public class MonthlyFileRuleServiceImpl {

	private RulesExecutionService rulesService;
	private KieContainerInstanceImpl container;

	public MonthlyFileRuleServiceImpl() {
		KieServerImpl server =  KieServerLocator.getInstance(); 
		KieServerRegistry registry =   server.getServerRegistry();
		rulesService =   new RulesExecutionService (registry);
		container =   registry.getContainer(Constants.CONTAINER_ID);
	}

	public MonthlyFileRuleModel execute(MonthlyFileRuleModel model) {
		
	    List<GenericCommand<?>> cmds = new ArrayList<GenericCommand<?>>();

	    cmds.add( new InsertObjectCommand(model));
        cmds.add(new FireAllRulesCommand());
        
        ExecutionResults results = rulesService.call(container, new BatchExecutionCommandImpl((List<GenericCommand<?>>) cmds));
        
		return model;
	}

}
