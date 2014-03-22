/*
 * 
 */
package mapper.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import mapper.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import mapper.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import mapper.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import mapper.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import mapper.diagram.edit.parts.JavaMapperEditPart;
import mapper.diagram.edit.parts.MappersEditPart;
import mapper.diagram.edit.parts.RecipeDeloymentEditPart;
import mapper.diagram.edit.parts.RecipeInfrastructuresEditPart;
import mapper.diagram.edit.parts.RelationEditPart;
import mapper.diagram.edit.parts.TypeExtensionEditPart;
import mapper.diagram.part.DomainDiagramEditorPlugin;

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
	public static final IElementType Mappers_401000 = getElementType("org.tura.metamodel.diagram.mapper.Mappers_401000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JavaMapper_402001 = getElementType("org.tura.metamodel.diagram.mapper.JavaMapper_402001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_404001 = getElementType("org.tura.metamodel.diagram.mapper.TypeExtension_404001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_404011 = getElementType("org.tura.metamodel.diagram.mapper.Relation_404011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponentDeplymentComponent_404007 = getElementType("org.tura.metamodel.diagram.mapper.DeploymentComponentDeplymentComponent_404007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStepFirstStep_404009 = getElementType("org.tura.metamodel.diagram.mapper.DeploymentStarStepFirstStep_404009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeInfrastructures_404005 = getElementType("org.tura.metamodel.diagram.mapper.RecipeInfrastructures_404005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeDeloyment_404006 = getElementType("org.tura.metamodel.diagram.mapper.RecipeDeloyment_404006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureRecipeConfig_404004 = getElementType("org.tura.metamodel.diagram.mapper.InfrastructureRecipeConfig_404004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_404003 = getElementType("org.tura.metamodel.diagram.mapper.ConfigurationConfigExtension_404003"); //$NON-NLS-1$

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

			elements.put(Mappers_401000, DomainPackage.eINSTANCE.getMappers());

			elements.put(JavaMapper_402001,
					DomainPackage.eINSTANCE.getJavaMapper());

			elements.put(TypeExtension_404001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(Relation_404011, DomainPackage.eINSTANCE.getRelation());

			elements.put(DeploymentComponentDeplymentComponent_404007,
					DomainPackage.eINSTANCE
							.getDeploymentComponent_DeplymentComponent());

			elements.put(DeploymentStarStepFirstStep_404009,
					DomainPackage.eINSTANCE.getDeploymentStarStep_FirstStep());

			elements.put(RecipeInfrastructures_404005,
					DomainPackage.eINSTANCE.getRecipe_Infrastructures());

			elements.put(RecipeDeloyment_404006,
					DomainPackage.eINSTANCE.getRecipe_Deloyment());

			elements.put(InfrastructureRecipeConfig_404004,
					DomainPackage.eINSTANCE.getInfrastructure_RecipeConfig());

			elements.put(ConfigurationConfigExtension_404003,
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
			KNOWN_ELEMENT_TYPES.add(Mappers_401000);
			KNOWN_ELEMENT_TYPES.add(JavaMapper_402001);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_404001);
			KNOWN_ELEMENT_TYPES.add(Relation_404011);
			KNOWN_ELEMENT_TYPES
					.add(DeploymentComponentDeplymentComponent_404007);
			KNOWN_ELEMENT_TYPES.add(DeploymentStarStepFirstStep_404009);
			KNOWN_ELEMENT_TYPES.add(RecipeInfrastructures_404005);
			KNOWN_ELEMENT_TYPES.add(RecipeDeloyment_404006);
			KNOWN_ELEMENT_TYPES.add(InfrastructureRecipeConfig_404004);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_404003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MappersEditPart.VISUAL_ID:
			return Mappers_401000;
		case JavaMapperEditPart.VISUAL_ID:
			return JavaMapper_402001;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_404001;
		case RelationEditPart.VISUAL_ID:
			return Relation_404011;
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			return DeploymentComponentDeplymentComponent_404007;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return DeploymentStarStepFirstStep_404009;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return RecipeInfrastructures_404005;
		case RecipeDeloymentEditPart.VISUAL_ID:
			return RecipeDeloyment_404006;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return InfrastructureRecipeConfig_404004;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_404003;
		}
		return null;
	}

}
