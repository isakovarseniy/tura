/*
 * 
 */
package tura.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import tura.diagram.part.TuraVisualIDRegistry;

/**
 * @generated
 */
public class TuraNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TuraNavigatorItem) {
			TuraNavigatorItem item = (TuraNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return TuraVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
