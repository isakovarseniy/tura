/*
* 
*/
package domain.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import domain.diagram.edit.commands.ContinuousIintegrationCreateCommand;
import domain.diagram.edit.commands.DomainArtifactCreateCommand;
import domain.diagram.edit.commands.EJBServiceCreateCommand;
import domain.diagram.edit.commands.JPAServiceCreateCommand;
import domain.diagram.edit.commands.ORMEntityCreateCommand;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainArtifactsDomainArtifactsDomainArtifactCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DomainArtifactsDomainArtifactsDomainArtifactCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.DomainArtifacts_502001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ORMEntity_503003 == req.getElementType()) {
			return getGEFWrapper(new ORMEntityCreateCommand(req));
		}
		if (DomainElementTypes.JPAService_503004 == req.getElementType()) {
			return getGEFWrapper(new JPAServiceCreateCommand(req));
		}
		if (DomainElementTypes.EJBService_503005 == req.getElementType()) {
			return getGEFWrapper(new EJBServiceCreateCommand(req));
		}
		if (DomainElementTypes.ContinuousIintegration_503006 == req.getElementType()) {
			return getGEFWrapper(new ContinuousIintegrationCreateCommand(req));
		}
		if (DomainElementTypes.DomainArtifact_503002 == req.getElementType()) {
			return getGEFWrapper(new DomainArtifactCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
