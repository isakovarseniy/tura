/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
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
