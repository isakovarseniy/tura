/*
 * 
 */
package recipe.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import recipe.diagram.part.RecipeVisualIDRegistry;

/**
 * @generated
 */
public class RecipeNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 307014;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 307013;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RecipeNavigatorItem) {
			RecipeNavigatorItem item = (RecipeNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return RecipeVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
