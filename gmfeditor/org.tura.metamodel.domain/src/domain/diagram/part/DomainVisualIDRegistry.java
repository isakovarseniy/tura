/*
 * 
 */
package domain.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import typedefinition.TypedefinitionPackage;
import domain.Dammy1;
import domain.DomainPackage;
import domain.diagram.edit.parts.Attribute2EditPart;
import domain.diagram.edit.parts.AttributeEditPart;
import domain.diagram.edit.parts.AttributeName2EditPart;
import domain.diagram.edit.parts.AttributeNameEditPart;
import domain.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import domain.diagram.edit.parts.Dammy1EditPart;
import domain.diagram.edit.parts.EnumAttributeEditPart;
import domain.diagram.edit.parts.EnumAttributeNameEditPart;
import domain.diagram.edit.parts.EnumaratorEditPart;
import domain.diagram.edit.parts.EnumaratorEnumaratorValuesCompartmentEditPart;
import domain.diagram.edit.parts.EnumaratorNameEditPart;
import domain.diagram.edit.parts.OperationEditPart;
import domain.diagram.edit.parts.OperationNameEditPart;
import domain.diagram.edit.parts.OperationOperationParametersCompartmentEditPart;
import domain.diagram.edit.parts.OperationOperationReturnValueCompartmentEditPart;
import domain.diagram.edit.parts.RecipeRecipeConfigEditPart;
import domain.diagram.edit.parts.ReturnValueEditPart;
import domain.diagram.edit.parts.ReturnValuePackageNameTypeNameEditPart;
import domain.diagram.edit.parts.TypeEditPart;
import domain.diagram.edit.parts.TypeExtensionEditPart;
import domain.diagram.edit.parts.TypeNameEditPart;
import domain.diagram.edit.parts.TypeReferenceEditPart;
import domain.diagram.edit.parts.TypeReferencePackageNameTypeNameEditPart;
import domain.diagram.edit.parts.TypeTypeAttributesCompartmentEditPart;
import domain.diagram.edit.parts.TypeTypeOperationsCompartmentEditPart;
import domain.diagram.edit.parts.WrappingLabel2EditPart;
import domain.diagram.edit.parts.WrappingLabelEditPart;

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
	private static final String DEBUG_KEY = "org.tura.metamodel.domain/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Dammy1EditPart.MODEL_ID.equals(view.getType())) {
				return Dammy1EditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return domain.diagram.part.DomainVisualIDRegistry.getVisualID(view
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
		if (DomainPackage.eINSTANCE.getDammy1().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Dammy1) domainElement)) {
			return Dammy1EditPart.VISUAL_ID;
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
		String containerModelID = domain.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!Dammy1EditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (Dammy1EditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = domain.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Dammy1EditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Dammy1EditPart.VISUAL_ID:
			if (TypedefinitionPackage.eINSTANCE.getTypeReference()
					.isSuperTypeOf(domainElement.eClass())) {
				return TypeReferenceEditPart.VISUAL_ID;
			}
			if (TypedefinitionPackage.eINSTANCE.getType().isSuperTypeOf(
					domainElement.eClass())) {
				return TypeEditPart.VISUAL_ID;
			}
			if (TypedefinitionPackage.eINSTANCE.getEnumarator().isSuperTypeOf(
					domainElement.eClass())) {
				return EnumaratorEditPart.VISUAL_ID;
			}
			break;
		case TypeTypeAttributesCompartmentEditPart.VISUAL_ID:
			if (TypedefinitionPackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case TypeTypeOperationsCompartmentEditPart.VISUAL_ID:
			if (TypedefinitionPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case OperationOperationParametersCompartmentEditPart.VISUAL_ID:
			if (TypedefinitionPackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return Attribute2EditPart.VISUAL_ID;
			}
			break;
		case OperationOperationReturnValueCompartmentEditPart.VISUAL_ID:
			if (TypedefinitionPackage.eINSTANCE.getReturnValue().isSuperTypeOf(
					domainElement.eClass())) {
				return ReturnValueEditPart.VISUAL_ID;
			}
			break;
		case EnumaratorEnumaratorValuesCompartmentEditPart.VISUAL_ID:
			if (TypedefinitionPackage.eINSTANCE.getEnumAttribute()
					.isSuperTypeOf(domainElement.eClass())) {
				return EnumAttributeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = domain.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!Dammy1EditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (Dammy1EditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = domain.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Dammy1EditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Dammy1EditPart.VISUAL_ID:
			if (TypeReferenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumaratorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeReferenceEditPart.VISUAL_ID:
			if (TypeReferencePackageNameTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeEditPart.VISUAL_ID:
			if (TypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypeTypeAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypeTypeOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumaratorEditPart.VISUAL_ID:
			if (EnumaratorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumaratorEnumaratorValuesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeEditPart.VISUAL_ID:
			if (AttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationEditPart.VISUAL_ID:
			if (OperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationOperationParametersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationOperationReturnValueCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Attribute2EditPart.VISUAL_ID:
			if (AttributeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReturnValueEditPart.VISUAL_ID:
			if (ReturnValuePackageNameTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumAttributeEditPart.VISUAL_ID:
			if (EnumAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeTypeAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeTypeOperationsCompartmentEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationOperationParametersCompartmentEditPart.VISUAL_ID:
			if (Attribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationOperationReturnValueCompartmentEditPart.VISUAL_ID:
			if (ReturnValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumaratorEnumaratorValuesCompartmentEditPart.VISUAL_ID:
			if (EnumAttributeEditPart.VISUAL_ID == nodeVisualID) {
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
		if (TypedefinitionPackage.eINSTANCE.getTypeExtension().isSuperTypeOf(
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
	private static boolean isDiagram(Dammy1 element) {
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
		case TypeTypeAttributesCompartmentEditPart.VISUAL_ID:
		case TypeTypeOperationsCompartmentEditPart.VISUAL_ID:
		case OperationOperationParametersCompartmentEditPart.VISUAL_ID:
		case OperationOperationReturnValueCompartmentEditPart.VISUAL_ID:
		case EnumaratorEnumaratorValuesCompartmentEditPart.VISUAL_ID:
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
		case Dammy1EditPart.VISUAL_ID:
			return false;
		case TypeReferenceEditPart.VISUAL_ID:
		case AttributeEditPart.VISUAL_ID:
		case Attribute2EditPart.VISUAL_ID:
		case ReturnValueEditPart.VISUAL_ID:
		case EnumAttributeEditPart.VISUAL_ID:
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
			return domain.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return domain.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return domain.diagram.part.DomainVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return domain.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return domain.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return domain.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
