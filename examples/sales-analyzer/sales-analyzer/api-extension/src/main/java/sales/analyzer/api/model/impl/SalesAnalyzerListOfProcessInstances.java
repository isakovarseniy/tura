package sales.analyzer.api.model.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;
import org.kie.server.api.model.Wrapped;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Remotable
public class SalesAnalyzerListOfProcessInstances implements Wrapped<List<SalesAnalyzerProcessInstance>> {

	@XmlElement(name = "processes")
	List<SalesAnalyzerProcessInstance> processes;

	public SalesAnalyzerListOfProcessInstances() {

	}

	public List<SalesAnalyzerProcessInstance> getProcesses() {
		return processes;
	}

	public void setProcesses(List<SalesAnalyzerProcessInstance> processes) {
		this.processes = processes;
	}

	@Override
	public List<SalesAnalyzerProcessInstance> unwrap() {
		return processes;
	}

}
