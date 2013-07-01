/*
 * 
 */
package businessobjects.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import businessobjects.diagram.part.BusinessobjectsDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(BusinessobjectsDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
