/*
 * 
 */
package typesrepository.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typesrepository.diagram.edit.commands.PackageCreateCommand;
import typesrepository.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class TypesTypesPackagesCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypesTypesPackagesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Types_202001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Package_203002 == req.getElementType()) {
			return getGEFWrapper(new PackageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
