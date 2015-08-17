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
package uipackage.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import domain.DomainPackage;
import domain.UIPackage;
import uipackage.diagram.edit.parts.FormDataControlsEditPart;
import uipackage.diagram.edit.parts.FormDataControlsNameEditPart;
import uipackage.diagram.edit.parts.FormEditPart;
import uipackage.diagram.edit.parts.FormFormDatacontrolsCompartmentEditPart;
import uipackage.diagram.edit.parts.FormFormParametersCompartmentEditPart;
import uipackage.diagram.edit.parts.FormFormViewCompartmentEditPart;
import uipackage.diagram.edit.parts.FormNameEditPart;
import uipackage.diagram.edit.parts.FormParameterEditPart;
import uipackage.diagram.edit.parts.FormParameterNameEditPart;
import uipackage.diagram.edit.parts.FormViewEditPart;
import uipackage.diagram.edit.parts.FormViewNameEditPart;
import uipackage.diagram.edit.parts.UIPackageEditPart;

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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.uipackage/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UIPackageEditPart.MODEL_ID.equals(view.getType())) {
				return UIPackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uipackage.diagram.part.DomainVisualIDRegistry.getVisualID(view.getType());
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				DomainDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
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
		if (DomainPackage.eINSTANCE.getUIPackage().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((UIPackage) domainElement)) {
			return UIPackageEditPart.VISUAL_ID;
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
		String containerModelID = uipackage.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!UIPackageEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (UIPackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uipackage.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UIPackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UIPackageEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getForm().isSuperTypeOf(domainElement.eClass())) {
				return FormEditPart.VISUAL_ID;
			}
			break;
		case FormFormViewCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getFormView().isSuperTypeOf(domainElement.eClass())) {
				return FormViewEditPart.VISUAL_ID;
			}
			break;
		case FormFormDatacontrolsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getFormDataControls().isSuperTypeOf(domainElement.eClass())) {
				return FormDataControlsEditPart.VISUAL_ID;
			}
			break;
		case FormFormParametersCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getFormParameter().isSuperTypeOf(domainElement.eClass())) {
				return FormParameterEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uipackage.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!UIPackageEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (UIPackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uipackage.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UIPackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UIPackageEditPart.VISUAL_ID:
			if (FormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormEditPart.VISUAL_ID:
			if (FormNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormFormViewCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormFormDatacontrolsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FormFormParametersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormParameterEditPart.VISUAL_ID:
			if (FormParameterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormViewEditPart.VISUAL_ID:
			if (FormViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormDataControlsEditPart.VISUAL_ID:
			if (FormDataControlsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormFormViewCompartmentEditPart.VISUAL_ID:
			if (FormViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormFormDatacontrolsCompartmentEditPart.VISUAL_ID:
			if (FormDataControlsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FormFormParametersCompartmentEditPart.VISUAL_ID:
			if (FormParameterEditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(UIPackage element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
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
		case FormFormViewCompartmentEditPart.VISUAL_ID:
		case FormFormDatacontrolsCompartmentEditPart.VISUAL_ID:
		case FormFormParametersCompartmentEditPart.VISUAL_ID:
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
		case UIPackageEditPart.VISUAL_ID:
			return false;
		case FormViewEditPart.VISUAL_ID:
		case FormDataControlsEditPart.VISUAL_ID:
		case FormParameterEditPart.VISUAL_ID:
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
			return uipackage.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uipackage.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uipackage.diagram.part.DomainVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uipackage.diagram.part.DomainVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uipackage.diagram.part.DomainVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uipackage.diagram.part.DomainVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
