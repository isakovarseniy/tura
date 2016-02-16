/*
 * 
 */
package menu.diagram.edit.policies;

import menu.diagram.edit.commands.MenuExtensionPointCreateCommand;
import menu.diagram.edit.commands.MenuItemCreateCommand;
import menu.diagram.edit.commands.MenuSeparatorCreateCommand;
import menu.diagram.edit.commands.SubMenuCreateCommand;
import menu.diagram.providers.DomainElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MenuFolderMenuFolderMenuElementsCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MenuFolderMenuFolderMenuElementsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.MenuFolder_1802001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.MenuItem_1803002 == req.getElementType()) {
			return getGEFWrapper(new MenuItemCreateCommand(req));
		}
		if (DomainElementTypes.MenuExtensionPoint_1803005 == req
				.getElementType()) {
			return getGEFWrapper(new MenuExtensionPointCreateCommand(req));
		}
		if (DomainElementTypes.SubMenu_1803004 == req.getElementType()) {
			return getGEFWrapper(new SubMenuCreateCommand(req));
		}
		if (DomainElementTypes.MenuSeparator_1803003 == req.getElementType()) {
			return getGEFWrapper(new MenuSeparatorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
