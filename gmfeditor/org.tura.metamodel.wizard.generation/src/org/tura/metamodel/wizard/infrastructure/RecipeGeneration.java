package org.tura.metamodel.wizard.infrastructure;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

public class RecipeGeneration {

	public void generation(domain.Infrastructure infrastructure) {

		IEditorPart editorPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		GenerationJob job = new GenerationJob("Generation");
		job.setEditorPart(editorPart);
		job.setInfrastructure(infrastructure);

		job.schedule();

	}

	class GenerationJob extends Job {
		public GenerationJob(String name) {
			super(name);
		}

		private IEditorPart editorPart;
		private domain.Infrastructure infrastructure;

		public domain.Infrastructure getInfrastructure() {
			return infrastructure;
		}

		public void setInfrastructure(domain.Infrastructure infrastructure) {
			this.infrastructure = infrastructure;
		}

		public IEditorPart getEditorPart() {
			return editorPart;
		}

		public void setEditorPart(IEditorPart editorPart) {
			this.editorPart = editorPart;
		}

		protected IStatus run(IProgressMonitor monitor) {

			Object input = editorPart.getEditorInput();
			IDocument document = (((IDocumentEditor) editorPart)
					.getDocumentProvider()).getDocument(input);

			ValidateAction action = new ValidateAction(monitor);

			action.runValidation(
					((IDiagramWorkbenchPart) editorPart).getDiagramEditPart(),
					(View) document.getContent());

			if (action.isValidationError()) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						MessageDialog dialog = new MessageDialog(Display
								.getDefault().getActiveShell(), "Tura", null,
								"Validation error", MessageDialog.ERROR,
								new String[] { "Ok" }, 0);
						dialog.open();
					}
				});

			}else{
				action.runGeneration(
						((IDiagramWorkbenchPart) editorPart).getDiagramEditPart(),
						(View) document.getContent(),infrastructure);
				if (action.isGenerationError()){
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							MessageDialog dialog = new MessageDialog(Display
									.getDefault().getActiveShell(), "Tura", null,
									"Generation error", MessageDialog.ERROR,
									new String[] { "Ok" }, 0);
							dialog.open();
						}
					});

			}
			}
			return Status.OK_STATUS;
		}

	}

}
