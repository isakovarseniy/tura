/*
 * 
 */
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

import typedefinition.diagram.edit.parts.AttributeEditPart;
import typedefinition.diagram.edit.parts.EnumAttributeEditPart;
import typedefinition.diagram.edit.parts.EnumaratorEditPart;
import typedefinition.diagram.edit.parts.EnumaratorEnumaratorValuesCompartmentEditPart;
import typedefinition.diagram.edit.parts.OperationEditPart;
import typedefinition.diagram.edit.parts.OperationOperationParametersCompartmentEditPart;
import typedefinition.diagram.edit.parts.OperationOperationReturnValueCompartmentEditPart;
import typedefinition.diagram.edit.parts.ParameterEditPart;
import typedefinition.diagram.edit.parts.PrimitiveEditPart;
import typedefinition.diagram.edit.parts.ReturnValueEditPart;
import typedefinition.diagram.edit.parts.TypeDefinitionEditPart;
import typedefinition.diagram.edit.parts.TypeEditPart;
import typedefinition.diagram.edit.parts.TypeExtensionEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceEditPart;
import typedefinition.diagram.edit.parts.TypeTypeAttributesCompartmentEditPart;
import typedefinition.diagram.edit.parts.TypeTypeOperationsCompartmentEditPart;
import typedefinition.diagram.providers.DomainElementTypes;
import domain.Attribute;
import domain.DomainPackage;
import domain.EnumAttribute;
import domain.Enumarator;
import domain.Operation;
import domain.Parameter;
import domain.Primitive;
import domain.ReturnValue;
import domain.Type;
import domain.TypeDefinition;
import domain.TypeElement;
import domain.TypeExtension;
import domain.TypeReference;

/**
 * @generated
 */
