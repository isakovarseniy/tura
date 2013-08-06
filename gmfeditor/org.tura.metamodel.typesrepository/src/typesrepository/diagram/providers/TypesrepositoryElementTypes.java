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
import typesrepository.diagram.edit.parts.BusinessPackageEditPart;
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
	public static final IElementType TypesRepository_201000 = getElementType("org.tura.metamodel.typesrepository.TypesRepository_201000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Types_202001 = getElementType("org.tura.metamodel.typesrepository.Types_202001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Primitive_203003 = getElementType("org.tura.metamodel.typesrepository.Primitive_203003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Package_203001 = getElementType("org.tura.metamodel.typesrepository.Package_203001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BusinessPackage_203002 = getElementType("org.tura.metamodel.typesrepository.BusinessPackage_203002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_204001 = getElementType("org.tura.metamodel.typesrepository.TypeExtension_204001"); //$NON-NLS-1$

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

			elements.put(TypesRepository_201000,
					TypesrepositoryPackage.eINSTANCE.getTypesRepository());

			elements.put(Types_202001,
					TypesrepositoryPackage.eINSTANCE.getTypes());

			elements.put(Primitive_203003,
					TypesrepositoryPackage.eINSTANCE.getPrimitive());

			elements.put(Package_203001,
					TypesrepositoryPackage.eINSTANCE.getPackage());

			elements.put(BusinessPackage_203002,
					TypesrepositoryPackage.eINSTANCE.getBusinessPackage());

			elements.put(TypeExtension_204001,
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
			KNOWN_ELEMENT_TYPES.add(TypesRepository_201000);
			KNOWN_ELEMENT_TYPES.add(Types_202001);
			KNOWN_ELEMENT_TYPES.add(Primitive_203003);
			KNOWN_ELEMENT_TYPES.add(Package_203001);
			KNOWN_ELEMENT_TYPES.add(BusinessPackage_203002);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_204001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TypesRepositoryEditPart.VISUAL_ID:
			return TypesRepository_201000;
		case TypesEditPart.VISUAL_ID:
			return Types_202001;
		case PrimitiveEditPart.VISUAL_ID:
			return Primitive_203003;
		case PackageEditPart.VISUAL_ID:
			return Package_203001;
		case BusinessPackageEditPart.VISUAL_ID:
			return BusinessPackage_203002;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_204001;
		}
		return null;
	}

}