package org.tura.platform.repository.operation;

import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import com.rits.cloning.Cloner;

public class RemoveContainmentObjectOperation extends ProxyOperation{
	
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
    	RemoveContainmentObjectData data = new RemoveContainmentObjectData();
    	populate(data);

        data.setMasterPk(master.getPath());

        Cloner c = new Cloner();
        Object cloned = c.deepClone(detail.getWrappedObject());
        data.setObject(cloned);

        stackProvider.addCommand(data);


    }
	
	
	

}
