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

public class ETLListOfTaskInstances implements ItemList<ETLTaskInstance> {

	@XmlElement(name = "tasks")
	List<ETLTaskInstance> tasks;

	public ETLListOfTaskInstances() {

	}
	
	
	
	public List<ETLTaskInstance> getTasks() {
		return tasks;
	}

	public void setTasks(List<ETLTaskInstance> tasks) {
		this.tasks = tasks;
	}



	@Override
	public List<ETLTaskInstance> getItems() {
		return tasks;
	}

}