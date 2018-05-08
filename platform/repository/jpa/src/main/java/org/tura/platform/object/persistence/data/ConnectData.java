package org.tura.platform.object.persistence.data;

public class ConnectData {

	Object masterPk;
	String masterClassName;
	String masterProperty;
	Object detailPk;
	String  detailClassName;
	String relation;
	
	public Object getMasterPk() {
		return masterPk;
	}
	public void setMasterPk(Object masterPk) {
		this.masterPk = masterPk;
	}
	public Object getDetailPk() {
		return detailPk;
	}
	public void setDetailPk(Object detailPk) {
		this.detailPk = detailPk;
	}
	public String getMasterProperty() {
		return masterProperty;
	}
	public void setMasterProperty(String masterProperty) {
		this.masterProperty = masterProperty;
	}

	public String getMasterClassName() {
		return masterClassName;
	}
	public void setMasterClassName(String masterClassName) {
		this.masterClassName = masterClassName;
	}
	public String getDetailClassName() {
		return detailClassName;
	}
	public void setDetailClassName(String detailClassName) {
		this.detailClassName = detailClassName;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
}
