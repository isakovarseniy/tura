package sales.analyzer.ui.businesslogic.etlcontroller;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.IBeanFactory;


@Alternative
@Priority(10)
@Selector("dataloader.etlcontroller")
public class PreFormTrigger implements FactoryInitializeTrigger{

	@Override
	public void execute(Object obj) throws TuraException {
		IBeanFactory bf = (IBeanFactory) obj;
		bf.setActiveIndex(0);
		
	}

}
