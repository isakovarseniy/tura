package typedefinition.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import typedefinition.Attribute;
import typedefinition.EnumAttribute;
import typedefinition.Enumarator;
import typedefinition.Operation;
import typedefinition.ReturnValue;
import typedefinition.Type;
import typedefinition.TypeDefinition;
import typedefinition.TypeElement;
import typedefinition.TypeExtension;
import typedefinition.TypeReference;
import typedefinition.TypedefinitionPackage;
import typedefinition.diagram.edit.parts.Attribute2EditPart;
import typedefinition.diagram.edit.parts.AttributeEditPart;
import typedefinition.diagram.edit.parts.EnumAttributeEditPart;
import typedefinition.diagram.edit.parts.EnumaratorEditPart;
import typedefinition.diagram.edit.parts.EnumaratorEnumaratorValuesCompartmentEditPart;
import typedefinition.diagram.edit.parts.OperationEditPart;
import typedefinition.diagram.edit.parts.OperationOperationParametersCompartmentEditPart;
import typedefinition.diagram.edit.parts.OperationOperationReturnValueCompartmentEditPart;
import typedefinition.diagram.edit.parts.ReturnValueEditPart;
import typedefinition.diagram.edit.parts.TypeDefinitionEditPart;
import typedefinition.diagram.edit.parts.TypeEditPart;
import typedefinition.diagram.edit.parts.TypeExtensionEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceEditPart;
import typedefinition.diagram.edit.parts.TypeTypeAttributesCompartmentEditPart;
import typedefinition.diagram.edit.parts.TypeTypeOperationsCompartmentEditPart;
import typedefinition.diagram.providers.TypedefinitionElementTypes;

/**
 * @generated
 */
