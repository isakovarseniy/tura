/*
 * 
 */
package application.diagram.providers;

import application.diagram.part.ApplicationDiagramEditorPlugin;

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
		ElementInitializers cached = ApplicationDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			ApplicationDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
