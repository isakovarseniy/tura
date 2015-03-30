/*
 * 
 */
package application.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import application.diagram.edit.commands.ApplicationUIPackageCreateCommand;
import application.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ApplicationUILayerApplicationUILayerApplicationUIPackagesCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ApplicationUILayerApplicationUILayerApplicationUIPackagesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.ApplicationUILayer_802003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ApplicationUIPackage_803003 == req.getElementType()) {
			return getGEFWrapper(new ApplicationUIPackageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
