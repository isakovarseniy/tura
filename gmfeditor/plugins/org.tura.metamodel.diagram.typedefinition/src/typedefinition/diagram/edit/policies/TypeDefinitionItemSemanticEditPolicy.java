/*
* 
*/
package typedefinition.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import typedefinition.diagram.edit.commands.EnumaratorCreateCommand;
import typedefinition.diagram.edit.commands.PrimitiveCreateCommand;
import typedefinition.diagram.edit.commands.TypeCreateCommand;
import typedefinition.diagram.edit.commands.TypeReferenceCreateCommand;
import typedefinition.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class TypeDefinitionItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TypeDefinitionItemSemanticEditPolicy() {
		super(DomainElementTypes.TypeDefinition_101000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Type_102002 == req.getElementType()) {
			return getGEFWrapper(new TypeCreateCommand(req));
		}
		if (DomainElementTypes.TypeReference_102001 == req.getElementType()) {
			return getGEFWrapper(new TypeReferenceCreateCommand(req));
		}
		if (DomainElementTypes.Primitive_102004 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveCreateCommand(req));
		}
		if (DomainElementTypes.Enumarator_102005 == req.getElementType()) {
			return getGEFWrapper(new EnumaratorCreateCommand(req));
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
