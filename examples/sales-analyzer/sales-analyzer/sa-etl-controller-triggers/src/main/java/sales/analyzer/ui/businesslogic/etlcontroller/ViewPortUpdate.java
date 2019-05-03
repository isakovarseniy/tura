package sales.analyzer.ui.businesslogic.etlcontroller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.HolderObjectArtifitialFieldsAdapter;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.viewmodel.IViewPortHolder;
import org.tura.salesanalyzer.serialized.db.HolderObject;
import org.tura.salesanalyzer.serialized.jbpm.EtlNodeLog;
import org.tura.salesanalyzer.serialized.jbpm.EtlProcess;
import org.tura.salesanalyzer.serialized.jbpm.EtlTask;

import sales.analyzer.process.commons.Constants;

public class ViewPortUpdate {

	private transient Logger logger = Logger.getLogger(ViewPortUpdate.class.getName());

	private static String STEP = "/dataloader/etlcontroller/step${STEP}.xhtml";
	public static String QUERY_LAST_TASK = "SELECT * FROM org.tura.salesanalyzer.serialized.jbpm.EtlTask WHERE status != null and status != 'Completed'";
	public static String QUERY_LAST_NODE = "SELECT * FROM org.tura.salesanalyzer.serialized.jbpm.EtlNodeLog WHERE type = 0";

	private String HUMAN_TASK = "/dataloader/etlcontroller/humanTaskStep.xhtml";
	private String AUTOMATED_STEPS = "/dataloader/etlcontroller/automatedStep.xhtml";
	private String processSelection = "/dataloader/etlcontroller/processSelection.xhtml";
	private String monthlyFileProcessSteps = "/dataloader/etlcontroller/monthlyFileLoadingProcessSteps.xhtml";

	public void setup(IViewPortHolder vp, ELResolver elResolver) {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");

		setVewAriaPort(bf, vp, elResolver);
		if (!processSelection.equals(vp.getViewAria())) {
			this.setStepSelectorViewPort(bf, vp, elResolver);
			if (vp.getStepSelector().equals(AUTOMATED_STEPS)) {
				setAUStepsViewPort(bf, vp, elResolver);
			} else {
				setHTStepsViewPort(bf, vp, elResolver);
			}
		}
	}

	private void setAUStepsViewPort(IBeanFactory bf, IViewPortHolder vp, ELResolver elResolver) {
		Integer i = bf.getActiveStep() + 1;
		String url = STEP.replace("${STEP}", i.toString());
		vp.setHtSteps(url);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void setStepSelectorViewPort(IBeanFactory bf, IViewPortHolder vp, ELResolver elResolver) {
		try {

			DataControl dc = (DataControl) bf.getEtlProcessSelector();
			EtlProcess process = (EtlProcess) dc.getCurrentObject();

			if (process == null || process.getActiveUserTasks() == null) {
				initNode(bf, elResolver);
				vp.setStepSelector(AUTOMATED_STEPS);
				return;
			}

			List<Object> list = new ArrayList<>();
			list.addAll(process.getActiveUserTasks());
			Query query = new Query();
			query.parse(QUERY_LAST_TASK);
			QueryResults result = query.execute(list);

			if (result.getResults().size() != 0) {
				EtlTask task = (EtlTask) result.getResults().get(0);
				if (Constants.TASK_STATUS.contains(task.getStatus())) {
					initHT(result.getResults(), bf, elResolver);
					vp.setStepSelector(HUMAN_TASK);
					return;
				}
			} else {
				initNode(bf, elResolver);
				vp.setStepSelector(AUTOMATED_STEPS);
				return;
			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);

		}

		vp.setStepSelector(null);

	}

	private void setHTStepsViewPort(IBeanFactory bf, IViewPortHolder vp, ELResolver elResolver) {
		Integer i = bf.getActiveStep() + 1;
		String url = STEP.replace("${STEP}", i.toString());
		vp.setHtSteps(url);
	}

	@SuppressWarnings("rawtypes")
	private void setVewAriaPort(IBeanFactory bf, IViewPortHolder vp, ELResolver elResolver) {
		try {
			if (bf.getSelectedProcess() == null) {
				bf.setPollStop(true);
				vp.setViewAria(processSelection);
				return;
			}

			DataControl dc = (DataControl) bf.getEtlProcessSelector();
			dc.forceRefresh();
			EtlProcess process = (EtlProcess) dc.getCurrentObject();

			if (process == null) {
				dc = (DataControl) bf.getEtlNodeLog();
				dc.forceRefresh();
				for (Object obj : dc.getScroller()) {
					EtlNodeLog log = (EtlNodeLog) obj;
					if (log.getType() == 1 && Constants.STEP9.equals(log.getNodeName())) {
						dc = (DataControl) bf.getEtlProcess();
						bf.setRefreshControl(true);
						dc.forceRefresh();
						bf.setPollStop(true);
						vp.setViewAria(processSelection);
						return;
					}
					if (log.getType() == 0 && Constants.CT_ARRAY.contains(log.getNodeName())) {
						int i = Constants.PRC_NODES.indexOf(log.getNodeName());
						bf.setActiveStep(i);

						vp.setViewAria(monthlyFileProcessSteps);
						return;
					}
				}

				vp.setViewAria(processSelection);
				return;
			}
			vp.setViewAria(monthlyFileProcessSteps);
			return;

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);

		}
		vp.setViewAria(processSelection);

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initNode(IBeanFactory bf, ELResolver elResolver) throws Exception {
		DataControl dc = (DataControl) bf.getEtlNodeLog();
		dc.forceRefresh();

		List<Object> list = new ArrayList<>();
		list.addAll(dc.getScroller());
		Query query = new Query();
		query.parse(QUERY_LAST_NODE);
		QueryResults result = query.execute(list);

		EtlNodeLog node = (EtlNodeLog) result.getResults().get(0);

		int i = Constants.PRC_NODES.indexOf(node.getNodeName());
		bf.setActiveStep(i);
		bf.setPollStop(false);

		String nodename = (String) elResolver
				.getValue("#{ETLController['STEP_" + new Integer(i + 1).toString() + "']}");
		HolderObject holder = (HolderObject) bf.getHolderObject().getCurrentObject();
		HolderObjectArtifitialFieldsAdapter adapter = new HolderObjectArtifitialFieldsAdapter((ObjectControl) holder);
		adapter.setStepName(nodename);

		bf.setPollStop(false);

	}

	private void initHT(List<EtlTask> tasks, IBeanFactory bf, ELResolver elResolver) throws Exception {
		EtlTask task = tasks.get(0);
		int i = Constants.PRC_NODES.indexOf(task.getName());
		bf.setActiveStep(i);
		bf.setPollStop(true);

		String nodename = (String) elResolver
				.getValue("#{ETLController['STEP_" + new Integer(i + 1).toString() + "']}");
		HolderObject holder = (HolderObject) bf.getHolderObject().getCurrentObject();
		HolderObjectArtifitialFieldsAdapter adapter = new HolderObjectArtifitialFieldsAdapter((ObjectControl) holder);
		adapter.setStepName(nodename);

		initLoadingDate(bf);

	}

	private void initLoadingDate(IBeanFactory bf) throws Exception {
		if (bf.getActiveStep() == 0) {

			HolderObject holder = (HolderObject) bf.getHolderObject().getCurrentObject();
			HolderObjectArtifitialFieldsAdapter adapter = new HolderObjectArtifitialFieldsAdapter(
					(ObjectControl) holder);

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			Date d = formatter.parse("01-11-2017");
			adapter.setLoadingDate(d);
		}
	}

}