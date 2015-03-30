/*
 * 
 */
package frmview.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import frmview.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class TabPagesInheritanceItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TabPagesInheritanceItemSemanticEditPolicy() {
		super(DomainElementTypes.TabPagesInheritance_1304002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
