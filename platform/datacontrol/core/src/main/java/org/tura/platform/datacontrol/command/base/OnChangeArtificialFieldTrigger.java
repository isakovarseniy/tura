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

package org.tura.platform.datacontrol.command.base;

import java.util.Map;

import org.tura.platform.datacontrol.commons.TuraException;

public interface OnChangeArtificialFieldTrigger {
	
	public boolean onSet(Object obj, Map<String, Object> attributes, String field ,Object value) throws TuraException;

	public Object[] onGet(Object obj, Map<String, Object> attributes, String field ) throws TuraException;

}
