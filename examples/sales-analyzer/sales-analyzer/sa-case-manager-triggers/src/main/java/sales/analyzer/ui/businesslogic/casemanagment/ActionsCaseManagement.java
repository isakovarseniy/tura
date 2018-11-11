package sales.analyzer.ui.businesslogic.casemanagment;

import java.util.logging.Logger;

import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.IBeanFactory;


public class ActionsCaseManagement  implements EventAccessor {

	private transient Logger logger = Logger.getLogger(ActionsCaseManagement.class.getName());
	private ActionEvent event;

	@Inject
	ELResolver elResolver;

	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}
	
	public String searchIcon() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		if ( bf.getShowSearchPanelForWI() == null || ! bf.getShowSearchPanelForWI()) {
			return "search-button";
		}else {
			return "hide-search-button";
			
		}

	}
	
	
	public void showhidesearch() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		bf.setShowSearchPanelForWI(!bf.getShowSearchPanelForWI());
		
	}
	
	
	
}
