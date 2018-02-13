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
