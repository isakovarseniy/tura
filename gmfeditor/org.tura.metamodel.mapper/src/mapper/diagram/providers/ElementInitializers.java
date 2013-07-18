/*
 * 
 */
package mapper.diagram.providers;

import mapper.diagram.part.MapperDiagramEditorPlugin;

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
		ElementInitializers cached = MapperDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			MapperDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
