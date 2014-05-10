/*
 * 
 */
package mapper.diagram.edit.parts;

import mapper.diagram.part.DomainVisualIDRegistry;

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

			case MappersEditPart.VISUAL_ID:
				return new MappersEditPart(view);

			case JavaMapperEditPart.VISUAL_ID:
				return new JavaMapperEditPart(view);

			case JavaMapperFakePackageNameFakeTypeEditPart.VISUAL_ID:
				return new JavaMapperFakePackageNameFakeTypeEditPart(view);

			case JavaScriptEditPart.VISUAL_ID:
				return new JavaScriptEditPart(view);

			case JavaScriptFakePackageNameFakeTypeEditPart.VISUAL_ID:
				return new JavaScriptFakePackageNameFakeTypeEditPart(view);
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
