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

package sales.analyzer.process;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.drools.core.command.impl.FixedKnowledgeCommandContext;
import org.drools.core.command.impl.GenericCommand;
import org.jbpm.process.core.context.variable.VariableScope;
import org.jbpm.process.instance.context.variable.VariableScopeInstance;
import org.jbpm.ruleflow.instance.RuleFlowProcessInstance;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.internal.command.Context;
import org.kie.internal.runtime.StatefulKnowledgeSession;

public class ProcessTests {

	private String PROCESS_ID = "sales.analyzer.HealthCheck";

	@Test
	public void passInitialParametersTest() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession();

			HashMap<String, Object> param = new HashMap<>();
			param.put("city", "Toronto");
			param.put("country", "Canada");

			ProcessInstance pLong = kSession.createProcessInstance(PROCESS_ID, param);

			Map<String, Object> variables = kSession.execute(new GenericCommand<Map<String, Object>>() {

				private static final long serialVersionUID = 1L;

				public Map<String, Object> execute(Context context) {
					StatefulKnowledgeSession ksession = (StatefulKnowledgeSession) ((FixedKnowledgeCommandContext) context)
							.getKieSession();
					RuleFlowProcessInstance processInstance = (RuleFlowProcessInstance) ksession.getProcessInstance(pLong.getId());
					VariableScopeInstance variableScope = (VariableScopeInstance) processInstance.getContextInstance(VariableScope.VARIABLE_SCOPE);
					Map<String, Object> variables = variableScope.getVariables();
					return variables;
				}
			});
			
			assertEquals( "Toronto", variables.get("city"));
			assertEquals( "Canada", variables.get("country"));
			
			
		} catch (Exception e) {
			fail();
		}

	}

}
