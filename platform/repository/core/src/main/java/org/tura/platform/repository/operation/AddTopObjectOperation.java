package org.tura.platform.repository.operation;

import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import com.rits.cloning.Cloner;

public class AddTopObjectOperation extends ProxyOperation{
	
	private ObjectControl proxy ;
    private ProxyCommadStackProvider stackProvider;
	

	public ProxyCommadStackProvider getStackProvider() {
		return stackProvider;
	}

	public void setStackProvider(ProxyCommadStackProvider stackProvider) {
		this.stackProvider = stackProvider;
	}

	
    public ObjectControl getProxy() {
		return proxy;
	}

	public void setProxy(ObjectControl proxy) {
		this.proxy = proxy;
	}

	
	
	public boolean prepare() throws Exception {
        add();
        return true;
    }
    

    public void add() throws Exception {
    	AddTopObjectData data = new AddTopObjectData();
    	populate(data);

        Cloner c = new Cloner();
        Object cloned = c.deepClone(proxy.getWrappedObject());
        data.setObject(cloned);

        stackProvider.addCommand(data);

        proxy.setAttached(true);

    }
	
	
	

}
