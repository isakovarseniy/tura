/*
 * 
 */
package typesrepository.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import typesrepository.diagram.part.TypesrepositoryVisualIDRegistry;

/**
 * @generated
 */
public class TypesrepositoryNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 207005;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 207004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TypesrepositoryNavigatorItem) {
			TypesrepositoryNavigatorItem item = (TypesrepositoryNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return TypesrepositoryVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
