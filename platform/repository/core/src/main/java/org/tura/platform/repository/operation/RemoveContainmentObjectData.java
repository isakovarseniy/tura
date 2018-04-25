package org.tura.platform.repository.operation;

import org.tura.platform.repository.core.RepoKeyPath;

public class RemoveContainmentObjectData  extends ProxyData{
	
	private RepoKeyPath masterPk;
	private Object object;
	
	
	public RepoKeyPath getMasterPk() {
		return masterPk;
	}
	public void setMasterPk(RepoKeyPath masterPk) {
		this.masterPk = masterPk;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	

}
