/*
 * 
 */
package message.diagram.edit.parts;

import message.diagram.part.DomainVisualIDRegistry;

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

			case MessagesEditPart.VISUAL_ID:
				return new MessagesEditPart(view);

			case MessageLibraryEditPart.VISUAL_ID:
				return new MessageLibraryEditPart(view);

			case MessageLibraryNameEditPart.VISUAL_ID:
				return new MessageLibraryNameEditPart(view);

			case LanguageEditPart.VISUAL_ID:
				return new LanguageEditPart(view);

			case LanguageLangEditPart.VISUAL_ID:
				return new LanguageLangEditPart(view);

			case MessageEditPart.VISUAL_ID:
				return new MessageEditPart(view);

			case MessageNameEditPart.VISUAL_ID:
				return new MessageNameEditPart(view);

			case MessageLibraryMessageLibraryMessagesCompartmentEditPart.VISUAL_ID:
				return new MessageLibraryMessageLibraryMessagesCompartmentEditPart(
						view);
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
