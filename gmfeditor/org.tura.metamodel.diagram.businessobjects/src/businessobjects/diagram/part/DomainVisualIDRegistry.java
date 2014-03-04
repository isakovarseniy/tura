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
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectNameEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import businessobjects.diagram.edit.parts.ConfigurationConfigExtensionExternalLabelEditPart;
import businessobjects.diagram.edit.parts.CreateMethodEditPart;
import businessobjects.diagram.edit.parts.CreateMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import businessobjects.diagram.edit.parts.DeploymentComponentDeplymentComponentExternalLabelEditPart;
import businessobjects.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import businessobjects.diagram.edit.parts.DeploymentStarStepFirstStepExternalLabelEditPart;
import businessobjects.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import businessobjects.diagram.edit.parts.InfrastructureRecipeConfigExternalLabelEditPart;
import businessobjects.diagram.edit.parts.InsertMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.RecipeDeloymentEditPart;
import businessobjects.diagram.edit.parts.RecipeDeloymentExternalLabelEditPart;
import businessobjects.diagram.edit.parts.RecipeInfrastructuresEditPart;
import businessobjects.diagram.edit.parts.RecipeInfrastructuresExternalLabelEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.TypeExtensionEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodFakeMethodEditPart;
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
		case BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getUpdateMethod().isSuperTypeOf(
					domainElement.eClass())) {
				return UpdateMethodEditPart.VISUAL_ID;
			}
			break;
		case BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getRemoveMethod().isSuperTypeOf(
					domainElement.eClass())) {
				return RemoveMethodEditPart.VISUAL_ID;
			}
			break;
		case BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart.VISUAL_ID:
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
			if (BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateMethodEditPart.VISUAL_ID:
			if (CreateMethodFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InsertMethodEditPart.VISUAL_ID:
			if (InsertMethodFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UpdateMethodEditPart.VISUAL_ID:
			if (UpdateMethodFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RemoveMethodEditPart.VISUAL_ID:
			if (RemoveMethodFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SearchMethodEditPart.VISUAL_ID:
			if (SearchMethodFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OtherMethodEditPart.VISUAL_ID:
			if (OtherMethodFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
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
		case BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart.VISUAL_ID:
			if (UpdateMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart.VISUAL_ID:
			if (RemoveMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart.VISUAL_ID:
			if (SearchMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart.VISUAL_ID:
			if (OtherMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			if (DeploymentComponentDeplymentComponentExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			if (DeploymentStarStepFirstStepExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			if (RecipeInfrastructuresExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeDeloymentEditPart.VISUAL_ID:
			if (RecipeDeloymentExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			if (InfrastructureRecipeConfigExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			if (ConfigurationConfigExtensionExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
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
		case BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart.VISUAL_ID:
		case BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart.VISUAL_ID:
		case BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart.VISUAL_ID:
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
		case OtherMethodEditPart.VISUAL_ID:
		case UpdateMethodEditPart.VISUAL_ID:
		case RemoveMethodEditPart.VISUAL_ID:
		case SearchMethodEditPart.VISUAL_ID:
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
