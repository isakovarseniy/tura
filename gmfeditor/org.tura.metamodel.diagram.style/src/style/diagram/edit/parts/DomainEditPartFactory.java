/*
 * 
 */
package style.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import style.diagram.part.DomainVisualIDRegistry;

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

			case StylesEditPart.VISUAL_ID:
				return new StylesEditPart(view);

			case StyleLibraryEditPart.VISUAL_ID:
				return new StyleLibraryEditPart(view);

			case StyleLibraryNameEditPart.VISUAL_ID:
				return new StyleLibraryNameEditPart(view);

			case StyleSetEditPart.VISUAL_ID:
				return new StyleSetEditPart(view);

			case StyleSetNameEditPart.VISUAL_ID:
				return new StyleSetNameEditPart(view);

			case StyleLibraryStyleLibraryStylesCompartmentEditPart.VISUAL_ID:
				return new StyleLibraryStyleLibraryStylesCompartmentEditPart(view);
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
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
