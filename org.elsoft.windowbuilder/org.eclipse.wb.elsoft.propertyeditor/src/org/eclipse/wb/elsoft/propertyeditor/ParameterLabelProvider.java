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
package org.eclipse.wb.elsoft.propertyeditor;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.elsoft.propertyeditor.ExpressionLeaf;
import org.eclipse.wb.elsoft.propertyeditor.ValueLeaf;

public class ParameterLabelProvider extends BaseLabelProvider implements
		ILabelProvider {
	public Image getImage(Object element) {
		return null;
	}

	public String getText(Object element) {
		if (element instanceof ExpressionLeaf) {
			ExpressionLeaf leaf = (ExpressionLeaf) element;
			if (leaf.expression == null)
				return leaf.nodeName;
			else
				return leaf.nodeName + " - " + leaf.expression;
		}
		if (element instanceof ValueLeaf) {
			ValueLeaf leaf = (ValueLeaf) element;
			if (leaf.value == null)
				return leaf.nodeName;
			else
				return leaf.nodeName + " - " + leaf.value;
		}
		return ((TreeModel) element).nodeName;
	}
}
