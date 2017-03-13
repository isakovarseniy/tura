/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.generation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;

import recipe.Infrastructure;

public class MetamodelTransformationJob extends Job {

	@SuppressWarnings("unused")
	private static boolean constraintsActive = false;
	private IEditorPart editorPart;
	private Infrastructure infrastructure;

	public MetamodelTransformationJob(String name) {
		super(name);
	}

	public IEditorPart getEditorPart() {
		return editorPart;
	}

	public void setEditorPart(IEditorPart editorPart) {
		this.editorPart = editorPart;
	}

	public Infrastructure getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(Infrastructure infrastructure) {
		this.infrastructure = infrastructure;
	}

	protected IStatus run(IProgressMonitor monitor) {

		Object input = editorPart.getEditorInput();
		IDocument document = (((IDocumentEditor) editorPart)
				.getDocumentProvider()).getDocument(input);

		GMFGeneration gmfGeneration = new GMFGeneration(monitor);
        try{
			runGeneration(((IDiagramWorkbenchPart) editorPart).getDiagramEditPart(), (View) document.getContent(),
					infrastructure, gmfGeneration);
			if (gmfGeneration.isGenerationError()) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						MessageDialog dialog = new MessageDialog(Display.getDefault().getActiveShell(), "Tura", null,
								"Generation error", MessageDialog.ERROR, new String[] { "Ok" }, 0);
						dialog.open();
					}
				});
	
			}
        }catch(Throwable t){
			LogUtil.log(t);
        }
        monitor.done();
        
		return Status.OK_STATUS;

	}


	public void runGeneration(DiagramEditPart diagramEditPart, View view,
			Infrastructure infrastructure, GMFGeneration gmfGeneration) {
		final DiagramEditPart fpart = diagramEditPart;
		final View fview = view;
		final GMFGeneration action = gmfGeneration;
		final Infrastructure infra = infrastructure;

		action.generate(fpart, fview, infra);

	}

}
