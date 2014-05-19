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
import application.diagram.edit.parts.ApplicationInfrastructureLayerEditPart;
import application.diagram.edit.parts.ApplicationMapperEditPart;
import application.diagram.edit.parts.ApplicationMappersEditPart;
import application.diagram.edit.parts.ApplicationMessagesEditPart;
import application.diagram.edit.parts.ApplicationRecipeEditPart;
import application.diagram.edit.parts.ApplicationRecipesEditPart;
import application.diagram.edit.parts.ApplicationRoleEditPart;
import application.diagram.edit.parts.ApplicationStyleEditPart;
import application.diagram.edit.parts.ApplicationUILayerEditPart;
import application.diagram.edit.parts.ApplicationUIPackageEditPart;
import application.diagram.edit.parts.StylesPackageEditPart;
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
	public static final IElementType ApplicationUILayer_802003 = getElementType("org.tura.metamodel.diagram.application.ApplicationUILayer_802003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationInfrastructureLayer_802004 = getElementType("org.tura.metamodel.diagram.application.ApplicationInfrastructureLayer_802004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationStyle_802005 = getElementType("org.tura.metamodel.diagram.application.ApplicationStyle_802005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationRole_802006 = getElementType("org.tura.metamodel.diagram.application.ApplicationRole_802006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApplicationMessages_802007 = getElementType("org.tura.metamodel.diagram.application.ApplicationMessages_802007"); //$NON-NLS-1$
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
	public static final IElementType ApplicationUIPackage_803003 = getElementType("org.tura.metamodel.diagram.application.ApplicationUIPackage_803003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StylesPackage_803004 = getElementType("org.tura.metamodel.diagram.application.StylesPackage_803004"); //$NON-NLS-1$

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

			elements.put(ApplicationUILayer_802003,
					DomainPackage.eINSTANCE.getApplicationUILayer());

			elements.put(ApplicationInfrastructureLayer_802004,
					DomainPackage.eINSTANCE.getApplicationInfrastructureLayer());

			elements.put(ApplicationStyle_802005,
					DomainPackage.eINSTANCE.getApplicationStyle());

			elements.put(ApplicationRole_802006,
					DomainPackage.eINSTANCE.getApplicationRole());

			elements.put(ApplicationMessages_802007,
					DomainPackage.eINSTANCE.getApplicationMessages());

			elements.put(ApplicationRecipe_803001,
					DomainPackage.eINSTANCE.getApplicationRecipe());

			elements.put(ApplicationMapper_803002,
					DomainPackage.eINSTANCE.getApplicationMapper());

			elements.put(ApplicationUIPackage_803003,
					DomainPackage.eINSTANCE.getApplicationUIPackage());

			elements.put(StylesPackage_803004,
					DomainPackage.eINSTANCE.getStylesPackage());
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
			KNOWN_ELEMENT_TYPES.add(ApplicationUILayer_802003);
			KNOWN_ELEMENT_TYPES.add(ApplicationInfrastructureLayer_802004);
			KNOWN_ELEMENT_TYPES.add(ApplicationStyle_802005);
			KNOWN_ELEMENT_TYPES.add(ApplicationRole_802006);
			KNOWN_ELEMENT_TYPES.add(ApplicationMessages_802007);
			KNOWN_ELEMENT_TYPES.add(ApplicationRecipe_803001);
			KNOWN_ELEMENT_TYPES.add(ApplicationMapper_803002);
			KNOWN_ELEMENT_TYPES.add(ApplicationUIPackage_803003);
			KNOWN_ELEMENT_TYPES.add(StylesPackage_803004);
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
		case ApplicationUILayerEditPart.VISUAL_ID:
			return ApplicationUILayer_802003;
		case ApplicationInfrastructureLayerEditPart.VISUAL_ID:
			return ApplicationInfrastructureLayer_802004;
		case ApplicationStyleEditPart.VISUAL_ID:
			return ApplicationStyle_802005;
		case ApplicationRoleEditPart.VISUAL_ID:
			return ApplicationRole_802006;
		case ApplicationMessagesEditPart.VISUAL_ID:
			return ApplicationMessages_802007;
		case ApplicationRecipeEditPart.VISUAL_ID:
			return ApplicationRecipe_803001;
		case ApplicationMapperEditPart.VISUAL_ID:
			return ApplicationMapper_803002;
		case ApplicationUIPackageEditPart.VISUAL_ID:
			return ApplicationUIPackage_803003;
		case StylesPackageEditPart.VISUAL_ID:
			return StylesPackage_803004;
		}
		return null;
	}

}
