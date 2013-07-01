/*
 * 
 */
package businessobjects.diagram.providers;

import businessobjects.diagram.part.BusinessobjectsDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = BusinessobjectsDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			BusinessobjectsDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