public class DomainDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getSemanticChildren(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case TypeDefinitionEditPart.VISUAL_ID:
			return getTypeDefinition_101000SemanticChildren(view);
		case TypeTypeAttributesCompartmentEditPart.VISUAL_ID:
			return getTypeTypeAttributesCompartment_107001SemanticChildren(view);
		case TypeTypeOperationsCompartmentEditPart.VISUAL_ID:
			return getTypeTypeOperationsCompartment_107002SemanticChildren(view);
		case OperationOperationParametersCompartmentEditPart.VISUAL_ID:
			return getOperationOperationParametersCompartment_107003SemanticChildren(view);
		case OperationOperationReturnValueCompartmentEditPart.VISUAL_ID:
			return getOperationOperationReturnValueCompartment_107004SemanticChildren(view);
		case EnumaratorEnumaratorValuesCompartmentEditPart.VISUAL_ID:
			return getEnumaratorEnumaratorValuesCompartment_107006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getTypeDefinition_101000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TypeDefinition modelElement = (TypeDefinition) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTypes().iterator(); it.hasNext();) {
			TypeElement childElement = (TypeElement) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeReferenceEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrimitiveEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TypeEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnumaratorEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getTypeTypeAttributesCompartment_107001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Type modelElement = (Type) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getTypeTypeOperationsCompartment_107002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Type modelElement = (Type) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getOperationOperationParametersCompartment_107003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Operation modelElement = (Operation) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getOperationOperationReturnValueCompartment_107004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Operation modelElement = (Operation) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			ReturnValue childElement = modelElement.getReturnValue();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ReturnValueEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getEnumaratorEnumaratorValuesCompartment_107006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Enumarator modelElement = (Enumarator) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getValues().iterator(); it.hasNext();) {
			EnumAttribute childElement = (EnumAttribute) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnumAttributeEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getContainedLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case TypeDefinitionEditPart.VISUAL_ID:
			return getTypeDefinition_101000ContainedLinks(view);
		case TypeReferenceEditPart.VISUAL_ID:
			return getTypeReference_102001ContainedLinks(view);
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_102004ContainedLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_102002ContainedLinks(view);
		case EnumaratorEditPart.VISUAL_ID:
			return getEnumarator_102005ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_103001ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_103002ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_103006ContainedLinks(view);
		case ReturnValueEditPart.VISUAL_ID:
			return getReturnValue_103004ContainedLinks(view);
		case EnumAttributeEditPart.VISUAL_ID:
			return getEnumAttribute_103005ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_104001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case TypeReferenceEditPart.VISUAL_ID:
			return getTypeReference_102001IncomingLinks(view);
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_102004IncomingLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_102002IncomingLinks(view);
		case EnumaratorEditPart.VISUAL_ID:
			return getEnumarator_102005IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_103001IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_103002IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_103006IncomingLinks(view);
		case ReturnValueEditPart.VISUAL_ID:
			return getReturnValue_103004IncomingLinks(view);
		case EnumAttributeEditPart.VISUAL_ID:
			return getEnumAttribute_103005IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_104001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case TypeReferenceEditPart.VISUAL_ID:
			return getTypeReference_102001OutgoingLinks(view);
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_102004OutgoingLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_102002OutgoingLinks(view);
		case EnumaratorEditPart.VISUAL_ID:
			return getEnumarator_102005OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_103001OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_103002OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_103006OutgoingLinks(view);
		case ReturnValueEditPart.VISUAL_ID:
			return getReturnValue_103004OutgoingLinks(view);
		case EnumAttributeEditPart.VISUAL_ID:
			return getEnumAttribute_103005OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_104001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeDefinition_101000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeReference_102001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPrimitive_102004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getType_102002ContainedLinks(
			View view) {
		Type modelElement = (Type) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_TypeExtension_104001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEnumarator_102005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getAttribute_103001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOperation_103002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getParameter_103006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getReturnValue_103004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEnumAttribute_103005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_104001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeReference_102001IncomingLinks(
			View view) {
		TypeReference modelElement = (TypeReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TypeExtension_104001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPrimitive_102004IncomingLinks(
			View view) {
		Primitive modelElement = (Primitive) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TypeExtension_104001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getType_102002IncomingLinks(
			View view) {
		Type modelElement = (Type) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TypeExtension_104001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEnumarator_102005IncomingLinks(
			View view) {
		Enumarator modelElement = (Enumarator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TypeExtension_104001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getAttribute_103001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOperation_103002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getParameter_103006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getReturnValue_103004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEnumAttribute_103005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_104001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeReference_102001OutgoingLinks(
			View view) {
		TypeReference modelElement = (TypeReference) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TypeExtension_104001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPrimitive_102004OutgoingLinks(
			View view) {
		Primitive modelElement = (Primitive) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TypeExtension_104001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getType_102002OutgoingLinks(
			View view) {
		Type modelElement = (Type) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TypeExtension_104001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEnumarator_102005OutgoingLinks(
			View view) {
		Enumarator modelElement = (Enumarator) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TypeExtension_104001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getAttribute_103001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOperation_103002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getParameter_103006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getReturnValue_103004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEnumAttribute_103005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_104001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getContainedTypeModelFacetLinks_TypeExtension_104001(
			Type container) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getExtension().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TypeExtension) {
				continue;
			}
			TypeExtension link = (TypeExtension) linkObject;
			if (TypeExtensionEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TypeElement dst = link.getTarget();
			TypeElement src = link.getSource();
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.TypeExtension_104001,
					TypeExtensionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingTypeModelFacetLinks_TypeExtension_104001(
			TypeElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DomainPackage.eINSTANCE
					.getTypeExtension_Target()
					|| false == setting.getEObject() instanceof TypeExtension) {
				continue;
			}
			TypeExtension link = (TypeExtension) setting.getEObject();
			if (TypeExtensionEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TypeElement src = link.getSource();
			result.add(new DomainLinkDescriptor(src, target, link,
					DomainElementTypes.TypeExtension_104001,
					TypeExtensionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingTypeModelFacetLinks_TypeExtension_104001(
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
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getExtension().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TypeExtension) {
				continue;
			}
			TypeExtension link = (TypeExtension) linkObject;
			if (TypeExtensionEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TypeElement dst = link.getTarget();
			TypeElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.TypeExtension_104001,
					TypeExtensionEditPart.VISUAL_ID));
		}
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
		public List<DomainNodeDescriptor> getSemanticChildren(View view) {
			return DomainDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DomainLinkDescriptor> getContainedLinks(View view) {
			return DomainDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DomainLinkDescriptor> getIncomingLinks(View view) {
			return DomainDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DomainLinkDescriptor> getOutgoingLinks(View view) {
			return DomainDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
