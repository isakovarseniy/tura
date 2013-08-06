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
import recipe.diagram.edit.commands.RecipeCreateCommand;
import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class RecipesItemSemanticEditPolicy extends
		RecipeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RecipesItemSemanticEditPolicy() {
		super(RecipeElementTypes.Recipes_301000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RecipeElementTypes.Recipe_302004 == req.getElementType()) {
			return getGEFWrapper(new RecipeCreateCommand(req));
		}
		if (RecipeElementTypes.Configuration_302005 == req.getElementType()) {
			return getGEFWrapper(new ConfigurationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}