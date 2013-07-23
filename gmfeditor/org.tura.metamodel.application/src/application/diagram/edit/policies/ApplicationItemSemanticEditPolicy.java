/*
 * 
 */
package application.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import application.diagram.edit.commands.ApplicationMappersCreateCommand;
import application.diagram.edit.commands.ApplicationRecipesCreateCommand;
import application.diagram.providers.ApplicationElementTypes;

/**
 * @generated
 */
public class ApplicationItemSemanticEditPolicy extends
		ApplicationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ApplicationItemSemanticEditPolicy() {
		super(ApplicationElementTypes.Application_801000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ApplicationElementTypes.ApplicationRecipes_802001 == req
				.getElementType()) {
			return getGEFWrapper(new ApplicationRecipesCreateCommand(req));
		}
		if (ApplicationElementTypes.ApplicationMappers_802002 == req
				.getElementType()) {
			return getGEFWrapper(new ApplicationMappersCreateCommand(req));
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
