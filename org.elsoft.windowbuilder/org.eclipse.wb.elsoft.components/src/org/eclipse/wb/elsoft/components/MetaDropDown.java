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

import org.eclipse.e4.xwt.elsoft.types.IteratorProperty;
import org.eclipse.e4.xwt.elsoft.types.OptionFieldProperty;
import org.eclipse.e4.xwt.elsoft.types.SourceProperty;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

public class MetaDropDown extends Combo{
	private IteratorProperty iteratorProperty;
	private SourceProperty sourceProperty;
	private IteratorProperty optionIterator;
	private OptionFieldProperty optionLabel;
	private OptionFieldProperty optionValue;
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

	public IteratorProperty getOptionIterator() {
		return optionIterator;
	}

	public void setOptionIterator(IteratorProperty optionIterator) {
		this.optionIterator = optionIterator;
	}

	public OptionFieldProperty getOptionLabel() {
		return optionLabel;
	}

	public void setOptionLabel(OptionFieldProperty optionLabel) {
		this.optionLabel = optionLabel;
	}

	public OptionFieldProperty getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(OptionFieldProperty optionValue) {
		this.optionValue = optionValue;
	}

	protected void checkSubclass() {
	}

	public IteratorProperty getIteratorProperty() {
		return iteratorProperty;
	}

	public void setIteratorProperty(IteratorProperty iteratorProperty) {
		this.iteratorProperty = iteratorProperty;
	}

	public SourceProperty getSourceProperty() {
		return sourceProperty;
	}

	public void setSourceProperty(SourceProperty sourceProperty) {
		this.sourceProperty = sourceProperty;
	}

	public MetaDropDown(Composite parent, int style) {
		super(parent, style);
	}


}
