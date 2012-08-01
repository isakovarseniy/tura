package org.eclipse.wb.elsoft.propertyeditor;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.elsoft.propertyeditor.VisualDependencyPropertyEditor.Pair;

public class IDLabelProvider extends BaseLabelProvider implements
		ILabelProvider {
	public Image getImage(Object element) {
		return null;
	}

	public String getText(Object element) {
		return ((Pair) element).name+" - "+((Pair) element).value;
	}
}