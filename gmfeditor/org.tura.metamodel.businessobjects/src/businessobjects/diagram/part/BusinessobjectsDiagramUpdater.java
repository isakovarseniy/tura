/*
 * 
 */
package businessobjects.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import businessobjects.BusinessObject;
import businessobjects.BusinessObjects;
import businessobjects.CreateMethod;
import businessobjects.InsertMethod;
import businessobjects.OtherMethod;
import businessobjects.RemoveMethod;
import businessobjects.SearchMethod;
import businessobjects.UpdateMethod;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectRemovetMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectSearchtMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectUpdaeteMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.edit.parts.CreateMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodEditPart;
import businessobjects.diagram.edit.parts.TypeExtensionEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodEditPart;

/**
 * @generated
 */
public class BusinessobjectsDiagramUpdater {

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
	public static List<BusinessobjectsNodeDescriptor> getSemanticChildren(
			View view) {
		switch (BusinessobjectsVisualIDRegistry.getVisualID(view)) {
		case BusinessObjectsEditPart.VISUAL_ID:
			return getBusinessObjects_1000SemanticChildren(view);
		case BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectCreateMethodsCompartment_7003SemanticChildren(view);
		case BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectInsertMethodsCompartment_7004SemanticChildren(view);
		case BusinessObjectBusinessObjectUpdaeteMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectUpdaeteMethodsCompartment_7005SemanticChildren(view);
		case BusinessObjectBusinessObjectRemovetMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectRemovetMethodsCompartment_7006SemanticChildren(view);
		case BusinessObjectBusinessObjectSearchtMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectSearchtMethodsCompartment_7007SemanticChildren(view);
		case BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectOthersMethodsCompartment_7008SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsNodeDescriptor> getBusinessObjects_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		BusinessObjects modelElement = (BusinessObjects) view.getElement();
		LinkedList<BusinessobjectsNodeDescriptor> result = new LinkedList<BusinessobjectsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBusinessObject().iterator(); it
				.hasNext();) {
			BusinessObject childElement = (BusinessObject) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == BusinessObjectEditPart.VISUAL_ID) {
				result.add(new BusinessobjectsNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsNodeDescriptor> getBusinessObjectBusinessObjectCreateMethodsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BusinessObject modelElement = (BusinessObject) containerView
				.getElement();
		LinkedList<BusinessobjectsNodeDescriptor> result = new LinkedList<BusinessobjectsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCreateMethods().iterator(); it
				.hasNext();) {
			CreateMethod childElement = (CreateMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == CreateMethodEditPart.VISUAL_ID) {
				result.add(new BusinessobjectsNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsNodeDescriptor> getBusinessObjectBusinessObjectInsertMethodsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BusinessObject modelElement = (BusinessObject) containerView
				.getElement();
		LinkedList<BusinessobjectsNodeDescriptor> result = new LinkedList<BusinessobjectsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInsertMethods().iterator(); it
				.hasNext();) {
			InsertMethod childElement = (InsertMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == InsertMethodEditPart.VISUAL_ID) {
				result.add(new BusinessobjectsNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsNodeDescriptor> getBusinessObjectBusinessObjectUpdaeteMethodsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BusinessObject modelElement = (BusinessObject) containerView
				.getElement();
		LinkedList<BusinessobjectsNodeDescriptor> result = new LinkedList<BusinessobjectsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUpdaeteMethods().iterator(); it
				.hasNext();) {
			UpdateMethod childElement = (UpdateMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == UpdateMethodEditPart.VISUAL_ID) {
				result.add(new BusinessobjectsNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsNodeDescriptor> getBusinessObjectBusinessObjectRemovetMethodsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BusinessObject modelElement = (BusinessObject) containerView
				.getElement();
		LinkedList<BusinessobjectsNodeDescriptor> result = new LinkedList<BusinessobjectsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRemovetMethods().iterator(); it
				.hasNext();) {
			RemoveMethod childElement = (RemoveMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == RemoveMethodEditPart.VISUAL_ID) {
				result.add(new BusinessobjectsNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsNodeDescriptor> getBusinessObjectBusinessObjectSearchtMethodsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BusinessObject modelElement = (BusinessObject) containerView
				.getElement();
		LinkedList<BusinessobjectsNodeDescriptor> result = new LinkedList<BusinessobjectsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSearchtMethods().iterator(); it
				.hasNext();) {
			SearchMethod childElement = (SearchMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == SearchMethodEditPart.VISUAL_ID) {
				result.add(new BusinessobjectsNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsNodeDescriptor> getBusinessObjectBusinessObjectOthersMethodsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BusinessObject modelElement = (BusinessObject) containerView
				.getElement();
		LinkedList<BusinessobjectsNodeDescriptor> result = new LinkedList<BusinessobjectsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOthersMethods().iterator(); it
				.hasNext();) {
			OtherMethod childElement = (OtherMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == OtherMethodEditPart.VISUAL_ID) {
				result.add(new BusinessobjectsNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getContainedLinks(
			View view) {
		switch (BusinessobjectsVisualIDRegistry.getVisualID(view)) {
		case BusinessObjectsEditPart.VISUAL_ID:
			return getBusinessObjects_1000ContainedLinks(view);
		case BusinessObjectEditPart.VISUAL_ID:
			return getBusinessObject_2003ContainedLinks(view);
		case CreateMethodEditPart.VISUAL_ID:
			return getCreateMethod_3009ContainedLinks(view);
		case InsertMethodEditPart.VISUAL_ID:
			return getInsertMethod_3010ContainedLinks(view);
		case UpdateMethodEditPart.VISUAL_ID:
			return getUpdateMethod_3011ContainedLinks(view);
		case RemoveMethodEditPart.VISUAL_ID:
			return getRemoveMethod_3012ContainedLinks(view);
		case SearchMethodEditPart.VISUAL_ID:
			return getSearchMethod_3013ContainedLinks(view);
		case OtherMethodEditPart.VISUAL_ID:
			return getOtherMethod_3014ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getIncomingLinks(View view) {
		switch (BusinessobjectsVisualIDRegistry.getVisualID(view)) {
		case BusinessObjectEditPart.VISUAL_ID:
			return getBusinessObject_2003IncomingLinks(view);
		case CreateMethodEditPart.VISUAL_ID:
			return getCreateMethod_3009IncomingLinks(view);
		case InsertMethodEditPart.VISUAL_ID:
			return getInsertMethod_3010IncomingLinks(view);
		case UpdateMethodEditPart.VISUAL_ID:
			return getUpdateMethod_3011IncomingLinks(view);
		case RemoveMethodEditPart.VISUAL_ID:
			return getRemoveMethod_3012IncomingLinks(view);
		case SearchMethodEditPart.VISUAL_ID:
			return getSearchMethod_3013IncomingLinks(view);
		case OtherMethodEditPart.VISUAL_ID:
			return getOtherMethod_3014IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getOutgoingLinks(View view) {
		switch (BusinessobjectsVisualIDRegistry.getVisualID(view)) {
		case BusinessObjectEditPart.VISUAL_ID:
			return getBusinessObject_2003OutgoingLinks(view);
		case CreateMethodEditPart.VISUAL_ID:
			return getCreateMethod_3009OutgoingLinks(view);
		case InsertMethodEditPart.VISUAL_ID:
			return getInsertMethod_3010OutgoingLinks(view);
		case UpdateMethodEditPart.VISUAL_ID:
			return getUpdateMethod_3011OutgoingLinks(view);
		case RemoveMethodEditPart.VISUAL_ID:
			return getRemoveMethod_3012OutgoingLinks(view);
		case SearchMethodEditPart.VISUAL_ID:
			return getSearchMethod_3013OutgoingLinks(view);
		case OtherMethodEditPart.VISUAL_ID:
			return getOtherMethod_3014OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessObjects_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessObject_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getCreateMethod_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getInsertMethod_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getUpdateMethod_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getRemoveMethod_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getSearchMethod_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getOtherMethod_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getTypeExtension_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessObject_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getCreateMethod_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getInsertMethod_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getUpdateMethod_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getRemoveMethod_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getSearchMethod_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getOtherMethod_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getTypeExtension_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessObject_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getCreateMethod_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getInsertMethod_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getUpdateMethod_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getRemoveMethod_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getSearchMethod_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getOtherMethod_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getTypeExtension_4001OutgoingLinks(
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
		public List<BusinessobjectsNodeDescriptor> getSemanticChildren(View view) {
			return BusinessobjectsDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<BusinessobjectsLinkDescriptor> getContainedLinks(View view) {
			return BusinessobjectsDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<BusinessobjectsLinkDescriptor> getIncomingLinks(View view) {
			return BusinessobjectsDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<BusinessobjectsLinkDescriptor> getOutgoingLinks(View view) {
			return BusinessobjectsDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
