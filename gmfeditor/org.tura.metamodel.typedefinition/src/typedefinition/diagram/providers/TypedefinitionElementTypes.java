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

import typedefinition.TypedefinitionPackage;
import typedefinition.diagram.edit.parts.Attribute2EditPart;
import typedefinition.diagram.edit.parts.AttributeEditPart;
import typedefinition.diagram.edit.parts.EnumAttributeEditPart;
import typedefinition.diagram.edit.parts.EnumaratorEditPart;
import typedefinition.diagram.edit.parts.OperationEditPart;
import typedefinition.diagram.edit.parts.ReturnValueEditPart;
import typedefinition.diagram.edit.parts.TypeDefinitionEditPart;
import typedefinition.diagram.edit.parts.TypeEditPart;
import typedefinition.diagram.edit.parts.TypeExtensionEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceEditPart;
import typedefinition.diagram.part.TypedefinitionDiagramEditorPlugin;

/**
 * @generated
 */
public class TypedefinitionElementTypes {

	/**
	 * @generated
	 */
	private TypedefinitionElementTypes() {
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
	public static final IElementType TypeDefinition_1000 = getElementType("org.tura.metamodel.typedefinition.TypeDefinition_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeReference_2001 = getElementType("org.tura.metamodel.typedefinition.TypeReference_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Type_2002 = getElementType("org.tura.metamodel.typedefinition.Type_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Enumarator_2003 = getElementType("org.tura.metamodel.typedefinition.Enumarator_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_3001 = getElementType("org.tura.metamodel.typedefinition.Attribute_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_3002 = getElementType("org.tura.metamodel.typedefinition.Operation_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_3003 = getElementType("org.tura.metamodel.typedefinition.Attribute_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ReturnValue_3004 = getElementType("org.tura.metamodel.typedefinition.ReturnValue_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnumAttribute_3005 = getElementType("org.tura.metamodel.typedefinition.EnumAttribute_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_4001 = getElementType("org.tura.metamodel.typedefinition.TypeExtension_4001"); //$NON-NLS-1$

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
				return TypedefinitionDiagramEditorPlugin.getInstance()
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

			elements.put(TypeDefinition_1000,
					TypedefinitionPackage.eINSTANCE.getTypeDefinition());

			elements.put(TypeReference_2001,
					TypedefinitionPackage.eINSTANCE.getTypeReference());

			elements.put(Type_2002, TypedefinitionPackage.eINSTANCE.getType());

			elements.put(Enumarator_2003,
					TypedefinitionPackage.eINSTANCE.getEnumarator());

			elements.put(Attribute_3001,
					TypedefinitionPackage.eINSTANCE.getAttribute());

			elements.put(Operation_3002,
					TypedefinitionPackage.eINSTANCE.getOperation());

			elements.put(Attribute_3003,
					TypedefinitionPackage.eINSTANCE.getAttribute());

			elements.put(ReturnValue_3004,
					TypedefinitionPackage.eINSTANCE.getReturnValue());

			elements.put(EnumAttribute_3005,
					TypedefinitionPackage.eINSTANCE.getEnumAttribute());

			elements.put(TypeExtension_4001,
					TypedefinitionPackage.eINSTANCE.getTypeExtension());
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
			KNOWN_ELEMENT_TYPES.add(TypeDefinition_1000);
			KNOWN_ELEMENT_TYPES.add(TypeReference_2001);
			KNOWN_ELEMENT_TYPES.add(Type_2002);
			KNOWN_ELEMENT_TYPES.add(Enumarator_2003);
			KNOWN_ELEMENT_TYPES.add(Attribute_3001);
			KNOWN_ELEMENT_TYPES.add(Operation_3002);
			KNOWN_ELEMENT_TYPES.add(Attribute_3003);
			KNOWN_ELEMENT_TYPES.add(ReturnValue_3004);
			KNOWN_ELEMENT_TYPES.add(EnumAttribute_3005);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TypeDefinitionEditPart.VISUAL_ID:
			return TypeDefinition_1000;
		case TypeReferenceEditPart.VISUAL_ID:
			return TypeReference_2001;
		case TypeEditPart.VISUAL_ID:
			return Type_2002;
		case EnumaratorEditPart.VISUAL_ID:
			return Enumarator_2003;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_3001;
		case OperationEditPart.VISUAL_ID:
			return Operation_3002;
		case Attribute2EditPart.VISUAL_ID:
			return Attribute_3003;
		case ReturnValueEditPart.VISUAL_ID:
			return ReturnValue_3004;
		case EnumAttributeEditPart.VISUAL_ID:
			return EnumAttribute_3005;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_4001;
		}
		return null;
	}

}
