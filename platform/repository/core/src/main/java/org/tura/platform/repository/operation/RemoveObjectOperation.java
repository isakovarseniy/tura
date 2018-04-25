package org.tura.platform.repository.operation;

import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public class RemoveObjectOperation extends ProxyOperation{

	private ObjectControl master;
	private ObjectControl detail;
    private ProxyCommadStackProvider stackProvider;
    
    
	public ObjectControl getMaster() {
		return master;
	}
	public void setMaster(ObjectControl master) {
		this.master = master;
	}
	public ObjectControl getDetail() {
		return detail;
	}
	public void setDetail(ObjectControl detail) {
		this.detail = detail;
	}
	public ProxyCommadStackProvider getStackProvider() {
		return stackProvider;
	}
	public void setStackProvider(ProxyCommadStackProvider stackProvider) {
		this.stackProvider = stackProvider;
	}

    public boolean prepare() throws Exception {
        remove();
        return true;

    }

    public void remove() throws Exception {
    	RemoveObjectData data = new RemoveObjectData();
    	populate(data);

        data.setMasterPk(master.getPath());

        data.setDetailPk(master.getPath());

        stackProvider.addCommand(data);


    }
}
