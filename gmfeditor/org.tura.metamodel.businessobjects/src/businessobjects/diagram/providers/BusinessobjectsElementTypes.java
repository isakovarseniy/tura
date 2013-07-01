/*
 * 
 */
package businessobjects.diagram.providers;

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

import typedefinition.TypedefinitionPackage;
import businessobjects.BusinessobjectsPackage;
import businessobjects.diagram.edit.parts.BusinessMethod2EditPart;
import businessobjects.diagram.edit.parts.BusinessMethod3EditPart;
import businessobjects.diagram.edit.parts.BusinessMethod4EditPart;
import businessobjects.diagram.edit.parts.BusinessMethod5EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.edit.parts.TypeExtensionEditPart;
import businessobjects.diagram.part.BusinessobjectsDiagramEditorPlugin;

/**
 * @generated
 */
public class BusinessobjectsElementTypes {

	/**
	 * @generated
	 */
	private BusinessobjectsElementTypes() {
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
	public static final IElementType BusinessObjects_1000 = getElementType("org.tura.metamodel.businessobjects.BusinessObjects_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusinessObject_2003 = getElementType("org.tura.metamodel.businessobjects.BusinessObject_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusinessMethod_3003 = getElementType("org.tura.metamodel.businessobjects.BusinessMethod_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusinessMethod_3004 = getElementType("org.tura.metamodel.businessobjects.BusinessMethod_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusinessMethod_3005 = getElementType("org.tura.metamodel.businessobjects.BusinessMethod_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusinessMethod_3006 = getElementType("org.tura.metamodel.businessobjects.BusinessMethod_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusinessMethod_3007 = getElementType("org.tura.metamodel.businessobjects.BusinessMethod_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_4001 = getElementType("org.tura.metamodel.businessobjects.TypeExtension_4001"); //$NON-NLS-1$

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
				return BusinessobjectsDiagramEditorPlugin.getInstance()
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

			elements.put(BusinessObjects_1000,
					BusinessobjectsPackage.eINSTANCE.getBusinessObjects());

			elements.put(BusinessObject_2003,
					BusinessobjectsPackage.eINSTANCE.getBusinessObject());

			elements.put(BusinessMethod_3003,
					BusinessobjectsPackage.eINSTANCE.getBusinessMethod());

			elements.put(BusinessMethod_3004,
					BusinessobjectsPackage.eINSTANCE.getBusinessMethod());

			elements.put(BusinessMethod_3005,
					BusinessobjectsPackage.eINSTANCE.getBusinessMethod());

			elements.put(BusinessMethod_3006,
					BusinessobjectsPackage.eINSTANCE.getBusinessMethod());

			elements.put(BusinessMethod_3007,
					BusinessobjectsPackage.eINSTANCE.getBusinessMethod());

			elements.put(TypeExtension_4001,
					TypedefinitionPackage.eINSTANCE.getTypeExtension());
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
			KNOWN_ELEMENT_TYPES.add(BusinessObjects_1000);
			KNOWN_ELEMENT_TYPES.add(BusinessObject_2003);
			KNOWN_ELEMENT_TYPES.add(BusinessMethod_3003);
			KNOWN_ELEMENT_TYPES.add(BusinessMethod_3004);
			KNOWN_ELEMENT_TYPES.add(BusinessMethod_3005);
			KNOWN_ELEMENT_TYPES.add(BusinessMethod_3006);
			KNOWN_ELEMENT_TYPES.add(BusinessMethod_3007);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case BusinessObjectsEditPart.VISUAL_ID:
			return BusinessObjects_1000;
		case BusinessObjectEditPart.VISUAL_ID:
			return BusinessObject_2003;
		case BusinessMethodEditPart.VISUAL_ID:
			return BusinessMethod_3003;
		case BusinessMethod2EditPart.VISUAL_ID:
			return BusinessMethod_3004;
		case BusinessMethod3EditPart.VISUAL_ID:
			return BusinessMethod_3005;
		case BusinessMethod4EditPart.VISUAL_ID:
			return BusinessMethod_3006;
		case BusinessMethod5EditPart.VISUAL_ID:
			return BusinessMethod_3007;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_4001;
		}
		return null;
	}

}
