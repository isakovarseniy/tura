/*
 * 
 */
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.FormVariableCreateCommand;
import control.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class RootRootVariablesCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RootRootVariablesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Root_1102001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.FormVariable_1103017 == req.getElementType()) {
			return getGEFWrapper(new FormVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
