/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.client.commands.StartPoll;
import org.tura.platform.uuiclient.rest.client.commands.StopPoll;
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

	private static String STEP = "/dataloader/etlcontroller/step${STEP}";
	public static String QUERY_LAST_TASK = "SELECT * FROM org.tura.salesanalyzer.serialized.jbpm.EtlTask WHERE status != null and status != 'Completed'";
	public static String QUERY_LAST_NODE = "SELECT * FROM org.tura.salesanalyzer.serialized.jbpm.EtlNodeLog WHERE type = 0";

	private String HUMAN_TASK = "/dataloader/etlcontroller/humanTaskStep";
	private String AUTOMATED_STEPS = "/dataloader/etlcontroller/automatedStep";
	private String processSelection = "/dataloader/etlcontroller/processSelection";
	private String monthlyFileProcessSteps = "/dataloader/etlcontroller/monthlyFileLoadingProcessSteps";

	public void setup(IViewPortHolder vp, ELResolver elResolver,ResponseState responseState) {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");

		setVewAriaPort(bf, vp, elResolver,responseState);
		if (!processSelection.equals(vp.getViewAria())) {
			this.setStepSelectorViewPort(bf, vp, elResolver,responseState);
			if (vp.getStepSelector().equals(AUTOMATED_STEPS)) {
				setAUStepsViewPort(bf, vp, elResolver);
				startPoll(responseState);
			} else {
				setHTStepsViewPort(bf, vp, elResolver);
				stopPoll(responseState);
				
			}
		}else {
			stopPoll(responseState);
		}
	}

	private void setAUStepsViewPort(IBeanFactory bf, IViewPortHolder vp, ELResolver elResolver) {
		Integer i = bf.getActiveStep() + 1;
		String url = STEP.replace("${STEP}", i.toString());
		vp.setHtSteps(url);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void setStepSelectorViewPort(IBeanFactory bf, IViewPortHolder vp, ELResolver elResolver,ResponseState responseState) {
		try {

			DataControl dc = (DataControl) bf.getEtlProcessSelector();
			EtlProcess process = (EtlProcess) dc.getCurrentObject();

			if (process == null || process.getActiveUserTasks() == null) {
				initNode(bf, elResolver,responseState);
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
					initHT(result.getResults(), bf, elResolver,responseState);
					vp.setStepSelector(HUMAN_TASK);
					return;
				}
			} else {
				initNode(bf, elResolver,responseState);
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
	private void setVewAriaPort(IBeanFactory bf, IViewPortHolder vp, ELResolver elResolver,ResponseState responseState) {
		try {
			if (bf.getSelectedProcess() == null) {
				vp.setViewAria(processSelection);
				return;
			}

			DataControl dc = (DataControl) bf.getEtlProcessSelector();
			dc.forceRefresh();
			EtlProcess process = (EtlProcess) dc.getCurrentObject();

			if (process == null) {
				dc = (DataControl) bf.getEtlProcess();
				dc.forceRefresh();
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
	private void initNode(IBeanFactory bf, ELResolver elResolver,ResponseState responseState) throws Exception {
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

		String nodename = (String) elResolver
				.getValue("#{ETLController['STEP_" +  Integer.valueOf(i + 1).toString() + "']}");
		HolderObject holder = (HolderObject) bf.getHolderObject().getCurrentObject();
		HolderObjectArtifitialFieldsAdapter adapter = new HolderObjectArtifitialFieldsAdapter((ObjectControl) holder);
		adapter.setStepName(nodename);


	}

	private void initHT(List<EtlTask> tasks, IBeanFactory bf, ELResolver elResolver,ResponseState responseState) throws Exception {
		EtlTask task = tasks.get(0);
		int i = Constants.PRC_NODES.indexOf(task.getName());
		bf.setActiveStep(i);

		String nodename = (String) elResolver
				.getValue("#{ETLController['STEP_" +  Integer.valueOf(i + 1).toString() + "']}");
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

	
	
	public void startPoll(ResponseState responseState) {
		StartPoll cmd = new StartPoll();
		cmd.setTarget("c82be598-0f08-4792-a0de-4234a7fc9de6");
		responseState.addCommand(cmd);
		
	}
	
	public void stopPoll(ResponseState responseState) {
		StopPoll cmd = new StopPoll();
		cmd.setTarget("c82be598-0f08-4792-a0de-4234a7fc9de6");
		responseState.addCommand(cmd);
		
	}
	
	
}