/*
 * 
 */
package menu.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import menu.diagram.edit.parts.MenuExtensionPointEditPart;
import menu.diagram.edit.parts.MenuFolderEditPart;
import menu.diagram.edit.parts.MenuItemEditPart;
import menu.diagram.edit.parts.MenuSeparatorEditPart;
import menu.diagram.edit.parts.MenuViewEditPart;
import menu.diagram.edit.parts.SubMenuEditPart;
import menu.diagram.edit.parts.SubMenuToSubmenuEditPart;
import menu.diagram.part.DomainDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import domain.DomainPackage;

/**
 * @generated
 */
public class DomainElementTypes {

	/**
	 * @generated
	 */
	private DomainElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DomainDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType MenuView_1801000 = getElementType("org.tura.metamodel.diagram.menu.MenuView_1801000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MenuFolder_1802001 = getElementType("org.tura.metamodel.diagram.menu.MenuFolder_1802001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MenuItem_1803002 = getElementType("org.tura.metamodel.diagram.menu.MenuItem_1803002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SubMenu_1803004 = getElementType("org.tura.metamodel.diagram.menu.SubMenu_1803004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MenuExtensionPoint_1803005 = getElementType("org.tura.metamodel.diagram.menu.MenuExtensionPoint_1803005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MenuSeparator_1803003 = getElementType("org.tura.metamodel.diagram.menu.MenuSeparator_1803003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SubMenuToSubmenu_1804018 = getElementType("org.tura.metamodel.diagram.menu.SubMenuToSubmenu_1804018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(MenuView_1801000,
					DomainPackage.eINSTANCE.getMenuView());

			elements.put(MenuFolder_1802001,
					DomainPackage.eINSTANCE.getMenuFolder());

			elements.put(MenuItem_1803002,
					DomainPackage.eINSTANCE.getMenuItem());

			elements.put(SubMenu_1803004, DomainPackage.eINSTANCE.getSubMenu());

			elements.put(MenuExtensionPoint_1803005,
					DomainPackage.eINSTANCE.getMenuExtensionPoint());

			elements.put(MenuSeparator_1803003,
					DomainPackage.eINSTANCE.getMenuSeparator());

			elements.put(SubMenuToSubmenu_1804018,
					DomainPackage.eINSTANCE.getSubMenu_ToSubmenu());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(MenuView_1801000);
			KNOWN_ELEMENT_TYPES.add(MenuFolder_1802001);
			KNOWN_ELEMENT_TYPES.add(MenuItem_1803002);
			KNOWN_ELEMENT_TYPES.add(SubMenu_1803004);
			KNOWN_ELEMENT_TYPES.add(MenuExtensionPoint_1803005);
			KNOWN_ELEMENT_TYPES.add(MenuSeparator_1803003);
			KNOWN_ELEMENT_TYPES.add(SubMenuToSubmenu_1804018);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MenuViewEditPart.VISUAL_ID:
			return MenuView_1801000;
		case MenuFolderEditPart.VISUAL_ID:
			return MenuFolder_1802001;
		case MenuItemEditPart.VISUAL_ID:
			return MenuItem_1803002;
		case SubMenuEditPart.VISUAL_ID:
			return SubMenu_1803004;
		case MenuExtensionPointEditPart.VISUAL_ID:
			return MenuExtensionPoint_1803005;
		case MenuSeparatorEditPart.VISUAL_ID:
			return MenuSeparator_1803003;
		case SubMenuToSubmenuEditPart.VISUAL_ID:
			return SubMenuToSubmenu_1804018;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return menu.diagram.providers.DomainElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return menu.diagram.providers.DomainElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return menu.diagram.providers.DomainElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
