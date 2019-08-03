package sales.analyzer.ui.businesslogic.admin;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;


@Alternative
@Priority(10)
@Selector("admin.administration")
public class PreFormTrigger implements FactoryInitializeTrigger{

	@Override
	public void execute(Object obj) throws TuraException {
		IBeanFactory bf = (IBeanFactory) obj;
		bf.setActiveIndex(2);
		
	}

}
