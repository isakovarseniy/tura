/*
 * 
 */
package businessobjects.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;

import businessobjects.diagram.part.BusinessobjectsDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

	/**
	 * @generated
	 */
	public DiagramAppearancePreferencePage() {
		setPreferenceStore(BusinessobjectsDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
