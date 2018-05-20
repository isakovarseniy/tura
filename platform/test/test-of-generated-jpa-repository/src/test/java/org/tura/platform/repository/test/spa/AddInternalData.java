package org.tura.platform.repository.test.spa;

import org.tura.platform.repository.core.RepoKeyPath;

public class AddInternalData {

	private RepoKeyPath masterPk;
	private String masterProperty;
	private Object detailObject;
	private String detailProperty;
	
	
	public RepoKeyPath getMasterPk() {
		return masterPk;
	}
	public void setMasterPk(RepoKeyPath masterPk) {
		this.masterPk = masterPk;
	}
	public String getMasterProperty() {
		return masterProperty;
	}
	public void setMasterProperty(String masterProperty) {
		this.masterProperty = masterProperty;
	}
	public Object getDetailObject() {
		return detailObject;
	}
	public void setDetailObject(Object detailObject) {
		this.detailObject = detailObject;
	}
	public String getDetailProperty() {
		return detailProperty;
	}
	public void setDetailProperty(String detailProperty) {
		this.detailProperty = detailProperty;
	}
	
	
}
