package typedefinition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import typedefinition.diagram.providers.TypedefinitionElementTypes;

/**
 * @generated
 */
public class TypeExtensionItemSemanticEditPolicy extends
		TypedefinitionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypeExtensionItemSemanticEditPolicy() {
		super(TypedefinitionElementTypes.TypeExtension_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
