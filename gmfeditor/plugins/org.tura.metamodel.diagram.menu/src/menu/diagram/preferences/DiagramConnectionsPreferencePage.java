/*
 * 
 */
package menu.diagram.preferences;

import menu.diagram.part.DomainDiagramEditorPlugin;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(DomainDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}