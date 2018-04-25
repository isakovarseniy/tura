package org.tura.platform.repository.operation;

import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public class UpdateObjectOperation {

	private ObjectControl proxy ;
    private ProxyCommadStackProvider stackProvider;
    private Object newValue;
    private Object oldValue;
    private String property;
    
	

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

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

	public Object getNewValue() {
		return newValue;
	}

	public void setNewValue(Object newValue) {
		this.newValue = newValue;
	}

	public Object getOldValue() {
		return oldValue;
	}

	public void setOldValue(Object oldValue) {
		this.oldValue = oldValue;
	}

    public boolean prepare() throws Exception {
        return isUpdated();
    }
	
	
    public boolean isUpdated() throws Exception {
        if ((oldValue != null) && (oldValue.equals(""))) {
            oldValue = null;
        }

        if ((newValue != null) && (newValue.equals(""))) {
            newValue = null;
        }

        if ((newValue == null) && (oldValue == null)) {
            return false;
        }

        if ((newValue != null) && (oldValue == null) ||
              (newValue == null) && (oldValue != null)) {
            add();
            return true;

        } else {
            if (!newValue.equals(oldValue)) {
                add();
                return true;
            }
            return false;
        }
    }	
	
    private void add() throws Exception {
    	UpdateObjectData data =  new UpdateObjectData();
    	
        data.setValue(newValue);
        data.setPk(proxy.getPath());
        stackProvider.addCommand(data);
        
        
    }
}
