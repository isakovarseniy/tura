/*
 * 
 */
package canvas.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import canvas.diagram.part.DomainVisualIDRegistry;

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

			case CanvasViewEditPart.VISUAL_ID:
				return new CanvasViewEditPart(view);

			case LayerHolderEditPart.VISUAL_ID:
				return new LayerHolderEditPart(view);

			case DropDownSelectionEditPart.VISUAL_ID:
				return new DropDownSelectionEditPart(view);

			case TableEditPart.VISUAL_ID:
				return new TableEditPart(view);

			case TableLabelEditPart.VISUAL_ID:
				return new TableLabelEditPart(view);

			case ColumnEditPart.VISUAL_ID:
				return new ColumnEditPart(view);

			case ColumnLabelEditPart.VISUAL_ID:
				return new ColumnLabelEditPart(view);

			case DropDownSelection2EditPart.VISUAL_ID:
				return new DropDownSelection2EditPart(view);

			case Table2EditPart.VISUAL_ID:
				return new Table2EditPart(view);

			case TableLabel2EditPart.VISUAL_ID:
				return new TableLabel2EditPart(view);

			case TreeEditPart.VISUAL_ID:
				return new TreeEditPart(view);

			case TreeLabelEditPart.VISUAL_ID:
				return new TreeLabelEditPart(view);

			case Column2EditPart.VISUAL_ID:
				return new Column2EditPart(view);

			case ColumnLabel2EditPart.VISUAL_ID:
				return new ColumnLabel2EditPart(view);

			case LayerHolder2EditPart.VISUAL_ID:
				return new LayerHolder2EditPart(view);

			case Tree2EditPart.VISUAL_ID:
				return new Tree2EditPart(view);

			case TreeLabel2EditPart.VISUAL_ID:
				return new TreeLabel2EditPart(view);

			case LayerHolder3EditPart.VISUAL_ID:
				return new LayerHolder3EditPart(view);

			case InputTextEditPart.VISUAL_ID:
				return new InputTextEditPart(view);

			case OutputTextEditPart.VISUAL_ID:
				return new OutputTextEditPart(view);

			case CheckBoxEditPart.VISUAL_ID:
				return new CheckBoxEditPart(view);

			case ImageEditPart.VISUAL_ID:
				return new ImageEditPart(view);

			case DateEditPart.VISUAL_ID:
				return new DateEditPart(view);

			case ButtonEditPart.VISUAL_ID:
				return new ButtonEditPart(view);

			case ButtonLabelEditPart.VISUAL_ID:
				return new ButtonLabelEditPart(view);

			case ActionTriggerEditPart.VISUAL_ID:
				return new ActionTriggerEditPart(view);

			case ActionTriggerFakeMethodEditPart.VISUAL_ID:
				return new ActionTriggerFakeMethodEditPart(view);

			case LabelEditPart.VISUAL_ID:
				return new LabelEditPart(view);

			case LabelLabelEditPart.VISUAL_ID:
				return new LabelLabelEditPart(view);

			case InputText2EditPart.VISUAL_ID:
				return new InputText2EditPart(view);

			case OutputText2EditPart.VISUAL_ID:
				return new OutputText2EditPart(view);

			case CheckBox2EditPart.VISUAL_ID:
				return new CheckBox2EditPart(view);

			case Image2EditPart.VISUAL_ID:
				return new Image2EditPart(view);

			case Date2EditPart.VISUAL_ID:
				return new Date2EditPart(view);

			case Button2EditPart.VISUAL_ID:
				return new Button2EditPart(view);

			case ButtonLabel2EditPart.VISUAL_ID:
				return new ButtonLabel2EditPart(view);

			case Label2EditPart.VISUAL_ID:
				return new Label2EditPart(view);

			case LabelLabel2EditPart.VISUAL_ID:
				return new LabelLabel2EditPart(view);

			case LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID:
				return new LayerHolderLayerHolderChildrenCompartmentEditPart(view);

			case TableTableColsCompartmentEditPart.VISUAL_ID:
				return new TableTableColsCompartmentEditPart(view);

			case ColumnColumnElementCompartmentEditPart.VISUAL_ID:
				return new ColumnColumnElementCompartmentEditPart(view);

			case TableTableColsCompartment2EditPart.VISUAL_ID:
				return new TableTableColsCompartment2EditPart(view);

			case TreeTreeColsCompartmentEditPart.VISUAL_ID:
				return new TreeTreeColsCompartmentEditPart(view);

			case ColumnColumnElementCompartment2EditPart.VISUAL_ID:
				return new ColumnColumnElementCompartment2EditPart(view);

			case LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID:
				return new LayerHolderLayerHolderChildrenCompartment2EditPart(view);

			case TreeTreeColsCompartment2EditPart.VISUAL_ID:
				return new TreeTreeColsCompartment2EditPart(view);

			case LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID:
				return new LayerHolderLayerHolderChildrenCompartment3EditPart(view);

			case ButtonButtonTriggersCompartmentEditPart.VISUAL_ID:
				return new ButtonButtonTriggersCompartmentEditPart(view);

			case ButtonButtonTriggersCompartment2EditPart.VISUAL_ID:
				return new ButtonButtonTriggersCompartment2EditPart(view);
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
