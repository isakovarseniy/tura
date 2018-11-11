package sales.analyzer.ui.triggers.casemanager;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.TaskArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.db.State;
import org.tura.salesanalyzer.serialized.jbpm.Task;


@Alternative
@Priority(10)
@Selector("analysis.casemanager")
@PostQuery("task")

public class TaskPostQueryTrigger implements PostQueryTrigger{

	@Inject
	ELResolver elResolver;

	
	@SuppressWarnings("rawtypes")
	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		
		Task task = (Task) obj;
		TaskArtifitialFieldsAdapter adapter = new TaskArtifitialFieldsAdapter((ObjectControl) task);
		adapter.setProduct(  task.getProcess().getProduct());
		DataControl dc = (DataControl) bf.getCity();
		bf.setCityId(task.getProcess().getCity());
		dc.forceRefresh();
		City city =   (City) dc.getCurrentObject();

		adapter.setCity(city.getName());
		
		dc = (DataControl) bf.getState();
		bf.setStateId(task.getProcess().getStates());
		dc.forceRefresh();
		State state =   (State) dc.getCurrentObject();
		adapter.setStates(state.getName());
		
		
		if ( task.getProcess().getCaseId() != null && "".equals(task.getProcess().getCaseId() ))  {
			adapter.setCaseId(task.getProcess().getCaseId());
		}else {
			adapter.setCaseId(task.getProcess().getId().toString());
		}

	}

}
