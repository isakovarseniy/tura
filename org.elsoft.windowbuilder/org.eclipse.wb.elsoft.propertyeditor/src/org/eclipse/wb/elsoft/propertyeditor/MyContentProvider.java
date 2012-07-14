package org.eclipse.wb.elsoft.propertyeditor;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class MyContentProvider implements ITreeContentProvider {

	public Object[] getElements(Object inputElement) {
		return ((TreeModel) inputElement).child.toArray();
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	public Object[] getChildren(Object parentElement) {
		return getElements(parentElement);
	}

	public Object getParent(Object element) {
		if (element == null) {
			return null;
		}
		return ((TreeModel) element).parent;
	}

	public boolean hasChildren(Object element) {
		return ((TreeModel) element).child.size() > 0;
	}

}
