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
package org.eclipse.e4.xwt.elsoft.types;

import java.util.StringTokenizer;

public class TriggerType {
	
	private String triggerType;
	private String triggerName;
	
	
	public TriggerType(String property){
		StringTokenizer tokenizer = new StringTokenizer(property, ".");

		if (tokenizer.hasMoreElements())
			triggerType = tokenizer.nextToken();

		if (tokenizer.hasMoreElements())
			triggerName = tokenizer.nextToken();
	
	}

	public String getTriggerType() {
		return triggerType;
	}
	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}
	public String getTriggerName() {
		return triggerName;
	}
	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

}
