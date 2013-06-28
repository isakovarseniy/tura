package typedefinition.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import typedefinition.diagram.part.TypedefinitionVisualIDRegistry;

/**
 * @generated
 */
public class TypedefinitionNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TypedefinitionNavigatorItem) {
			TypedefinitionNavigatorItem item = (TypedefinitionNavigatorItem) element;
			return TypedefinitionVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
