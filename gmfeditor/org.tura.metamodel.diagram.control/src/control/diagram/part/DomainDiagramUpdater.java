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
import control.diagram.edit.parts.CreateTriggerEditPart;
import control.diagram.edit.parts.DataControlDataControlArtificialFieldsCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlCreateCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlInsertCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPostCreateTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPostQueryTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreDeleteTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreInsertTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreQueryTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreUpdateTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlRemoveCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlSearchCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlUpdateCompartmentEditPart;
import control.diagram.edit.parts.DataControlEditPart;
import control.diagram.edit.parts.DeleteTriggerEditPart;
import control.diagram.edit.parts.DependencyEditPart;
import control.diagram.edit.parts.FormVariableEditPart;
import control.diagram.edit.parts.InsertTriggerEditPart;
import control.diagram.edit.parts.POSTCreateTriggerEditPart;
import control.diagram.edit.parts.POSTQueryTriggerEditPart;
import control.diagram.edit.parts.PREDeleteTriggerEditPart;
import control.diagram.edit.parts.PREFormTriggerEditPart;
import control.diagram.edit.parts.PREInsertTriggerEditPart;
import control.diagram.edit.parts.PREQueryTriggerEditPart;
import control.diagram.edit.parts.PREUpdateTriggerEditPart;
import control.diagram.edit.parts.RelationEditPart;
import control.diagram.edit.parts.RootEditPart;
import control.diagram.edit.parts.RootRootPreFormTriggerCompartmentEditPart;
import control.diagram.edit.parts.RootRootVariablesCompartmentEditPart;
import control.diagram.edit.parts.SearchTriggerEditPart;
import control.diagram.edit.parts.UpdateTriggerEditPart;
import control.diagram.providers.DomainElementTypes;
import domain.ArtificialField;
import domain.Controls;
import domain.CreateTrigger;
import domain.DataControl;
import domain.DeleteTrigger;
import domain.Dependency;
import domain.DomainPackage;
import domain.FormVariable;
import domain.InsertTrigger;
import domain.POSTCreateTrigger;
import domain.POSTQueryTrigger;
import domain.PREDeleteTrigger;
import domain.PREFormTrigger;
import domain.PREInsertTrigger;
import domain.PREQueryTrigger;
import domain.PREUpdateTrigger;
import domain.Relation;
import domain.Root;
import domain.SearchTrigger;
import domain.UpdateTrigger;

/**
 * @generated
 */
