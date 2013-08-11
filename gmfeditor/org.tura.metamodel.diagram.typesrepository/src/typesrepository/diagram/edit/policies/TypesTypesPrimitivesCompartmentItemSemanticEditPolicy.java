/*
 * 
 */
package typesrepository.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typesrepository.diagram.edit.commands.PrimitiveCreateCommand;
import typesrepository.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class TypesTypesPrimitivesCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypesTypesPrimitivesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Types_202001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Primitive_203001 == req.getElementType()) {
			return getGEFWrapper(new PrimitiveCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
