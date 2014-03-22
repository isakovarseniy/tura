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

import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.edit.parts.CreateMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodEditPart;
import businessobjects.diagram.edit.parts.RelationEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodEditPart;
import businessobjects.diagram.edit.parts.TypeExtensionEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodEditPart;
import domain.BusinessObject;
import domain.BusinessObjects;
import domain.CreateMethod;
import domain.InsertMethod;
import domain.OtherMethod;
import domain.RemoveMethod;
import domain.SearchMethod;
import domain.UpdateMethod;

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
		case BusinessObjectsEditPart.VISUAL_ID:
			return getBusinessObjects_601000SemanticChildren(view);
		case BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectCreateMethodsCompartment_607001SemanticChildren(view);
		case BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectInsertMethodsCompartment_607002SemanticChildren(view);
		case BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectUpdateMethodsCompartment_607003SemanticChildren(view);
		case BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectRemoveMethodsCompartment_607004SemanticChildren(view);
		case BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectSearchMethodsCompartment_607005SemanticChildren(view);
		case BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart.VISUAL_ID:
			return getBusinessObjectBusinessObjectOthersMethodsCompartment_607006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getBusinessObjects_601000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		BusinessObjects modelElement = (BusinessObjects) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBusinessObject().iterator(); it
				.hasNext();) {
			BusinessObject childElement = (BusinessObject) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BusinessObjectEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getBusinessObjectBusinessObjectCreateMethodsCompartment_607001SemanticChildren(
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
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCreateMethods().iterator(); it
				.hasNext();) {
			CreateMethod childElement = (CreateMethod) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CreateMethodEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getBusinessObjectBusinessObjectInsertMethodsCompartment_607002SemanticChildren(
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
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInsertMethods().iterator(); it
				.hasNext();) {
			InsertMethod childElement = (InsertMethod) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InsertMethodEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getBusinessObjectBusinessObjectUpdateMethodsCompartment_607003SemanticChildren(
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
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUpdateMethods().iterator(); it
				.hasNext();) {
			UpdateMethod childElement = (UpdateMethod) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == UpdateMethodEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getBusinessObjectBusinessObjectRemoveMethodsCompartment_607004SemanticChildren(
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
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRemoveMethods().iterator(); it
				.hasNext();) {
			RemoveMethod childElement = (RemoveMethod) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RemoveMethodEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getBusinessObjectBusinessObjectSearchMethodsCompartment_607005SemanticChildren(
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
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSearchMethods().iterator(); it
				.hasNext();) {
			SearchMethod childElement = (SearchMethod) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SearchMethodEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getBusinessObjectBusinessObjectOthersMethodsCompartment_607006SemanticChildren(
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
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOthersMethods().iterator(); it
				.hasNext();) {
			OtherMethod childElement = (OtherMethod) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OtherMethodEditPart.VISUAL_ID) {
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
		case BusinessObjectsEditPart.VISUAL_ID:
			return getBusinessObjects_601000ContainedLinks(view);
		case BusinessObjectEditPart.VISUAL_ID:
			return getBusinessObject_602001ContainedLinks(view);
		case CreateMethodEditPart.VISUAL_ID:
			return getCreateMethod_603001ContainedLinks(view);
		case InsertMethodEditPart.VISUAL_ID:
			return getInsertMethod_603002ContainedLinks(view);
		case UpdateMethodEditPart.VISUAL_ID:
			return getUpdateMethod_603007ContainedLinks(view);
		case RemoveMethodEditPart.VISUAL_ID:
			return getRemoveMethod_603008ContainedLinks(view);
		case SearchMethodEditPart.VISUAL_ID:
			return getSearchMethod_603009ContainedLinks(view);
		case OtherMethodEditPart.VISUAL_ID:
			return getOtherMethod_603006ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_604001ContainedLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_604011ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case BusinessObjectEditPart.VISUAL_ID:
			return getBusinessObject_602001IncomingLinks(view);
		case CreateMethodEditPart.VISUAL_ID:
			return getCreateMethod_603001IncomingLinks(view);
		case InsertMethodEditPart.VISUAL_ID:
			return getInsertMethod_603002IncomingLinks(view);
		case UpdateMethodEditPart.VISUAL_ID:
			return getUpdateMethod_603007IncomingLinks(view);
		case RemoveMethodEditPart.VISUAL_ID:
			return getRemoveMethod_603008IncomingLinks(view);
		case SearchMethodEditPart.VISUAL_ID:
			return getSearchMethod_603009IncomingLinks(view);
		case OtherMethodEditPart.VISUAL_ID:
			return getOtherMethod_603006IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_604001IncomingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_604011IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case BusinessObjectEditPart.VISUAL_ID:
			return getBusinessObject_602001OutgoingLinks(view);
		case CreateMethodEditPart.VISUAL_ID:
			return getCreateMethod_603001OutgoingLinks(view);
		case InsertMethodEditPart.VISUAL_ID:
			return getInsertMethod_603002OutgoingLinks(view);
		case UpdateMethodEditPart.VISUAL_ID:
			return getUpdateMethod_603007OutgoingLinks(view);
		case RemoveMethodEditPart.VISUAL_ID:
			return getRemoveMethod_603008OutgoingLinks(view);
		case SearchMethodEditPart.VISUAL_ID:
			return getSearchMethod_603009OutgoingLinks(view);
		case OtherMethodEditPart.VISUAL_ID:
			return getOtherMethod_603006OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_604001OutgoingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_604011OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getBusinessObjects_601000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getBusinessObject_602001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCreateMethod_603001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInsertMethod_603002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getUpdateMethod_603007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRemoveMethod_603008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSearchMethod_603009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOtherMethod_603006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_604001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_604011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getBusinessObject_602001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCreateMethod_603001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInsertMethod_603002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getUpdateMethod_603007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRemoveMethod_603008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSearchMethod_603009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOtherMethod_603006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_604001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_604011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getBusinessObject_602001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCreateMethod_603001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInsertMethod_603002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getUpdateMethod_603007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRemoveMethod_603008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSearchMethod_603009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOtherMethod_603006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_604001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_604011OutgoingLinks(
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
