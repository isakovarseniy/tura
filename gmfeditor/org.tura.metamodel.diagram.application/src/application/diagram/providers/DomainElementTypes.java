/*
 * 
 */
package application.diagram.providers;

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

import application.diagram.edit.parts.ApplicationEditPart;
import application.diagram.edit.parts.ApplicationMapperEditPart;
import application.diagram.edit.parts.ApplicationMappersEditPart;
import application.diagram.edit.parts.ApplicationRecipeEditPart;
import application.diagram.edit.parts.ApplicationRecipesEditPart;
import application.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import application.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import application.diagram.edit.parts.RecipeInfrastructuresEditPart;
import application.diagram.edit.parts.TypeExtensionEditPart;
import application.diagram.part.DomainDiagramEditorPlugin;
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
	public static final IElementType Application_801000 = getElementType("org.tura.metamodel.diagram.application.Application_801000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationRecipes_802001 = getElementType("org.tura.metamodel.diagram.application.ApplicationRecipes_802001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationMappers_802002 = getElementType("org.tura.metamodel.diagram.application.ApplicationMappers_802002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationRecipe_803001 = getElementType("org.tura.metamodel.diagram.application.ApplicationRecipe_803001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationMapper_803002 = getElementType("org.tura.metamodel.diagram.application.ApplicationMapper_803002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_804001 = getElementType("org.tura.metamodel.diagram.application.TypeExtension_804001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureRecipeConfig_804004 = getElementType("org.tura.metamodel.diagram.application.InfrastructureRecipeConfig_804004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeInfrastructures_804005 = getElementType("org.tura.metamodel.diagram.application.RecipeInfrastructures_804005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_804003 = getElementType("org.tura.metamodel.diagram.application.ConfigurationConfigExtension_804003"); //$NON-NLS-1$

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

			elements.put(Application_801000,
					DomainPackage.eINSTANCE.getApplication());

			elements.put(ApplicationRecipes_802001,
					DomainPackage.eINSTANCE.getApplicationRecipes());

			elements.put(ApplicationMappers_802002,
					DomainPackage.eINSTANCE.getApplicationMappers());

			elements.put(ApplicationRecipe_803001,
					DomainPackage.eINSTANCE.getApplicationRecipe());

			elements.put(ApplicationMapper_803002,
					DomainPackage.eINSTANCE.getApplicationMapper());

			elements.put(TypeExtension_804001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(RecipeInfrastructures_804005,
					DomainPackage.eINSTANCE.getRecipe_Infrastructures());

			elements.put(InfrastructureRecipeConfig_804004,
					DomainPackage.eINSTANCE.getInfrastructure_RecipeConfig());

			elements.put(ConfigurationConfigExtension_804003,
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
			KNOWN_ELEMENT_TYPES.add(Application_801000);
			KNOWN_ELEMENT_TYPES.add(ApplicationRecipes_802001);
			KNOWN_ELEMENT_TYPES.add(ApplicationMappers_802002);
			KNOWN_ELEMENT_TYPES.add(ApplicationRecipe_803001);
			KNOWN_ELEMENT_TYPES.add(ApplicationMapper_803002);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_804001);
			KNOWN_ELEMENT_TYPES.add(RecipeInfrastructures_804005);
			KNOWN_ELEMENT_TYPES.add(InfrastructureRecipeConfig_804004);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_804003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ApplicationEditPart.VISUAL_ID:
			return Application_801000;
		case ApplicationRecipesEditPart.VISUAL_ID:
			return ApplicationRecipes_802001;
		case ApplicationMappersEditPart.VISUAL_ID:
			return ApplicationMappers_802002;
		case ApplicationRecipeEditPart.VISUAL_ID:
			return ApplicationRecipe_803001;
		case ApplicationMapperEditPart.VISUAL_ID:
			return ApplicationMapper_803002;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_804001;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return RecipeInfrastructures_804005;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return InfrastructureRecipeConfig_804004;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_804003;
		}
		return null;
	}

}
