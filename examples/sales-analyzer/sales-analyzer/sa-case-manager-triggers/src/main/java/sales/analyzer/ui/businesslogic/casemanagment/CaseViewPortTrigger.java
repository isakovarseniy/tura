package sales.analyzer.ui.businesslogic.casemanagment;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.annotations.ViewPortTrigger;
import org.tura.platform.datacontrol.command.ViewPortCommand;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.IBeanFactory;


@Alternative
@Priority(10)
@Selector("analysis.casemanager")
@ViewPortTrigger("caseViewport")
public class CaseViewPortTrigger extends ViewPortCommand{

	@Inject
	ELResolver elResolver;
	
	@Override
	public Object execute() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		if ("CASE".equals(bf.getCanvasType())) {
			return "/analysis/casemanager/CaseDescription.xhtml";
		}else {
			return "/analysis/casemanager/WorkItemCanvase.xhtml";
		}
	}
}
