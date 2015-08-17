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
package org.tura.metamodel.wizard.infrastructure;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

public class RecipeGeneration {

	public void generation(domain.Infrastructure infrastructure) {

		IEditorPart editorPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		MetamodelTransformationJob job = new MetamodelTransformationJob("Generation");
		job.setEditorPart(editorPart);
		job.setInfrastructure(infrastructure);

		job.schedule();

	}

	public void deployment(domain.Infrastructure infrastructure) {
		IEditorPart editorPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		MetamodelDeploymentJob job = new MetamodelDeploymentJob("Deplyment");
		job.setEditorPart(editorPart);
		job.setInfrastructure(infrastructure);

		job.schedule();

		
	}	
	

}
