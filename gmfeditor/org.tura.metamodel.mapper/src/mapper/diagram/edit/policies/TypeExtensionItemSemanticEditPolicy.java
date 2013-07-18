/*
 * 
 */
package mapper.diagram.edit.policies;

import mapper.diagram.providers.MapperElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class TypeExtensionItemSemanticEditPolicy extends
		MapperBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypeExtensionItemSemanticEditPolicy() {
		super(MapperElementTypes.TypeExtension_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
