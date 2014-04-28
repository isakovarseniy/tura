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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import domain.DomainPackage;
import frmview.diagram.edit.parts.CanvasEditPart;
import frmview.diagram.edit.parts.TabCanvasEditPart;
import frmview.diagram.edit.parts.TabPageEditPart;
import frmview.diagram.edit.parts.TabPagesInheritanceEditPart;
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
	private static ImageRegistry imageRegistry;

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
	public static final IElementType ViewPort_1303003 = getElementType("org.tura.metamodel.diagram.frmview.ViewPort_1303003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewPortTrigger_1303002 = getElementType("org.tura.metamodel.diagram.frmview.ViewPortTrigger_1303002"); //$NON-NLS-1$
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
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return DomainDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
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

			elements.put(Canvas_1302003, DomainPackage.eINSTANCE.getCanvas());

			elements.put(Window_1302007, DomainPackage.eINSTANCE.getWindow());

			elements.put(TabPage_1302002, DomainPackage.eINSTANCE.getTabPage());

			elements.put(TabCanvas_1302008,
					DomainPackage.eINSTANCE.getTabCanvas());

			elements.put(ViewPort_1303003,
					DomainPackage.eINSTANCE.getViewPort());

			elements.put(ViewPortTrigger_1303002,
					DomainPackage.eINSTANCE.getViewPortTrigger());

			elements.put(ViewInheritance_1304001,
					DomainPackage.eINSTANCE.getViewInheritance());

			elements.put(TabPagesInheritance_1304002,
					DomainPackage.eINSTANCE.getTabPagesInheritance());
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
			KNOWN_ELEMENT_TYPES.add(Canvas_1302003);
			KNOWN_ELEMENT_TYPES.add(Window_1302007);
			KNOWN_ELEMENT_TYPES.add(TabPage_1302002);
			KNOWN_ELEMENT_TYPES.add(TabCanvas_1302008);
			KNOWN_ELEMENT_TYPES.add(ViewPort_1303003);
			KNOWN_ELEMENT_TYPES.add(ViewPortTrigger_1303002);
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
		case CanvasEditPart.VISUAL_ID:
			return Canvas_1302003;
		case WindowEditPart.VISUAL_ID:
			return Window_1302007;
		case TabPageEditPart.VISUAL_ID:
			return TabPage_1302002;
		case TabCanvasEditPart.VISUAL_ID:
			return TabCanvas_1302008;
		case ViewPortEditPart.VISUAL_ID:
			return ViewPort_1303003;
		case ViewPortTriggerEditPart.VISUAL_ID:
			return ViewPortTrigger_1303002;
		case ViewInheritanceEditPart.VISUAL_ID:
			return ViewInheritance_1304001;
		case TabPagesInheritanceEditPart.VISUAL_ID:
			return TabPagesInheritance_1304002;
		}
		return null;
	}

}