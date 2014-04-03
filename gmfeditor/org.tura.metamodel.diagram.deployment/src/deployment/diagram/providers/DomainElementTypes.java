/*
 * 
 */
package deployment.diagram.providers;

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

import deployment.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import deployment.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import deployment.diagram.edit.parts.DeploymentComponentEditPart;
import deployment.diagram.edit.parts.DeploymentComponentsEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import deployment.diagram.edit.parts.InfrastructureConnectionEditPart;
import deployment.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import deployment.diagram.edit.parts.RecipeDeloymentEditPart;
import deployment.diagram.edit.parts.RecipeInfrastructuresEditPart;
import deployment.diagram.edit.parts.RelationEditPart;
import deployment.diagram.edit.parts.TypeExtensionEditPart;
import deployment.diagram.part.DomainDiagramEditorPlugin;
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
	public static final IElementType DeploymentComponents_901000 = getElementType("org.tura.metamodel.diagram.deployment.DeploymentComponents_901000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponent_902001 = getElementType("org.tura.metamodel.diagram.deployment.DeploymentComponent_902001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStep_902002 = getElementType("org.tura.metamodel.diagram.deployment.DeploymentStarStep_902002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_904001 = getElementType("org.tura.metamodel.diagram.deployment.TypeExtension_904001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_904010 = getElementType("org.tura.metamodel.diagram.deployment.Relation_904010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureConnection_904011 = getElementType("org.tura.metamodel.diagram.deployment.InfrastructureConnection_904011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponentDeplymentComponent_904002 = getElementType("org.tura.metamodel.diagram.deployment.DeploymentComponentDeplymentComponent_904002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStepFirstStep_904008 = getElementType("org.tura.metamodel.diagram.deployment.DeploymentStarStepFirstStep_904008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeInfrastructures_904004 = getElementType("org.tura.metamodel.diagram.deployment.RecipeInfrastructures_904004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeDeloyment_904005 = getElementType("org.tura.metamodel.diagram.deployment.RecipeDeloyment_904005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureRecipeConfig_904006 = getElementType("org.tura.metamodel.diagram.deployment.InfrastructureRecipeConfig_904006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_904007 = getElementType("org.tura.metamodel.diagram.deployment.ConfigurationConfigExtension_904007"); //$NON-NLS-1$

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

			elements.put(DeploymentComponents_901000,
					DomainPackage.eINSTANCE.getDeploymentComponents());

			elements.put(DeploymentComponent_902001,
					DomainPackage.eINSTANCE.getDeploymentComponent());

			elements.put(DeploymentStarStep_902002,
					DomainPackage.eINSTANCE.getDeploymentStarStep());

			elements.put(TypeExtension_904001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(Relation_904010, DomainPackage.eINSTANCE.getRelation());

			elements.put(InfrastructureConnection_904011,
					DomainPackage.eINSTANCE.getInfrastructureConnection());

			elements.put(DeploymentComponentDeplymentComponent_904002,
					DomainPackage.eINSTANCE
							.getDeploymentComponent_DeplymentComponent());

			elements.put(DeploymentStarStepFirstStep_904008,
					DomainPackage.eINSTANCE.getDeploymentStarStep_FirstStep());

			elements.put(RecipeInfrastructures_904004,
					DomainPackage.eINSTANCE.getRecipe_Infrastructures());

			elements.put(RecipeDeloyment_904005,
					DomainPackage.eINSTANCE.getRecipe_Deloyment());

			elements.put(InfrastructureRecipeConfig_904006,
					DomainPackage.eINSTANCE.getInfrastructure_RecipeConfig());

			elements.put(ConfigurationConfigExtension_904007,
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
			KNOWN_ELEMENT_TYPES.add(DeploymentComponents_901000);
			KNOWN_ELEMENT_TYPES.add(DeploymentComponent_902001);
			KNOWN_ELEMENT_TYPES.add(DeploymentStarStep_902002);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_904001);
			KNOWN_ELEMENT_TYPES.add(Relation_904010);
			KNOWN_ELEMENT_TYPES.add(InfrastructureConnection_904011);
			KNOWN_ELEMENT_TYPES
					.add(DeploymentComponentDeplymentComponent_904002);
			KNOWN_ELEMENT_TYPES.add(DeploymentStarStepFirstStep_904008);
			KNOWN_ELEMENT_TYPES.add(RecipeInfrastructures_904004);
			KNOWN_ELEMENT_TYPES.add(RecipeDeloyment_904005);
			KNOWN_ELEMENT_TYPES.add(InfrastructureRecipeConfig_904006);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_904007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DeploymentComponentsEditPart.VISUAL_ID:
			return DeploymentComponents_901000;
		case DeploymentComponentEditPart.VISUAL_ID:
			return DeploymentComponent_902001;
		case DeploymentStarStepEditPart.VISUAL_ID:
			return DeploymentStarStep_902002;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_904001;
		case RelationEditPart.VISUAL_ID:
			return Relation_904010;
		case InfrastructureConnectionEditPart.VISUAL_ID:
			return InfrastructureConnection_904011;
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			return DeploymentComponentDeplymentComponent_904002;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return DeploymentStarStepFirstStep_904008;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return RecipeInfrastructures_904004;
		case RecipeDeloymentEditPart.VISUAL_ID:
			return RecipeDeloyment_904005;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return InfrastructureRecipeConfig_904006;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_904007;
		}
		return null;
	}

}
