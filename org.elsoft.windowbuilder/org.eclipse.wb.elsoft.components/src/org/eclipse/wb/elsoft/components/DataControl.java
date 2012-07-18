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

import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.e4.xwt.elsoft.types.TriggerProperty;
import org.eclipse.swt.widgets.Composite;

public class DataControl extends Composite{

	private BusinessObjectProperty businessObject;
	private TriggerProperty triggerProperty;
	
	public DataControl(Composite parent, int style) {
		super(parent, style);
	}

	
	public BusinessObjectProperty getBusinessObject() {
		return businessObject;
	}


	public void setBusinessObject(BusinessObjectProperty businessObject) {
		this.businessObject = businessObject;
	}


	public TriggerProperty getTriggerProperty() {
		return triggerProperty;
	}


	public void setTriggerProperty(TriggerProperty triggerProperty) {
		this.triggerProperty = triggerProperty;
	}
}
