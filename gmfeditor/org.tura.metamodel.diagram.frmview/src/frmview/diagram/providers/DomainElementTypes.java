/*
 * 
 */
package frmview.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import domain.DomainPackage;
import frmview.diagram.edit.parts.CanvasEditPart;
import frmview.diagram.edit.parts.PopupCanvasEditPart;
import frmview.diagram.edit.parts.TabCanvasEditPart;
import frmview.diagram.edit.parts.TabPageEditPart;
import frmview.diagram.edit.parts.TabPagesInheritanceEditPart;
import frmview.diagram.edit.parts.ViewAreaEditPart;
import frmview.diagram.edit.parts.ViewInheritanceEditPart;
import frmview.diagram.edit.parts.ViewPortEditPart;
import frmview.diagram.edit.parts.ViewPortTriggerEditPart;
import frmview.diagram.edit.parts.ViewsEditPart;
import frmview.diagram.edit.parts.WindowEditPart;
import frmview.diagram.part.DomainDiagramEditorPlugin;

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
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(DomainDiagramEditorPlugin
			.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Views_1301000 = getElementType("org.tura.metamodel.diagram.frmview.Views_1301000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PopupCanvas_1302009 = getElementType("org.tura.metamodel.diagram.frmview.PopupCanvas_1302009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Canvas_1302003 = getElementType("org.tura.metamodel.diagram.frmview.Canvas_1302003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Window_1302007 = getElementType("org.tura.metamodel.diagram.frmview.Window_1302007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TabPage_1302002 = getElementType("org.tura.metamodel.diagram.frmview.TabPage_1302002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TabCanvas_1302008 = getElementType("org.tura.metamodel.diagram.frmview.TabCanvas_1302008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewPort_1303004 = getElementType("org.tura.metamodel.diagram.frmview.ViewPort_1303004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewPortTrigger_1303002 = getElementType("org.tura.metamodel.diagram.frmview.ViewPortTrigger_1303002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewArea_1303005 = getElementType("org.tura.metamodel.diagram.frmview.ViewArea_1303005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewInheritance_1304001 = getElementType("org.tura.metamodel.diagram.frmview.ViewInheritance_1304001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TabPagesInheritance_1304002 = getElementType("org.tura.metamodel.diagram.frmview.TabPagesInheritance_1304002"); //$NON-NLS-1$

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

			elements.put(Views_1301000, DomainPackage.eINSTANCE.getViews());

			elements.put(PopupCanvas_1302009, DomainPackage.eINSTANCE.getPopupCanvas());

			elements.put(Canvas_1302003, DomainPackage.eINSTANCE.getCanvas());

			elements.put(TabPage_1302002, DomainPackage.eINSTANCE.getTabPage());

			elements.put(Window_1302007, DomainPackage.eINSTANCE.getWindow());

			elements.put(TabCanvas_1302008, DomainPackage.eINSTANCE.getTabCanvas());

			elements.put(ViewPort_1303004, DomainPackage.eINSTANCE.getViewPort());

			elements.put(ViewPortTrigger_1303002, DomainPackage.eINSTANCE.getViewPortTrigger());

			elements.put(ViewArea_1303005, DomainPackage.eINSTANCE.getViewArea());

			elements.put(ViewInheritance_1304001, DomainPackage.eINSTANCE.getViewInheritance());

			elements.put(TabPagesInheritance_1304002, DomainPackage.eINSTANCE.getTabPagesInheritance());
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
			KNOWN_ELEMENT_TYPES.add(Views_1301000);
			KNOWN_ELEMENT_TYPES.add(PopupCanvas_1302009);
			KNOWN_ELEMENT_TYPES.add(Canvas_1302003);
			KNOWN_ELEMENT_TYPES.add(TabPage_1302002);
			KNOWN_ELEMENT_TYPES.add(Window_1302007);
			KNOWN_ELEMENT_TYPES.add(TabCanvas_1302008);
			KNOWN_ELEMENT_TYPES.add(ViewPort_1303004);
			KNOWN_ELEMENT_TYPES.add(ViewPortTrigger_1303002);
			KNOWN_ELEMENT_TYPES.add(ViewArea_1303005);
			KNOWN_ELEMENT_TYPES.add(ViewInheritance_1304001);
			KNOWN_ELEMENT_TYPES.add(TabPagesInheritance_1304002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ViewsEditPart.VISUAL_ID:
			return Views_1301000;
		case PopupCanvasEditPart.VISUAL_ID:
			return PopupCanvas_1302009;
		case CanvasEditPart.VISUAL_ID:
			return Canvas_1302003;
		case TabPageEditPart.VISUAL_ID:
			return TabPage_1302002;
		case WindowEditPart.VISUAL_ID:
			return Window_1302007;
		case TabCanvasEditPart.VISUAL_ID:
			return TabCanvas_1302008;
		case ViewPortEditPart.VISUAL_ID:
			return ViewPort_1303004;
		case ViewPortTriggerEditPart.VISUAL_ID:
			return ViewPortTrigger_1303002;
		case ViewAreaEditPart.VISUAL_ID:
			return ViewArea_1303005;
		case ViewInheritanceEditPart.VISUAL_ID:
			return ViewInheritance_1304001;
		case TabPagesInheritanceEditPart.VISUAL_ID:
			return TabPagesInheritance_1304002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return frmview.diagram.providers.DomainElementTypes.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return frmview.diagram.providers.DomainElementTypes.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return frmview.diagram.providers.DomainElementTypes.getElement(elementTypeAdapter);
		}
	};

}
