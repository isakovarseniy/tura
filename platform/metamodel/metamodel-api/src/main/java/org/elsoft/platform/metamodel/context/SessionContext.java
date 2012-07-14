/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.metamodel.context;

import org.elsoft.platform.datacontrol.Mode;

public interface SessionContext {
	public static String CURRENT_RECORD = "CURRENT_RECORD";
	public static String OBJECT_TYPE = "OBJECT_TYPE";
	public static String RESULT_EXPRESSION = "RESULT_EXPRESSION";
	public static String COMMAND_TYPE = "CommandType";
	
	
	public void set(Mode<?> mode, Object... parameters);
	public void unset(Mode<?> mode);
	
}
