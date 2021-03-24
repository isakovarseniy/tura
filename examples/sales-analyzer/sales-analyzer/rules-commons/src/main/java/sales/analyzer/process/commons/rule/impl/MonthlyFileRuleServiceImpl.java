/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package sales.analyzer.process.commons.rule.impl;

import java.util.ArrayList;
import java.util.List;

import org.drools.core.command.impl.GenericCommand;
import org.drools.core.command.runtime.BatchExecutionCommandImpl;
import org.drools.core.command.runtime.rule.DeleteObjectCommand;
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
        cmds.add(new DeleteObjectCommand(model,"DEFAULT"));
        
        @SuppressWarnings("unused")
		ExecutionResults results = rulesService.call(container, new BatchExecutionCommandImpl((List<GenericCommand<?>>) cmds));
        
		return model;
	}

}
