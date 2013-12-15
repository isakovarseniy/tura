package org.tura.metamodel.wizard.infrastructure;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentEditor;

public class RecipeGeneration {

	public void generation(domain.Infrastructure infrastructure) {

		
		IEditorPart editorPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		Object input=  editorPart.getEditorInput();
	    IDocument document =    (((IDocumentEditor)editorPart).getDocumentProvider()).getDocument(input);
	    ValidateAction.runValidation((View)document.getContent());
	    
	}

}
