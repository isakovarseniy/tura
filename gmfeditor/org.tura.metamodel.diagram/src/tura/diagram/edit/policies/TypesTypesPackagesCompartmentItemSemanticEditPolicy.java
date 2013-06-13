/*
 * 
 */
package tura.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import tura.diagram.edit.commands.PackageCreateCommand;
import tura.diagram.providers.TuraElementTypes;

/**
 * @generated
 */
public class TypesTypesPackagesCompartmentItemSemanticEditPolicy extends
		TuraBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypesTypesPackagesCompartmentItemSemanticEditPolicy() {
		super(TuraElementTypes.Types_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TuraElementTypes.Package_3001 == req.getElementType()) {
			return getGEFWrapper(new PackageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
