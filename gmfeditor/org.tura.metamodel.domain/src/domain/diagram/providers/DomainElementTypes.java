/*
 * 
 */
package domain.diagram.providers;

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
import domain.DomainPackage;
import domain.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import domain.diagram.edit.parts.DomainApplicationEditPart;
import domain.diagram.edit.parts.DomainApplicationsEditPart;
import domain.diagram.edit.parts.DomainArtifactsEditPart;
import domain.diagram.edit.parts.DomainEditPart;
import domain.diagram.edit.parts.DomainTypesEditPart;
import domain.diagram.edit.parts.RecipeRecipeConfigEditPart;
import domain.diagram.edit.parts.TypeExtensionEditPart;
import domain.diagram.part.DomainDiagramEditorPlugin;

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
	public static final IElementType Domain_1000 = getElementType("org.tura.metamodel.domain.Domain_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainArtifacts_2007 = getElementType("org.tura.metamodel.domain.DomainArtifacts_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainTypes_2008 = getElementType("org.tura.metamodel.domain.DomainTypes_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainApplications_2009 = getElementType("org.tura.metamodel.domain.DomainApplications_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainApplication_3002 = getElementType("org.tura.metamodel.domain.DomainApplication_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_4001 = getElementType("org.tura.metamodel.domain.TypeExtension_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeRecipeConfig_4002 = getElementType("org.tura.metamodel.domain.RecipeRecipeConfig_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_4003 = getElementType("org.tura.metamodel.domain.ConfigurationConfigExtension_4003"); //$NON-NLS-1$

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

			elements.put(Domain_1000, DomainPackage.eINSTANCE.getDomain());

			elements.put(DomainArtifacts_2007,
					DomainPackage.eINSTANCE.getDomainArtifacts());

			elements.put(DomainTypes_2008,
					DomainPackage.eINSTANCE.getDomainTypes());

			elements.put(DomainApplications_2009,
					DomainPackage.eINSTANCE.getDomainApplications());

			elements.put(DomainApplication_3002,
					DomainPackage.eINSTANCE.getDomainApplication());

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
			KNOWN_ELEMENT_TYPES.add(Domain_1000);
			KNOWN_ELEMENT_TYPES.add(DomainArtifacts_2007);
			KNOWN_ELEMENT_TYPES.add(DomainTypes_2008);
			KNOWN_ELEMENT_TYPES.add(DomainApplications_2009);
			KNOWN_ELEMENT_TYPES.add(DomainApplication_3002);
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
		case DomainEditPart.VISUAL_ID:
			return Domain_1000;
		case DomainArtifactsEditPart.VISUAL_ID:
			return DomainArtifacts_2007;
		case DomainTypesEditPart.VISUAL_ID:
			return DomainTypes_2008;
		case DomainApplicationsEditPart.VISUAL_ID:
			return DomainApplications_2009;
		case DomainApplicationEditPart.VISUAL_ID:
			return DomainApplication_3002;
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
