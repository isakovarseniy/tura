/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import businessobjects.diagram.providers.BusinessobjectsElementTypes;

/**
 * @generated
 */
public class TypeExtensionItemSemanticEditPolicy extends
		BusinessobjectsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypeExtensionItemSemanticEditPolicy() {
		super(BusinessobjectsElementTypes.TypeExtension_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
