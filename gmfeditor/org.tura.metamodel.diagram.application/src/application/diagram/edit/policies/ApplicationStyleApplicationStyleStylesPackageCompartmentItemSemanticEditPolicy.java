/*
 * 
 */
package application.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import application.diagram.edit.commands.StylesPackageCreateCommand;
import application.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ApplicationStyleApplicationStyleStylesPackageCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ApplicationStyleApplicationStyleStylesPackageCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.ApplicationStyle_802005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.StylesPackage_803004 == req.getElementType()) {
			return getGEFWrapper(new StylesPackageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
