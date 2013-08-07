/*
 * 
 */
package application.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import application.diagram.edit.commands.ApplicationMapperCreateCommand;
import application.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ApplicationMappersApplicationMappersMappersCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ApplicationMappersApplicationMappersMappersCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.ApplicationMappers_802002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ApplicationMapper_803002 == req.getElementType()) {
			return getGEFWrapper(new ApplicationMapperCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
