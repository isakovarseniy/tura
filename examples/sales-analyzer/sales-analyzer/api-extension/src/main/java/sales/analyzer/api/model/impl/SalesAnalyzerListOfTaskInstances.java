package sales.analyzer.api.model.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;
import org.kie.server.api.model.ItemList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Remotable
public class SalesAnalyzerListOfTaskInstances implements ItemList<SalesAnalyzerTaskInstance> {

	@XmlElement(name = "tasks")
	List<SalesAnalyzerTaskInstance> tasks;

	public List<SalesAnalyzerTaskInstance> getTasks() {
		return tasks;
	}

	public void setTasks(List<SalesAnalyzerTaskInstance> tasks) {
		this.tasks = tasks;
	}

	public SalesAnalyzerListOfTaskInstances() {

	}


	@Override
	public List<SalesAnalyzerTaskInstance> getItems() {
		return tasks;
	}

}