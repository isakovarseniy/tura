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

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import canvas.diagram.edit.parts.Button2EditPart;
import canvas.diagram.edit.parts.ButtonEditPart;
import canvas.diagram.edit.parts.ButtonLabel2EditPart;
import canvas.diagram.edit.parts.ButtonLabelEditPart;
import canvas.diagram.edit.parts.CanvasViewEditPart;
import canvas.diagram.edit.parts.CheckBox2EditPart;
import canvas.diagram.edit.parts.CheckBoxEditPart;
import canvas.diagram.edit.parts.Column2EditPart;
import canvas.diagram.edit.parts.ColumnColumnElementCompartment2EditPart;
import canvas.diagram.edit.parts.ColumnColumnElementCompartmentEditPart;
import canvas.diagram.edit.parts.ColumnEditPart;
import canvas.diagram.edit.parts.ColumnLabel2EditPart;
import canvas.diagram.edit.parts.ColumnLabelEditPart;
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
import canvas.diagram.edit.parts.LabelLabel2EditPart;
import canvas.diagram.edit.parts.LabelLabelEditPart;
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
import canvas.diagram.edit.parts.MessageElementLabel2EditPart;
import canvas.diagram.edit.parts.MessageElementLabelEditPart;
import canvas.diagram.edit.parts.OutputText2EditPart;
import canvas.diagram.edit.parts.OutputTextEditPart;
import canvas.diagram.edit.parts.Password2EditPart;
import canvas.diagram.edit.parts.PasswordEditPart;
import canvas.diagram.edit.parts.Table2EditPart;
import canvas.diagram.edit.parts.TableEditPart;
import canvas.diagram.edit.parts.TableLabel2EditPart;
import canvas.diagram.edit.parts.TableLabelEditPart;
import canvas.diagram.edit.parts.TableTableColsCompartment2EditPart;
import canvas.diagram.edit.parts.TableTableColsCompartmentEditPart;
import canvas.diagram.edit.parts.Tree2EditPart;
import canvas.diagram.edit.parts.TreeEditPart;
import canvas.diagram.edit.parts.TreeLabel2EditPart;
import canvas.diagram.edit.parts.TreeLabelEditPart;
import canvas.diagram.edit.parts.TreeTreeColsCompartment2EditPart;
import canvas.diagram.edit.parts.TreeTreeColsCompartmentEditPart;
import domain.CanvasView;
import domain.DomainPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DomainVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.canvas/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CanvasViewEditPart.MODEL_ID.equals(view.getType())) {
				return CanvasViewEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return canvas.diagram.part.DomainVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				DomainDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DomainPackage.eINSTANCE.getCanvasView().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((CanvasView) domainElement)) {
			return CanvasViewEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = canvas.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!CanvasViewEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CanvasViewEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = canvas.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CanvasViewEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CanvasViewEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getLayerHolder().isSuperTypeOf(
					domainElement.eClass())) {
				return LayerHolderEditPart.VISUAL_ID;
			}
			break;
		case LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getInputText().isSuperTypeOf(
					domainElement.eClass())) {
				return InputTextEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getPassword().isSuperTypeOf(
					domainElement.eClass())) {
				return PasswordEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getOutputText().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputTextEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDropDownSelection().isSuperTypeOf(
					domainElement.eClass())) {
				return DropDownSelectionEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDate().isSuperTypeOf(
					domainElement.eClass())) {
				return DateEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTable().isSuperTypeOf(
					domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTree().isSuperTypeOf(
					domainElement.eClass())) {
				return Tree2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLayerHolder().isSuperTypeOf(
					domainElement.eClass())) {
				return LayerHolder3EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getCheckBox().isSuperTypeOf(
					domainElement.eClass())) {
				return CheckBoxEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return ImageEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLabel().isSuperTypeOf(
					domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getMessageElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageElementEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			break;
		case TableTableColsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getColumn().isSuperTypeOf(
					domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case ColumnColumnElementCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getInputText().isSuperTypeOf(
					domainElement.eClass())) {
				return InputText2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getPassword().isSuperTypeOf(
					domainElement.eClass())) {
				return Password2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getOutputText().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputText2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDropDownSelection().isSuperTypeOf(
					domainElement.eClass())) {
				return DropDownSelection2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDate().isSuperTypeOf(
					domainElement.eClass())) {
				return Date2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTable().isSuperTypeOf(
					domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTree().isSuperTypeOf(
					domainElement.eClass())) {
				return TreeEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLayerHolder().isSuperTypeOf(
					domainElement.eClass())) {
				return LayerHolder2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getCheckBox().isSuperTypeOf(
					domainElement.eClass())) {
				return CheckBox2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLabel().isSuperTypeOf(
					domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getMessageElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageElement2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			break;
		case TableTableColsCompartment2EditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getColumn().isSuperTypeOf(
					domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case TreeTreeColsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getColumn().isSuperTypeOf(
					domainElement.eClass())) {
				return Column2EditPart.VISUAL_ID;
			}
			break;
		case ColumnColumnElementCompartment2EditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getInputText().isSuperTypeOf(
					domainElement.eClass())) {
				return InputText2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getPassword().isSuperTypeOf(
					domainElement.eClass())) {
				return Password2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getOutputText().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputText2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDropDownSelection().isSuperTypeOf(
					domainElement.eClass())) {
				return DropDownSelection2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDate().isSuperTypeOf(
					domainElement.eClass())) {
				return Date2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTable().isSuperTypeOf(
					domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTree().isSuperTypeOf(
					domainElement.eClass())) {
				return TreeEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLayerHolder().isSuperTypeOf(
					domainElement.eClass())) {
				return LayerHolder2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getCheckBox().isSuperTypeOf(
					domainElement.eClass())) {
				return CheckBox2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return Image2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLabel().isSuperTypeOf(
					domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getMessageElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageElement2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			break;
		case LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getInputText().isSuperTypeOf(
					domainElement.eClass())) {
				return InputTextEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getPassword().isSuperTypeOf(
					domainElement.eClass())) {
				return PasswordEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getOutputText().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputTextEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDropDownSelection().isSuperTypeOf(
					domainElement.eClass())) {
				return DropDownSelectionEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDate().isSuperTypeOf(
					domainElement.eClass())) {
				return DateEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTable().isSuperTypeOf(
					domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTree().isSuperTypeOf(
					domainElement.eClass())) {
				return Tree2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLayerHolder().isSuperTypeOf(
					domainElement.eClass())) {
				return LayerHolder3EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getCheckBox().isSuperTypeOf(
					domainElement.eClass())) {
				return CheckBoxEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return ImageEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLabel().isSuperTypeOf(
					domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getMessageElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageElementEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			break;
		case TreeTreeColsCompartment2EditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getColumn().isSuperTypeOf(
					domainElement.eClass())) {
				return Column2EditPart.VISUAL_ID;
			}
			break;
		case LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getInputText().isSuperTypeOf(
					domainElement.eClass())) {
				return InputTextEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getPassword().isSuperTypeOf(
					domainElement.eClass())) {
				return PasswordEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getOutputText().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputTextEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDropDownSelection().isSuperTypeOf(
					domainElement.eClass())) {
				return DropDownSelectionEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDate().isSuperTypeOf(
					domainElement.eClass())) {
				return DateEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTable().isSuperTypeOf(
					domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTree().isSuperTypeOf(
					domainElement.eClass())) {
				return Tree2EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLayerHolder().isSuperTypeOf(
					domainElement.eClass())) {
				return LayerHolder3EditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getCheckBox().isSuperTypeOf(
					domainElement.eClass())) {
				return CheckBoxEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getImage().isSuperTypeOf(
					domainElement.eClass())) {
				return ImageEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getLabel().isSuperTypeOf(
					domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getMessageElement().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageElementEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getButton().isSuperTypeOf(
					domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = canvas.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!CanvasViewEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CanvasViewEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = canvas.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CanvasViewEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CanvasViewEditPart.VISUAL_ID:
			if (LayerHolderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LayerHolderEditPart.VISUAL_ID:
			if (LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableEditPart.VISUAL_ID:
			if (TableLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableColsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ColumnEditPart.VISUAL_ID:
			if (ColumnLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnColumnElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Table2EditPart.VISUAL_ID:
			if (TableLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableColsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TreeEditPart.VISUAL_ID:
			if (TreeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TreeTreeColsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column2EditPart.VISUAL_ID:
			if (ColumnLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnColumnElementCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LayerHolder2EditPart.VISUAL_ID:
			if (LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Tree2EditPart.VISUAL_ID:
			if (TreeLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TreeTreeColsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LayerHolder3EditPart.VISUAL_ID:
			if (LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabelEditPart.VISUAL_ID:
			if (LabelLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageElementEditPart.VISUAL_ID:
			if (MessageElementLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ButtonEditPart.VISUAL_ID:
			if (ButtonLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label2EditPart.VISUAL_ID:
			if (LabelLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageElement2EditPart.VISUAL_ID:
			if (MessageElementLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button2EditPart.VISUAL_ID:
			if (ButtonLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID:
			if (InputTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PasswordEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DropDownSelectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tree2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LayerHolder3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableColsCompartmentEditPart.VISUAL_ID:
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ColumnColumnElementCompartmentEditPart.VISUAL_ID:
			if (InputText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Password2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DropDownSelection2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Date2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TreeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LayerHolder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableColsCompartment2EditPart.VISUAL_ID:
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TreeTreeColsCompartmentEditPart.VISUAL_ID:
			if (Column2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ColumnColumnElementCompartment2EditPart.VISUAL_ID:
			if (InputText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Password2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DropDownSelection2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Date2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TreeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LayerHolder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Image2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID:
			if (InputTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PasswordEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DropDownSelectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tree2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LayerHolder3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TreeTreeColsCompartment2EditPart.VISUAL_ID:
			if (Column2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID:
			if (InputTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PasswordEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DropDownSelectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tree2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LayerHolder3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DomainPackage.eINSTANCE.getLinkToMessage().isSuperTypeOf(
				domainElement.eClass())) {
			return LinkToMessageEditPart.VISUAL_ID;
		}
		if (DomainPackage.eINSTANCE.getLinkToLabel().isSuperTypeOf(
				domainElement.eClass())) {
			return LinkToLabelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(CanvasView element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID:
		case TableTableColsCompartmentEditPart.VISUAL_ID:
		case ColumnColumnElementCompartmentEditPart.VISUAL_ID:
		case TableTableColsCompartment2EditPart.VISUAL_ID:
		case TreeTreeColsCompartmentEditPart.VISUAL_ID:
		case ColumnColumnElementCompartment2EditPart.VISUAL_ID:
		case LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID:
		case TreeTreeColsCompartment2EditPart.VISUAL_ID:
		case LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CanvasViewEditPart.VISUAL_ID:
			return false;
		case DropDownSelectionEditPart.VISUAL_ID:
		case InputTextEditPart.VISUAL_ID:
		case LabelEditPart.VISUAL_ID:
		case OutputTextEditPart.VISUAL_ID:
		case CheckBoxEditPart.VISUAL_ID:
		case DropDownSelection2EditPart.VISUAL_ID:
		case InputText2EditPart.VISUAL_ID:
		case Label2EditPart.VISUAL_ID:
		case OutputText2EditPart.VISUAL_ID:
		case CheckBox2EditPart.VISUAL_ID:
		case ButtonEditPart.VISUAL_ID:
		case Button2EditPart.VISUAL_ID:
		case ImageEditPart.VISUAL_ID:
		case DateEditPart.VISUAL_ID:
		case Image2EditPart.VISUAL_ID:
		case Date2EditPart.VISUAL_ID:
		case PasswordEditPart.VISUAL_ID:
		case Password2EditPart.VISUAL_ID:
		case MessageElementEditPart.VISUAL_ID:
		case MessageElement2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return canvas.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return canvas.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return canvas.diagram.part.DomainVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return canvas.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return canvas.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return canvas.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
