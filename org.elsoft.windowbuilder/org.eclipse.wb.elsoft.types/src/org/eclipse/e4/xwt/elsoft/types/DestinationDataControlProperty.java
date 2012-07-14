package org.eclipse.e4.xwt.elsoft.types;

public class DestinationDataControlProperty {
	
	private String dataControlName;

	public DestinationDataControlProperty(String name){
		dataControlName=name;
	}
	
	public String getDataControlName() {
		return dataControlName;
	}

	public void setDataControlName(String dataControlName) {
		this.dataControlName = dataControlName;
	}
}
