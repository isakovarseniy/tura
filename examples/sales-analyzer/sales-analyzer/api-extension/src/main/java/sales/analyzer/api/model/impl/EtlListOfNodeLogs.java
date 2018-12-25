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

public class EtlListOfNodeLogs  implements ItemList<EtlNodeLog>{

	@XmlElement(name = "nodes")
	List<EtlNodeLog> nodes;

	public EtlListOfNodeLogs() {

	}

	
	public List<EtlNodeLog> getNodes() {
		return nodes;
	}



	public void setNodes(List<EtlNodeLog> nodes) {
		this.nodes = nodes;
	}


	@Override
	public List<EtlNodeLog> getItems() {
		return nodes;
	}

}
