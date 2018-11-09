package sales.analyzer.ui.triggers.casemanager;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.TaskArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.jbpm.Task;


@Alternative
@Priority(10)
@Selector("analysis.casemanager")
@PostQuery("task")

public class TaskPostQueryTrigger implements PostQueryTrigger{

	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		Task task = (Task) obj;
		TaskArtifitialFieldsAdapter adapter = new TaskArtifitialFieldsAdapter((ObjectControl) task);
		adapter.setProduct(  task.getProcess().getProduct());

	}

}
