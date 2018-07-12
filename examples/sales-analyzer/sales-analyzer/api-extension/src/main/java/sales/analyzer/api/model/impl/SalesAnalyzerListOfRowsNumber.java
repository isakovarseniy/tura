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
public class SalesAnalyzerListOfRowsNumber implements ItemList<SalesAnalyzerRowsNumber> {

	@XmlElement(name = "rows")
	private List<SalesAnalyzerRowsNumber> rows;
	
	@Override
	public List<SalesAnalyzerRowsNumber> getItems() {
		return rows;
	}

	public List<SalesAnalyzerRowsNumber> getRows() {
		return rows;
	}

	public void setRows(List<SalesAnalyzerRowsNumber> rows) {
		this.rows = rows;
	}

	
}

