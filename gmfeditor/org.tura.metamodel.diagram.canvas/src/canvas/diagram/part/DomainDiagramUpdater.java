/*
 * 
 */
package canvas.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import canvas.diagram.edit.parts.Button2EditPart;
import canvas.diagram.edit.parts.ButtonEditPart;
import canvas.diagram.edit.parts.CanvasViewEditPart;
import canvas.diagram.edit.parts.CheckBox2EditPart;
import canvas.diagram.edit.parts.CheckBoxEditPart;
import canvas.diagram.edit.parts.ColumnColumnElementCompartmentEditPart;
import canvas.diagram.edit.parts.ColumnEditPart;
import canvas.diagram.edit.parts.DropDownSelection2EditPart;
import canvas.diagram.edit.parts.DropDownSelectionEditPart;
import canvas.diagram.edit.parts.InputText2EditPart;
import canvas.diagram.edit.parts.InputTextEditPart;
import canvas.diagram.edit.parts.Label2EditPart;
import canvas.diagram.edit.parts.LabelEditPart;
import canvas.diagram.edit.parts.LayerHolder2EditPart;
import canvas.diagram.edit.parts.LayerHolder3EditPart;
import canvas.diagram.edit.parts.LayerHolderEditPart;
import canvas.diagram.edit.parts.LayerHolderLayerHolderChildrenCompartment2EditPart;
import canvas.diagram.edit.parts.LayerHolderLayerHolderChildrenCompartment3EditPart;
import canvas.diagram.edit.parts.LayerHolderLayerHolderChildrenCompartmentEditPart;
import canvas.diagram.edit.parts.OutputText2EditPart;
import canvas.diagram.edit.parts.OutputTextEditPart;
import canvas.diagram.edit.parts.Table2EditPart;
import canvas.diagram.edit.parts.TableEditPart;
import canvas.diagram.edit.parts.TableTableColsCompartment2EditPart;
import canvas.diagram.edit.parts.TableTableColsCompartmentEditPart;
import canvas.diagram.edit.parts.Tree2EditPart;
import canvas.diagram.edit.parts.TreeEditPart;
import domain.CanvasView;
import domain.Column;
import domain.LayerHolder;
import domain.Table;
import domain.Uielement;

/**
 * @generated
 */
