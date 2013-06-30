/*
 * 
 */
package typesrepository.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typesrepository.diagram.edit.commands.PrimitiveCreateCommand;
import typesrepository.diagram.providers.TypesrepositoryElementTypes;

/**
 * @generated
 */
public class TypesTypesPrimitivesCompartmentItemSemanticEditPolicy extends
		TypesrepositoryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypesTypesPrimitivesCompartmentItemSemanticEditPolicy() {
		super(TypesrepositoryElementTypes.Types_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TypesrepositoryElementTypes.Primitive_3002 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
