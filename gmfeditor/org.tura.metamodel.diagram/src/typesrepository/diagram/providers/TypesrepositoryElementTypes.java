/*
 * 
 */
package typesrepository.diagram.providers;

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
import typesrepository.TypesrepositoryPackage;
import typesrepository.diagram.edit.parts.PackageEditPart;
import typesrepository.diagram.edit.parts.PrimitiveEditPart;
import typesrepository.diagram.edit.parts.TypeExtensionEditPart;
import typesrepository.diagram.edit.parts.TypesEditPart;
import typesrepository.diagram.edit.parts.TypesRepositoryEditPart;
import typesrepository.diagram.part.TypesrepositoryDiagramEditorPlugin;

/**
 * @generated
 */
public class TypesrepositoryElementTypes {

	/**
	 * @generated
	 */
	private TypesrepositoryElementTypes() {
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
	public static final IElementType TypesRepository_1000 = getElementType("org.tura.metamodel.diagram.TypesRepository_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Types_2001 = getElementType("org.tura.metamodel.diagram.Types_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_3001 = getElementType("org.tura.metamodel.diagram.Package_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Primitive_3002 = getElementType("org.tura.metamodel.diagram.Primitive_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_4001 = getElementType("org.tura.metamodel.diagram.TypeExtension_4001"); //$NON-NLS-1$

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
				return TypesrepositoryDiagramEditorPlugin.getInstance()
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

			elements.put(TypesRepository_1000,
					TypesrepositoryPackage.eINSTANCE.getTypesRepository());

			elements.put(Types_2001,
					TypesrepositoryPackage.eINSTANCE.getTypes());

			elements.put(Package_3001,
					TypesrepositoryPackage.eINSTANCE.getPackage());

			elements.put(Primitive_3002,
					TypesrepositoryPackage.eINSTANCE.getPrimitive());

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
			KNOWN_ELEMENT_TYPES.add(TypesRepository_1000);
			KNOWN_ELEMENT_TYPES.add(Types_2001);
			KNOWN_ELEMENT_TYPES.add(Package_3001);
			KNOWN_ELEMENT_TYPES.add(Primitive_3002);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TypesRepositoryEditPart.VISUAL_ID:
			return TypesRepository_1000;
		case TypesEditPart.VISUAL_ID:
			return Types_2001;
		case PackageEditPart.VISUAL_ID:
			return Package_3001;
		case PrimitiveEditPart.VISUAL_ID:
			return Primitive_3002;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_4001;
		}
		return null;
	}

}
