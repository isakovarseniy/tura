/*
 * 
 */
package businessobjects.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import businessobjects.diagram.part.DomainDiagramEditorPlugin;

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
