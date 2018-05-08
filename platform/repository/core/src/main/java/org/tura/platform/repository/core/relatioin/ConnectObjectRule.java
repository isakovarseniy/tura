package org.tura.platform.repository.core.relatioin;

import java.util.List;

import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.Repository;
import org.tura.platform.repository.Rule;

public class ConnectObjectRule extends RepositoryHelper implements Rule {

	List<Object> masterChanges;
	Repository masterProvider;

	List<Object> detailChanges;
	Repository detailProvider;

	public List<Object> getMasterChanges() {
		return masterChanges;
	}

	public void setMasterChanges(List<Object> masterChanges) {
		this.masterChanges = masterChanges;
	}

	public Repository getMasterProvider() {
		return masterProvider;
	}

	public void setMasterProvider(Repository masterProvider) {
		this.masterProvider = masterProvider;
	}

	public List<Object> getDetailChanges() {
		return detailChanges;
	}

	public void setDetailChanges(List<Object> detailChanges) {
		this.detailChanges = detailChanges;
	}

	public Repository getDetailProvider() {
		return detailProvider;
	}

	public void setDetailProvider(Repository detailProvider) {
		this.detailProvider = detailProvider;
	}

	@Override
	public void execute() throws Exception {
		masterProvider.applyChanges(getMasterChanges());
		detailProvider.applyChanges(getDetailChanges());
	}

}
