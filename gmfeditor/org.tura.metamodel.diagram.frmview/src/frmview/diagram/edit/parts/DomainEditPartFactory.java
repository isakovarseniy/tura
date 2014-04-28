/*
 * 
 */
package frmview.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import frmview.diagram.part.DomainVisualIDRegistry;

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

			case ViewsEditPart.VISUAL_ID:
				return new ViewsEditPart(view);

			case CanvasEditPart.VISUAL_ID:
				return new CanvasEditPart(view);

			case CanvasNameEditPart.VISUAL_ID:
				return new CanvasNameEditPart(view);

			case WindowEditPart.VISUAL_ID:
				return new WindowEditPart(view);

			case WindowNameEditPart.VISUAL_ID:
				return new WindowNameEditPart(view);

			case TabPageEditPart.VISUAL_ID:
				return new TabPageEditPart(view);

			case TabPageNameEditPart.VISUAL_ID:
				return new TabPageNameEditPart(view);

			case TabCanvasEditPart.VISUAL_ID:
				return new TabCanvasEditPart(view);

			case TabCanvasNameEditPart.VISUAL_ID:
				return new TabCanvasNameEditPart(view);

			case ViewPortEditPart.VISUAL_ID:
				return new ViewPortEditPart(view);

			case ViewPortNameEditPart.VISUAL_ID:
				return new ViewPortNameEditPart(view);

			case ViewPortTriggerEditPart.VISUAL_ID:
				return new ViewPortTriggerEditPart(view);

			case ViewPortTriggerFakeMethodEditPart.VISUAL_ID:
				return new ViewPortTriggerFakeMethodEditPart(view);

			case ViewAreaEditPart.VISUAL_ID:
				return new ViewAreaEditPart(view);

			case ViewAreaNameEditPart.VISUAL_ID:
				return new ViewAreaNameEditPart(view);

			case CanvasCanvasViewElementCompartmentEditPart.VISUAL_ID:
				return new CanvasCanvasViewElementCompartmentEditPart(view);

			case ViewPortViewPortViewPortTriggerCompartmentEditPart.VISUAL_ID:
				return new ViewPortViewPortViewPortTriggerCompartmentEditPart(
						view);

			case WindowWindowViewElementCompartmentEditPart.VISUAL_ID:
				return new WindowWindowViewElementCompartmentEditPart(view);

			case TabPageTabPageViewElementCompartmentEditPart.VISUAL_ID:
				return new TabPageTabPageViewElementCompartmentEditPart(view);

			case ViewInheritanceEditPart.VISUAL_ID:
				return new ViewInheritanceEditPart(view);

			case TabPagesInheritanceEditPart.VISUAL_ID:
				return new TabPagesInheritanceEditPart(view);

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
