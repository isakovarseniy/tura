package sales.analyzer.ui.businesslogic.etlcontroller;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.HolderObjectArtifitialFieldsAdapter;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.db.HolderObject;
import org.tura.salesanalyzer.serialized.jbpm.EtlProcess;
import org.tura.salesanalyzer.serialized.jbpm.EtlTask;

import sales.analyzer.process.commons.Constants;

@Alternative
@Priority(10)
@Selector("dataloader.etlcontroller")
@ViewPortTrigger("stepSelector")

public class StepSelectorViewPort extends ViewPortCommand {

	private transient Logger logger = Logger.getLogger(StepSelectorViewPort.class.getName());
	private String HUMAN_TASK =  "/dataloader/etlcontroller/HumanTaskStep.xhtml";
	private String AUTOMATED_STEPS =  "/dataloader/etlcontroller/AutomatedStep.xhtml";

	@Inject
	ELResolver elResolver;

	@SuppressWarnings("rawtypes")
	@Override
	public Object execute() {

		try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");

			DataControl dc = (DataControl) bf.getEtlProcessSelector();
			EtlProcess process = (EtlProcess) dc.getCurrentObject();
			if ( process != null && process.getActiveUserTasks() != null  && process.getActiveUserTasks().size() != 0) {
				EtlTask task = process.getActiveUserTasks().get(0);
				if ( Constants.TASK_STATUS.contains(task.getStatus())) {
					initHT(process, bf);
					return HUMAN_TASK;
				}
			}else {
				initNode( bf);
				return AUTOMATED_STEPS;
			}
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);

		}

		return null;

	}
	
	
	private void initNode( IBeanFactory bf) throws Exception {
		int i = bf.getActiveStep();

		String nodename =  (String) elResolver.getValue("#{ETLController['STEP_"+  new Integer(i+1).toString() +"']}");
		HolderObject holder = (HolderObject) bf.getHolderObject().getCurrentObject();

		HolderObjectArtifitialFieldsAdapter adapter  = new  HolderObjectArtifitialFieldsAdapter((ObjectControl) holder);
		adapter.setStepName(nodename);
		bf.setPollStop(false);

	}

	
	private void initHT(EtlProcess process , IBeanFactory bf) throws Exception {
		EtlTask task = process.getActiveUserTasks().get(0);
		int i = Constants.PRC_NODES.indexOf(task.getName());
		bf.setActiveStep(i);
		bf.setPollStop(true);


		String nodename =  (String) elResolver.getValue("#{ETLController['STEP_"+  new Integer(i+1).toString() +"']}");
		HolderObject holder = (HolderObject) bf.getHolderObject().getCurrentObject();
		HolderObjectArtifitialFieldsAdapter adapter  = new  HolderObjectArtifitialFieldsAdapter((ObjectControl) holder);
		adapter.setStepName(nodename);
		
		initLoadingDate(bf);
		
	}
	

	private void initLoadingDate( IBeanFactory bf) throws Exception {
		if (bf.getActiveStep() == 0) {
			
			HolderObject holder = (HolderObject) bf.getHolderObject().getCurrentObject();
			HolderObjectArtifitialFieldsAdapter adapter  = new  HolderObjectArtifitialFieldsAdapter((ObjectControl) holder);
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			Date d =  formatter.parse("01-11-2017");
			adapter.setLoadingDate(d);
		}
	}
	
	
	
}