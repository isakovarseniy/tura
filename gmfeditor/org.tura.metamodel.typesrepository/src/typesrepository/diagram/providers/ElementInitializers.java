/*
 * 
 */
package typesrepository.diagram.providers;

import typesrepository.diagram.part.TypesrepositoryDiagramEditorPlugin;

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
		ElementInitializers cached = TypesrepositoryDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			TypesrepositoryDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
