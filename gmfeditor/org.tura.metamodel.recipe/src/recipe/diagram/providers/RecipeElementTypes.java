/*
 * 
 */
package recipe.diagram.providers;

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
import recipe.diagram.edit.parts.Component2EditPart;
import recipe.diagram.edit.parts.ComponentEditPart;
import recipe.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import recipe.diagram.edit.parts.ConfigurationEditPart;
import recipe.diagram.edit.parts.ModelMapperEditPart;
import recipe.diagram.edit.parts.PropertyEditPart;
import recipe.diagram.edit.parts.RecipeEditPart;
import recipe.diagram.edit.parts.RecipeRecipeConfigEditPart;
import recipe.diagram.edit.parts.RecipesEditPart;
import recipe.diagram.part.RecipeDiagramEditorPlugin;

/**
 * @generated
 */
public class RecipeElementTypes {

	/**
	 * @generated
	 */
	private RecipeElementTypes() {
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
	public static final IElementType Recipes_1000 = getElementType("org.tura.metamodel.recipe.Recipes_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Recipe_2004 = getElementType("org.tura.metamodel.recipe.Recipe_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Configuration_2005 = getElementType("org.tura.metamodel.recipe.Configuration_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Component_3004 = getElementType("org.tura.metamodel.recipe.Component_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Component_3002 = getElementType("org.tura.metamodel.recipe.Component_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ModelMapper_3003 = getElementType("org.tura.metamodel.recipe.ModelMapper_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_3005 = getElementType("org.tura.metamodel.recipe.Property_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RecipeRecipeConfig_4001 = getElementType("org.tura.metamodel.recipe.RecipeRecipeConfig_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_4002 = getElementType("org.tura.metamodel.recipe.ConfigurationConfigExtension_4002"); //$NON-NLS-1$

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
				return RecipeDiagramEditorPlugin.getInstance()
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

			elements.put(Recipes_1000, RecipePackage.eINSTANCE.getRecipes());

			elements.put(Recipe_2004, RecipePackage.eINSTANCE.getRecipe());

			elements.put(Configuration_2005,
					RecipePackage.eINSTANCE.getConfiguration());

			elements.put(Component_3004, RecipePackage.eINSTANCE.getComponent());

			elements.put(Component_3002, RecipePackage.eINSTANCE.getComponent());

			elements.put(ModelMapper_3003,
					RecipePackage.eINSTANCE.getModelMapper());

			elements.put(Property_3005, RecipePackage.eINSTANCE.getProperty());

			elements.put(RecipeRecipeConfig_4001,
					RecipePackage.eINSTANCE.getRecipe_RecipeConfig());

			elements.put(ConfigurationConfigExtension_4002,
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
			KNOWN_ELEMENT_TYPES.add(Recipes_1000);
			KNOWN_ELEMENT_TYPES.add(Recipe_2004);
			KNOWN_ELEMENT_TYPES.add(Configuration_2005);
			KNOWN_ELEMENT_TYPES.add(Component_3004);
			KNOWN_ELEMENT_TYPES.add(Component_3002);
			KNOWN_ELEMENT_TYPES.add(ModelMapper_3003);
			KNOWN_ELEMENT_TYPES.add(Property_3005);
			KNOWN_ELEMENT_TYPES.add(RecipeRecipeConfig_4001);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RecipesEditPart.VISUAL_ID:
			return Recipes_1000;
		case RecipeEditPart.VISUAL_ID:
			return Recipe_2004;
		case ConfigurationEditPart.VISUAL_ID:
			return Configuration_2005;
		case ComponentEditPart.VISUAL_ID:
			return Component_3004;
		case Component2EditPart.VISUAL_ID:
			return Component_3002;
		case ModelMapperEditPart.VISUAL_ID:
			return ModelMapper_3003;
		case PropertyEditPart.VISUAL_ID:
			return Property_3005;
		case RecipeRecipeConfigEditPart.VISUAL_ID:
			return RecipeRecipeConfig_4001;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_4002;
		}
		return null;
	}

}
