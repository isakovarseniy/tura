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

import org.elsoft.platform.metamodel.PersistentInterface;
import org.elsoft.platform.metamodel.processor.CommandHandler;

public class Field2field extends PersistentInterface {


	private String detailField;
	private String masterField;
	
	public Field2field(String masterField, String detailField ){
		this.masterField=masterField;
		this.detailField=detailField;
	}
	
	@Override
	protected void serialize(CommandHandler ch) {

	}




	public String getDetailField() {
		return detailField;
	}

	public void setDetailField(String detailField) {
		this.detailField = detailField;
	}

	public String getMasterField() {
		return masterField;
	}

	public void setMasterField(String masterField) {
		this.masterField = masterField;
	}

}
