/*
 * 
 */
package application.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import application.diagram.edit.commands.ApplicationMapperCreateCommand;
import application.diagram.providers.ApplicationElementTypes;

/**
 * @generated
 */
public class ApplicationMappersApplicationMappersMappersCompartmentItemSemanticEditPolicy
		extends ApplicationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ApplicationMappersApplicationMappersMappersCompartmentItemSemanticEditPolicy() {
		super(ApplicationElementTypes.ApplicationMappers_802002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ApplicationElementTypes.ApplicationMapper_803002 == req
				.getElementType()) {
			return getGEFWrapper(new ApplicationMapperCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
