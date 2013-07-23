/*
 * 
 */
package businessobjects.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import businessobjects.diagram.part.BusinessobjectsVisualIDRegistry;

/**
 * @generated
 */
public class BusinessobjectsNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 607010;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 607009;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof BusinessobjectsNavigatorItem) {
			BusinessobjectsNavigatorItem item = (BusinessobjectsNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return BusinessobjectsVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
