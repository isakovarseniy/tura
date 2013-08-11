/*
 * 
 */
package businessobjects.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectRemovetMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectSearchtMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectUpdaeteMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectNameEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import businessobjects.diagram.edit.parts.CreateMethodEditPart;
import businessobjects.diagram.edit.parts.CreateMethodMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodMethodEditPart;
import businessobjects.diagram.edit.parts.RecipeRecipeConfigEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodMethodEditPart;
import businessobjects.diagram.edit.parts.TypeExtensionEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodMethodEditPart;
import businessobjects.diagram.edit.parts.WrappingLabel2EditPart;
import businessobjects.diagram.edit.parts.WrappingLabelEditPart;
import domain.BusinessObjects;
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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.businessobjects/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (BusinessObjectsEditPart.MODEL_ID.equals(view.getType())) {
				return BusinessObjectsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return businessobjects.diagram.part.DomainVisualIDRegistry
				.getVisualID(view.getType());
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
		if (DomainPackage.eINSTANCE.getBusinessObjects().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((BusinessObjects) domainElement)) {
			return BusinessObjectsEditPart.VISUAL_ID;
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
		String containerModelID = businessobjects.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!BusinessObjectsEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (BusinessObjectsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = businessobjects.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = BusinessObjectsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case BusinessObjectsEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getBusinessObject().isSuperTypeOf(
					domainElement.eClass())) {
				return BusinessObjectEditPart.VISUAL_ID;
			}
			break;
		case BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getCreateMethod().isSuperTypeOf(
					domainElement.eClass())) {
				return CreateMethodEditPart.VISUAL_ID;
			}
			break;
		case BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getInsertMethod().isSuperTypeOf(
					domainElement.eClass())) {
				return InsertMethodEditPart.VISUAL_ID;
			}
			break;
		case BusinessObjectBusinessObjectUpdaeteMethodsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getUpdateMethod().isSuperTypeOf(
					domainElement.eClass())) {
				return UpdateMethodEditPart.VISUAL_ID;
			}
			break;
		case BusinessObjectBusinessObjectRemovetMethodsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getRemoveMethod().isSuperTypeOf(
					domainElement.eClass())) {
				return RemoveMethodEditPart.VISUAL_ID;
			}
			break;
		case BusinessObjectBusinessObjectSearchtMethodsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getSearchMethod().isSuperTypeOf(
					domainElement.eClass())) {
				return SearchMethodEditPart.VISUAL_ID;
			}
			break;
		case BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getOtherMethod().isSuperTypeOf(
					domainElement.eClass())) {
				return OtherMethodEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = businessobjects.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!BusinessObjectsEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (BusinessObjectsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = businessobjects.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = BusinessObjectsEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case BusinessObjectsEditPart.VISUAL_ID:
			if (BusinessObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessObjectEditPart.VISUAL_ID:
			if (BusinessObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BusinessObjectBusinessObjectUpdaeteMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BusinessObjectBusinessObjectRemovetMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BusinessObjectBusinessObjectSearchtMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateMethodEditPart.VISUAL_ID:
			if (CreateMethodMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InsertMethodEditPart.VISUAL_ID:
			if (InsertMethodMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UpdateMethodEditPart.VISUAL_ID:
			if (UpdateMethodMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RemoveMethodEditPart.VISUAL_ID:
			if (RemoveMethodMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SearchMethodEditPart.VISUAL_ID:
			if (SearchMethodMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OtherMethodEditPart.VISUAL_ID:
			if (OtherMethodMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart.VISUAL_ID:
			if (CreateMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart.VISUAL_ID:
			if (InsertMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessObjectBusinessObjectUpdaeteMethodsCompartmentEditPart.VISUAL_ID:
			if (UpdateMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessObjectBusinessObjectRemovetMethodsCompartmentEditPart.VISUAL_ID:
			if (RemoveMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessObjectBusinessObjectSearchtMethodsCompartmentEditPart.VISUAL_ID:
			if (SearchMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart.VISUAL_ID:
			if (OtherMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeRecipeConfigEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
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
		if (DomainPackage.eINSTANCE.getTypeExtension().isSuperTypeOf(
				domainElement.eClass())) {
			return TypeExtensionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(BusinessObjects element) {
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
		case BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart.VISUAL_ID:
		case BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart.VISUAL_ID:
		case BusinessObjectBusinessObjectUpdaeteMethodsCompartmentEditPart.VISUAL_ID:
		case BusinessObjectBusinessObjectRemovetMethodsCompartmentEditPart.VISUAL_ID:
		case BusinessObjectBusinessObjectSearchtMethodsCompartmentEditPart.VISUAL_ID:
		case BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart.VISUAL_ID:
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
		case BusinessObjectsEditPart.VISUAL_ID:
			return false;
		case CreateMethodEditPart.VISUAL_ID:
		case InsertMethodEditPart.VISUAL_ID:
		case UpdateMethodEditPart.VISUAL_ID:
		case RemoveMethodEditPart.VISUAL_ID:
		case SearchMethodEditPart.VISUAL_ID:
		case OtherMethodEditPart.VISUAL_ID:
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
			return businessobjects.diagram.part.DomainVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return businessobjects.diagram.part.DomainVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return businessobjects.diagram.part.DomainVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return businessobjects.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return businessobjects.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return businessobjects.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
