/*
 * 
 */
package typesrepository.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import typedefinition.TypedefinitionPackage;
import typesrepository.TypesRepository;
import typesrepository.TypesrepositoryPackage;
import typesrepository.diagram.edit.parts.BusinessPackageEditPart;
import typesrepository.diagram.edit.parts.BusinessPackageNameEditPart;
import typesrepository.diagram.edit.parts.PackageEditPart;
import typesrepository.diagram.edit.parts.PackageNameEditPart;
import typesrepository.diagram.edit.parts.PrimitiveEditPart;
import typesrepository.diagram.edit.parts.PrimitiveNameEditPart;
import typesrepository.diagram.edit.parts.TypeExtensionEditPart;
import typesrepository.diagram.edit.parts.TypesEditPart;
import typesrepository.diagram.edit.parts.TypesNameEditPart;
import typesrepository.diagram.edit.parts.TypesRepositoryEditPart;
import typesrepository.diagram.edit.parts.TypesTypesBusinessPackagesCompartmentEditPart;
import typesrepository.diagram.edit.parts.TypesTypesPackagesCompartmentEditPart;
import typesrepository.diagram.edit.parts.TypesTypesPrimitivesCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TypesrepositoryVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TypesRepositoryEditPart.MODEL_ID.equals(view.getType())) {
				return TypesRepositoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
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
				TypesrepositoryDiagramEditorPlugin.getInstance().logError(
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
		if (TypesrepositoryPackage.eINSTANCE.getTypesRepository()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((TypesRepository) domainElement)) {
			return TypesRepositoryEditPart.VISUAL_ID;
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
		String containerModelID = typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
				.getModelID(containerView);
		if (!TypesRepositoryEditPart.MODEL_ID.equals(containerModelID)
				&& !"typesrepository".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (TypesRepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TypesRepositoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TypesRepositoryEditPart.VISUAL_ID:
			if (TypesrepositoryPackage.eINSTANCE.getTypes().isSuperTypeOf(
					domainElement.eClass())) {
				return TypesEditPart.VISUAL_ID;
			}
			break;
		case TypesTypesPrimitivesCompartmentEditPart.VISUAL_ID:
			if (TypesrepositoryPackage.eINSTANCE.getPrimitive().isSuperTypeOf(
					domainElement.eClass())) {
				return PrimitiveEditPart.VISUAL_ID;
			}
			break;
		case TypesTypesPackagesCompartmentEditPart.VISUAL_ID:
			if (TypesrepositoryPackage.eINSTANCE.getPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return PackageEditPart.VISUAL_ID;
			}
			break;
		case TypesTypesBusinessPackagesCompartmentEditPart.VISUAL_ID:
			if (TypesrepositoryPackage.eINSTANCE.getBusinessPackage()
					.isSuperTypeOf(domainElement.eClass())) {
				return BusinessPackageEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
				.getModelID(containerView);
		if (!TypesRepositoryEditPart.MODEL_ID.equals(containerModelID)
				&& !"typesrepository".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (TypesRepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TypesRepositoryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TypesRepositoryEditPart.VISUAL_ID:
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
			if (TypesTypesBusinessPackagesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BusinessPackageEditPart.VISUAL_ID:
			if (BusinessPackageNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case TypesTypesBusinessPackagesCompartmentEditPart.VISUAL_ID:
			if (BusinessPackageEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(TypesRepository element) {
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
		case TypesTypesBusinessPackagesCompartmentEditPart.VISUAL_ID:
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
		case TypesRepositoryEditPart.VISUAL_ID:
			return false;
		case PackageEditPart.VISUAL_ID:
		case BusinessPackageEditPart.VISUAL_ID:
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
			return typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return typesrepository.diagram.part.TypesrepositoryVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
