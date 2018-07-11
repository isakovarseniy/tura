package sales.analyzer.api.model.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.kie.api.remote.Remotable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Remotable
public class SalesAnalyzerRowsNumber {

	Long rowsNumber;

	public Long getRowsNumber() {
		return rowsNumber;
	}

	public void setRowsNumber(Long rowsNumber) {
		this.rowsNumber = rowsNumber;
	}
}

