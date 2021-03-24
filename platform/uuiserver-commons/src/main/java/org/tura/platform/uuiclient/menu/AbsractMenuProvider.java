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

package org.tura.platform.uuiclient.menu;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;

public abstract class AbsractMenuProvider {

    public abstract  Object getMenu(ELResolver eLResolver) throws TuraException;
	
    public Object resolver(String experssion, ELResolver eLResolver) {
        if (  experssion.length() > 2 &&  "#{".equals(experssion.substring(0, 2))) {
            return eLResolver.getValue(experssion);
        }
        return experssion;
    }
}
