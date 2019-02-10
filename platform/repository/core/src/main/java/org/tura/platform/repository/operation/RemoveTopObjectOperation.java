/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
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
import org.tura.platform.repository.data.ProxyOperation;
import org.tura.platform.repository.data.RemoveTopObjectData;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import com.rits.cloning.Cloner;

public class RemoveTopObjectOperation extends ProxyOperation{

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
        remove();
        return true;
    }

    public void remove() throws Exception {
    	RemoveTopObjectData data = new RemoveTopObjectData();
    	populate(data);

        Cloner c = new Cloner();
        Object cloned = c.deepClone(proxy.getWrappedObject());
        data.setObject(cloned);

        stackProvider.addCommand(data);


    }

    
    
}
