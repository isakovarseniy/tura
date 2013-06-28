/*
 * 
 */
package typedefinition.diagram.providers;

import typedefinition.diagram.part.TypedefinitionDiagramEditorPlugin;

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
		ElementInitializers cached = TypedefinitionDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			TypedefinitionDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
