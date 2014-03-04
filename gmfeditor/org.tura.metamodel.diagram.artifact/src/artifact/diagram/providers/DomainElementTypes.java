/*
 * 
 */
package artifact.diagram.providers;

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

import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.ConfigVariableEditPart;
import artifact.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import artifact.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import artifact.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import artifact.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import artifact.diagram.edit.parts.ModelQueryEditPart;
import artifact.diagram.edit.parts.RecipeDeloymentEditPart;
import artifact.diagram.edit.parts.RecipeInfrastructuresEditPart;
import artifact.diagram.edit.parts.SpecifierEditPart;
import artifact.diagram.edit.parts.TypeExtensionEditPart;
import artifact.diagram.part.DomainDiagramEditorPlugin;
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
	public static final IElementType Artifacts_701000 = getElementType("org.tura.metamodel.diagram.artifact.Artifacts_701000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Artifact_702001 = getElementType("org.tura.metamodel.diagram.artifact.Artifact_702001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigVariable_703004 = getElementType("org.tura.metamodel.diagram.artifact.ConfigVariable_703004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ModelQuery_703005 = getElementType("org.tura.metamodel.diagram.artifact.ModelQuery_703005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Specifier_703003 = getElementType("org.tura.metamodel.diagram.artifact.Specifier_703003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_704001 = getElementType("org.tura.metamodel.diagram.artifact.TypeExtension_704001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponentDeplymentComponent_704007 = getElementType("org.tura.metamodel.diagram.artifact.DeploymentComponentDeplymentComponent_704007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStepFirstStep_704009 = getElementType("org.tura.metamodel.diagram.artifact.DeploymentStarStepFirstStep_704009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeInfrastructures_704005 = getElementType("org.tura.metamodel.diagram.artifact.RecipeInfrastructures_704005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeDeloyment_704006 = getElementType("org.tura.metamodel.diagram.artifact.RecipeDeloyment_704006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureRecipeConfig_704004 = getElementType("org.tura.metamodel.diagram.artifact.InfrastructureRecipeConfig_704004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_704003 = getElementType("org.tura.metamodel.diagram.artifact.ConfigurationConfigExtension_704003"); //$NON-NLS-1$

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

			elements.put(Artifacts_701000,
					DomainPackage.eINSTANCE.getArtifacts());

			elements.put(Artifact_702001, DomainPackage.eINSTANCE.getArtifact());

			elements.put(ConfigVariable_703004,
					DomainPackage.eINSTANCE.getConfigVariable());

			elements.put(ModelQuery_703005,
					DomainPackage.eINSTANCE.getModelQuery());

			elements.put(Specifier_703003,
					DomainPackage.eINSTANCE.getSpecifier());

			elements.put(TypeExtension_704001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(DeploymentComponentDeplymentComponent_704007,
					DomainPackage.eINSTANCE
							.getDeploymentComponent_DeplymentComponent());

			elements.put(DeploymentStarStepFirstStep_704009,
					DomainPackage.eINSTANCE.getDeploymentStarStep_FirstStep());

			elements.put(RecipeInfrastructures_704005,
					DomainPackage.eINSTANCE.getRecipe_Infrastructures());

			elements.put(RecipeDeloyment_704006,
					DomainPackage.eINSTANCE.getRecipe_Deloyment());

			elements.put(InfrastructureRecipeConfig_704004,
					DomainPackage.eINSTANCE.getInfrastructure_RecipeConfig());

			elements.put(ConfigurationConfigExtension_704003,
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
			KNOWN_ELEMENT_TYPES.add(Artifacts_701000);
			KNOWN_ELEMENT_TYPES.add(Artifact_702001);
			KNOWN_ELEMENT_TYPES.add(ConfigVariable_703004);
			KNOWN_ELEMENT_TYPES.add(ModelQuery_703005);
			KNOWN_ELEMENT_TYPES.add(Specifier_703003);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_704001);
			KNOWN_ELEMENT_TYPES
					.add(DeploymentComponentDeplymentComponent_704007);
			KNOWN_ELEMENT_TYPES.add(DeploymentStarStepFirstStep_704009);
			KNOWN_ELEMENT_TYPES.add(RecipeInfrastructures_704005);
			KNOWN_ELEMENT_TYPES.add(RecipeDeloyment_704006);
			KNOWN_ELEMENT_TYPES.add(InfrastructureRecipeConfig_704004);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_704003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArtifactsEditPart.VISUAL_ID:
			return Artifacts_701000;
		case ArtifactEditPart.VISUAL_ID:
			return Artifact_702001;
		case ConfigVariableEditPart.VISUAL_ID:
			return ConfigVariable_703004;
		case ModelQueryEditPart.VISUAL_ID:
			return ModelQuery_703005;
		case SpecifierEditPart.VISUAL_ID:
			return Specifier_703003;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_704001;
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			return DeploymentComponentDeplymentComponent_704007;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return DeploymentStarStepFirstStep_704009;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return RecipeInfrastructures_704005;
		case RecipeDeloymentEditPart.VISUAL_ID:
			return RecipeDeloyment_704006;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return InfrastructureRecipeConfig_704004;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_704003;
		}
		return null;
	}

}
