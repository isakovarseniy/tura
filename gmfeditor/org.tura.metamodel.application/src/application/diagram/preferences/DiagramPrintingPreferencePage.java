/*
 * 
 */
package application.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage;

import application.diagram.part.ApplicationDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPrintingPreferencePage extends PrintingPreferencePage {

	/**
	 * @generated
	 */
	public DiagramPrintingPreferencePage() {
		setPreferenceStore(ApplicationDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
