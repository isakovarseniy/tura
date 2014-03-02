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


}
