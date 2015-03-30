/*
 * 
 */
package domain.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import domain.diagram.edit.commands.DomainApplicationsCreateCommand;
import domain.diagram.edit.commands.DomainArtifactsCreateCommand;
import domain.diagram.edit.commands.DomainTypesCreateCommand;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DomainItemSemanticEditPolicy() {
		super(DomainElementTypes.Domain_501000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.DomainArtifacts_502001 == req.getElementType()) {
			return getGEFWrapper(new DomainArtifactsCreateCommand(req));
		}
		if (DomainElementTypes.DomainApplications_502003 == req.getElementType()) {
			return getGEFWrapper(new DomainApplicationsCreateCommand(req));
		}
		if (DomainElementTypes.DomainTypes_502002 == req.getElementType()) {
			return getGEFWrapper(new DomainTypesCreateCommand(req));
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
