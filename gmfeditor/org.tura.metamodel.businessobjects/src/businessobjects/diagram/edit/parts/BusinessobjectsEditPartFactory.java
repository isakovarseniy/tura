/*
 * 
 */
package businessobjects.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import businessobjects.diagram.part.BusinessobjectsVisualIDRegistry;

/**
 * @generated
 */
public class BusinessobjectsEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (BusinessobjectsVisualIDRegistry.getVisualID(view)) {

			case BusinessObjectsEditPart.VISUAL_ID:
				return new BusinessObjectsEditPart(view);

			case BusinessObjectEditPart.VISUAL_ID:
				return new BusinessObjectEditPart(view);

			case BusinessObjectTypeEditPart.VISUAL_ID:
				return new BusinessObjectTypeEditPart(view);

			case BusinessMethodEditPart.VISUAL_ID:
				return new BusinessMethodEditPart(view);

			case BusinessMethodMethodEditPart.VISUAL_ID:
				return new BusinessMethodMethodEditPart(view);

			case BusinessMethod2EditPart.VISUAL_ID:
				return new BusinessMethod2EditPart(view);

			case BusinessMethodMethod2EditPart.VISUAL_ID:
				return new BusinessMethodMethod2EditPart(view);

			case BusinessMethod3EditPart.VISUAL_ID:
				return new BusinessMethod3EditPart(view);

			case BusinessMethodMethod3EditPart.VISUAL_ID:
				return new BusinessMethodMethod3EditPart(view);

			case BusinessMethod4EditPart.VISUAL_ID:
				return new BusinessMethod4EditPart(view);

			case BusinessMethodMethod4EditPart.VISUAL_ID:
				return new BusinessMethodMethod4EditPart(view);

			case BusinessMethod5EditPart.VISUAL_ID:
				return new BusinessMethod5EditPart(view);

			case BusinessMethodMethod5EditPart.VISUAL_ID:
				return new BusinessMethodMethod5EditPart(view);

			case BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart(
						view);

			case BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart(
						view);

			case BusinessObjectBusinessObjectUpdaeteMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectUpdaeteMethodsCompartmentEditPart(
						view);

			case BusinessObjectBusinessObjectRemovetMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectRemovetMethodsCompartmentEditPart(
						view);

			case BusinessObjectBusinessObjectSearchtMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectSearchtMethodsCompartmentEditPart(
						view);

			case TypeExtensionEditPart.VISUAL_ID:
				return new TypeExtensionEditPart(view);

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
