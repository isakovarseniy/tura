/*
 * 
 */
package uipackage.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uipackage.diagram.part.DomainVisualIDRegistry;

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

			case UIPackageEditPart.VISUAL_ID:
				return new UIPackageEditPart(view);

			case FormEditPart.VISUAL_ID:
				return new FormEditPart(view);

			case FormNameEditPart.VISUAL_ID:
				return new FormNameEditPart(view);

			case FormParameterEditPart.VISUAL_ID:
				return new FormParameterEditPart(view);

			case FormParameterNameEditPart.VISUAL_ID:
				return new FormParameterNameEditPart(view);

			case FormViewEditPart.VISUAL_ID:
				return new FormViewEditPart(view);

			case FormViewNameEditPart.VISUAL_ID:
				return new FormViewNameEditPart(view);

			case FormDataControlsEditPart.VISUAL_ID:
				return new FormDataControlsEditPart(view);

			case FormDataControlsNameEditPart.VISUAL_ID:
				return new FormDataControlsNameEditPart(view);

			case FormFormViewCompartmentEditPart.VISUAL_ID:
				return new FormFormViewCompartmentEditPart(view);

			case FormFormDatacontrolsCompartmentEditPart.VISUAL_ID:
				return new FormFormDatacontrolsCompartmentEditPart(view);

			case FormFormParametersCompartmentEditPart.VISUAL_ID:
				return new FormFormParametersCompartmentEditPart(view);
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
