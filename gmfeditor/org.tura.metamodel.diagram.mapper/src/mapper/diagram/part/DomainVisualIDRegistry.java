/*
 * 
 */
package mapper.diagram.part;

import mapper.diagram.edit.parts.CSSMapperEditPart;
import mapper.diagram.edit.parts.CSSMapperFakePackageNameFakeTypeEditPart;
import mapper.diagram.edit.parts.JavaMapperEditPart;
import mapper.diagram.edit.parts.JavaMapperFakePackageNameFakeTypeEditPart;
import mapper.diagram.edit.parts.JavaScriptMapperEditPart;
import mapper.diagram.edit.parts.JavaScriptMapperFakePackageNameFakeTypeEditPart;
import mapper.diagram.edit.parts.MappersEditPart;
import mapper.diagram.edit.parts.RoleMapperEditPart;
import mapper.diagram.edit.parts.RoleMapperFakeRoleNameEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import domain.DomainPackage;
import domain.Mappers;

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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.mapper/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MappersEditPart.MODEL_ID.equals(view.getType())) {
				return MappersEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return mapper.diagram.part.DomainVisualIDRegistry.getVisualID(view.getType());
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
				DomainDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: " + type);
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
		if (DomainPackage.eINSTANCE.getMappers().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Mappers) domainElement)) {
			return MappersEditPart.VISUAL_ID;
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
		String containerModelID = mapper.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!MappersEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MappersEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mapper.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MappersEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MappersEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getJavaMapper().isSuperTypeOf(domainElement.eClass())) {
				return JavaMapperEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getJavaScriptMapper().isSuperTypeOf(domainElement.eClass())) {
				return JavaScriptMapperEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getCSSMapper().isSuperTypeOf(domainElement.eClass())) {
				return CSSMapperEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getRoleMapper().isSuperTypeOf(domainElement.eClass())) {
				return RoleMapperEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mapper.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!MappersEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MappersEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mapper.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MappersEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MappersEditPart.VISUAL_ID:
			if (JavaMapperEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JavaScriptMapperEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CSSMapperEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleMapperEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JavaMapperEditPart.VISUAL_ID:
			if (JavaMapperFakePackageNameFakeTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JavaScriptMapperEditPart.VISUAL_ID:
			if (JavaScriptMapperFakePackageNameFakeTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CSSMapperEditPart.VISUAL_ID:
			if (CSSMapperFakePackageNameFakeTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleMapperEditPart.VISUAL_ID:
			if (RoleMapperFakeRoleNameEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(Mappers element) {
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
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MappersEditPart.VISUAL_ID:
			return false;
		case JavaMapperEditPart.VISUAL_ID:
		case JavaScriptMapperEditPart.VISUAL_ID:
		case CSSMapperEditPart.VISUAL_ID:
		case RoleMapperEditPart.VISUAL_ID:
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
			return mapper.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return mapper.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return mapper.diagram.part.DomainVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return mapper.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return mapper.diagram.part.DomainVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return mapper.diagram.part.DomainVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
