/*
 * 
 */
package recipe.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import recipe.diagram.part.RecipeDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(RecipeDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
