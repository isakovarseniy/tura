/*
 * 
 */
package menu.diagram.part;

import menu.diagram.edit.parts.MenuFolderEditPart;
import menu.diagram.edit.parts.MenuFolderMenuFolderMenuElementsCompartmentEditPart;
import menu.diagram.edit.parts.MenuFolderNameEditPart;
import menu.diagram.edit.parts.MenuItemEditPart;
import menu.diagram.edit.parts.MenuItemNameEditPart;
import menu.diagram.edit.parts.MenuSeparatorEditPart;
import menu.diagram.edit.parts.MenuSeparatorNameEditPart;
import menu.diagram.edit.parts.MenuViewEditPart;
import menu.diagram.edit.parts.SubMenuEditPart;
import menu.diagram.edit.parts.SubMenuNameEditPart;
import menu.diagram.edit.parts.SubMenuToSubmenuEditPart;
import menu.diagram.edit.parts.SubMenuToSubmenuExternalLabelEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import domain.DomainPackage;
import domain.MenuView;

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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.menu/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MenuViewEditPart.MODEL_ID.equals(view.getType())) {
				return MenuViewEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return menu.diagram.part.DomainVisualIDRegistry.getVisualID(view
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
		if (DomainPackage.eINSTANCE.getMenuView().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((MenuView) domainElement)) {
			return MenuViewEditPart.VISUAL_ID;
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
		String containerModelID = menu.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!MenuViewEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MenuViewEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = menu.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MenuViewEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MenuViewEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getMenuFolder().isSuperTypeOf(
					domainElement.eClass())) {
				return MenuFolderEditPart.VISUAL_ID;
			}
			break;
		case MenuFolderMenuFolderMenuElementsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getMenuItem().isSuperTypeOf(
					domainElement.eClass())) {
				return MenuItemEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getSubMenu().isSuperTypeOf(
					domainElement.eClass())) {
				return SubMenuEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getMenuSeparator().isSuperTypeOf(
					domainElement.eClass())) {
				return MenuSeparatorEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = menu.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!MenuViewEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MenuViewEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = menu.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MenuViewEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MenuViewEditPart.VISUAL_ID:
			if (MenuFolderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuFolderEditPart.VISUAL_ID:
			if (MenuFolderNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuFolderMenuFolderMenuElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuItemEditPart.VISUAL_ID:
			if (MenuItemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubMenuEditPart.VISUAL_ID:
			if (SubMenuNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuSeparatorEditPart.VISUAL_ID:
			if (MenuSeparatorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuFolderMenuFolderMenuElementsCompartmentEditPart.VISUAL_ID:
			if (MenuItemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubMenuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuSeparatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubMenuToSubmenuEditPart.VISUAL_ID:
			if (SubMenuToSubmenuExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(MenuView element) {
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
		case MenuFolderMenuFolderMenuElementsCompartmentEditPart.VISUAL_ID:
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
		case MenuViewEditPart.VISUAL_ID:
			return false;
		case MenuItemEditPart.VISUAL_ID:
		case MenuSeparatorEditPart.VISUAL_ID:
		case SubMenuEditPart.VISUAL_ID:
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
			return menu.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return menu.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return menu.diagram.part.DomainVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return menu.diagram.part.DomainVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return menu.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return menu.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
