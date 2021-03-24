/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.client.commands.SwitchWindow;
import org.tura.platform.uuiclient.rest.events.EventAware;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.HolderObjectArtifitialFieldsAdapter;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.viewmodel.IViewPortHolder;
import org.tura.salesanalyzer.serialized.db.HolderObject;
import org.tura.salesanalyzer.serialized.jbpm.EtlProcess;
import org.tura.salesanalyzer.serialized.jbpm.EtlTask;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;

import com.fasterxml.jackson.databind.ObjectMapper;

import sales.analyzer.api.model.impl.EtlMLPMessage;
import sales.analyzer.commons.CachedUserPreferences;
import sales.analyzer.process.commons.Constants;

public class Actions implements EventAware {

	private EventDescription event;

	private transient Logger logger = Logger.getLogger(Actions.class.getName());
	private static String IMAGE_FILE = "ajaxloadingbar.gif";

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("dataloader.etlcontroller")
	CommandStack commandStack;

	@Inject
	@Named("viewPortHolderDataLoaderETLController")
	IViewPortHolder vp;

	@Inject
	Repository repository;

	@Inject
	CachedUserPreferences userPref;

	@Inject
	ResponseState responseState;

	public void openProcess() {
		try {

			EventParameter param = event.findParameter("rowkey");
			String key = (String) param.getValue();
			StringTokenizer multiTokenizer = new StringTokenizer(key, ".");
			String processId = multiTokenizer.nextToken();
			String processingDate = multiTokenizer.nextToken();

			if (processId != null) {
				IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");
				bf.setSelectedProcess(Long.parseLong(processId));
				bf.setProcessingDate(processingDate);

				ObjectControl oh = (ObjectControl) bf.getHolderObject().getCurrentObject();
				HolderObjectArtifitialFieldsAdapter adapter = new HolderObjectArtifitialFieldsAdapter(oh);
				adapter.setImage(IMAGE_FILE);

				new ViewPortUpdate().setup(vp, elResolver, responseState);

			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void createMonthlyLoadingProcess() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");
			@SuppressWarnings("rawtypes")
			DataControl dc = (DataControl) bf.getEtlProcess();
			EtlProcess process = (EtlProcess) dc.createObject();
			process.setProcessId(Constants.ETL_MONTHLY_FILE_LOAD_PROCESS_ID);

			applyChanges();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	private void applyChanges() throws Exception {
		CommandStackProvider sp = new CommandStackProvider();
		sp.setCommandStack(commandStack);

		ProxyRepository proxyRepository = new ProxyRepository(repository, sp);

		proxyRepository.applyChanges(null);
		commandStack.commitSavePoint();
	}

	public void logout() {
		SwitchWindow cmd = new SwitchWindow();
		cmd.setTarget(
				"http://kc:8080/auth/realms/sales-analyzer/protocol/openid-connect/logout?redirect_uri=http://wf:8081/sa-etl-controller-react-client/dataloader/etlcontroller/etlControlWindow");
		responseState.addCommand(cmd);
	}

	public void nextStep() {
		try {
			EtlMLPMessage message = new EtlMLPMessage();
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");
			EtlProcess process = (EtlProcess) bf.getEtlProcessSelector().getCurrentObject();

			HolderObject holder = (HolderObject) bf.getHolderObject().getCurrentObject();
			if (bf.getActiveStep() == 0) {
				HolderObjectArtifitialFieldsAdapter adapter = new HolderObjectArtifitialFieldsAdapter(
						(ObjectControl) holder);
				message.setLoadingDate(adapter.getLoadingDate());
				SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
				bf.setProcessingDate(sdfr.format(adapter.getLoadingDate()));
			}
			message.setDirection(0);
			changeStep(process, message);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void prevStep() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");
			EtlProcess process = (EtlProcess) bf.getEtlProcessSelector().getCurrentObject();
			EtlMLPMessage message = new EtlMLPMessage();
			message.setDirection(1);
			changeStep(process, message);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	private void changeStep(EtlProcess process, EtlMLPMessage message) throws Exception {
		List<Object> list = new ArrayList<>();
		if (process != null) {
			list.addAll(process.getActiveUserTasks());
			Query query = new Query();
			query.parse(ViewPortUpdate.QUERY_LAST_TASK);
			QueryResults result = query.execute(list);

			ObjectMapper mapper = new ObjectMapper();
			String s = mapper.writeValueAsString(message);
			EtlTask task = (EtlTask) result.getResults().get(0);
			task.setCompleteTask(s);
			applyChanges();
		}

		new ViewPortUpdate().setup(vp, elResolver, responseState);

	}

	@SuppressWarnings("rawtypes")
	public void poll() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");
			DataControl dc = (DataControl) bf.getFileEntry();
			dc.forceRefresh();
			
			
			new ViewPortUpdate().setup(vp, elResolver, responseState);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;

	}
}