public class DomainDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getSemanticChildren(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case ControlsEditPart.VISUAL_ID:
			return getControls_1101000SemanticChildren(view);
		case RootRootPreFormTriggerCompartmentEditPart.VISUAL_ID:
			return getRootRootPreFormTriggerCompartment_1107001SemanticChildren(view);
		case RootRootVariablesCompartmentEditPart.VISUAL_ID:
			return getRootRootVariablesCompartment_1107014SemanticChildren(view);
		case DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPreQueryTriggerCompartment_1107002SemanticChildren(view);
		case DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPostQueryTriggerCompartment_1107003SemanticChildren(view);
		case DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPreInsertTriggerCompartment_1107004SemanticChildren(view);
		case DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPreDeleteTriggerCompartment_1107005SemanticChildren(view);
		case DataControlDataControlPostCreateTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPostCreateTriggerCompartment_1107006SemanticChildren(view);
		case DataControlDataControlPreUpdateTriggerCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlPreUpdateTriggerCompartment_1107007SemanticChildren(view);
		case DataControlDataControlCreateCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlCreateCompartment_1107008SemanticChildren(view);
		case DataControlDataControlInsertCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlInsertCompartment_1107009SemanticChildren(view);
		case DataControlDataControlUpdateCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlUpdateCompartment_1107010SemanticChildren(view);
		case DataControlDataControlRemoveCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlRemoveCompartment_1107011SemanticChildren(view);
		case DataControlDataControlSearchCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlSearchCompartment_1107012SemanticChildren(view);
		case DataControlDataControlArtificialFieldsCompartmentEditPart.VISUAL_ID:
			return getDataControlDataControlArtificialFieldsCompartment_1107013SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getControls_1101000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Controls modelElement = (Controls) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			Root childElement = modelElement.getRoot();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RootEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getControls().iterator(); it.hasNext();) {
			DataControl childElement = (DataControl) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataControlEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getRootRootPreFormTriggerCompartment_1107001SemanticChildren(View view) {
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
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PREFormTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getRootRootVariablesCompartment_1107014SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Root modelElement = (Root) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it.hasNext();) {
			FormVariable childElement = (FormVariable) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FormVariableEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
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
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
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
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
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
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
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
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PREDeleteTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlPostCreateTriggerCompartment_1107006SemanticChildren(
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
			POSTCreateTrigger childElement = modelElement.getPostCreateTrigger();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == POSTCreateTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlPreUpdateTriggerCompartment_1107007SemanticChildren(
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
			PREUpdateTrigger childElement = modelElement.getPreUpdateTrigger();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PREUpdateTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlCreateCompartment_1107008SemanticChildren(
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
			CreateTrigger childElement = modelElement.getCreate();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CreateTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlInsertCompartment_1107009SemanticChildren(
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
			InsertTrigger childElement = modelElement.getInsert();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InsertTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlUpdateCompartment_1107010SemanticChildren(
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
			UpdateTrigger childElement = modelElement.getUpdate();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UpdateTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlRemoveCompartment_1107011SemanticChildren(
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
			DeleteTrigger childElement = modelElement.getRemove();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DeleteTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlSearchCompartment_1107012SemanticChildren(
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
			SearchTrigger childElement = modelElement.getSearch();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SearchTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDataControlDataControlArtificialFieldsCompartment_1107013SemanticChildren(
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
		for (Iterator<?> it = modelElement.getArtificialFields().iterator(); it.hasNext();) {
			ArtificialField childElement = (ArtificialField) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ArtificialFieldEditPart.VISUAL_ID) {
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
		case ControlsEditPart.VISUAL_ID:
			return getControls_1101000ContainedLinks(view);
		case RootEditPart.VISUAL_ID:
			return getRoot_1102001ContainedLinks(view);
		case DataControlEditPart.VISUAL_ID:
			return getDataControl_1102002ContainedLinks(view);
		case PREFormTriggerEditPart.VISUAL_ID:
			return getPREFormTrigger_1103001ContainedLinks(view);
		case FormVariableEditPart.VISUAL_ID:
			return getFormVariable_1103017ContainedLinks(view);
		case PREQueryTriggerEditPart.VISUAL_ID:
			return getPREQueryTrigger_1103002ContainedLinks(view);
		case POSTQueryTriggerEditPart.VISUAL_ID:
			return getPOSTQueryTrigger_1103003ContainedLinks(view);
		case PREInsertTriggerEditPart.VISUAL_ID:
			return getPREInsertTrigger_1103004ContainedLinks(view);
		case PREDeleteTriggerEditPart.VISUAL_ID:
			return getPREDeleteTrigger_1103005ContainedLinks(view);
		case POSTCreateTriggerEditPart.VISUAL_ID:
			return getPOSTCreateTrigger_1103011ContainedLinks(view);
		case PREUpdateTriggerEditPart.VISUAL_ID:
			return getPREUpdateTrigger_1103010ContainedLinks(view);
		case CreateTriggerEditPart.VISUAL_ID:
			return getCreateTrigger_1103012ContainedLinks(view);
		case InsertTriggerEditPart.VISUAL_ID:
			return getInsertTrigger_1103013ContainedLinks(view);
		case UpdateTriggerEditPart.VISUAL_ID:
			return getUpdateTrigger_1103014ContainedLinks(view);
		case DeleteTriggerEditPart.VISUAL_ID:
			return getDeleteTrigger_1103015ContainedLinks(view);
		case SearchTriggerEditPart.VISUAL_ID:
			return getSearchTrigger_1103016ContainedLinks(view);
		case ArtificialFieldEditPart.VISUAL_ID:
			return getArtificialField_1103008ContainedLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1104009ContainedLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_1104010ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case RootEditPart.VISUAL_ID:
			return getRoot_1102001IncomingLinks(view);
		case DataControlEditPart.VISUAL_ID:
			return getDataControl_1102002IncomingLinks(view);
		case PREFormTriggerEditPart.VISUAL_ID:
			return getPREFormTrigger_1103001IncomingLinks(view);
		case FormVariableEditPart.VISUAL_ID:
			return getFormVariable_1103017IncomingLinks(view);
		case PREQueryTriggerEditPart.VISUAL_ID:
			return getPREQueryTrigger_1103002IncomingLinks(view);
		case POSTQueryTriggerEditPart.VISUAL_ID:
			return getPOSTQueryTrigger_1103003IncomingLinks(view);
		case PREInsertTriggerEditPart.VISUAL_ID:
			return getPREInsertTrigger_1103004IncomingLinks(view);
		case PREDeleteTriggerEditPart.VISUAL_ID:
			return getPREDeleteTrigger_1103005IncomingLinks(view);
		case POSTCreateTriggerEditPart.VISUAL_ID:
			return getPOSTCreateTrigger_1103011IncomingLinks(view);
		case PREUpdateTriggerEditPart.VISUAL_ID:
			return getPREUpdateTrigger_1103010IncomingLinks(view);
		case CreateTriggerEditPart.VISUAL_ID:
			return getCreateTrigger_1103012IncomingLinks(view);
		case InsertTriggerEditPart.VISUAL_ID:
			return getInsertTrigger_1103013IncomingLinks(view);
		case UpdateTriggerEditPart.VISUAL_ID:
			return getUpdateTrigger_1103014IncomingLinks(view);
		case DeleteTriggerEditPart.VISUAL_ID:
			return getDeleteTrigger_1103015IncomingLinks(view);
		case SearchTriggerEditPart.VISUAL_ID:
			return getSearchTrigger_1103016IncomingLinks(view);
		case ArtificialFieldEditPart.VISUAL_ID:
			return getArtificialField_1103008IncomingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1104009IncomingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_1104010IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case RootEditPart.VISUAL_ID:
			return getRoot_1102001OutgoingLinks(view);
		case DataControlEditPart.VISUAL_ID:
			return getDataControl_1102002OutgoingLinks(view);
		case PREFormTriggerEditPart.VISUAL_ID:
			return getPREFormTrigger_1103001OutgoingLinks(view);
		case FormVariableEditPart.VISUAL_ID:
			return getFormVariable_1103017OutgoingLinks(view);
		case PREQueryTriggerEditPart.VISUAL_ID:
			return getPREQueryTrigger_1103002OutgoingLinks(view);
		case POSTQueryTriggerEditPart.VISUAL_ID:
			return getPOSTQueryTrigger_1103003OutgoingLinks(view);
		case PREInsertTriggerEditPart.VISUAL_ID:
			return getPREInsertTrigger_1103004OutgoingLinks(view);
		case PREDeleteTriggerEditPart.VISUAL_ID:
			return getPREDeleteTrigger_1103005OutgoingLinks(view);
		case POSTCreateTriggerEditPart.VISUAL_ID:
			return getPOSTCreateTrigger_1103011OutgoingLinks(view);
		case PREUpdateTriggerEditPart.VISUAL_ID:
			return getPREUpdateTrigger_1103010OutgoingLinks(view);
		case CreateTriggerEditPart.VISUAL_ID:
			return getCreateTrigger_1103012OutgoingLinks(view);
		case InsertTriggerEditPart.VISUAL_ID:
			return getInsertTrigger_1103013OutgoingLinks(view);
		case UpdateTriggerEditPart.VISUAL_ID:
			return getUpdateTrigger_1103014OutgoingLinks(view);
		case DeleteTriggerEditPart.VISUAL_ID:
			return getDeleteTrigger_1103015OutgoingLinks(view);
		case SearchTriggerEditPart.VISUAL_ID:
			return getSearchTrigger_1103016OutgoingLinks(view);
		case ArtificialFieldEditPart.VISUAL_ID:
			return getArtificialField_1103008OutgoingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1104009OutgoingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_1104010OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getControls_1101000ContainedLinks(View view) {
		Controls modelElement = (Controls) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_1104009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependency_1104010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRoot_1102001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDataControl_1102002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREFormTrigger_1103001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getFormVariable_1103017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREQueryTrigger_1103002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPOSTQueryTrigger_1103003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREInsertTrigger_1103004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREDeleteTrigger_1103005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPOSTCreateTrigger_1103011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREUpdateTrigger_1103010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCreateTrigger_1103012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInsertTrigger_1103013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getUpdateTrigger_1103014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeleteTrigger_1103015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSearchTrigger_1103016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getArtificialField_1103008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1104009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDependency_1104010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRoot_1102001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDataControl_1102002IncomingLinks(View view) {
		DataControl modelElement = (DataControl) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view
				.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_1104009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_1104010(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREFormTrigger_1103001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getFormVariable_1103017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREQueryTrigger_1103002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPOSTQueryTrigger_1103003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREInsertTrigger_1103004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREDeleteTrigger_1103005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPOSTCreateTrigger_1103011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREUpdateTrigger_1103010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCreateTrigger_1103012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInsertTrigger_1103013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getUpdateTrigger_1103014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeleteTrigger_1103015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSearchTrigger_1103016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getArtificialField_1103008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1104009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDependency_1104010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRoot_1102001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDataControl_1102002OutgoingLinks(View view) {
		DataControl modelElement = (DataControl) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_1104009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_1104010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREFormTrigger_1103001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getFormVariable_1103017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREQueryTrigger_1103002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPOSTQueryTrigger_1103003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREInsertTrigger_1103004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREDeleteTrigger_1103005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPOSTCreateTrigger_1103011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getPREUpdateTrigger_1103010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCreateTrigger_1103012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInsertTrigger_1103013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getUpdateTrigger_1103014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeleteTrigger_1103015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSearchTrigger_1103016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getArtificialField_1103008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1104009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDependency_1104010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getContainedTypeModelFacetLinks_Relation_1104009(Controls container) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relation) {
				continue;
			}
			Relation link = (Relation) linkObject;
			if (RelationEditPart.VISUAL_ID != DomainVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataControl dst = link.getDetail();
			DataControl src = link.getMaster();
			result.add(new DomainLinkDescriptor(src, dst, link, DomainElementTypes.Relation_1104009,
					RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getContainedTypeModelFacetLinks_Dependency_1104010(
			Controls container) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getDependencies().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != DomainVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataControl dst = link.getDetail();
			DataControl src = link.getMaster();
			result.add(new DomainLinkDescriptor(src, dst, link, DomainElementTypes.Dependency_1104010,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_1104009(DataControl target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DomainPackage.eINSTANCE.getRelation_Detail()
					|| false == setting.getEObject() instanceof Relation) {
				continue;
			}
			Relation link = (Relation) setting.getEObject();
			if (RelationEditPart.VISUAL_ID != DomainVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataControl src = link.getMaster();
			result.add(new DomainLinkDescriptor(src, target, link, DomainElementTypes.Relation_1104009,
					RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingTypeModelFacetLinks_Dependency_1104010(
			DataControl target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DomainPackage.eINSTANCE.getDependency_Detail()
					|| false == setting.getEObject() instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) setting.getEObject();
			if (DependencyEditPart.VISUAL_ID != DomainVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataControl src = link.getMaster();
			result.add(new DomainLinkDescriptor(src, target, link, DomainElementTypes.Dependency_1104010,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingTypeModelFacetLinks_Relation_1104009(DataControl source) {
		Controls container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Controls) {
				container = (Controls) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relation) {
				continue;
			}
			Relation link = (Relation) linkObject;
			if (RelationEditPart.VISUAL_ID != DomainVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataControl dst = link.getDetail();
			DataControl src = link.getMaster();
			if (src != source) {
				continue;
			}
			result.add(new DomainLinkDescriptor(src, dst, link, DomainElementTypes.Relation_1104009,
					RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingTypeModelFacetLinks_Dependency_1104010(DataControl source) {
		Controls container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Controls) {
				container = (Controls) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getDependencies().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != DomainVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			DataControl dst = link.getDetail();
			DataControl src = link.getMaster();
			if (src != source) {
				continue;
			}
			result.add(new DomainLinkDescriptor(src, dst, link, DomainElementTypes.Dependency_1104010,
					DependencyEditPart.VISUAL_ID));
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
