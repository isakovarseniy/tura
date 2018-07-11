package sales.analyzer.api.model.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import org.kie.server.api.model.Wrapped;

public class SalesAnalyzerListOfTaskInstances implements Wrapped<List<SalesAnalyzerTaskInstance>> {

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
	public List<SalesAnalyzerTaskInstance> unwrap() {
		return tasks;
	}

}