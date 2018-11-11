package sales.analyzer.ui.triggers.casemanager;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.IBeanFactory;


@Alternative
@Priority(10)
@Selector("analysis.casemanager")
public class PreFormTrigger implements FactoryInitializeTrigger{

	@Override
	public void execute(Object obj) throws TuraException {
		IBeanFactory bf = (IBeanFactory) obj;
		bf.setShowSearchPanelForWI(false);
	}

}
