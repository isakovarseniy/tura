/*
 * 
 */
package typesrepository.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typesrepository.diagram.edit.commands.BusinessPackageCreateCommand;
import typesrepository.diagram.providers.TypesrepositoryElementTypes;

/**
 * @generated
 */
public class TypesTypesBusinessPackagesCompartmentItemSemanticEditPolicy extends
		TypesrepositoryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypesTypesBusinessPackagesCompartmentItemSemanticEditPolicy() {
		super(TypesrepositoryElementTypes.Types_202001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TypesrepositoryElementTypes.BusinessPackage_203002 == req
				.getElementType()) {
			return getGEFWrapper(new BusinessPackageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
