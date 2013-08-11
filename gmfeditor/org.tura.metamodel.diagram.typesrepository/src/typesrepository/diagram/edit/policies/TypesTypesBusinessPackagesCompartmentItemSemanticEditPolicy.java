/*
 * 
 */
package typesrepository.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typesrepository.diagram.edit.commands.BusinessPackageCreateCommand;
import typesrepository.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class TypesTypesBusinessPackagesCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypesTypesBusinessPackagesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Types_202001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.BusinessPackage_203003 == req.getElementType()) {
			return getGEFWrapper(new BusinessPackageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
