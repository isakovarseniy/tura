/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.repository.operation;

import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.data.AddTopObjectData;
import org.tura.platform.repository.data.ProxyOperation;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.OperationLevel;

public class CreateObjectOperation extends ProxyOperation{
	
	private static final long serialVersionUID = 1396411560628088105L;
	private Object proxy ;
    private ProxyCommadStackProvider stackProvider;
    private Registry registry;
	
    public CreateObjectOperation(Registry registry) {
    	this.registry = registry;
    }
    
	public ProxyCommadStackProvider getStackProvider() {
		return stackProvider;
	}

	public void setStackProvider(ProxyCommadStackProvider stackProvider) {
		this.stackProvider = stackProvider;
	}
	
    public Object getProxy() {
		return proxy;
	}

	public void setProxy(Object proxy) {
		this.proxy = proxy;
	}

	
	public boolean prepare() throws Exception {
        add();
        return true;
    }
    

    public void add() throws Exception {
    	AddTopObjectData data = new AddTopObjectData();
    	populate(data);
        data.setObject(proxy);
        data.setRegistry(registry);
        data.getParams().put(Constants.CPA_OPERATION, OperationLevel.CREATE.name());
        stackProvider.get().addCommand(data);
        
    }
	
	
	

}
