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

import org.eclipse.e4.xwt.elsoft.types.FieldsSetTypeProperty;
import org.eclipse.e4.xwt.elsoft.types.IDProperty;
import org.eclipse.swt.widgets.Composite;

public class MetaFieldSet extends Composite{

	private IDProperty idObject;
	private String label;
	private FieldsSetTypeProperty fieldSet;
	private String cssStyle;
	private String cssStyleClass;
	
	public String getCssStyle() {
		return cssStyle;
	}

	public void setCssStyle(String cssStyle) {
		this.cssStyle = cssStyle;
	}

	public String getCssStyleClass() {
		return cssStyleClass;
	}

	public void setCssStyleClass(String cssStyleClass) {
		this.cssStyleClass = cssStyleClass;
	}

	public MetaFieldSet(Composite parent, int style) {
		super(parent, style);
	}

	public IDProperty getIdObject() {
		return idObject;
	}

	public void setIdObject(IDProperty idObject) {
		this.idObject = idObject;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public FieldsSetTypeProperty getFieldSet() {
		return fieldSet;
	}

	public void setFieldSet(FieldsSetTypeProperty fieldSet) {
		this.fieldSet = fieldSet;
	}

}
