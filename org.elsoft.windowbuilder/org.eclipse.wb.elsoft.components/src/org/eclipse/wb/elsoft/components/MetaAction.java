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

import org.eclipse.e4.xwt.elsoft.types.ExpressionProperty;
import org.eclipse.e4.xwt.elsoft.types.IDProperty;
import org.eclipse.e4.xwt.elsoft.types.VisualDependencyProperty;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class MetaAction extends Button {

	private ExpressionProperty expressionProperty;
	private ExpressionProperty imageProperty;
	private String cssStyle;
	private String cssStyleClass;
	private IDProperty idObject;
	private VisualDependencyProperty updateOnButtonPressed;

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

	protected void checkSubclass() {
	}

	public MetaAction(Composite parent, int style) {
		super(parent, style);
	}

	public ExpressionProperty getExpressionProperty() {
		return expressionProperty;
	}

	public void setExpressionProperty(ExpressionProperty expressionProperty) {
		this.expressionProperty = expressionProperty;
	}

	public IDProperty getIdObject() {
		return idObject;
	}

	public void setIdObject(IDProperty idObject) {
		this.idObject = idObject;
	}

	public VisualDependencyProperty getUpdateOnButtonPressed() {
		return updateOnButtonPressed;
	}

	public void setUpdateOnButtonPressed(VisualDependencyProperty updateOnButtonPressed) {
		this.updateOnButtonPressed = updateOnButtonPressed;
	}

	public ExpressionProperty getImageProperty() {
		return imageProperty;
	}

	public void setImageProperty(ExpressionProperty imageProperty) {
		this.imageProperty = imageProperty;
	}


}
