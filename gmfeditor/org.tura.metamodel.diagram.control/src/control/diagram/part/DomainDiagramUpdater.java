/*
 * 
 */
package control.diagram.part;

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

import control.diagram.edit.parts.ArtificialFieldEditPart;
import control.diagram.edit.parts.ControlsEditPart;
import control.diagram.edit.parts.DataControlDataControlArtificialFieldCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPostQueryTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreCreateTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreDeleteTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreInsertTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreQueryTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlEditPart;
import control.diagram.edit.parts.POSTQueryTriggerEditPart;
import control.diagram.edit.parts.PRECreateTriggerEditPart;
import control.diagram.edit.parts.PREDeleteTriggerEditPart;
import control.diagram.edit.parts.PREFormTriggerEditPart;
import control.diagram.edit.parts.PREInsertTriggerEditPart;
import control.diagram.edit.parts.PREQueryTriggerEditPart;
import control.diagram.edit.parts.RelationEditPart;
import control.diagram.edit.parts.RootEditPart;
import control.diagram.edit.parts.RootRootPreFormTriggerCompartmentEditPart;
import control.diagram.edit.parts.TypeExtensionEditPart;
import control.diagram.providers.DomainElementTypes;
import domain.ArtificialField;
import domain.Controls;
import domain.DataControl;
import domain.DomainPackage;
import domain.POSTQueryTrigger;
import domain.PRECreateTrigger;
import domain.PREDeleteTrigger;
import domain.PREFormTrigger;
import domain.PREInsertTrigger;
import domain.PREQueryTrigger;
import domain.Relation;
import domain.Root;

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
		case ControlsEditPart.VISUAL_ID:
			return getControls_1101000SemanticChildren(view);
		case DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPreQueryTriggerCompartment_1107002SemanticChildren(view);
		case DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPostQueryTriggerCompartment_1107003SemanticChildren(view);
		case DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPreInsertTriggerCompartment_1107004SemanticChildren(view);
		case DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPreDeleteTriggerCompartment_1107005SemanticChildren(view);
		case DataControlDataControlPreCreateTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPreCreateTriggerCompartment_1107006SemanticChildren(view);
		case DataControlDataControlArtificialFieldCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlArtificialFieldCompartment_1107007SemanticChildren(view);
		case RootRootPreFormTriggerCompartmentEditPart.VISUAL_ID:
			return getRootRootPreFormTriggerCompartment_1107001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getControls_1101000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Controls modelElement = (Controls) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getControls().iterator(); it
				.hasNext();) {
			DataControl childElement = (DataControl) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DataControlEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Root childElement = modelElement.getRoot();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RootEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlPreQueryTriggerCompartment_1107002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataControl modelElement = (DataControl) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			PREQueryTrigger childElement = modelElement.getPreQueryTrigger();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PREQueryTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlPostQueryTriggerCompartment_1107003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataControl modelElement = (DataControl) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			POSTQueryTrigger childElement = modelElement.getPostQueryTrigger();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == POSTQueryTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlPreInsertTriggerCompartment_1107004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataControl modelElement = (DataControl) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			PREInsertTrigger childElement = modelElement.getPreInsertTrigger();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PREInsertTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlPreDeleteTriggerCompartment_1107005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataControl modelElement = (DataControl) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			PREDeleteTrigger childElement = modelElement.getPreDeleteTrigger();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PREDeleteTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlPreCreateTriggerCompartment_1107006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataControl modelElement = (DataControl) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			PRECreateTrigger childElement = modelElement.getPreCreateTrigger();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PRECreateTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlArtificialFieldCompartment_1107007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DataControl modelElement = (DataControl) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			ArtificialField childElement = modelElement.getArtificialField();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArtificialFieldEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getRootRootPreFormTriggerCompartment_1107001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Root modelElement = (Root) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			PREFormTrigger childElement = modelElement.getPreFormTrigger();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PREFormTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getContainedLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case ControlsEditPart.VISUAL_ID:
			return getControls_1101000ContainedLinks(view);
		case DataControlEditPart.VISUAL_ID:
			return getDataControl_1102002ContainedLinks(view);
		case RootEditPart.VISUAL_ID:
			return getRoot_1102001ContainedLinks(view);
		case PREQueryTriggerEditPart.VISUAL_ID:
			return getPREQueryTrigger_1103002ContainedLinks(view);
		case POSTQueryTriggerEditPart.VISUAL_ID:
			return getPOSTQueryTrigger_1103003ContainedLinks(view);
		case PREInsertTriggerEditPart.VISUAL_ID:
			return getPREInsertTrigger_1103004ContainedLinks(view);
		case PREDeleteTriggerEditPart.VISUAL_ID:
			return getPREDeleteTrigger_1103005ContainedLinks(view);
		case PRECreateTriggerEditPart.VISUAL_ID:
			return getPRECreateTrigger_1103006ContainedLinks(view);
		case ArtificialFieldEditPart.VISUAL_ID:
			return getArtificialField_1103007ContainedLinks(view);
		case PREFormTriggerEditPart.VISUAL_ID:
			return getPREFormTrigger_1103001ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_1104001ContainedLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1104009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DataControlEditPart.VISUAL_ID:
			return getDataControl_1102002IncomingLinks(view);
		case RootEditPart.VISUAL_ID:
			return getRoot_1102001IncomingLinks(view);
		case PREQueryTriggerEditPart.VISUAL_ID:
			return getPREQueryTrigger_1103002IncomingLinks(view);
		case POSTQueryTriggerEditPart.VISUAL_ID:
			return getPOSTQueryTrigger_1103003IncomingLinks(view);
		case PREInsertTriggerEditPart.VISUAL_ID:
			return getPREInsertTrigger_1103004IncomingLinks(view);
		case PREDeleteTriggerEditPart.VISUAL_ID:
			return getPREDeleteTrigger_1103005IncomingLinks(view);
		case PRECreateTriggerEditPart.VISUAL_ID:
			return getPRECreateTrigger_1103006IncomingLinks(view);
		case ArtificialFieldEditPart.VISUAL_ID:
			return getArtificialField_1103007IncomingLinks(view);
		case PREFormTriggerEditPart.VISUAL_ID:
			return getPREFormTrigger_1103001IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_1104001IncomingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1104009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DataControlEditPart.VISUAL_ID:
			return getDataControl_1102002OutgoingLinks(view);
		case RootEditPart.VISUAL_ID:
			return getRoot_1102001OutgoingLinks(view);
		case PREQueryTriggerEditPart.VISUAL_ID:
			return getPREQueryTrigger_1103002OutgoingLinks(view);
		case POSTQueryTriggerEditPart.VISUAL_ID:
			return getPOSTQueryTrigger_1103003OutgoingLinks(view);
		case PREInsertTriggerEditPart.VISUAL_ID:
			return getPREInsertTrigger_1103004OutgoingLinks(view);
		case PREDeleteTriggerEditPart.VISUAL_ID:
			return getPREDeleteTrigger_1103005OutgoingLinks(view);
		case PRECreateTriggerEditPart.VISUAL_ID:
			return getPRECreateTrigger_1103006OutgoingLinks(view);
		case ArtificialFieldEditPart.VISUAL_ID:
			return getArtificialField_1103007OutgoingLinks(view);
		case PREFormTriggerEditPart.VISUAL_ID:
			return getPREFormTrigger_1103001OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_1104001OutgoingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1104009OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getControls_1101000ContainedLinks(
			View view) {
		Controls modelElement = (Controls) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_1104009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDataControl_1102002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRoot_1102001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREQueryTrigger_1103002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPOSTQueryTrigger_1103003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREInsertTrigger_1103004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREDeleteTrigger_1103005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPRECreateTrigger_1103006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getArtificialField_1103007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREFormTrigger_1103001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_1104001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1104009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDataControl_1102002IncomingLinks(
			View view) {
		DataControl modelElement = (DataControl) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_1104009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRoot_1102001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREQueryTrigger_1103002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPOSTQueryTrigger_1103003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREInsertTrigger_1103004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREDeleteTrigger_1103005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPRECreateTrigger_1103006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getArtificialField_1103007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREFormTrigger_1103001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_1104001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1104009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDataControl_1102002OutgoingLinks(
			View view) {
		DataControl modelElement = (DataControl) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_1104009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRoot_1102001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREQueryTrigger_1103002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPOSTQueryTrigger_1103003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREInsertTrigger_1103004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREDeleteTrigger_1103005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPRECreateTrigger_1103006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getArtificialField_1103007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREFormTrigger_1103001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_1104001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1104009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getContainedTypeModelFacetLinks_Relation_1104009(
			Controls container) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relation) {
				continue;
			}
			Relation link = (Relation) linkObject;
			if (RelationEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataControl dst = link.getDetail();
			DataControl src = link.getMaster();
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.Relation_1104009,
					RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_1104009(
			DataControl target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DomainPackage.eINSTANCE
					.getRelation_Detail()
					|| false == setting.getEObject() instanceof Relation) {
				continue;
			}
			Relation link = (Relation) setting.getEObject();
			if (RelationEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataControl src = link.getMaster();
			result.add(new DomainLinkDescriptor(src, target, link,
					DomainElementTypes.Relation_1104009,
					RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingTypeModelFacetLinks_Relation_1104009(
			DataControl source) {
		Controls container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Controls) {
				container = (Controls) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relation) {
				continue;
			}
			Relation link = (Relation) linkObject;
			if (RelationEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataControl dst = link.getDetail();
			DataControl src = link.getMaster();
			if (src != source) {
				continue;
			}
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.Relation_1104009,
					RelationEditPart.VISUAL_ID));
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
