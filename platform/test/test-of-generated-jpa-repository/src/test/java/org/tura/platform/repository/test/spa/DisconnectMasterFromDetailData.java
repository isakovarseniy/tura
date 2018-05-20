package org.tura.platform.repository.test.spa;

import org.tura.platform.repository.core.RepoKeyPath;

public class DisconnectMasterFromDetailData {

	private RepoKeyPath masterPk;
	private String masterProperty;
	private RepoKeyPath detailPk;
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
	public RepoKeyPath getDetailPk() {
		return detailPk;
	}
	public void setDetailPk(RepoKeyPath detailPk) {
		this.detailPk = detailPk;
	}
	public String getDetailProperty() {
		return detailProperty;
	}
	public void setDetailProperty(String detailProperty) {
		this.detailProperty = detailProperty;
	}
	
	
	
}