public class TypedefinitionDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<TypedefinitionNodeDescriptor> getSemanticChildren(
			View view) {
		switch (TypedefinitionVisualIDRegistry.getVisualID(view)) {
		case TypeDefinitionEditPart.VISUAL_ID:
			return getTypeDefinition_1000SemanticChildren(view);
		case TypeTypeAttributesCompartmentEditPart.VISUAL_ID:
			return getTypeTypeAttributesCompartment_7001SemanticChildren(view);
		case TypeTypeOperationsCompartmentEditPart.VISUAL_ID:
			return getTypeTypeOperationsCompartment_7002SemanticChildren(view);
		case OperationOperationParametersCompartmentEditPart.VISUAL_ID:
			return getOperationOperationParametersCompartment_7003SemanticChildren(view);
		case OperationOperationReturnValueCompartmentEditPart.VISUAL_ID:
			return getOperationOperationReturnValueCompartment_7004SemanticChildren(view);
		case EnumaratorEnumaratorValuesCompartmentEditPart.VISUAL_ID:
			return getEnumaratorEnumaratorValuesCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionNodeDescriptor> getTypeDefinition_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TypeDefinition modelElement = (TypeDefinition) view.getElement();
		LinkedList<TypedefinitionNodeDescriptor> result = new LinkedList<TypedefinitionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTypes().iterator(); it.hasNext();) {
			TypeElement childElement = (TypeElement) it.next();
			int visualID = TypedefinitionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeReferenceEditPart.VISUAL_ID) {
				result.add(new TypedefinitionNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == TypeEditPart.VISUAL_ID) {
				result.add(new TypedefinitionNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEnums().iterator(); it.hasNext();) {
			Enumarator childElement = (Enumarator) it.next();
			int visualID = TypedefinitionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnumaratorEditPart.VISUAL_ID) {
				result.add(new TypedefinitionNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionNodeDescriptor> getTypeTypeAttributesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Type modelElement = (Type) containerView.getElement();
		LinkedList<TypedefinitionNodeDescriptor> result = new LinkedList<TypedefinitionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = TypedefinitionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new TypedefinitionNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionNodeDescriptor> getTypeTypeOperationsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Type modelElement = (Type) containerView.getElement();
		LinkedList<TypedefinitionNodeDescriptor> result = new LinkedList<TypedefinitionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = TypedefinitionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new TypedefinitionNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionNodeDescriptor> getOperationOperationParametersCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Operation modelElement = (Operation) containerView.getElement();
		LinkedList<TypedefinitionNodeDescriptor> result = new LinkedList<TypedefinitionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = TypedefinitionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Attribute2EditPart.VISUAL_ID) {
				result.add(new TypedefinitionNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionNodeDescriptor> getOperationOperationReturnValueCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Operation modelElement = (Operation) containerView.getElement();
		LinkedList<TypedefinitionNodeDescriptor> result = new LinkedList<TypedefinitionNodeDescriptor>();
		{
			ReturnValue childElement = modelElement.getReturnValue();
			int visualID = TypedefinitionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ReturnValueEditPart.VISUAL_ID) {
				result.add(new TypedefinitionNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionNodeDescriptor> getEnumaratorEnumaratorValuesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Enumarator modelElement = (Enumarator) containerView.getElement();
		LinkedList<TypedefinitionNodeDescriptor> result = new LinkedList<TypedefinitionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getValues().iterator(); it.hasNext();) {
			EnumAttribute childElement = (EnumAttribute) it.next();
			int visualID = TypedefinitionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnumAttributeEditPart.VISUAL_ID) {
				result.add(new TypedefinitionNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getContainedLinks(View view) {
		switch (TypedefinitionVisualIDRegistry.getVisualID(view)) {
		case TypeDefinitionEditPart.VISUAL_ID:
			return getTypeDefinition_1000ContainedLinks(view);
		case TypeReferenceEditPart.VISUAL_ID:
			return getTypeReference_2004ContainedLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2001ContainedLinks(view);
		case EnumaratorEditPart.VISUAL_ID:
			return getEnumarator_2003ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002ContainedLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003ContainedLinks(view);
		case ReturnValueEditPart.VISUAL_ID:
			return getReturnValue_3004ContainedLinks(view);
		case EnumAttributeEditPart.VISUAL_ID:
			return getEnumAttribute_3005ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getIncomingLinks(View view) {
		switch (TypedefinitionVisualIDRegistry.getVisualID(view)) {
		case TypeReferenceEditPart.VISUAL_ID:
			return getTypeReference_2004IncomingLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2001IncomingLinks(view);
		case EnumaratorEditPart.VISUAL_ID:
			return getEnumarator_2003IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002IncomingLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003IncomingLinks(view);
		case ReturnValueEditPart.VISUAL_ID:
			return getReturnValue_3004IncomingLinks(view);
		case EnumAttributeEditPart.VISUAL_ID:
			return getEnumAttribute_3005IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getOutgoingLinks(View view) {
		switch (TypedefinitionVisualIDRegistry.getVisualID(view)) {
		case TypeReferenceEditPart.VISUAL_ID:
			return getTypeReference_2004OutgoingLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2001OutgoingLinks(view);
		case EnumaratorEditPart.VISUAL_ID:
			return getEnumarator_2003OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002OutgoingLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003OutgoingLinks(view);
		case ReturnValueEditPart.VISUAL_ID:
			return getReturnValue_3004OutgoingLinks(view);
		case EnumAttributeEditPart.VISUAL_ID:
			return getEnumAttribute_3005OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getTypeDefinition_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getTypeReference_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getType_2001ContainedLinks(
			View view) {
		Type modelElement = (Type) view.getElement();
		LinkedList<TypedefinitionLinkDescriptor> result = new LinkedList<TypedefinitionLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_TypeExtension_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getEnumarator_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getAttribute_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getOperation_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getAttribute_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getReturnValue_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getEnumAttribute_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getTypeExtension_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getTypeReference_2004IncomingLinks(
			View view) {
		TypeReference modelElement = (TypeReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TypedefinitionLinkDescriptor> result = new LinkedList<TypedefinitionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TypeExtension_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getType_2001IncomingLinks(
			View view) {
		Type modelElement = (Type) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TypedefinitionLinkDescriptor> result = new LinkedList<TypedefinitionLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TypeExtension_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getEnumarator_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getAttribute_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getOperation_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getAttribute_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getReturnValue_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getEnumAttribute_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getTypeExtension_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getTypeReference_2004OutgoingLinks(
			View view) {
		TypeReference modelElement = (TypeReference) view.getElement();
		LinkedList<TypedefinitionLinkDescriptor> result = new LinkedList<TypedefinitionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TypeExtension_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getType_2001OutgoingLinks(
			View view) {
		Type modelElement = (Type) view.getElement();
		LinkedList<TypedefinitionLinkDescriptor> result = new LinkedList<TypedefinitionLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TypeExtension_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getEnumarator_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getAttribute_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getOperation_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getAttribute_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getReturnValue_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getEnumAttribute_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getTypeExtension_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<TypedefinitionLinkDescriptor> getContainedTypeModelFacetLinks_TypeExtension_4001(
			Type container) {
		LinkedList<TypedefinitionLinkDescriptor> result = new LinkedList<TypedefinitionLinkDescriptor>();
		TypeExtension link = container.getExtension();
		if (TypeExtensionEditPart.VISUAL_ID != TypedefinitionVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		TypeElement dst = link.getTarget();
		TypeElement src = link.getSource();
		result.add(new TypedefinitionLinkDescriptor(src, dst, link,
				TypedefinitionElementTypes.TypeExtension_4001,
				TypeExtensionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TypedefinitionLinkDescriptor> getIncomingTypeModelFacetLinks_TypeExtension_4001(
			TypeElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TypedefinitionLinkDescriptor> result = new LinkedList<TypedefinitionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TypedefinitionPackage.eINSTANCE
					.getTypeExtension_Target()
					|| false == setting.getEObject() instanceof TypeExtension) {
				continue;
			}
			TypeExtension link = (TypeExtension) setting.getEObject();
			if (TypeExtensionEditPart.VISUAL_ID != TypedefinitionVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TypeElement src = link.getSource();
			result.add(new TypedefinitionLinkDescriptor(src, target, link,
					TypedefinitionElementTypes.TypeExtension_4001,
					TypeExtensionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TypedefinitionLinkDescriptor> getOutgoingTypeModelFacetLinks_TypeExtension_4001(
			TypeElement source) {
		Type container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Type) {
				container = (Type) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TypedefinitionLinkDescriptor> result = new LinkedList<TypedefinitionLinkDescriptor>();
		TypeExtension link = container.getExtension();
		if (TypeExtensionEditPart.VISUAL_ID != TypedefinitionVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		TypeElement dst = link.getTarget();
		TypeElement src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new TypedefinitionLinkDescriptor(src, dst, link,
				TypedefinitionElementTypes.TypeExtension_4001,
				TypeExtensionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<TypedefinitionNodeDescriptor> getSemanticChildren(View view) {
			return TypedefinitionDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TypedefinitionLinkDescriptor> getContainedLinks(View view) {
			return TypedefinitionDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TypedefinitionLinkDescriptor> getIncomingLinks(View view) {
			return TypedefinitionDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TypedefinitionLinkDescriptor> getOutgoingLinks(View view) {
			return TypedefinitionDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
