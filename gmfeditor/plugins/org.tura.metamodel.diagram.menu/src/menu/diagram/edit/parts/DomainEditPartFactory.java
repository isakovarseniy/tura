/*
 * 
 */
package menu.diagram.edit.parts;

import menu.diagram.part.DomainVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class DomainEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DomainVisualIDRegistry.getVisualID(view)) {

			case MenuViewEditPart.VISUAL_ID:
				return new MenuViewEditPart(view);

			case MenuFolderEditPart.VISUAL_ID:
				return new MenuFolderEditPart(view);

			case MenuFolderNameEditPart.VISUAL_ID:
				return new MenuFolderNameEditPart(view);

			case MenuItemEditPart.VISUAL_ID:
				return new MenuItemEditPart(view);

			case MenuItemNameEditPart.VISUAL_ID:
				return new MenuItemNameEditPart(view);

			case SubMenuEditPart.VISUAL_ID:
				return new SubMenuEditPart(view);

			case SubMenuNameEditPart.VISUAL_ID:
				return new SubMenuNameEditPart(view);

			case MenuSeparatorEditPart.VISUAL_ID:
				return new MenuSeparatorEditPart(view);

			case MenuSeparatorNameEditPart.VISUAL_ID:
				return new MenuSeparatorNameEditPart(view);

			case MenuFolderMenuFolderMenuElementsCompartmentEditPart.VISUAL_ID:
				return new MenuFolderMenuFolderMenuElementsCompartmentEditPart(
						view);

			case SubMenuToSubmenuEditPart.VISUAL_ID:
				return new SubMenuToSubmenuEditPart(view);

			case SubMenuToSubmenuExternalLabelEditPart.VISUAL_ID:
				return new SubMenuToSubmenuExternalLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
