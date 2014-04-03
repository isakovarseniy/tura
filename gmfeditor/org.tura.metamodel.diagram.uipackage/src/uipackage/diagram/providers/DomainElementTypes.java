/*
 * 
 */
package uipackage.diagram.providers;

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

import uipackage.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import uipackage.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import uipackage.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import uipackage.diagram.edit.parts.FormDataControlsEditPart;
import uipackage.diagram.edit.parts.FormEditPart;
import uipackage.diagram.edit.parts.FormViewEditPart;
import uipackage.diagram.edit.parts.InfrastructureConnectionEditPart;
import uipackage.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import uipackage.diagram.edit.parts.RecipeDeloymentEditPart;
import uipackage.diagram.edit.parts.RecipeInfrastructuresEditPart;
import uipackage.diagram.edit.parts.RelationEditPart;
import uipackage.diagram.edit.parts.TypeExtensionEditPart;
import uipackage.diagram.edit.parts.UIPackageEditPart;
import uipackage.diagram.part.DomainDiagramEditorPlugin;
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
	public static final IElementType UIPackage_1001000 = getElementType("org.tura.metamodel.diagram.uipackage.UIPackage_1001000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Form_1002002 = getElementType("org.tura.metamodel.diagram.uipackage.Form_1002002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormView_1003001 = getElementType("org.tura.metamodel.diagram.uipackage.FormView_1003001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormDataControls_1003002 = getElementType("org.tura.metamodel.diagram.uipackage.FormDataControls_1003002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_1004001 = getElementType("org.tura.metamodel.diagram.uipackage.TypeExtension_1004001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_1004009 = getElementType("org.tura.metamodel.diagram.uipackage.Relation_1004009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureConnection_1004010 = getElementType("org.tura.metamodel.diagram.uipackage.InfrastructureConnection_1004010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponentDeplymentComponent_1004002 = getElementType("org.tura.metamodel.diagram.uipackage.DeploymentComponentDeplymentComponent_1004002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStepFirstStep_1004003 = getElementType("org.tura.metamodel.diagram.uipackage.DeploymentStarStepFirstStep_1004003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeInfrastructures_1004004 = getElementType("org.tura.metamodel.diagram.uipackage.RecipeInfrastructures_1004004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeDeloyment_1004005 = getElementType("org.tura.metamodel.diagram.uipackage.RecipeDeloyment_1004005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureRecipeConfig_1004006 = getElementType("org.tura.metamodel.diagram.uipackage.InfrastructureRecipeConfig_1004006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_1004007 = getElementType("org.tura.metamodel.diagram.uipackage.ConfigurationConfigExtension_1004007"); //$NON-NLS-1$

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

			elements.put(UIPackage_1001000,
					DomainPackage.eINSTANCE.getUIPackage());

			elements.put(Form_1002002, DomainPackage.eINSTANCE.getForm());

			elements.put(FormView_1003001,
					DomainPackage.eINSTANCE.getFormView());

			elements.put(FormDataControls_1003002,
					DomainPackage.eINSTANCE.getFormDataControls());

			elements.put(TypeExtension_1004001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(Relation_1004009,
					DomainPackage.eINSTANCE.getRelation());

			elements.put(InfrastructureConnection_1004010,
					DomainPackage.eINSTANCE.getInfrastructureConnection());

			elements.put(DeploymentComponentDeplymentComponent_1004002,
					DomainPackage.eINSTANCE
							.getDeploymentComponent_DeplymentComponent());

			elements.put(DeploymentStarStepFirstStep_1004003,
					DomainPackage.eINSTANCE.getDeploymentStarStep_FirstStep());

			elements.put(RecipeInfrastructures_1004004,
					DomainPackage.eINSTANCE.getRecipe_Infrastructures());

			elements.put(RecipeDeloyment_1004005,
					DomainPackage.eINSTANCE.getRecipe_Deloyment());

			elements.put(InfrastructureRecipeConfig_1004006,
					DomainPackage.eINSTANCE.getInfrastructure_RecipeConfig());

			elements.put(ConfigurationConfigExtension_1004007,
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
			KNOWN_ELEMENT_TYPES.add(UIPackage_1001000);
			KNOWN_ELEMENT_TYPES.add(Form_1002002);
			KNOWN_ELEMENT_TYPES.add(FormView_1003001);
			KNOWN_ELEMENT_TYPES.add(FormDataControls_1003002);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_1004001);
			KNOWN_ELEMENT_TYPES.add(Relation_1004009);
			KNOWN_ELEMENT_TYPES.add(InfrastructureConnection_1004010);
			KNOWN_ELEMENT_TYPES
					.add(DeploymentComponentDeplymentComponent_1004002);
			KNOWN_ELEMENT_TYPES.add(DeploymentStarStepFirstStep_1004003);
			KNOWN_ELEMENT_TYPES.add(RecipeInfrastructures_1004004);
			KNOWN_ELEMENT_TYPES.add(RecipeDeloyment_1004005);
			KNOWN_ELEMENT_TYPES.add(InfrastructureRecipeConfig_1004006);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_1004007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UIPackageEditPart.VISUAL_ID:
			return UIPackage_1001000;
		case FormEditPart.VISUAL_ID:
			return Form_1002002;
		case FormViewEditPart.VISUAL_ID:
			return FormView_1003001;
		case FormDataControlsEditPart.VISUAL_ID:
			return FormDataControls_1003002;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_1004001;
		case RelationEditPart.VISUAL_ID:
			return Relation_1004009;
		case InfrastructureConnectionEditPart.VISUAL_ID:
			return InfrastructureConnection_1004010;
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			return DeploymentComponentDeplymentComponent_1004002;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return DeploymentStarStepFirstStep_1004003;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return RecipeInfrastructures_1004004;
		case RecipeDeloymentEditPart.VISUAL_ID:
			return RecipeDeloyment_1004005;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return InfrastructureRecipeConfig_1004006;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_1004007;
		}
		return null;
	}

}
