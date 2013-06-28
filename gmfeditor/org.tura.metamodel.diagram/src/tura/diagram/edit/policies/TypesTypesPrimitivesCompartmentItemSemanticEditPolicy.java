/*
 * 
 */
package tura.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import tura.diagram.edit.commands.PrimitiveCreateCommand;
import tura.diagram.providers.TuraElementTypes;

/**
 * @generated
 */
public class TypesTypesPrimitivesCompartmentItemSemanticEditPolicy extends
		TuraBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypesTypesPrimitivesCompartmentItemSemanticEditPolicy() {
		super(TuraElementTypes.Types_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TuraElementTypes.Primitive_3002 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
