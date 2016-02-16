/*
 * 
 */
package menu.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import menu.diagram.edit.parts.MenuExtensionPointEditPart;
import menu.diagram.edit.parts.MenuFolderEditPart;
import menu.diagram.edit.parts.MenuFolderMenuFolderMenuElementsCompartmentEditPart;
import menu.diagram.edit.parts.MenuItemEditPart;
import menu.diagram.edit.parts.MenuSeparatorEditPart;
import menu.diagram.edit.parts.MenuViewEditPart;
import menu.diagram.edit.parts.SubMenuEditPart;
import menu.diagram.edit.parts.SubMenuToSubmenuEditPart;
import menu.diagram.providers.DomainElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import domain.DomainPackage;
import domain.MenuElement;
import domain.MenuFolder;
import domain.MenuView;
import domain.SubMenu;

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
		case MenuViewEditPart.VISUAL_ID:
			return getMenuView_1801000SemanticChildren(view);
		case MenuFolderMenuFolderMenuElementsCompartmentEditPart.VISUAL_ID:
			return getMenuFolderMenuFolderMenuElementsCompartment_1807001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getMenuView_1801000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MenuView modelElement = (MenuView) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMenuFolders().iterator(); it
				.hasNext();) {
			MenuFolder childElement = (MenuFolder) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MenuFolderEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getMenuFolderMenuFolderMenuElementsCompartment_1807001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MenuFolder modelElement = (MenuFolder) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMenuElements().iterator(); it
				.hasNext();) {
			MenuElement childElement = (MenuElement) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MenuItemEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MenuExtensionPointEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SubMenuEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MenuSeparatorEditPart.VISUAL_ID) {
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
		case MenuViewEditPart.VISUAL_ID:
			return getMenuView_1801000ContainedLinks(view);
		case MenuFolderEditPart.VISUAL_ID:
			return getMenuFolder_1802001ContainedLinks(view);
		case MenuItemEditPart.VISUAL_ID:
			return getMenuItem_1803002ContainedLinks(view);
		case MenuExtensionPointEditPart.VISUAL_ID:
			return getMenuExtensionPoint_1803005ContainedLinks(view);
		case SubMenuEditPart.VISUAL_ID:
			return getSubMenu_1803004ContainedLinks(view);
		case MenuSeparatorEditPart.VISUAL_ID:
			return getMenuSeparator_1803003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case MenuFolderEditPart.VISUAL_ID:
			return getMenuFolder_1802001IncomingLinks(view);
		case MenuItemEditPart.VISUAL_ID:
			return getMenuItem_1803002IncomingLinks(view);
		case MenuExtensionPointEditPart.VISUAL_ID:
			return getMenuExtensionPoint_1803005IncomingLinks(view);
		case SubMenuEditPart.VISUAL_ID:
			return getSubMenu_1803004IncomingLinks(view);
		case MenuSeparatorEditPart.VISUAL_ID:
			return getMenuSeparator_1803003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case MenuFolderEditPart.VISUAL_ID:
			return getMenuFolder_1802001OutgoingLinks(view);
		case MenuItemEditPart.VISUAL_ID:
			return getMenuItem_1803002OutgoingLinks(view);
		case MenuExtensionPointEditPart.VISUAL_ID:
			return getMenuExtensionPoint_1803005OutgoingLinks(view);
		case SubMenuEditPart.VISUAL_ID:
			return getSubMenu_1803004OutgoingLinks(view);
		case MenuSeparatorEditPart.VISUAL_ID:
			return getMenuSeparator_1803003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuView_1801000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuFolder_1802001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuItem_1803002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSubMenu_1803004ContainedLinks(
			View view) {
		SubMenu modelElement = (SubMenu) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_SubMenu_ToSubmenu_1804018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuExtensionPoint_1803005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuSeparator_1803003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuFolder_1802001IncomingLinks(
			View view) {
		MenuFolder modelElement = (MenuFolder) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_SubMenu_ToSubmenu_1804018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuItem_1803002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSubMenu_1803004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuExtensionPoint_1803005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuSeparator_1803003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuFolder_1802001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuItem_1803002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSubMenu_1803004OutgoingLinks(
			View view) {
		SubMenu modelElement = (SubMenu) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_SubMenu_ToSubmenu_1804018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuExtensionPoint_1803005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getMenuSeparator_1803003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_SubMenu_ToSubmenu_1804018(
			MenuFolder target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE
					.getSubMenu_ToSubmenu()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(),
						target, DomainElementTypes.SubMenuToSubmenu_1804018,
						SubMenuToSubmenuEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_SubMenu_ToSubmenu_1804018(
			SubMenu source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		MenuFolder destination = source.getToSubmenu();
		if (destination == null) {
			return result;
		}
		result.add(new DomainLinkDescriptor(source, destination,
				DomainElementTypes.SubMenuToSubmenu_1804018,
				SubMenuToSubmenuEditPart.VISUAL_ID));
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
