package org.tura.metamodel.commons.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * A preference page for a simple HTML editor.
 */
public class TuraPreferencePage 
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public TuraPreferencePage() {
		super(FieldEditorPreferencePage.GRID);
		
		// Set the preference store for the preference page.
		IPreferenceStore store =
			Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
	}

	/**
	 * @see org.eclipse.jface.preference.
	 * FieldEditorPreferencePage#createFieldEditors()
	 */
	protected void createFieldEditors() {
		
		// Initialize all field editors.
		BooleanFieldEditor enableValidation = new BooleanFieldEditor(
			IPreferenceConstants.ENABLE_VALIDATION, 
			"&Enable validation before generation", 
			getFieldEditorParent());
		addField(enableValidation);
		

		BooleanFieldEditor logPreprocessedTemplate = new BooleanFieldEditor(
				IPreferenceConstants.LOG_TEMPLATES, 
				"&Log preprocessed templates", 
				getFieldEditorParent());
			addField(logPreprocessedTemplate);
		
			BooleanFieldEditor debugging = new BooleanFieldEditor(
					IPreferenceConstants.DEBUGING, 
					"&Debugging", 
					getFieldEditorParent());
				addField(debugging);

	
	
	}
	
	/**
	 * @see IWorkbenchPreferencePage#init
	 */
	public void init(IWorkbench workbench) {
	}
}
