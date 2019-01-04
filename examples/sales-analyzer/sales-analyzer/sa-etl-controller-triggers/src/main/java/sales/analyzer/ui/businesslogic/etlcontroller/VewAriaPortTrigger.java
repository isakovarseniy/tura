package sales.analyzer.ui.businesslogic.etlcontroller;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.annotations.ViewPortTrigger;
import org.tura.platform.datacontrol.command.ViewPortCommand;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.jbpm.EtlNodeLog;
import org.tura.salesanalyzer.serialized.jbpm.EtlProcess;

import sales.analyzer.process.commons.Constants;

@Alternative
@Priority(10)
@Selector("dataloader.etlcontroller")
@ViewPortTrigger("viewAria")
public class VewAriaPortTrigger extends ViewPortCommand {

	private transient Logger logger = Logger.getLogger(VewAriaPortTrigger.class.getName());
	private String processSelection =  "/dataloader/etlcontroller/ProcessSelection.xhtml";
	private String monthlyFileProcessSteps =  "/dataloader/etlcontroller/MonthlyFileLoadingProcessSteps.xhtml";
	

	@Inject
	ELResolver elResolver;

	@SuppressWarnings("rawtypes")
	@Override
	public Object execute() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");
			if (bf.getSelectedProcess() == null) {
				return processSelection;
			}
			
			DataControl dc = (DataControl) bf.getEtlProcessSelector();
			dc.forceRefresh();
			EtlProcess process = (EtlProcess) dc.getCurrentObject();

			if (process == null) {
				dc = (DataControl) bf.getEtlNodeLog();
				dc.forceRefresh();
				for (Object  obj : dc.getScroller()) {
					EtlNodeLog log = (EtlNodeLog) obj;
					if ( log.getType() == 1 && Constants.STEP9.equals(log.getNodeName())) {
						dc = (DataControl) bf.getEtlProcess();
						dc.forceRefresh();
						return processSelection;
					}
					if ( log.getType() == 0 && Constants.CT_ARRAY.contains(log.getNodeName())) {
						int i = Constants.PRC_NODES.indexOf(log.getNodeName());
						bf.setActiveStep(i);
						
						return monthlyFileProcessSteps;
					}
				}
				
				return processSelection;
			}
			return monthlyFileProcessSteps;
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);

		}
		return processSelection;

	}

}
