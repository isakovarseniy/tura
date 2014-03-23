/*
 * 
 */
package control.diagram.providers;

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

import control.diagram.edit.parts.ArtificialFieldEditPart;
import control.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import control.diagram.edit.parts.ControlsEditPart;
import control.diagram.edit.parts.DataControlEditPart;
import control.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import control.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import control.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import control.diagram.edit.parts.POSTCreateTriggerEditPart;
import control.diagram.edit.parts.POSTQueryTriggerEditPart;
import control.diagram.edit.parts.PREDeleteTriggerEditPart;
import control.diagram.edit.parts.PREFormTriggerEditPart;
import control.diagram.edit.parts.PREInsertTriggerEditPart;
import control.diagram.edit.parts.PREQueryTriggerEditPart;
import control.diagram.edit.parts.PREUpdateTriggerEditPart;
import control.diagram.edit.parts.RecipeDeloymentEditPart;
import control.diagram.edit.parts.RecipeInfrastructuresEditPart;
import control.diagram.edit.parts.RelationEditPart;
import control.diagram.edit.parts.RootEditPart;
import control.diagram.edit.parts.TypeExtensionEditPart;
import control.diagram.part.DomainDiagramEditorPlugin;
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
	public static final IElementType Controls_1101000 = getElementType("org.tura.metamodel.diagram.control.Controls_1101000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataControl_1102002 = getElementType("org.tura.metamodel.diagram.control.DataControl_1102002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Root_1102001 = getElementType("org.tura.metamodel.diagram.control.Root_1102001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PREQueryTrigger_1103002 = getElementType("org.tura.metamodel.diagram.control.PREQueryTrigger_1103002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType POSTQueryTrigger_1103003 = getElementType("org.tura.metamodel.diagram.control.POSTQueryTrigger_1103003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PREInsertTrigger_1103004 = getElementType("org.tura.metamodel.diagram.control.PREInsertTrigger_1103004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PREDeleteTrigger_1103005 = getElementType("org.tura.metamodel.diagram.control.PREDeleteTrigger_1103005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType POSTCreateTrigger_1103011 = getElementType("org.tura.metamodel.diagram.control.POSTCreateTrigger_1103011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PREUpdateTrigger_1103010 = getElementType("org.tura.metamodel.diagram.control.PREUpdateTrigger_1103010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArtificialField_1103008 = getElementType("org.tura.metamodel.diagram.control.ArtificialField_1103008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PREFormTrigger_1103001 = getElementType("org.tura.metamodel.diagram.control.PREFormTrigger_1103001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_1104001 = getElementType("org.tura.metamodel.diagram.control.TypeExtension_1104001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_1104009 = getElementType("org.tura.metamodel.diagram.control.Relation_1104009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponentDeplymentComponent_1104002 = getElementType("org.tura.metamodel.diagram.control.DeploymentComponentDeplymentComponent_1104002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStepFirstStep_1104003 = getElementType("org.tura.metamodel.diagram.control.DeploymentStarStepFirstStep_1104003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeInfrastructures_1104004 = getElementType("org.tura.metamodel.diagram.control.RecipeInfrastructures_1104004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeDeloyment_1104005 = getElementType("org.tura.metamodel.diagram.control.RecipeDeloyment_1104005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureRecipeConfig_1104006 = getElementType("org.tura.metamodel.diagram.control.InfrastructureRecipeConfig_1104006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_1104007 = getElementType("org.tura.metamodel.diagram.control.ConfigurationConfigExtension_1104007"); //$NON-NLS-1$

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

			elements.put(Controls_1101000,
					DomainPackage.eINSTANCE.getControls());

			elements.put(DataControl_1102002,
					DomainPackage.eINSTANCE.getDataControl());

			elements.put(Root_1102001, DomainPackage.eINSTANCE.getRoot());

			elements.put(PREQueryTrigger_1103002,
					DomainPackage.eINSTANCE.getPREQueryTrigger());

			elements.put(POSTQueryTrigger_1103003,
					DomainPackage.eINSTANCE.getPOSTQueryTrigger());

			elements.put(PREInsertTrigger_1103004,
					DomainPackage.eINSTANCE.getPREInsertTrigger());

			elements.put(PREDeleteTrigger_1103005,
					DomainPackage.eINSTANCE.getPREDeleteTrigger());

			elements.put(POSTCreateTrigger_1103011,
					DomainPackage.eINSTANCE.getPOSTCreateTrigger());

			elements.put(PREUpdateTrigger_1103010,
					DomainPackage.eINSTANCE.getPREUpdateTrigger());

			elements.put(ArtificialField_1103008,
					DomainPackage.eINSTANCE.getArtificialField());

			elements.put(PREFormTrigger_1103001,
					DomainPackage.eINSTANCE.getPREFormTrigger());

			elements.put(TypeExtension_1104001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(Relation_1104009,
					DomainPackage.eINSTANCE.getRelation());

			elements.put(DeploymentComponentDeplymentComponent_1104002,
					DomainPackage.eINSTANCE
							.getDeploymentComponent_DeplymentComponent());

			elements.put(DeploymentStarStepFirstStep_1104003,
					DomainPackage.eINSTANCE.getDeploymentStarStep_FirstStep());

			elements.put(RecipeInfrastructures_1104004,
					DomainPackage.eINSTANCE.getRecipe_Infrastructures());

			elements.put(RecipeDeloyment_1104005,
					DomainPackage.eINSTANCE.getRecipe_Deloyment());

			elements.put(InfrastructureRecipeConfig_1104006,
					DomainPackage.eINSTANCE.getInfrastructure_RecipeConfig());

			elements.put(ConfigurationConfigExtension_1104007,
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
			KNOWN_ELEMENT_TYPES.add(Controls_1101000);
			KNOWN_ELEMENT_TYPES.add(DataControl_1102002);
			KNOWN_ELEMENT_TYPES.add(Root_1102001);
			KNOWN_ELEMENT_TYPES.add(PREQueryTrigger_1103002);
			KNOWN_ELEMENT_TYPES.add(POSTQueryTrigger_1103003);
			KNOWN_ELEMENT_TYPES.add(PREInsertTrigger_1103004);
			KNOWN_ELEMENT_TYPES.add(PREDeleteTrigger_1103005);
			KNOWN_ELEMENT_TYPES.add(POSTCreateTrigger_1103011);
			KNOWN_ELEMENT_TYPES.add(PREUpdateTrigger_1103010);
			KNOWN_ELEMENT_TYPES.add(ArtificialField_1103008);
			KNOWN_ELEMENT_TYPES.add(PREFormTrigger_1103001);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_1104001);
			KNOWN_ELEMENT_TYPES.add(Relation_1104009);
			KNOWN_ELEMENT_TYPES
					.add(DeploymentComponentDeplymentComponent_1104002);
			KNOWN_ELEMENT_TYPES.add(DeploymentStarStepFirstStep_1104003);
			KNOWN_ELEMENT_TYPES.add(RecipeInfrastructures_1104004);
			KNOWN_ELEMENT_TYPES.add(RecipeDeloyment_1104005);
			KNOWN_ELEMENT_TYPES.add(InfrastructureRecipeConfig_1104006);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_1104007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ControlsEditPart.VISUAL_ID:
			return Controls_1101000;
		case DataControlEditPart.VISUAL_ID:
			return DataControl_1102002;
		case RootEditPart.VISUAL_ID:
			return Root_1102001;
		case PREQueryTriggerEditPart.VISUAL_ID:
			return PREQueryTrigger_1103002;
		case POSTQueryTriggerEditPart.VISUAL_ID:
			return POSTQueryTrigger_1103003;
		case PREInsertTriggerEditPart.VISUAL_ID:
			return PREInsertTrigger_1103004;
		case PREDeleteTriggerEditPart.VISUAL_ID:
			return PREDeleteTrigger_1103005;
		case POSTCreateTriggerEditPart.VISUAL_ID:
			return POSTCreateTrigger_1103011;
		case PREUpdateTriggerEditPart.VISUAL_ID:
			return PREUpdateTrigger_1103010;
		case ArtificialFieldEditPart.VISUAL_ID:
			return ArtificialField_1103008;
		case PREFormTriggerEditPart.VISUAL_ID:
			return PREFormTrigger_1103001;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_1104001;
		case RelationEditPart.VISUAL_ID:
			return Relation_1104009;
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			return DeploymentComponentDeplymentComponent_1104002;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return DeploymentStarStepFirstStep_1104003;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return RecipeInfrastructures_1104004;
		case RecipeDeloymentEditPart.VISUAL_ID:
			return RecipeDeloyment_1104005;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return InfrastructureRecipeConfig_1104006;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_1104007;
		}
		return null;
	}

}
