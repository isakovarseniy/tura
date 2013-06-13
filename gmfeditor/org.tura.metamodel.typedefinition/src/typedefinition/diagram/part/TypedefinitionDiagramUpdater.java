/*
 * 
 */
package typedefinition.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import typedefinition.Attribute;
import typedefinition.Operation;
import typedefinition.ReturnValue;
import typedefinition.Type;
import typedefinition.TypeDefinition;
import typedefinition.diagram.edit.parts.Attribute2EditPart;
import typedefinition.diagram.edit.parts.AttributeEditPart;
import typedefinition.diagram.edit.parts.OperationEditPart;
import typedefinition.diagram.edit.parts.OperationOperationParametersCompartmentEditPart;
import typedefinition.diagram.edit.parts.OperationOperationReturnValueCompartmentEditPart;
import typedefinition.diagram.edit.parts.ReturnValueEditPart;
import typedefinition.diagram.edit.parts.TypeDefinitionEditPart;
import typedefinition.diagram.edit.parts.TypeEditPart;
import typedefinition.diagram.edit.parts.TypeTypeAttributesCompartmentEditPart;
import typedefinition.diagram.edit.parts.TypeTypeOperationsCompartmentEditPart;

/**
 * @generated
 */
public class TypedefinitionDiagramUpdater {

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
			Type childElement = (Type) it.next();
			int visualID = TypedefinitionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeEditPart.VISUAL_ID) {
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
	public static List<TypedefinitionLinkDescriptor> getContainedLinks(View view) {
		switch (TypedefinitionVisualIDRegistry.getVisualID(view)) {
		case TypeDefinitionEditPart.VISUAL_ID:
			return getTypeDefinition_1000ContainedLinks(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2001ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002ContainedLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003ContainedLinks(view);
		case ReturnValueEditPart.VISUAL_ID:
			return getReturnValue_3004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getIncomingLinks(View view) {
		switch (TypedefinitionVisualIDRegistry.getVisualID(view)) {
		case TypeEditPart.VISUAL_ID:
			return getType_2001IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002IncomingLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003IncomingLinks(view);
		case ReturnValueEditPart.VISUAL_ID:
			return getReturnValue_3004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TypedefinitionLinkDescriptor> getOutgoingLinks(View view) {
		switch (TypedefinitionVisualIDRegistry.getVisualID(view)) {
		case TypeEditPart.VISUAL_ID:
			return getType_2001OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002OutgoingLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003OutgoingLinks(view);
		case ReturnValueEditPart.VISUAL_ID:
			return getReturnValue_3004OutgoingLinks(view);
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
	public static List<TypedefinitionLinkDescriptor> getType_2001ContainedLinks(
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
	public static List<TypedefinitionLinkDescriptor> getType_2001IncomingLinks(
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
	public static List<TypedefinitionLinkDescriptor> getType_2001OutgoingLinks(
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
