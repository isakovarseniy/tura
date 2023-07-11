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

import java.util.Map;

import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.data.AddTopObjectData;
import org.tura.platform.repository.data.ProxyOperation;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.OperationLevel;

public class LoadObjectOperation extends ProxyOperation{
	
	private static final long serialVersionUID = 1396411560628088105L;
	private Object proxy ;
    private ProxyCommadStackProvider stackProvider;
    private Map<Object,Map<Object, String>> collected;
    private Registry registry;
    private Class<?> loadedBy;
	
    public LoadObjectOperation(Registry registry) {
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

	
	public Map<Object, Map<Object, String>> getCollected() {
		return collected;
	}

	public void setCollected(Map<Object, Map<Object, String>> collected) {
		this.collected = collected;
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
        data.getParams().put(Constants.CPA_OPERATION, OperationLevel.LOAD.name());
        if( collected != null) {
            data.getParams().put(Constants.CPA_ID_MAPPERS, collected);
        }
        if ( loadedBy != null) {
            data.getParams().put(Constants.CPA_LOADED_BY, loadedBy);
        }
        stackProvider.get().addCommand(data);
    }

	public Class<?> getLoadedBy() {
		return loadedBy;
	}

	public void setLoadedBy(Class<?> loadedBy) {
		this.loadedBy = loadedBy;
	}
	
	
	

}
