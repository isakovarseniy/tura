/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * 
 */
package canvas.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import canvas.diagram.edit.parts.Button2EditPart;
import canvas.diagram.edit.parts.ButtonEditPart;
import canvas.diagram.edit.parts.CanvasViewEditPart;
import canvas.diagram.edit.parts.CheckBox2EditPart;
import canvas.diagram.edit.parts.CheckBoxEditPart;
import canvas.diagram.edit.parts.Column2EditPart;
import canvas.diagram.edit.parts.ColumnColumnElementCompartment2EditPart;
import canvas.diagram.edit.parts.ColumnColumnElementCompartmentEditPart;
import canvas.diagram.edit.parts.ColumnEditPart;
import canvas.diagram.edit.parts.Date2EditPart;
import canvas.diagram.edit.parts.DateEditPart;
import canvas.diagram.edit.parts.DropDownSelection2EditPart;
import canvas.diagram.edit.parts.DropDownSelectionEditPart;
import canvas.diagram.edit.parts.Image2EditPart;
import canvas.diagram.edit.parts.ImageEditPart;
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
import canvas.diagram.edit.parts.LinkToLabelEditPart;
import canvas.diagram.edit.parts.LinkToMessageEditPart;
import canvas.diagram.edit.parts.MessageElement2EditPart;
import canvas.diagram.edit.parts.MessageElementEditPart;
import canvas.diagram.edit.parts.OutputText2EditPart;
import canvas.diagram.edit.parts.OutputTextEditPart;
import canvas.diagram.edit.parts.Password2EditPart;
import canvas.diagram.edit.parts.PasswordEditPart;
import canvas.diagram.edit.parts.Table2EditPart;
import canvas.diagram.edit.parts.TableEditPart;
import canvas.diagram.edit.parts.TableTableColsCompartment2EditPart;
import canvas.diagram.edit.parts.TableTableColsCompartmentEditPart;
import canvas.diagram.edit.parts.Tree2EditPart;
import canvas.diagram.edit.parts.TreeEditPart;
import canvas.diagram.edit.parts.TreeTreeColsCompartment2EditPart;
import canvas.diagram.edit.parts.TreeTreeColsCompartmentEditPart;
import canvas.diagram.providers.DomainElementTypes;
import domain.CanvasView;
import domain.CheckBox;
import domain.Column;
import domain.Date;
import domain.DomainPackage;
import domain.DropDownSelection;
import domain.Image;
import domain.InputElement;
import domain.InputText;
import domain.Label;
import domain.LayerHolder;
import domain.LinkToLabel;
import domain.LinkToMessage;
import domain.MessageElement;
import domain.OutputText;
import domain.Password;
import domain.Table;
import domain.Tree;
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
		case TreeTreeColsCompartmentEditPart.VISUAL_ID:
			return getTreeTreeColsCompartment_1607014SemanticChildren(view);
		case ColumnColumnElementCompartment2EditPart.VISUAL_ID:
			return getColumnColumnElementCompartment_1607015SemanticChildren(view);
		case LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID:
			return getLayerHolderLayerHolderChildrenCompartment_1607009SemanticChildren(view);
		case TreeTreeColsCompartment2EditPart.VISUAL_ID:
			return getTreeTreeColsCompartment_1607012SemanticChildren(view);
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
			if (visualID == InputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PasswordEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OutputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDownSelectionEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tree2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LayerHolder3EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MessageElementEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
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
			if (visualID == InputText2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Password2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == OutputText2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == DropDownSelection2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Date2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Table2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == TreeEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == LayerHolder2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == CheckBox2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Image2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == MessageElement2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Button2EditPart.VISUAL_ID) {
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
	public static List<DomainNodeDescriptor> getTreeTreeColsCompartment_1607014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tree modelElement = (Tree) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCols().iterator(); it.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Column2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getColumnColumnElementCompartment_1607015SemanticChildren(
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
			if (visualID == InputText2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Password2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == OutputText2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == DropDownSelection2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Date2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Table2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == TreeEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == LayerHolder2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == CheckBox2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Image2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == MessageElement2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
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
			if (visualID == InputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PasswordEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OutputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDownSelectionEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tree2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LayerHolder3EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MessageElementEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getTreeTreeColsCompartment_1607012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tree modelElement = (Tree) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCols().iterator(); it.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Column2EditPart.VISUAL_ID) {
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
			if (visualID == InputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PasswordEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OutputTextEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DropDownSelectionEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tree2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LayerHolder3EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MessageElementEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
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
		case InputTextEditPart.VISUAL_ID:
			return getInputText_1603004ContainedLinks(view);
		case PasswordEditPart.VISUAL_ID:
			return getPassword_1603032ContainedLinks(view);
		case OutputTextEditPart.VISUAL_ID:
			return getOutputText_1603006ContainedLinks(view);
		case DropDownSelectionEditPart.VISUAL_ID:
			return getDropDownSelection_1603002ContainedLinks(view);
		case DateEditPart.VISUAL_ID:
			return getDate_1603029ContainedLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_1603008ContainedLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_1603024ContainedLinks(view);
		case InputText2EditPart.VISUAL_ID:
			return getInputText_1603012ContainedLinks(view);
		case Password2EditPart.VISUAL_ID:
			return getPassword_1603033ContainedLinks(view);
		case OutputText2EditPart.VISUAL_ID:
			return getOutputText_1603014ContainedLinks(view);
		case DropDownSelection2EditPart.VISUAL_ID:
			return getDropDownSelection_1603010ContainedLinks(view);
		case Date2EditPart.VISUAL_ID:
			return getDate_1603031ContainedLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_1603021ContainedLinks(view);
		case TreeEditPart.VISUAL_ID:
			return getTree_1603022ContainedLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_1603026ContainedLinks(view);
		case LayerHolder2EditPart.VISUAL_ID:
			return getLayerHolder_1603020ContainedLinks(view);
		case Tree2EditPart.VISUAL_ID:
			return getTree_1603016ContainedLinks(view);
		case LayerHolder3EditPart.VISUAL_ID:
			return getLayerHolder_1603019ContainedLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_1603007ContainedLinks(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_1603028ContainedLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_1603005ContainedLinks(view);
		case MessageElementEditPart.VISUAL_ID:
			return getMessageElement_1603034ContainedLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_1603017ContainedLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_1603015ContainedLinks(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_1603030ContainedLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_1603013ContainedLinks(view);
		case MessageElement2EditPart.VISUAL_ID:
			return getMessageElement_1603035ContainedLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_1603023ContainedLinks(view);
		case LinkToMessageEditPart.VISUAL_ID:
			return getLinkToMessage_1604001ContainedLinks(view);
		case LinkToLabelEditPart.VISUAL_ID:
			return getLinkToLabel_1604002ContainedLinks(view);
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
		case InputTextEditPart.VISUAL_ID:
			return getInputText_1603004IncomingLinks(view);
		case PasswordEditPart.VISUAL_ID:
			return getPassword_1603032IncomingLinks(view);
		case OutputTextEditPart.VISUAL_ID:
			return getOutputText_1603006IncomingLinks(view);
		case DropDownSelectionEditPart.VISUAL_ID:
			return getDropDownSelection_1603002IncomingLinks(view);
		case DateEditPart.VISUAL_ID:
			return getDate_1603029IncomingLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_1603008IncomingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_1603024IncomingLinks(view);
		case InputText2EditPart.VISUAL_ID:
			return getInputText_1603012IncomingLinks(view);
		case Password2EditPart.VISUAL_ID:
			return getPassword_1603033IncomingLinks(view);
		case OutputText2EditPart.VISUAL_ID:
			return getOutputText_1603014IncomingLinks(view);
		case DropDownSelection2EditPart.VISUAL_ID:
			return getDropDownSelection_1603010IncomingLinks(view);
		case Date2EditPart.VISUAL_ID:
			return getDate_1603031IncomingLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_1603021IncomingLinks(view);
		case TreeEditPart.VISUAL_ID:
			return getTree_1603022IncomingLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_1603026IncomingLinks(view);
		case LayerHolder2EditPart.VISUAL_ID:
			return getLayerHolder_1603020IncomingLinks(view);
		case Tree2EditPart.VISUAL_ID:
			return getTree_1603016IncomingLinks(view);
		case LayerHolder3EditPart.VISUAL_ID:
			return getLayerHolder_1603019IncomingLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_1603007IncomingLinks(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_1603028IncomingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_1603005IncomingLinks(view);
		case MessageElementEditPart.VISUAL_ID:
			return getMessageElement_1603034IncomingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_1603017IncomingLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_1603015IncomingLinks(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_1603030IncomingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_1603013IncomingLinks(view);
		case MessageElement2EditPart.VISUAL_ID:
			return getMessageElement_1603035IncomingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_1603023IncomingLinks(view);
		case LinkToMessageEditPart.VISUAL_ID:
			return getLinkToMessage_1604001IncomingLinks(view);
		case LinkToLabelEditPart.VISUAL_ID:
			return getLinkToLabel_1604002IncomingLinks(view);
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
		case InputTextEditPart.VISUAL_ID:
			return getInputText_1603004OutgoingLinks(view);
		case PasswordEditPart.VISUAL_ID:
			return getPassword_1603032OutgoingLinks(view);
		case OutputTextEditPart.VISUAL_ID:
			return getOutputText_1603006OutgoingLinks(view);
		case DropDownSelectionEditPart.VISUAL_ID:
			return getDropDownSelection_1603002OutgoingLinks(view);
		case DateEditPart.VISUAL_ID:
			return getDate_1603029OutgoingLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_1603008OutgoingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_1603024OutgoingLinks(view);
		case InputText2EditPart.VISUAL_ID:
			return getInputText_1603012OutgoingLinks(view);
		case Password2EditPart.VISUAL_ID:
			return getPassword_1603033OutgoingLinks(view);
		case OutputText2EditPart.VISUAL_ID:
			return getOutputText_1603014OutgoingLinks(view);
		case DropDownSelection2EditPart.VISUAL_ID:
			return getDropDownSelection_1603010OutgoingLinks(view);
		case Date2EditPart.VISUAL_ID:
			return getDate_1603031OutgoingLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_1603021OutgoingLinks(view);
		case TreeEditPart.VISUAL_ID:
			return getTree_1603022OutgoingLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_1603026OutgoingLinks(view);
		case LayerHolder2EditPart.VISUAL_ID:
			return getLayerHolder_1603020OutgoingLinks(view);
		case Tree2EditPart.VISUAL_ID:
			return getTree_1603016OutgoingLinks(view);
		case LayerHolder3EditPart.VISUAL_ID:
			return getLayerHolder_1603019OutgoingLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_1603007OutgoingLinks(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_1603028OutgoingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_1603005OutgoingLinks(view);
		case MessageElementEditPart.VISUAL_ID:
			return getMessageElement_1603034OutgoingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_1603017OutgoingLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_1603015OutgoingLinks(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_1603030OutgoingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_1603013OutgoingLinks(view);
		case MessageElement2EditPart.VISUAL_ID:
			return getMessageElement_1603035OutgoingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_1603023OutgoingLinks(view);
		case LinkToMessageEditPart.VISUAL_ID:
			return getLinkToMessage_1604001OutgoingLinks(view);
		case LinkToLabelEditPart.VISUAL_ID:
			return getLinkToLabel_1604002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCanvasView_1601000ContainedLinks(
			View view) {
		CanvasView modelElement = (CanvasView) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
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
	public static List<DomainLinkDescriptor> getInputText_1603004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPassword_1603032ContainedLinks(
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
	public static List<DomainLinkDescriptor> getDropDownSelection_1603002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDate_1603029ContainedLinks(
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
	public static List<DomainLinkDescriptor> getInputText_1603012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPassword_1603033ContainedLinks(
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
	public static List<DomainLinkDescriptor> getDropDownSelection_1603010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDate_1603031ContainedLinks(
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
	public static List<DomainLinkDescriptor> getTree_1603022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getColumn_1603026ContainedLinks(
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
	public static List<DomainLinkDescriptor> getTree_1603016ContainedLinks(
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
	public static List<DomainLinkDescriptor> getCheckBox_1603007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getImage_1603028ContainedLinks(
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
	public static List<DomainLinkDescriptor> getMessageElement_1603034ContainedLinks(
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
	public static List<DomainLinkDescriptor> getCheckBox_1603015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getImage_1603030ContainedLinks(
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
	public static List<DomainLinkDescriptor> getMessageElement_1603035ContainedLinks(
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
	public static List<DomainLinkDescriptor> getLinkToMessage_1604001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLinkToLabel_1604002ContainedLinks(
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
	public static List<DomainLinkDescriptor> getInputText_1603004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPassword_1603032IncomingLinks(
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
	public static List<DomainLinkDescriptor> getDropDownSelection_1603002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDate_1603029IncomingLinks(
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
	public static List<DomainLinkDescriptor> getInputText_1603012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPassword_1603033IncomingLinks(
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
	public static List<DomainLinkDescriptor> getDropDownSelection_1603010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDate_1603031IncomingLinks(
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
	public static List<DomainLinkDescriptor> getTree_1603022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getColumn_1603026IncomingLinks(
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
	public static List<DomainLinkDescriptor> getTree_1603016IncomingLinks(
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
	public static List<DomainLinkDescriptor> getCheckBox_1603007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getImage_1603028IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLabel_1603005IncomingLinks(
			View view) {
		Label modelElement = (Label) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkToLabel_1604002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMessageElement_1603034IncomingLinks(
			View view) {
		MessageElement modelElement = (MessageElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkToMessage_1604001(
				modelElement, crossReferences));
		return result;
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
	public static List<DomainLinkDescriptor> getCheckBox_1603015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getImage_1603030IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLabel_1603013IncomingLinks(
			View view) {
		Label modelElement = (Label) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkToLabel_1604002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMessageElement_1603035IncomingLinks(
			View view) {
		MessageElement modelElement = (MessageElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkToMessage_1604001(
				modelElement, crossReferences));
		return result;
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
	public static List<DomainLinkDescriptor> getLinkToMessage_1604001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLinkToLabel_1604002IncomingLinks(
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
	public static List<DomainLinkDescriptor> getInputText_1603004OutgoingLinks(
			View view) {
		InputText modelElement = (InputText) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPassword_1603032OutgoingLinks(
			View view) {
		Password modelElement = (Password) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutputText_1603006OutgoingLinks(
			View view) {
		OutputText modelElement = (OutputText) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDropDownSelection_1603002OutgoingLinks(
			View view) {
		DropDownSelection modelElement = (DropDownSelection) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDate_1603029OutgoingLinks(
			View view) {
		Date modelElement = (Date) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
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
	public static List<DomainLinkDescriptor> getInputText_1603012OutgoingLinks(
			View view) {
		InputText modelElement = (InputText) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPassword_1603033OutgoingLinks(
			View view) {
		Password modelElement = (Password) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutputText_1603014OutgoingLinks(
			View view) {
		OutputText modelElement = (OutputText) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDropDownSelection_1603010OutgoingLinks(
			View view) {
		DropDownSelection modelElement = (DropDownSelection) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDate_1603031OutgoingLinks(
			View view) {
		Date modelElement = (Date) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
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
	public static List<DomainLinkDescriptor> getTree_1603022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getColumn_1603026OutgoingLinks(
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
	public static List<DomainLinkDescriptor> getTree_1603016OutgoingLinks(
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
	public static List<DomainLinkDescriptor> getCheckBox_1603007OutgoingLinks(
			View view) {
		CheckBox modelElement = (CheckBox) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getImage_1603028OutgoingLinks(
			View view) {
		Image modelElement = (Image) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
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
	public static List<DomainLinkDescriptor> getMessageElement_1603034OutgoingLinks(
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
	public static List<DomainLinkDescriptor> getCheckBox_1603015OutgoingLinks(
			View view) {
		CheckBox modelElement = (CheckBox) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getImage_1603030OutgoingLinks(
			View view) {
		Image modelElement = (Image) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(modelElement));
		return result;
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
	public static List<DomainLinkDescriptor> getMessageElement_1603035OutgoingLinks(
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
	public static List<DomainLinkDescriptor> getLinkToMessage_1604001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getLinkToLabel_1604002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getContainedTypeModelFacetLinks_LinkToMessage_1604001(
			CanvasView container) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getLinkToMessages().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkToMessage) {
				continue;
			}
			LinkToMessage link = (LinkToMessage) linkObject;
			if (LinkToMessageEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageElement dst = link.getTarget();
			InputElement src = link.getSource();
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.LinkToMessage_1604001,
					LinkToMessageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getContainedTypeModelFacetLinks_LinkToLabel_1604002(
			CanvasView container) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getLinkToLabels().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkToLabel) {
				continue;
			}
			LinkToLabel link = (LinkToLabel) linkObject;
			if (LinkToLabelEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Label dst = link.getTarget();
			InputElement src = link.getSource();
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.LinkToLabel_1604002,
					LinkToLabelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingTypeModelFacetLinks_LinkToMessage_1604001(
			MessageElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DomainPackage.eINSTANCE
					.getLinkToMessage_Target()
					|| false == setting.getEObject() instanceof LinkToMessage) {
				continue;
			}
			LinkToMessage link = (LinkToMessage) setting.getEObject();
			if (LinkToMessageEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InputElement src = link.getSource();
			result.add(new DomainLinkDescriptor(src, target, link,
					DomainElementTypes.LinkToMessage_1604001,
					LinkToMessageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingTypeModelFacetLinks_LinkToLabel_1604002(
			Label target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DomainPackage.eINSTANCE
					.getLinkToLabel_Target()
					|| false == setting.getEObject() instanceof LinkToLabel) {
				continue;
			}
			LinkToLabel link = (LinkToLabel) setting.getEObject();
			if (LinkToLabelEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			InputElement src = link.getSource();
			result.add(new DomainLinkDescriptor(src, target, link,
					DomainElementTypes.LinkToLabel_1604002,
					LinkToLabelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkToMessage_1604001(
			InputElement source) {
		CanvasView container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CanvasView) {
				container = (CanvasView) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getLinkToMessages().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkToMessage) {
				continue;
			}
			LinkToMessage link = (LinkToMessage) linkObject;
			if (LinkToMessageEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MessageElement dst = link.getTarget();
			InputElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.LinkToMessage_1604001,
					LinkToMessageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkToLabel_1604002(
			InputElement source) {
		CanvasView container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CanvasView) {
				container = (CanvasView) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getLinkToLabels().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkToLabel) {
				continue;
			}
			LinkToLabel link = (LinkToLabel) linkObject;
			if (LinkToLabelEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Label dst = link.getTarget();
			InputElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.LinkToLabel_1604002,
					LinkToLabelEditPart.VISUAL_ID));
		}
		return result;
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
