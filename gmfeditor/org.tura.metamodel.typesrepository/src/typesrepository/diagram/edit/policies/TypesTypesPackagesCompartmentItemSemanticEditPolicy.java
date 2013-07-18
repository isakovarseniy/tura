/*
 * 
 */
package typesrepository.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typesrepository.diagram.edit.commands.PackageCreateCommand;
import typesrepository.diagram.providers.TypesrepositoryElementTypes;

/**
 * @generated
 */
public class TypesTypesPackagesCompartmentItemSemanticEditPolicy extends
		TypesrepositoryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypesTypesPackagesCompartmentItemSemanticEditPolicy() {
		super(TypesrepositoryElementTypes.Types_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TypesrepositoryElementTypes.Package_3001 == req.getElementType()) {
			return getGEFWrapper(new PackageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
