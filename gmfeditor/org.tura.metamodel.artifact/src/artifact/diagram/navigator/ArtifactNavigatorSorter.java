/*
 * 
 */
package artifact.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import artifact.diagram.part.ArtifactVisualIDRegistry;

/**
 * @generated
 */
public class ArtifactNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 707005;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 707004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ArtifactNavigatorItem) {
			ArtifactNavigatorItem item = (ArtifactNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ArtifactVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
