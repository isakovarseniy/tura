/*
 * 
 */
package mapper.diagram.edit.policies;

import mapper.diagram.edit.commands.CSSMapperCreateCommand;
import mapper.diagram.edit.commands.JavaMapperCreateCommand;
import mapper.diagram.edit.commands.JavaScriptMapperCreateCommand;
import mapper.diagram.providers.DomainElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class MappersItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MappersItemSemanticEditPolicy() {
		super(DomainElementTypes.Mappers_401000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.JavaMapper_402001 == req.getElementType()) {
			return getGEFWrapper(new JavaMapperCreateCommand(req));
		}
		if (DomainElementTypes.JavaScriptMapper_402003 == req.getElementType()) {
			return getGEFWrapper(new JavaScriptMapperCreateCommand(req));
		}
		if (DomainElementTypes.CSSMapper_402004 == req.getElementType()) {
			return getGEFWrapper(new CSSMapperCreateCommand(req));
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
