/*
 * 
 */
package uipackage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uipackage.diagram.edit.commands.FormParameterCreateCommand;
import uipackage.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class FormFormParametersCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FormFormParametersCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Form_1002002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.FormParameter_1003003 == req.getElementType()) {
			return getGEFWrapper(new FormParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
