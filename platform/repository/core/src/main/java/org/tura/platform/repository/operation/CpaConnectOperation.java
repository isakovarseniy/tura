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

import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.repository.data.AddObjectData;
import org.tura.platform.repository.spa.OperationLevel;

public class CpaConnectOperation extends AddObjectOperation{
	
	private static final long serialVersionUID = -4069739817512286889L;

	public void add() throws Exception {
    	AddObjectData data = new AddObjectData();
    	populate(data);

        data.setMasterPk(getMaster().getPath());
        data.setDetailPk(getDetail().getPath());
        data.getParams().put(Constants.CPA_OPERATION, OperationLevel.LOAD.name());
        
        
        getStackProvider().get().addCommand(data);


    }

}