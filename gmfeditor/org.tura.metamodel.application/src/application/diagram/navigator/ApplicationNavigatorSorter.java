/*
 * 
 */
package application.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import application.diagram.part.ApplicationVisualIDRegistry;

/**
 * @generated
 */
public class ApplicationNavigatorSorter extends ViewerSorter {

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
		if (element instanceof ApplicationNavigatorItem) {
			ApplicationNavigatorItem item = (ApplicationNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ApplicationVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
