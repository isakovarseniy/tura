package sales.analyzer.ui.businesslogic.etlcontroller;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.HolderObjectArtifitialFieldsAdapter;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.db.HolderObject;
import org.tura.salesanalyzer.serialized.jbpm.EtlProcess;
import org.tura.salesanalyzer.serialized.jbpm.EtlTask;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;

import com.fasterxml.jackson.databind.ObjectMapper;

import sales.analyzer.api.model.impl.EtlMLPMessage;
import sales.analyzer.commons.CachedUserPreferences;
import sales.analyzer.process.commons.Constants;

public class Actions implements EventAccessor {

	private transient Logger logger = Logger.getLogger(Actions.class.getName());
	private ActionEvent event;

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("dataloader.etlcontroller")
	CommandStack commandStack;

	@Inject
	Repository repository;

	@Inject
	CachedUserPreferences userPref;

	public void openProcess() {
		Object[] row = (Object[]) event.getComponent().getAttributes().get("param1");
		EtlProcess process = (EtlProcess) row[2];
		if (process != null) {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");
			bf.setSelectedProcess(process.getId());
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
		try {
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
			HttpServletRequest request = ((HttpServletRequest) externalContext.getRequest());
			request.logout();
			externalContext.redirect("/sa-etl-controller/dataloader/etlcontroller/ETLControlWindow.xhtml");
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

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
			}
			message.setDirection(0);
			changeStep(process,message);
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
			changeStep(process,message);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	private void changeStep(EtlProcess process, EtlMLPMessage message) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String s = mapper.writeValueAsString(message);
		EtlTask task =   process.getActiveUserTasks().get(0);
		task.setCompleteTask(s);
		applyChanges();
	}

	
	public void poll() {
	}
}