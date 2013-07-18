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

import domain.diagram.edit.commands.EnumaratorCreateCommand;
import domain.diagram.edit.commands.TypeCreateCommand;
import domain.diagram.edit.commands.TypeReferenceCreateCommand;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class Dammy1ItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Dammy1ItemSemanticEditPolicy() {
		super(DomainElementTypes.Dammy1_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.TypeReference_2004 == req.getElementType()) {
			return getGEFWrapper(new TypeReferenceCreateCommand(req));
		}
		if (DomainElementTypes.Type_2005 == req.getElementType()) {
			return getGEFWrapper(new TypeCreateCommand(req));
		}
		if (DomainElementTypes.Enumarator_2006 == req.getElementType()) {
			return getGEFWrapper(new EnumaratorCreateCommand(req));
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
