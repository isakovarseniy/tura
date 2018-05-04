package org.tura.platform.repository.core.relatioin;

import org.tura.platform.repository.core.PersistenceProvider;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.Rule;

public class ConnectObjectRule extends RepositoryHelper implements Rule {

	RepoKeyPath masterPk;
	String masterProperty;
	RepoKeyPath detailPk;
	String detailProperty;

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

	@Override
	public void execute() throws Exception {
		String masterClassName = masterPk.getPath().get(masterPk.getPath().size() - 1).getType();
		String detailClassName = detailPk.getPath().get(0).getType();

		PersistenceProvider pr = findProvider(masterClassName);
		pr.connectMasterToDetail(masterPk, masterProperty, detailPk, detailProperty);

		pr = findProvider(detailClassName);
		pr.connectDetailToMaster(masterPk, masterProperty, detailPk, detailProperty);

	}

}
