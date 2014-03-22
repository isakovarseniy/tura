/*
 * 
 */
package typedefinition.diagram.providers;

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

import typedefinition.diagram.edit.parts.AttributeEditPart;
import typedefinition.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import typedefinition.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import typedefinition.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import typedefinition.diagram.edit.parts.EnumAttributeEditPart;
import typedefinition.diagram.edit.parts.EnumaratorEditPart;
import typedefinition.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import typedefinition.diagram.edit.parts.OperationEditPart;
import typedefinition.diagram.edit.parts.PrimitiveEditPart;
import typedefinition.diagram.edit.parts.RecipeDeloymentEditPart;
import typedefinition.diagram.edit.parts.RecipeInfrastructuresEditPart;
import typedefinition.diagram.edit.parts.RelationEditPart;
import typedefinition.diagram.edit.parts.TypeDefinitionEditPart;
import typedefinition.diagram.edit.parts.TypeEditPart;
import typedefinition.diagram.edit.parts.TypeExtensionEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceEditPart;
import typedefinition.diagram.part.DomainDiagramEditorPlugin;
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
	public static final IElementType TypeDefinition_101000 = getElementType("org.tura.metamodel.diagram.typedefinition.TypeDefinition_101000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeReference_102001 = getElementType("org.tura.metamodel.diagram.typedefinition.TypeReference_102001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Primitive_102004 = getElementType("org.tura.metamodel.diagram.typedefinition.Primitive_102004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Type_102002 = getElementType("org.tura.metamodel.diagram.typedefinition.Type_102002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Enumarator_102005 = getElementType("org.tura.metamodel.diagram.typedefinition.Enumarator_102005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_103001 = getElementType("org.tura.metamodel.diagram.typedefinition.Attribute_103001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_103002 = getElementType("org.tura.metamodel.diagram.typedefinition.Operation_103002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnumAttribute_103005 = getElementType("org.tura.metamodel.diagram.typedefinition.EnumAttribute_103005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_104001 = getElementType("org.tura.metamodel.diagram.typedefinition.TypeExtension_104001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relation_104011 = getElementType("org.tura.metamodel.diagram.typedefinition.Relation_104011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentComponentDeplymentComponent_104007 = getElementType("org.tura.metamodel.diagram.typedefinition.DeploymentComponentDeplymentComponent_104007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeploymentStarStepFirstStep_104009 = getElementType("org.tura.metamodel.diagram.typedefinition.DeploymentStarStepFirstStep_104009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeInfrastructures_104005 = getElementType("org.tura.metamodel.diagram.typedefinition.RecipeInfrastructures_104005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeDeloyment_104006 = getElementType("org.tura.metamodel.diagram.typedefinition.RecipeDeloyment_104006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureRecipeConfig_104004 = getElementType("org.tura.metamodel.diagram.typedefinition.InfrastructureRecipeConfig_104004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_104003 = getElementType("org.tura.metamodel.diagram.typedefinition.ConfigurationConfigExtension_104003"); //$NON-NLS-1$

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

			elements.put(TypeDefinition_101000,
					DomainPackage.eINSTANCE.getTypeDefinition());

			elements.put(TypeReference_102001,
					DomainPackage.eINSTANCE.getTypeReference());

			elements.put(Primitive_102004,
					DomainPackage.eINSTANCE.getPrimitive());

			elements.put(Type_102002, DomainPackage.eINSTANCE.getType());

			elements.put(Enumarator_102005,
					DomainPackage.eINSTANCE.getEnumarator());

			elements.put(Attribute_103001,
					DomainPackage.eINSTANCE.getAttribute());

			elements.put(Operation_103002,
					DomainPackage.eINSTANCE.getOperation());

			elements.put(EnumAttribute_103005,
					DomainPackage.eINSTANCE.getEnumAttribute());

			elements.put(TypeExtension_104001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(Relation_104011, DomainPackage.eINSTANCE.getRelation());

			elements.put(DeploymentComponentDeplymentComponent_104007,
					DomainPackage.eINSTANCE
							.getDeploymentComponent_DeplymentComponent());

			elements.put(DeploymentStarStepFirstStep_104009,
					DomainPackage.eINSTANCE.getDeploymentStarStep_FirstStep());

			elements.put(RecipeInfrastructures_104005,
					DomainPackage.eINSTANCE.getRecipe_Infrastructures());

			elements.put(RecipeDeloyment_104006,
					DomainPackage.eINSTANCE.getRecipe_Deloyment());

			elements.put(InfrastructureRecipeConfig_104004,
					DomainPackage.eINSTANCE.getInfrastructure_RecipeConfig());

			elements.put(ConfigurationConfigExtension_104003,
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
			KNOWN_ELEMENT_TYPES.add(TypeDefinition_101000);
			KNOWN_ELEMENT_TYPES.add(TypeReference_102001);
			KNOWN_ELEMENT_TYPES.add(Primitive_102004);
			KNOWN_ELEMENT_TYPES.add(Type_102002);
			KNOWN_ELEMENT_TYPES.add(Enumarator_102005);
			KNOWN_ELEMENT_TYPES.add(Attribute_103001);
			KNOWN_ELEMENT_TYPES.add(Operation_103002);
			KNOWN_ELEMENT_TYPES.add(EnumAttribute_103005);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_104001);
			KNOWN_ELEMENT_TYPES.add(Relation_104011);
			KNOWN_ELEMENT_TYPES
					.add(DeploymentComponentDeplymentComponent_104007);
			KNOWN_ELEMENT_TYPES.add(DeploymentStarStepFirstStep_104009);
			KNOWN_ELEMENT_TYPES.add(RecipeInfrastructures_104005);
			KNOWN_ELEMENT_TYPES.add(RecipeDeloyment_104006);
			KNOWN_ELEMENT_TYPES.add(InfrastructureRecipeConfig_104004);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_104003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TypeDefinitionEditPart.VISUAL_ID:
			return TypeDefinition_101000;
		case TypeReferenceEditPart.VISUAL_ID:
			return TypeReference_102001;
		case PrimitiveEditPart.VISUAL_ID:
			return Primitive_102004;
		case TypeEditPart.VISUAL_ID:
			return Type_102002;
		case EnumaratorEditPart.VISUAL_ID:
			return Enumarator_102005;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_103001;
		case OperationEditPart.VISUAL_ID:
			return Operation_103002;
		case EnumAttributeEditPart.VISUAL_ID:
			return EnumAttribute_103005;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_104001;
		case RelationEditPart.VISUAL_ID:
			return Relation_104011;
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			return DeploymentComponentDeplymentComponent_104007;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return DeploymentStarStepFirstStep_104009;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return RecipeInfrastructures_104005;
		case RecipeDeloymentEditPart.VISUAL_ID:
			return RecipeDeloyment_104006;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return InfrastructureRecipeConfig_104004;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_104003;
		}
		return null;
	}

}
