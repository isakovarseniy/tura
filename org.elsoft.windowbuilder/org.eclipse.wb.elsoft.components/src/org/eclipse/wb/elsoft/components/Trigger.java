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
package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.MethodProperty;
import org.eclipse.e4.xwt.elsoft.types.ServiceProperty;
import org.eclipse.e4.xwt.elsoft.types.TriggerType;
import org.eclipse.swt.widgets.Composite;

public class Trigger extends Composite{
	
	private TriggerType triggerType;
	private ServiceProperty service;
	private MethodProperty method;
	
	public Trigger(Composite parent, int style) {
		super(parent, style);
	}

	public TriggerType getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(TriggerType triggerType) {
		this.triggerType = triggerType;
	}

	public ServiceProperty getService() {
		return service;
	}

	public void setService(ServiceProperty service) {
		this.service = service;
	}

	public MethodProperty getMethod() {
		return method;
	}

	public void setMethod(MethodProperty method) {
		this.method = method;
	}

}
