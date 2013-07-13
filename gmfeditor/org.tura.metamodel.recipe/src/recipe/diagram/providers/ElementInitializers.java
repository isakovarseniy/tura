/*
 * 
 */
package recipe.diagram.providers;

import recipe.diagram.part.RecipeDiagramEditorPlugin;

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
		ElementInitializers cached = RecipeDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			RecipeDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
