/*
 * 
 */
package control.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import control.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 1107015;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 1107014;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof DomainNavigatorItem) {
			DomainNavigatorItem item = (DomainNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return DomainVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
