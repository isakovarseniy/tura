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

public class ETLListOfProcessInstances implements ItemList<ETLProcessInstance> {

	@XmlElement(name = "processes")
	List<ETLProcessInstance> processes;

	public ETLListOfProcessInstances() {

	}

	public List<ETLProcessInstance> getProcesses() {
		return processes;
	}

	public void setProcesses(List<ETLProcessInstance> processes) {
		this.processes = processes;
	}


	@Override
	public List<ETLProcessInstance> getItems() {
		return processes;
	}

}

