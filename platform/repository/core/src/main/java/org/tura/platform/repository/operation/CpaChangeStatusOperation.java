/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.data.ProxyOperation;
import org.tura.platform.repository.data.UpdateObjectData;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public class CpaChangeStatusOperation  extends ProxyOperation{
	
	private static final long serialVersionUID = 1396411560628088105L;
	private ObjectControl proxy ;
    private ProxyCommadStackProvider stackProvider;
    private Map<Object,Map<Object, String>> collected;
	

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
    	UpdateObjectData data = new UpdateObjectData();
    	data.setValue(Constants.STORAGE_CONTROL_STATUS_LOADED);
    	data.setProperty( Constants.STORAGE_CONTROL_STATUS);
        data.setPk(proxy.getPath());
        stackProvider.get().addCommand(data);
    }
	
	
	

}
