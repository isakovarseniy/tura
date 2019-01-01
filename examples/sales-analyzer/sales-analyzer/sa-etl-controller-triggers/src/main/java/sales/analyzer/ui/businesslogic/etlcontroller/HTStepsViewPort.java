package sales.analyzer.ui.businesslogic.etlcontroller;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.annotations.ViewPortTrigger;
import org.tura.platform.datacontrol.command.ViewPortCommand;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.IBeanFactory;


@Alternative
@Priority(10)
@Selector("dataloader.etlcontroller")
@ViewPortTrigger("htSteps")
public class HTStepsViewPort extends ViewPortCommand {

	private static String STEP =  "/dataloader/etlcontroller/STEP${STEP}.xhtml";
	
	@Inject
	ELResolver elResolver;
	
	@Override
	public Object execute() {
		
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");
		Integer i = bf.getActiveStep()+1;
		String url = STEP.replace("${STEP}", i.toString());
		return url;
	}

}
