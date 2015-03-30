/*
 * 
 */
package domain.diagram.providers;

import domain.diagram.part.DomainDiagramEditorPlugin;

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
		ElementInitializers cached = DomainDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			DomainDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
