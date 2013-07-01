/*
 * 
 */
package businessobjects.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage;

import businessobjects.diagram.part.BusinessobjectsDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPrintingPreferencePage extends PrintingPreferencePage {

	/**
	 * @generated
	 */
	public DiagramPrintingPreferencePage() {
		setPreferenceStore(BusinessobjectsDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
