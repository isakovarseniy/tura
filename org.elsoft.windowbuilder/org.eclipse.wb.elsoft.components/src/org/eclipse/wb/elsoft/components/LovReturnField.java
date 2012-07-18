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
import org.eclipse.e4.xwt.elsoft.types.SourceProperty;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Widget;

public class LovReturnField extends Item{

	private SourceProperty displayField;
	private IteratorProperty returnIterator;
	private SourceProperty returnField;
	
	
	
	public SourceProperty getDisplayField() {
		return displayField;
	}

	public void setDisplayField(SourceProperty displayField) {
		this.displayField = displayField;
	}


	public IteratorProperty getReturnIterator() {
		return returnIterator;
	}


	public void setReturnIterator(IteratorProperty returnIterator) {
		this.returnIterator = returnIterator;
	}


	public LovReturnField(Widget parent, int style) {
		super(parent, style);
	}

	public SourceProperty getReturnField() {
		return returnField;
	}

	public void setReturnField(SourceProperty returnField) {
		this.returnField = returnField;
	}

}
