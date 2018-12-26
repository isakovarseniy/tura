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

public class ETLListOfNodeInstanceLogs  implements ItemList<ETLNodeInstanceLog>{

	@XmlElement(name = "nodes")
	List<ETLNodeInstanceLog> nodes;

	public ETLListOfNodeInstanceLogs() {

	}

	
	public List<ETLNodeInstanceLog> getNodes() {
		return nodes;
	}



	public void setNodes(List<ETLNodeInstanceLog> nodes) {
		this.nodes = nodes;
	}


	@Override
	public List<ETLNodeInstanceLog> getItems() {
		return nodes;
	}

}
