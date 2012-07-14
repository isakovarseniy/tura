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
package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.HashMap;

import org.elsoft.platform.metamodel.general.CreateUIInputTextDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIInputText;

public class InputText extends InputElement {

	
	public InputText(CreateUIInputTextDAO command,HashMap<String, Object> context){
		this.setCss(command.getCss());
		this.setCssClass(command.getCssClass());
		setUuid(command.getUUID());
		setLabel(command.getLabel());
		context.put(command.getUUID(), this);
		
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateUIInputText.save(ch, getParentUuid(), this);		
        super.serialize(ch);  
	}

	@Override
	public String getUiElementType() {
		return "InputText";
	}


}
