/*
 * 
 */
package mapper.diagram.navigator;

import mapper.diagram.part.MapperVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MapperNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 404003;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 404002;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MapperNavigatorItem) {
			MapperNavigatorItem item = (MapperNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return MapperVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
