package org.tura.metamodel.wizard.infrastructure;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;

import recipe.diagram.part.DomainDiagramEditorPlugin;
import recipe.diagram.providers.DomainValidationProvider;

public class MetamodelTransformationJob extends Job {

	@SuppressWarnings("unused")
	private static boolean constraintsActive = false;
	private IEditorPart editorPart;
	private domain.Infrastructure infrastructure;

	public MetamodelTransformationJob(String name) {
		super(name);
	}

	public IEditorPart getEditorPart() {
		return editorPart;
	}

	public void setEditorPart(IEditorPart editorPart) {
		this.editorPart = editorPart;
	}

	public domain.Infrastructure getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(domain.Infrastructure infrastructure) {
		this.infrastructure = infrastructure;
	}

	protected IStatus run(IProgressMonitor monitor) {

		Object input = editorPart.getEditorInput();
		IDocument document = (((IDocumentEditor) editorPart)
				.getDocumentProvider()).getDocument(input);

		GMFValidation gmfVlaidation = new GMFValidation(monitor);
		runValidation(
				((IDiagramWorkbenchPart) editorPart).getDiagramEditPart(),
				(View) document.getContent(), gmfVlaidation);

		if (gmfVlaidation.isValidationError()) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					MessageDialog dialog = new MessageDialog(Display
							.getDefault().getActiveShell(), "Tura", null,
							"Validation error", MessageDialog.ERROR,
							new String[] { "Ok" }, 0);
					dialog.open();
				}
			});

		} else {

			GMFGeneration gmfGeneration = new GMFGeneration(monitor);

			runGeneration(
					((IDiagramWorkbenchPart) editorPart).getDiagramEditPart(),
					(View) document.getContent(), infrastructure, gmfGeneration);
			if (gmfGeneration.isGenerationError()) {
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

	public void runValidation(DiagramEditPart diagramEditPart, View view,
			GMFValidation gmfVlaidation) {

		final DiagramEditPart fpart = diagramEditPart;
		final View fview = view;
		final GMFValidation action = gmfVlaidation;

		class Runner implements Runnable {
			public void run() {
				action.validate(fpart, fview);
			}

		}

		TransactionalEditingDomain txDomain = TransactionUtil
				.getEditingDomain(view);

		Runner v = new Runner();

		DomainValidationProvider.runWithConstraints(txDomain, v);

	}

	public void runGeneration(DiagramEditPart diagramEditPart, View view,
			domain.Infrastructure infrastructure, GMFGeneration gmfGeneration) {
		final DiagramEditPart fpart = diagramEditPart;
		final View fview = view;
		final GMFGeneration action = gmfGeneration;
		final domain.Infrastructure infra = infrastructure;
		
		action.generate(fpart, fview, infra);

	}

	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				DomainDiagramEditorPlugin.getInstance().logError(
						"Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

}
