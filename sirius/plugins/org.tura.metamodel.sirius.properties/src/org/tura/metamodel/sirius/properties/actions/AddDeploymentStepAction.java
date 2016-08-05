package org.tura.metamodel.sirius.properties.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import recipe.DeploymentComponent;
import recipe.ModelMapper;
import recipe.Recipe;
import recipe.RecipeFactory;
import recipe.RecipePackage;

public class AddDeploymentStepAction implements IExternalJavaAction{

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		DRepresentationElement node = (DRepresentationElement) arg0.iterator().next();
		ModelMapper mapper =  (ModelMapper) node.getTarget();
		Recipe recipe = (Recipe) mapper.eContainer().eContainer().eContainer();
		
		Session session = SessionManager.INSTANCE.getSession(mapper);
		EditingDomain editingDomain = session.getTransactionalEditingDomain();
		DeploymentComponent step = RecipeFactory.eINSTANCE.createDeploymentComponent();
		step.setMapper(mapper);
		
		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,recipe,
						RecipePackage.eINSTANCE.getRecipe_DeplymentStep(), step));
		
	}

}
