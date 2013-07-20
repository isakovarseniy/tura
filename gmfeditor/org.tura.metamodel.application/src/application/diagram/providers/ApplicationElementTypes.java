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

import recipe.RecipePackage;
import typedefinition.TypedefinitionPackage;
import application.ApplicationPackage;
import application.diagram.edit.parts.ApplicationEditPart;
import application.diagram.edit.parts.ApplicationMapperEditPart;
import application.diagram.edit.parts.ApplicationMappersEditPart;
import application.diagram.edit.parts.ApplicationRecipeEditPart;
import application.diagram.edit.parts.ApplicationRecipesEditPart;
import application.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import application.diagram.edit.parts.RecipeRecipeConfigEditPart;
import application.diagram.edit.parts.TypeExtensionEditPart;
import application.diagram.part.ApplicationDiagramEditorPlugin;

/**
 * @generated
 */
public class ApplicationElementTypes {

	/**
	 * @generated
	 */
	private ApplicationElementTypes() {
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
	public static final IElementType Application_1000 = getElementType("org.tura.metamodel.application.Application_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationRecipes_2001 = getElementType("org.tura.metamodel.application.ApplicationRecipes_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationMappers_2002 = getElementType("org.tura.metamodel.application.ApplicationMappers_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationRecipe_3001 = getElementType("org.tura.metamodel.application.ApplicationRecipe_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ApplicationMapper_3002 = getElementType("org.tura.metamodel.application.ApplicationMapper_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_4001 = getElementType("org.tura.metamodel.application.TypeExtension_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeRecipeConfig_4002 = getElementType("org.tura.metamodel.application.RecipeRecipeConfig_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_4003 = getElementType("org.tura.metamodel.application.ConfigurationConfigExtension_4003"); //$NON-NLS-1$

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
				return ApplicationDiagramEditorPlugin.getInstance()
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

			elements.put(Application_1000,
					ApplicationPackage.eINSTANCE.getApplication());

			elements.put(ApplicationRecipes_2001,
					ApplicationPackage.eINSTANCE.getApplicationRecipes());

			elements.put(ApplicationMappers_2002,
					ApplicationPackage.eINSTANCE.getApplicationMappers());

			elements.put(ApplicationRecipe_3001,
					ApplicationPackage.eINSTANCE.getApplicationRecipe());

			elements.put(ApplicationMapper_3002,
					ApplicationPackage.eINSTANCE.getApplicationMapper());

			elements.put(TypeExtension_4001,
					TypedefinitionPackage.eINSTANCE.getTypeExtension());

			elements.put(RecipeRecipeConfig_4002,
					RecipePackage.eINSTANCE.getRecipe_RecipeConfig());

			elements.put(ConfigurationConfigExtension_4003,
					RecipePackage.eINSTANCE.getConfiguration_ConfigExtension());
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
			KNOWN_ELEMENT_TYPES.add(Application_1000);
			KNOWN_ELEMENT_TYPES.add(ApplicationRecipes_2001);
			KNOWN_ELEMENT_TYPES.add(ApplicationMappers_2002);
			KNOWN_ELEMENT_TYPES.add(ApplicationRecipe_3001);
			KNOWN_ELEMENT_TYPES.add(ApplicationMapper_3002);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_4001);
			KNOWN_ELEMENT_TYPES.add(RecipeRecipeConfig_4002);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ApplicationEditPart.VISUAL_ID:
			return Application_1000;
		case ApplicationRecipesEditPart.VISUAL_ID:
			return ApplicationRecipes_2001;
		case ApplicationMappersEditPart.VISUAL_ID:
			return ApplicationMappers_2002;
		case ApplicationRecipeEditPart.VISUAL_ID:
			return ApplicationRecipe_3001;
		case ApplicationMapperEditPart.VISUAL_ID:
			return ApplicationMapper_3002;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_4001;
		case RecipeRecipeConfigEditPart.VISUAL_ID:
			return RecipeRecipeConfig_4002;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_4003;
		}
		return null;
	}

}
