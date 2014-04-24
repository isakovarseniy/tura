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

import application.diagram.edit.commands.ApplicationInfrastructureLayerCreateCommand;
import application.diagram.edit.commands.ApplicationMappersCreateCommand;
import application.diagram.edit.commands.ApplicationRecipesCreateCommand;
import application.diagram.edit.commands.ApplicationRoleCreateCommand;
import application.diagram.edit.commands.ApplicationStyleCreateCommand;
import application.diagram.edit.commands.ApplicationUILayerCreateCommand;
import application.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ApplicationItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ApplicationItemSemanticEditPolicy() {
		super(DomainElementTypes.Application_801000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ApplicationRecipes_802001 == req
				.getElementType()) {
			return getGEFWrapper(new ApplicationRecipesCreateCommand(req));
		}
		if (DomainElementTypes.ApplicationMappers_802002 == req
				.getElementType()) {
			return getGEFWrapper(new ApplicationMappersCreateCommand(req));
		}
		if (DomainElementTypes.ApplicationUILayer_802003 == req
				.getElementType()) {
			return getGEFWrapper(new ApplicationUILayerCreateCommand(req));
		}
		if (DomainElementTypes.ApplicationInfrastructureLayer_802004 == req
				.getElementType()) {
			return getGEFWrapper(new ApplicationInfrastructureLayerCreateCommand(
					req));
		}
		if (DomainElementTypes.ApplicationStyle_802005 == req.getElementType()) {
			return getGEFWrapper(new ApplicationStyleCreateCommand(req));
		}
		if (DomainElementTypes.ApplicationRole_802006 == req.getElementType()) {
			return getGEFWrapper(new ApplicationRoleCreateCommand(req));
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
