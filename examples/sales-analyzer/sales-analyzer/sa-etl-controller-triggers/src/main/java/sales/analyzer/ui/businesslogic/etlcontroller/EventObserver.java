package sales.analyzer.ui.businesslogic.etlcontroller;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.inject.Inject;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.BeforePhase;
import org.tura.salesanalyzer.etlcontroller.dataloader.etlcontroller.datacontrol.IBeanFactory;

public class EventObserver {

	@Inject
	ELResolver elResolver;

	private transient Logger logger = Logger.getLogger(EventObserver.class.getName());

	@SuppressWarnings("rawtypes")
	public void observeAll(@Observes @BeforePhase PhaseEvent event) {
		if (PhaseId.INVOKE_APPLICATION.equals(event.getPhaseId())) {
			try {
				IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryDataLoaderETLController}");
				if (bf.getRefreshControl() != null && bf.getRefreshControl()) {
					bf.setRefreshControl(false);
					DataControl dc = (DataControl) bf.getEtlProcess();
					dc.forceRefresh();

				}
			} catch (Exception e) {
				logger.log(Level.INFO, e.getMessage(), e);
			}
		}
	}

}
