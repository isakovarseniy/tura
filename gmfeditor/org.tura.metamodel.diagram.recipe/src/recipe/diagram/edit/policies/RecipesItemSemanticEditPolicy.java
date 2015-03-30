/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import recipe.diagram.edit.commands.ConfigurationCreateCommand;
import recipe.diagram.edit.commands.DeploymentSequenceCreateCommand;
import recipe.diagram.edit.commands.InfrastructureCreateCommand;
import recipe.diagram.edit.commands.RecipeCreateCommand;
import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class RecipesItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RecipesItemSemanticEditPolicy() {
		super(DomainElementTypes.Recipes_301000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Recipe_302001 == req.getElementType()) {
			return getGEFWrapper(new RecipeCreateCommand(req));
		}
		if (DomainElementTypes.Configuration_302002 == req.getElementType()) {
			return getGEFWrapper(new ConfigurationCreateCommand(req));
		}
		if (DomainElementTypes.Infrastructure_302003 == req.getElementType()) {
			return getGEFWrapper(new InfrastructureCreateCommand(req));
		}
		if (DomainElementTypes.DeploymentSequence_302004 == req.getElementType()) {
			return getGEFWrapper(new DeploymentSequenceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
