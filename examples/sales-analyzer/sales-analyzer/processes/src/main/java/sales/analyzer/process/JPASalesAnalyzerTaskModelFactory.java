package sales.analyzer.process;

import org.jbpm.services.task.persistence.JPATaskModelFactory;
import org.kie.api.task.model.Task;

public class JPASalesAnalyzerTaskModelFactory extends JPATaskModelFactory {

    @Override
    public Task newTask() {
        return new SalesAnalyzerTaskImpl();
    }

	
	
}
