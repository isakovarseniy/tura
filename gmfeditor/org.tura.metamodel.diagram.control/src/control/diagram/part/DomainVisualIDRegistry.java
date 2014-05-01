/*
 * 
 */
package control.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import control.diagram.edit.parts.ArtificialFieldEditPart;
import control.diagram.edit.parts.ArtificialFieldNameEditPart;
import control.diagram.edit.parts.ControlsEditPart;
import control.diagram.edit.parts.CreateTriggerEditPart;
import control.diagram.edit.parts.CreateTriggerFakeMethodEditPart;
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
import control.diagram.edit.parts.DataControlNameEditPart;
import control.diagram.edit.parts.DeleteTriggerEditPart;
import control.diagram.edit.parts.DeleteTriggerFakeMethodEditPart;
import control.diagram.edit.parts.InsertTriggerEditPart;
import control.diagram.edit.parts.InsertTriggerFakeMethodEditPart;
import control.diagram.edit.parts.POSTCreateTriggerEditPart;
import control.diagram.edit.parts.POSTCreateTriggerFakeMethodEditPart;
import control.diagram.edit.parts.POSTQueryTriggerEditPart;
import control.diagram.edit.parts.POSTQueryTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREDeleteTriggerEditPart;
import control.diagram.edit.parts.PREDeleteTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREFormTriggerEditPart;
import control.diagram.edit.parts.PREFormTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREInsertTriggerEditPart;
import control.diagram.edit.parts.PREInsertTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREQueryTriggerEditPart;
import control.diagram.edit.parts.PREQueryTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREUpdateTriggerEditPart;
import control.diagram.edit.parts.PREUpdateTriggerFakeMethodEditPart;
import control.diagram.edit.parts.RelationEditPart;
import control.diagram.edit.parts.RootEditPart;
import control.diagram.edit.parts.RootNameEditPart;
import control.diagram.edit.parts.RootRootPreFormTriggerCompartmentEditPart;
import control.diagram.edit.parts.SearchTriggerEditPart;
import control.diagram.edit.parts.SearchTriggerFakeMethodEditPart;
import control.diagram.edit.parts.UpdateTriggerEditPart;
import control.diagram.edit.parts.UpdateTriggerFakeMethodEditPart;
import domain.Controls;
import domain.DomainPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DomainVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.control/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ControlsEditPart.MODEL_ID.equals(view.getType())) {
				return ControlsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return control.diagram.part.DomainVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				DomainDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DomainPackage.eINSTANCE.getControls().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Controls) domainElement)) {
			return ControlsEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = control.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!ControlsEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ControlsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = control.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ControlsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ControlsEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getRoot().isSuperTypeOf(
					domainElement.eClass())) {
				return RootEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDataControl().isSuperTypeOf(
					domainElement.eClass())) {
				return DataControlEditPart.VISUAL_ID;
			}
			break;
		case RootRootPreFormTriggerCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getPREFormTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return PREFormTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getPREQueryTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return PREQueryTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getPOSTQueryTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return POSTQueryTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getPREInsertTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return PREInsertTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getPREDeleteTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return PREDeleteTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlPostCreateTriggerCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getPOSTCreateTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return POSTCreateTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlPreUpdateTriggerCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getPREUpdateTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return PREUpdateTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlCreateCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getCreateTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return CreateTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlInsertCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getInsertTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return InsertTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlUpdateCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getUpdateTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return UpdateTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlRemoveCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getDeleteTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return DeleteTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlSearchCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getSearchTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return SearchTriggerEditPart.VISUAL_ID;
			}
			break;
		case DataControlDataControlArtificialFieldsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getArtificialField().isSuperTypeOf(
					domainElement.eClass())) {
				return ArtificialFieldEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = control.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!ControlsEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ControlsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = control.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ControlsEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ControlsEditPart.VISUAL_ID:
			if (RootEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RootEditPart.VISUAL_ID:
			if (RootNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RootRootPreFormTriggerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlEditPart.VISUAL_ID:
			if (DataControlNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlPostCreateTriggerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlPreUpdateTriggerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlCreateCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlInsertCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlUpdateCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlRemoveCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlSearchCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataControlDataControlArtificialFieldsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PREFormTriggerEditPart.VISUAL_ID:
			if (PREFormTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PREQueryTriggerEditPart.VISUAL_ID:
			if (PREQueryTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case POSTQueryTriggerEditPart.VISUAL_ID:
			if (POSTQueryTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PREInsertTriggerEditPart.VISUAL_ID:
			if (PREInsertTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PREDeleteTriggerEditPart.VISUAL_ID:
			if (PREDeleteTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case POSTCreateTriggerEditPart.VISUAL_ID:
			if (POSTCreateTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PREUpdateTriggerEditPart.VISUAL_ID:
			if (PREUpdateTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateTriggerEditPart.VISUAL_ID:
			if (CreateTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InsertTriggerEditPart.VISUAL_ID:
			if (InsertTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UpdateTriggerEditPart.VISUAL_ID:
			if (UpdateTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeleteTriggerEditPart.VISUAL_ID:
			if (DeleteTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SearchTriggerEditPart.VISUAL_ID:
			if (SearchTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtificialFieldEditPart.VISUAL_ID:
			if (ArtificialFieldNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RootRootPreFormTriggerCompartmentEditPart.VISUAL_ID:
			if (PREFormTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID:
			if (PREQueryTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID:
			if (POSTQueryTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID:
			if (PREInsertTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID:
			if (PREDeleteTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlPostCreateTriggerCompartmentEditPart.VISUAL_ID:
			if (POSTCreateTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlPreUpdateTriggerCompartmentEditPart.VISUAL_ID:
			if (PREUpdateTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlCreateCompartmentEditPart.VISUAL_ID:
			if (CreateTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlInsertCompartmentEditPart.VISUAL_ID:
			if (InsertTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlUpdateCompartmentEditPart.VISUAL_ID:
			if (UpdateTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlRemoveCompartmentEditPart.VISUAL_ID:
			if (DeleteTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlSearchCompartmentEditPart.VISUAL_ID:
			if (SearchTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataControlDataControlArtificialFieldsCompartmentEditPart.VISUAL_ID:
			if (ArtificialFieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DomainPackage.eINSTANCE.getRelation().isSuperTypeOf(
				domainElement.eClass())) {
			return RelationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Controls element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case RootRootPreFormTriggerCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlPostCreateTriggerCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlPreUpdateTriggerCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlCreateCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlInsertCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlUpdateCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlRemoveCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlSearchCompartmentEditPart.VISUAL_ID:
		case DataControlDataControlArtificialFieldsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ControlsEditPart.VISUAL_ID:
			return false;
		case PREFormTriggerEditPart.VISUAL_ID:
		case PREQueryTriggerEditPart.VISUAL_ID:
		case POSTQueryTriggerEditPart.VISUAL_ID:
		case PREInsertTriggerEditPart.VISUAL_ID:
		case PREDeleteTriggerEditPart.VISUAL_ID:
		case ArtificialFieldEditPart.VISUAL_ID:
		case PREUpdateTriggerEditPart.VISUAL_ID:
		case POSTCreateTriggerEditPart.VISUAL_ID:
		case CreateTriggerEditPart.VISUAL_ID:
		case InsertTriggerEditPart.VISUAL_ID:
		case UpdateTriggerEditPart.VISUAL_ID:
		case DeleteTriggerEditPart.VISUAL_ID:
		case SearchTriggerEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return control.diagram.part.DomainVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return control.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return control.diagram.part.DomainVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return control.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return control.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return control.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
