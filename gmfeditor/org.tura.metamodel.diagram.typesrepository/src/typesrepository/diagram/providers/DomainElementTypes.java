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

import typesrepository.diagram.edit.parts.BusinessPackageEditPart;
import typesrepository.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import typesrepository.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import typesrepository.diagram.edit.parts.PackageEditPart;
import typesrepository.diagram.edit.parts.PrimitiveEditPart;
import typesrepository.diagram.edit.parts.RecipeInfrastructuresEditPart;
import typesrepository.diagram.edit.parts.TypeExtensionEditPart;
import typesrepository.diagram.edit.parts.TypesEditPart;
import typesrepository.diagram.edit.parts.TypesRepositoryEditPart;
import typesrepository.diagram.part.DomainDiagramEditorPlugin;
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
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType TypesRepository_201000 = getElementType("org.tura.metamodel.diagram.typesrepository.TypesRepository_201000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Types_202001 = getElementType("org.tura.metamodel.diagram.typesrepository.Types_202001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Primitive_203001 = getElementType("org.tura.metamodel.diagram.typesrepository.Primitive_203001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_203002 = getElementType("org.tura.metamodel.diagram.typesrepository.Package_203002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BusinessPackage_203003 = getElementType("org.tura.metamodel.diagram.typesrepository.BusinessPackage_203003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_204001 = getElementType("org.tura.metamodel.diagram.typesrepository.TypeExtension_204001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureRecipeConfig_204004 = getElementType("org.tura.metamodel.diagram.typesrepository.InfrastructureRecipeConfig_204004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeInfrastructures_204005 = getElementType("org.tura.metamodel.diagram.typesrepository.RecipeInfrastructures_204005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_204003 = getElementType("org.tura.metamodel.diagram.typesrepository.ConfigurationConfigExtension_204003"); //$NON-NLS-1$

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

			elements.put(TypesRepository_201000,
					DomainPackage.eINSTANCE.getTypesRepository());

			elements.put(Types_202001, DomainPackage.eINSTANCE.getTypes());

			elements.put(Primitive_203001,
					DomainPackage.eINSTANCE.getPrimitive());

			elements.put(Package_203002, DomainPackage.eINSTANCE.getPackage());

			elements.put(BusinessPackage_203003,
					DomainPackage.eINSTANCE.getBusinessPackage());

			elements.put(TypeExtension_204001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(RecipeInfrastructures_204005,
					DomainPackage.eINSTANCE.getRecipe_Infrastructures());

			elements.put(InfrastructureRecipeConfig_204004,
					DomainPackage.eINSTANCE.getInfrastructure_RecipeConfig());

			elements.put(ConfigurationConfigExtension_204003,
					DomainPackage.eINSTANCE.getConfiguration_ConfigExtension());
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
			KNOWN_ELEMENT_TYPES.add(Primitive_203001);
			KNOWN_ELEMENT_TYPES.add(Package_203002);
			KNOWN_ELEMENT_TYPES.add(BusinessPackage_203003);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_204001);
			KNOWN_ELEMENT_TYPES.add(RecipeInfrastructures_204005);
			KNOWN_ELEMENT_TYPES.add(InfrastructureRecipeConfig_204004);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_204003);
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
			return Primitive_203001;
		case PackageEditPart.VISUAL_ID:
			return Package_203002;
		case BusinessPackageEditPart.VISUAL_ID:
			return BusinessPackage_203003;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_204001;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return RecipeInfrastructures_204005;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return InfrastructureRecipeConfig_204004;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_204003;
		}
		return null;
	}

}
