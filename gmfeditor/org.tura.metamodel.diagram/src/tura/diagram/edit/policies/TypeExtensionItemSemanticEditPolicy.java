/*
 * 
 */
package tura.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import tura.diagram.providers.TuraElementTypes;

/**
 * @generated
 */
public class TypeExtensionItemSemanticEditPolicy extends
		TuraBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypeExtensionItemSemanticEditPolicy() {
		super(TuraElementTypes.TypeExtension_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
