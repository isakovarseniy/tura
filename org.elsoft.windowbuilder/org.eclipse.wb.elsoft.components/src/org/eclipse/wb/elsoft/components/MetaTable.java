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

import org.eclipse.e4.xwt.elsoft.types.CastObjectProperty;
import org.eclipse.e4.xwt.elsoft.types.IDProperty;
import org.eclipse.e4.xwt.elsoft.types.IteratorProperty;
import org.eclipse.e4.xwt.elsoft.types.VisualDependencyProperty;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

public class MetaTable extends Table {
	private IteratorProperty iteratorProperty;
	private CastObjectProperty castObject;
	private String cssStyle;
	private String cssStyleClass;
	private IDProperty idObject;
	private VisualDependencyProperty updateOnRawSelect;

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

	public MetaTable(Composite parent, int style) {
		super(parent, style);
	}

	protected void checkSubclass() {
	}

	public IteratorProperty getIteratorProperty() {
		return iteratorProperty;
	}

	public void setIteratorProperty(IteratorProperty iteratorProperty) {
		this.iteratorProperty = iteratorProperty;
	}

	public IDProperty getIdObject() {
		return idObject;
	}

	public void setIdObject(IDProperty idObject) {
		this.idObject = idObject;
	}

	public VisualDependencyProperty getUpdateOnRawSelect() {
		return updateOnRawSelect;
	}

	public void setUpdateOnRawSelect(VisualDependencyProperty updateOnRawSelect) {
		this.updateOnRawSelect = updateOnRawSelect;
	}

	public CastObjectProperty getCastObject() {
		return castObject;
	}

	public void setCastObject(CastObjectProperty castObject) {
		this.castObject = castObject;
	}




}
