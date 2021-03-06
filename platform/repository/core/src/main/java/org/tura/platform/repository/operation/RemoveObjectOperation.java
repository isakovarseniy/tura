/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.data.ProxyOperation;
import org.tura.platform.repository.data.RemoveObjectData;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public class RemoveObjectOperation extends ProxyOperation{

	private static final long serialVersionUID = 2512379128719575505L;
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

        data.setDetailPk(detail.getPath());

        stackProvider.addCommand(data);


    }
}
