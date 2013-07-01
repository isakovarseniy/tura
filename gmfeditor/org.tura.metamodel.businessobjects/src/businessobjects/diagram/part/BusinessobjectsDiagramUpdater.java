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

import businessobjects.BusinessMethod;
import businessobjects.BusinessObject;
import businessobjects.BusinessObjects;
import businessobjects.diagram.edit.parts.BusinessMethod2EditPart;
import businessobjects.diagram.edit.parts.BusinessMethod3EditPart;
import businessobjects.diagram.edit.parts.BusinessMethod4EditPart;
import businessobjects.diagram.edit.parts.BusinessMethod5EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectRemovetMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectSearchtMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectUpdaeteMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.edit.parts.TypeExtensionEditPart;

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
			BusinessMethod childElement = (BusinessMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == BusinessMethodEditPart.VISUAL_ID) {
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
			BusinessMethod childElement = (BusinessMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == BusinessMethod2EditPart.VISUAL_ID) {
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
			BusinessMethod childElement = (BusinessMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == BusinessMethod3EditPart.VISUAL_ID) {
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
			BusinessMethod childElement = (BusinessMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == BusinessMethod4EditPart.VISUAL_ID) {
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
			BusinessMethod childElement = (BusinessMethod) it.next();
			int visualID = BusinessobjectsVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == BusinessMethod5EditPart.VISUAL_ID) {
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
		case BusinessMethodEditPart.VISUAL_ID:
			return getBusinessMethod_3003ContainedLinks(view);
		case BusinessMethod2EditPart.VISUAL_ID:
			return getBusinessMethod_3004ContainedLinks(view);
		case BusinessMethod3EditPart.VISUAL_ID:
			return getBusinessMethod_3005ContainedLinks(view);
		case BusinessMethod4EditPart.VISUAL_ID:
			return getBusinessMethod_3006ContainedLinks(view);
		case BusinessMethod5EditPart.VISUAL_ID:
			return getBusinessMethod_3007ContainedLinks(view);
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
		case BusinessMethodEditPart.VISUAL_ID:
			return getBusinessMethod_3003IncomingLinks(view);
		case BusinessMethod2EditPart.VISUAL_ID:
			return getBusinessMethod_3004IncomingLinks(view);
		case BusinessMethod3EditPart.VISUAL_ID:
			return getBusinessMethod_3005IncomingLinks(view);
		case BusinessMethod4EditPart.VISUAL_ID:
			return getBusinessMethod_3006IncomingLinks(view);
		case BusinessMethod5EditPart.VISUAL_ID:
			return getBusinessMethod_3007IncomingLinks(view);
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
		case BusinessMethodEditPart.VISUAL_ID:
			return getBusinessMethod_3003OutgoingLinks(view);
		case BusinessMethod2EditPart.VISUAL_ID:
			return getBusinessMethod_3004OutgoingLinks(view);
		case BusinessMethod3EditPart.VISUAL_ID:
			return getBusinessMethod_3005OutgoingLinks(view);
		case BusinessMethod4EditPart.VISUAL_ID:
			return getBusinessMethod_3006OutgoingLinks(view);
		case BusinessMethod5EditPart.VISUAL_ID:
			return getBusinessMethod_3007OutgoingLinks(view);
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
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3007ContainedLinks(
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
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3007IncomingLinks(
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
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BusinessobjectsLinkDescriptor> getBusinessMethod_3007OutgoingLinks(
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
