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
