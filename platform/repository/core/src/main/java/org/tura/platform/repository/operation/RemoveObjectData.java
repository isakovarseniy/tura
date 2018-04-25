package org.tura.platform.repository.operation;

import org.tura.platform.repository.core.RepoKeyPath;

public class RemoveObjectData  extends ProxyData{

	private RepoKeyPath masterPk;
	private RepoKeyPath detailPk;

	
	
	public RepoKeyPath getMasterPk() {
		return masterPk;
	}
	public void setMasterPk(RepoKeyPath masterPk) {
		this.masterPk = masterPk;
	}
	public RepoKeyPath getDetailPk() {
		return detailPk;
	}
	public void setDetailPk(RepoKeyPath detailPk) {
		this.detailPk = detailPk;
	}
	
}
