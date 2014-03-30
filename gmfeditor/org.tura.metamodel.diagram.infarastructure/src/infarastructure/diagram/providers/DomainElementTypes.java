/*
 * 
 */
package infarastructure.diagram.providers;

import infarastructure.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import infarastructure.diagram.edit.parts.DatacenterEditPart;
import infarastructure.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import infarastructure.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import infarastructure.diagram.edit.parts.EnterpriseInfrastructureEditPart;
import infarastructure.diagram.edit.parts.HubEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerEditPart;
import infarastructure.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import infarastructure.diagram.edit.parts.RecipeDeloymentEditPart;
import infarastructure.diagram.edit.parts.RecipeInfrastructuresEditPart;
import infarastructure.diagram.edit.parts.RelationEditPart;
import infarastructure.diagram.edit.parts.RouterEditPart;
import infarastructure.diagram.edit.parts.ServerClasterEditPart;
import infarastructure.diagram.edit.parts.ServerEditPart;
import infarastructure.diagram.edit.parts.StorageEditPart;
import infarastructure.diagram.edit.parts.SubsystemEditPart;
import infarastructure.diagram.edit.parts.TypeExtensionEditPart;
import infarastructure.diagram.part.DomainDiagramEditorPlugin;

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
	public static final IElementType EnterpriseInfrastructure_1201000 = getElementType("org.tura.metamodel.diagram.infarastructure.EnterpriseInfrastructure_1201000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Datacenter_1202002 = getElementType("org.tura.metamodel.diagram.infarastructure.Datacenter_1202002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Subsystem_1203001 = getElementType("org.tura.metamodel.diagram.infarastructure.Subsystem_1203001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InfrastructureLayer_1203002 = getElementType("org.tura.metamodel.diagram.infarastructure.InfrastructureLayer_1203002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Server_1203003 = getElementType("org.tura.metamodel.diagram.infarastructure.Server_1203003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Router_1203004 = getElementType("org.tura.metamodel.diagram.infarastructure.Router_1203004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Hub_1203005 = getElementType("org.tura.metamodel.diagram.infarastructure.Hub_1203005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Storage_1203006 = getElementType("org.tura.metamodel.diagram.infarastructure.Storage_1203006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ServerClaster_1203007 = getElementType("org.tura.metamodel.diagram.infarastructure.ServerClaster_1203007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_1204001 = getElementType("org.tura.metamodel.diagram.infarastructure.TypeExtension_1204001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_1204002 = getElementType("org.tura.metamodel.diagram.infarastructure.Relation_1204002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponentDeplymentComponent_1204003 = getElementType("org.tura.metamodel.diagram.infarastructure.DeploymentComponentDeplymentComponent_1204003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStepFirstStep_1204004 = getElementType("org.tura.metamodel.diagram.infarastructure.DeploymentStarStepFirstStep_1204004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeInfrastructures_1204005 = getElementType("org.tura.metamodel.diagram.infarastructure.RecipeInfrastructures_1204005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeDeloyment_1204006 = getElementType("org.tura.metamodel.diagram.infarastructure.RecipeDeloyment_1204006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureRecipeConfig_1204007 = getElementType("org.tura.metamodel.diagram.infarastructure.InfrastructureRecipeConfig_1204007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_1204008 = getElementType("org.tura.metamodel.diagram.infarastructure.ConfigurationConfigExtension_1204008"); //$NON-NLS-1$

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

			elements.put(EnterpriseInfrastructure_1201000,
					DomainPackage.eINSTANCE.getEnterpriseInfrastructure());

			elements.put(Datacenter_1202002,
					DomainPackage.eINSTANCE.getDatacenter());

			elements.put(Subsystem_1203001,
					DomainPackage.eINSTANCE.getSubsystem());

			elements.put(InfrastructureLayer_1203002,
					DomainPackage.eINSTANCE.getInfrastructureLayer());

			elements.put(Server_1203003, DomainPackage.eINSTANCE.getServer());

			elements.put(Router_1203004, DomainPackage.eINSTANCE.getRouter());

			elements.put(Hub_1203005, DomainPackage.eINSTANCE.getHub());

			elements.put(Storage_1203006, DomainPackage.eINSTANCE.getStorage());

			elements.put(ServerClaster_1203007,
					DomainPackage.eINSTANCE.getServerClaster());

			elements.put(TypeExtension_1204001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(Relation_1204002,
					DomainPackage.eINSTANCE.getRelation());

			elements.put(DeploymentComponentDeplymentComponent_1204003,
					DomainPackage.eINSTANCE
							.getDeploymentComponent_DeplymentComponent());

			elements.put(DeploymentStarStepFirstStep_1204004,
					DomainPackage.eINSTANCE.getDeploymentStarStep_FirstStep());

			elements.put(RecipeInfrastructures_1204005,
					DomainPackage.eINSTANCE.getRecipe_Infrastructures());

			elements.put(RecipeDeloyment_1204006,
					DomainPackage.eINSTANCE.getRecipe_Deloyment());

			elements.put(InfrastructureRecipeConfig_1204007,
					DomainPackage.eINSTANCE.getInfrastructure_RecipeConfig());

			elements.put(ConfigurationConfigExtension_1204008,
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
			KNOWN_ELEMENT_TYPES.add(EnterpriseInfrastructure_1201000);
			KNOWN_ELEMENT_TYPES.add(Datacenter_1202002);
			KNOWN_ELEMENT_TYPES.add(Subsystem_1203001);
			KNOWN_ELEMENT_TYPES.add(InfrastructureLayer_1203002);
			KNOWN_ELEMENT_TYPES.add(Server_1203003);
			KNOWN_ELEMENT_TYPES.add(Router_1203004);
			KNOWN_ELEMENT_TYPES.add(Hub_1203005);
			KNOWN_ELEMENT_TYPES.add(Storage_1203006);
			KNOWN_ELEMENT_TYPES.add(ServerClaster_1203007);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_1204001);
			KNOWN_ELEMENT_TYPES.add(Relation_1204002);
			KNOWN_ELEMENT_TYPES
					.add(DeploymentComponentDeplymentComponent_1204003);
			KNOWN_ELEMENT_TYPES.add(DeploymentStarStepFirstStep_1204004);
			KNOWN_ELEMENT_TYPES.add(RecipeInfrastructures_1204005);
			KNOWN_ELEMENT_TYPES.add(RecipeDeloyment_1204006);
			KNOWN_ELEMENT_TYPES.add(InfrastructureRecipeConfig_1204007);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_1204008);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			return EnterpriseInfrastructure_1201000;
		case DatacenterEditPart.VISUAL_ID:
			return Datacenter_1202002;
		case SubsystemEditPart.VISUAL_ID:
			return Subsystem_1203001;
		case InfrastructureLayerEditPart.VISUAL_ID:
			return InfrastructureLayer_1203002;
		case ServerEditPart.VISUAL_ID:
			return Server_1203003;
		case RouterEditPart.VISUAL_ID:
			return Router_1203004;
		case HubEditPart.VISUAL_ID:
			return Hub_1203005;
		case StorageEditPart.VISUAL_ID:
			return Storage_1203006;
		case ServerClasterEditPart.VISUAL_ID:
			return ServerClaster_1203007;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_1204001;
		case RelationEditPart.VISUAL_ID:
			return Relation_1204002;
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			return DeploymentComponentDeplymentComponent_1204003;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return DeploymentStarStepFirstStep_1204004;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return RecipeInfrastructures_1204005;
		case RecipeDeloymentEditPart.VISUAL_ID:
			return RecipeDeloyment_1204006;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return InfrastructureRecipeConfig_1204007;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_1204008;
		}
		return null;
	}

}