public class DomainDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getSemanticChildren(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case CanvasViewEditPart.VISUAL_ID:
			return getCanvasView_1601000SemanticChildren(view);
		case LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID:
			return getLayerHolderLayerHolderChildrenCompartment_1607007SemanticChildren(view);
		case TableTableColsCompartmentEditPart.VISUAL_ID:
			return getTableTableColsCompartment_1607003SemanticChildren(view);
		case ColumnColumnElementCompartmentEditPart.VISUAL_ID:
			return getColumnColumnElementCompartment_1607011SemanticChildren(view);
		case TableTableColsCompartment2EditPart.VISUAL_ID:
			return getTableTableColsCompartment_1607010SemanticChildren(view);
		case LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID:
			return getLayerHolderLayerHolderChildrenCompartment_1607009SemanticChildren(view);
		case LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID:
			return getLayerHolderLayerHolderChildrenCompartment_1607008SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getCanvasView_1601000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CanvasView modelElement = (CanvasView) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			LayerHolder childElement = modelElement.getBaseCanvas();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LayerHolderEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getLayerHolderLayerHolderChildrenCompartment_1607007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LayerHolder modelElement = (LayerHolder) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			Uielement childElement = (Uielement) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDownSelectionEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LayerHolder3EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OutputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TreeEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getTableTableColsCompartment_1607003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCols().iterator(); it.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getColumnColumnElementCompartment_1607011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Column modelElement = (Column) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			Uielement childElement = modelElement.getElement();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == DropDownSelection2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Table2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == LayerHolder2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == InputText2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == OutputText2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == CheckBox2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Tree2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getTableTableColsCompartment_1607010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCols().iterator(); it.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getLayerHolderLayerHolderChildrenCompartment_1607009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LayerHolder modelElement = (LayerHolder) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			Uielement childElement = (Uielement) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDownSelectionEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LayerHolder3EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OutputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TreeEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getLayerHolderLayerHolderChildrenCompartment_1607008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LayerHolder modelElement = (LayerHolder) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			Uielement childElement = (Uielement) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDownSelectionEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LayerHolder3EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OutputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TreeEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getContainedLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case CanvasViewEditPart.VISUAL_ID:
			return getCanvasView_1601000ContainedLinks(view);
		case LayerHolderEditPart.VISUAL_ID:
			return getLayerHolder_1602003ContainedLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_1603017ContainedLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_1603005ContainedLinks(view);
		case DropDownSelectionEditPart.VISUAL_ID:
			return getDropDownSelection_1603002ContainedLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_1603008ContainedLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_1603024ContainedLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_1603023ContainedLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_1603013ContainedLinks(view);
		case DropDownSelection2EditPart.VISUAL_ID:
			return getDropDownSelection_1603010ContainedLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_1603021ContainedLinks(view);
		case LayerHolder2EditPart.VISUAL_ID:
			return getLayerHolder_1603020ContainedLinks(view);
		case LayerHolder3EditPart.VISUAL_ID:
			return getLayerHolder_1603019ContainedLinks(view);
		case InputTextEditPart.VISUAL_ID:
			return getInputText_1603004ContainedLinks(view);
		case OutputTextEditPart.VISUAL_ID:
			return getOutputText_1603006ContainedLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_1603007ContainedLinks(view);
		case TreeEditPart.VISUAL_ID:
			return getTree_1603016ContainedLinks(view);
		case InputText2EditPart.VISUAL_ID:
			return getInputText_1603012ContainedLinks(view);
		case OutputText2EditPart.VISUAL_ID:
			return getOutputText_1603014ContainedLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_1603015ContainedLinks(view);
		case Tree2EditPart.VISUAL_ID:
			return getTree_1603022ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case LayerHolderEditPart.VISUAL_ID:
			return getLayerHolder_1602003IncomingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_1603017IncomingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_1603005IncomingLinks(view);
		case DropDownSelectionEditPart.VISUAL_ID:
			return getDropDownSelection_1603002IncomingLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_1603008IncomingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_1603024IncomingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_1603023IncomingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_1603013IncomingLinks(view);
		case DropDownSelection2EditPart.VISUAL_ID:
			return getDropDownSelection_1603010IncomingLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_1603021IncomingLinks(view);
		case LayerHolder2EditPart.VISUAL_ID:
			return getLayerHolder_1603020IncomingLinks(view);
		case LayerHolder3EditPart.VISUAL_ID:
			return getLayerHolder_1603019IncomingLinks(view);
		case InputTextEditPart.VISUAL_ID:
			return getInputText_1603004IncomingLinks(view);
		case OutputTextEditPart.VISUAL_ID:
			return getOutputText_1603006IncomingLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_1603007IncomingLinks(view);
		case TreeEditPart.VISUAL_ID:
			return getTree_1603016IncomingLinks(view);
		case InputText2EditPart.VISUAL_ID:
			return getInputText_1603012IncomingLinks(view);
		case OutputText2EditPart.VISUAL_ID:
			return getOutputText_1603014IncomingLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_1603015IncomingLinks(view);
		case Tree2EditPart.VISUAL_ID:
			return getTree_1603022IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case LayerHolderEditPart.VISUAL_ID:
			return getLayerHolder_1602003OutgoingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_1603017OutgoingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_1603005OutgoingLinks(view);
		case DropDownSelectionEditPart.VISUAL_ID:
			return getDropDownSelection_1603002OutgoingLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_1603008OutgoingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_1603024OutgoingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_1603023OutgoingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_1603013OutgoingLinks(view);
		case DropDownSelection2EditPart.VISUAL_ID:
			return getDropDownSelection_1603010OutgoingLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_1603021OutgoingLinks(view);
		case LayerHolder2EditPart.VISUAL_ID:
			return getLayerHolder_1603020OutgoingLinks(view);
		case LayerHolder3EditPart.VISUAL_ID:
			return getLayerHolder_1603019OutgoingLinks(view);
		case InputTextEditPart.VISUAL_ID:
			return getInputText_1603004OutgoingLinks(view);
		case OutputTextEditPart.VISUAL_ID:
			return getOutputText_1603006OutgoingLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_1603007OutgoingLinks(view);
		case TreeEditPart.VISUAL_ID:
			return getTree_1603016OutgoingLinks(view);
		case InputText2EditPart.VISUAL_ID:
			return getInputText_1603012OutgoingLinks(view);
		case OutputText2EditPart.VISUAL_ID:
			return getOutputText_1603014OutgoingLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_1603015OutgoingLinks(view);
		case Tree2EditPart.VISUAL_ID:
			return getTree_1603022OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCanvasView_1601000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLayerHolder_1602003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getButton_1603017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLabel_1603005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDropDownSelection_1603002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTable_1603008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getColumn_1603024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getButton_1603023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLabel_1603013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDropDownSelection_1603010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTable_1603021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLayerHolder_1603020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLayerHolder_1603019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInputText_1603004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutputText_1603006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCheckBox_1603007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTree_1603016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInputText_1603012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutputText_1603014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCheckBox_1603015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTree_1603022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLayerHolder_1602003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getButton_1603017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLabel_1603005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDropDownSelection_1603002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTable_1603008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getColumn_1603024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getButton_1603023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLabel_1603013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDropDownSelection_1603010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTable_1603021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLayerHolder_1603020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLayerHolder_1603019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInputText_1603004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutputText_1603006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCheckBox_1603007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTree_1603016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInputText_1603012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutputText_1603014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCheckBox_1603015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTree_1603022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLayerHolder_1602003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getButton_1603017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLabel_1603005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDropDownSelection_1603002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTable_1603008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getColumn_1603024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getButton_1603023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLabel_1603013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDropDownSelection_1603010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTable_1603021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLayerHolder_1603020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLayerHolder_1603019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInputText_1603004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutputText_1603006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCheckBox_1603007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTree_1603016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInputText_1603012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutputText_1603014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCheckBox_1603015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTree_1603022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<DomainNodeDescriptor> getSemanticChildren(View view) {
			return DomainDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DomainLinkDescriptor> getContainedLinks(View view) {
			return DomainDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DomainLinkDescriptor> getIncomingLinks(View view) {
			return DomainDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DomainLinkDescriptor> getOutgoingLinks(View view) {
			return DomainDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
