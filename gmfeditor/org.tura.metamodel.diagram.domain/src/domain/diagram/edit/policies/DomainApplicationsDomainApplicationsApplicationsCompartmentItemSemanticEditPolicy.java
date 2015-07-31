/*
 * 
 */
package domain.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import domain.diagram.edit.commands.DomainApplicationCreateCommand;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainApplicationsDomainApplicationsApplicationsCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DomainApplicationsDomainApplicationsApplicationsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.DomainApplications_502003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.DomainApplication_503001 == req.getElementType()) {
			return getGEFWrapper(new DomainApplicationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
