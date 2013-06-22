/*
 * 
 */
package tura.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import tura.TuraMetamodel;
import tura.TuraPackage;
import tura.diagram.edit.parts.PackageEditPart;
import tura.diagram.edit.parts.PackageNameEditPart;
import tura.diagram.edit.parts.PrimitiveEditPart;
import tura.diagram.edit.parts.PrimitiveNameEditPart;
import tura.diagram.edit.parts.TuraMetamodelEditPart;
import tura.diagram.edit.parts.TypeExtensionEditPart;
import tura.diagram.edit.parts.TypesEditPart;
import tura.diagram.edit.parts.TypesNameEditPart;
import tura.diagram.edit.parts.TypesTypesPackagesCompartmentEditPart;
import tura.diagram.edit.parts.TypesTypesPrimitivesCompartmentEditPart;
import typedefinition.TypedefinitionPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TuraVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TuraMetamodelEditPart.MODEL_ID.equals(view.getType())) {
				return TuraMetamodelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return tura.diagram.part.TuraVisualIDRegistry.getVisualID(view
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
				TuraDiagramEditorPlugin.getInstance().logError(
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
		if (TuraPackage.eINSTANCE.getTuraMetamodel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((TuraMetamodel) domainElement)) {
			return TuraMetamodelEditPart.VISUAL_ID;
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
		String containerModelID = tura.diagram.part.TuraVisualIDRegistry
				.getModelID(containerView);
		if (!TuraMetamodelEditPart.MODEL_ID.equals(containerModelID)
				&& !"tura".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (TuraMetamodelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = tura.diagram.part.TuraVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TuraMetamodelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TuraMetamodelEditPart.VISUAL_ID:
			if (TuraPackage.eINSTANCE.getTypes().isSuperTypeOf(
					domainElement.eClass())) {
				return TypesEditPart.VISUAL_ID;
			}
			break;
		case TypesTypesPrimitivesCompartmentEditPart.VISUAL_ID:
			if (TuraPackage.eINSTANCE.getPrimitive().isSuperTypeOf(
					domainElement.eClass())) {
				return PrimitiveEditPart.VISUAL_ID;
			}
			break;
		case TypesTypesPackagesCompartmentEditPart.VISUAL_ID:
			if (TuraPackage.eINSTANCE.getPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return PackageEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = tura.diagram.part.TuraVisualIDRegistry
				.getModelID(containerView);
		if (!TuraMetamodelEditPart.MODEL_ID.equals(containerModelID)
				&& !"tura".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (TuraMetamodelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = tura.diagram.part.TuraVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TuraMetamodelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TuraMetamodelEditPart.VISUAL_ID:
			if (TypesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypesEditPart.VISUAL_ID:
			if (TypesNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypesTypesPrimitivesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypesTypesPackagesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveEditPart.VISUAL_ID:
			if (PrimitiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypesTypesPrimitivesCompartmentEditPart.VISUAL_ID:
			if (PrimitiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypesTypesPackagesCompartmentEditPart.VISUAL_ID:
			if (PackageEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(TuraMetamodel element) {
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
		case TypesTypesPrimitivesCompartmentEditPart.VISUAL_ID:
		case TypesTypesPackagesCompartmentEditPart.VISUAL_ID:
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
		case TuraMetamodelEditPart.VISUAL_ID:
			return false;
		case PackageEditPart.VISUAL_ID:
		case PrimitiveEditPart.VISUAL_ID:
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
			return tura.diagram.part.TuraVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return tura.diagram.part.TuraVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return tura.diagram.part.TuraVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return tura.diagram.part.TuraVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return tura.diagram.part.TuraVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return tura.diagram.part.TuraVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
