package org.tura.platform.repository.operation;

public class ProxyOperation {

	String relationType;
	String masterProperty;
	String detailProperty;
	
	public String getRelationType() {
		return relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}
	public String getMasterProperty() {
		return masterProperty;
	}
	public void setMasterProperty(String masterProperty) {
		this.masterProperty = masterProperty;
	}
	public String getDetailProperty() {
		return detailProperty;
	}
	public void setDetailProperty(String detailProperty) {
		this.detailProperty = detailProperty;
	}

	protected void populate(ProxyData data){
		data.setDetailProperty(detailProperty);
		data.setMasterProperty(masterProperty);
		data.setRelationType(relationType);
	}
	
	
}
