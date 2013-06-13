/*
 * 
 */
package tura.diagram.providers;

import tura.diagram.part.TuraDiagramEditorPlugin;

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
		ElementInitializers cached = TuraDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			TuraDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
