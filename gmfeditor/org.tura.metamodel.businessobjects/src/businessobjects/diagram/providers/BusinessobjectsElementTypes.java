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
import businessobjects.diagram.edit.parts.BusinessObjectEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.edit.parts.CreateMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodEditPart;
import businessobjects.diagram.edit.parts.TypeExtensionEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodEditPart;
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
	public static final IElementType BusinessObjects_601000 = getElementType("org.tura.metamodel.businessobjects.BusinessObjects_601000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BusinessObject_602003 = getElementType("org.tura.metamodel.businessobjects.BusinessObject_602003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CreateMethod_603009 = getElementType("org.tura.metamodel.businessobjects.CreateMethod_603009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InsertMethod_603010 = getElementType("org.tura.metamodel.businessobjects.InsertMethod_603010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UpdateMethod_603011 = getElementType("org.tura.metamodel.businessobjects.UpdateMethod_603011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RemoveMethod_603012 = getElementType("org.tura.metamodel.businessobjects.RemoveMethod_603012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SearchMethod_603013 = getElementType("org.tura.metamodel.businessobjects.SearchMethod_603013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OtherMethod_603014 = getElementType("org.tura.metamodel.businessobjects.OtherMethod_603014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_604001 = getElementType("org.tura.metamodel.businessobjects.TypeExtension_604001"); //$NON-NLS-1$

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

			elements.put(BusinessObjects_601000,
					BusinessobjectsPackage.eINSTANCE.getBusinessObjects());

			elements.put(BusinessObject_602003,
					BusinessobjectsPackage.eINSTANCE.getBusinessObject());

			elements.put(CreateMethod_603009,
					BusinessobjectsPackage.eINSTANCE.getCreateMethod());

			elements.put(InsertMethod_603010,
					BusinessobjectsPackage.eINSTANCE.getInsertMethod());

			elements.put(UpdateMethod_603011,
					BusinessobjectsPackage.eINSTANCE.getUpdateMethod());

			elements.put(RemoveMethod_603012,
					BusinessobjectsPackage.eINSTANCE.getRemoveMethod());

			elements.put(SearchMethod_603013,
					BusinessobjectsPackage.eINSTANCE.getSearchMethod());

			elements.put(OtherMethod_603014,
					BusinessobjectsPackage.eINSTANCE.getOtherMethod());

			elements.put(TypeExtension_604001,
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
			KNOWN_ELEMENT_TYPES.add(BusinessObjects_601000);
			KNOWN_ELEMENT_TYPES.add(BusinessObject_602003);
			KNOWN_ELEMENT_TYPES.add(CreateMethod_603009);
			KNOWN_ELEMENT_TYPES.add(InsertMethod_603010);
			KNOWN_ELEMENT_TYPES.add(UpdateMethod_603011);
			KNOWN_ELEMENT_TYPES.add(RemoveMethod_603012);
			KNOWN_ELEMENT_TYPES.add(SearchMethod_603013);
			KNOWN_ELEMENT_TYPES.add(OtherMethod_603014);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_604001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case BusinessObjectsEditPart.VISUAL_ID:
			return BusinessObjects_601000;
		case BusinessObjectEditPart.VISUAL_ID:
			return BusinessObject_602003;
		case CreateMethodEditPart.VISUAL_ID:
			return CreateMethod_603009;
		case InsertMethodEditPart.VISUAL_ID:
			return InsertMethod_603010;
		case UpdateMethodEditPart.VISUAL_ID:
			return UpdateMethod_603011;
		case RemoveMethodEditPart.VISUAL_ID:
			return RemoveMethod_603012;
		case SearchMethodEditPart.VISUAL_ID:
			return SearchMethod_603013;
		case OtherMethodEditPart.VISUAL_ID:
			return OtherMethod_603014;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_604001;
		}
		return null;
	}

}
