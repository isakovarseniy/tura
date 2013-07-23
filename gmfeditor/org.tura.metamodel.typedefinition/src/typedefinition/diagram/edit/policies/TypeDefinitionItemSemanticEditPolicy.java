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
import typedefinition.diagram.edit.commands.TypeCreateCommand;
import typedefinition.diagram.edit.commands.TypeReferenceCreateCommand;
import typedefinition.diagram.providers.TypedefinitionElementTypes;

/**
 * @generated
 */
public class TypeDefinitionItemSemanticEditPolicy extends
		TypedefinitionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypeDefinitionItemSemanticEditPolicy() {
		super(TypedefinitionElementTypes.TypeDefinition_101000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TypedefinitionElementTypes.TypeReference_102001 == req
				.getElementType()) {
			return getGEFWrapper(new TypeReferenceCreateCommand(req));
		}
		if (TypedefinitionElementTypes.Type_102002 == req.getElementType()) {
			return getGEFWrapper(new TypeCreateCommand(req));
		}
		if (TypedefinitionElementTypes.Enumarator_102003 == req
				.getElementType()) {
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
