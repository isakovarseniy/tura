/*
 * 
 */
package mapper.diagram.preferences;

import mapper.diagram.part.DomainDiagramEditorPlugin;

import org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage;

/**
 * @generated
 */
public class DiagramPrintingPreferencePage extends PrintingPreferencePage {

	/**
	 * @generated
	 */
	public DiagramPrintingPreferencePage() {
		setPreferenceStore(DomainDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
