/*
 * 
 */
package frmview.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import domain.DomainPackage;
import domain.Views;
import frmview.diagram.edit.parts.CanvasCanvasViewElementCompartmentEditPart;
import frmview.diagram.edit.parts.CanvasEditPart;
import frmview.diagram.edit.parts.CanvasNameEditPart;
import frmview.diagram.edit.parts.PopupCanvasEditPart;
import frmview.diagram.edit.parts.PopupCanvasNameEditPart;
import frmview.diagram.edit.parts.PopupCanvasPopupCanvasViewElementCompartmentEditPart;
import frmview.diagram.edit.parts.TabCanvasEditPart;
import frmview.diagram.edit.parts.TabCanvasNameEditPart;
import frmview.diagram.edit.parts.TabPageEditPart;
import frmview.diagram.edit.parts.TabPageNameEditPart;
import frmview.diagram.edit.parts.TabPageTabPageViewElementCompartmentEditPart;
import frmview.diagram.edit.parts.TabPagesInheritanceEditPart;
import frmview.diagram.edit.parts.ViewAreaEditPart;
import frmview.diagram.edit.parts.ViewAreaNameEditPart;
import frmview.diagram.edit.parts.ViewInheritanceEditPart;
import frmview.diagram.edit.parts.ViewPortEditPart;
import frmview.diagram.edit.parts.ViewPortNameEditPart;
import frmview.diagram.edit.parts.ViewPortTriggerEditPart;
import frmview.diagram.edit.parts.ViewPortTriggerFakeMethodEditPart;
import frmview.diagram.edit.parts.ViewPortViewPortViewPortTriggerCompartmentEditPart;
import frmview.diagram.edit.parts.ViewsEditPart;
import frmview.diagram.edit.parts.WindowEditPart;
import frmview.diagram.edit.parts.WindowNameEditPart;
import frmview.diagram.edit.parts.WindowWindowViewElementCompartmentEditPart;

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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.frmview/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ViewsEditPart.MODEL_ID.equals(view.getType())) {
				return ViewsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return frmview.diagram.part.DomainVisualIDRegistry.getVisualID(view
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
		if (DomainPackage.eINSTANCE.getViews().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Views) domainElement)) {
			return ViewsEditPart.VISUAL_ID;
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
		String containerModelID = frmview.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!ViewsEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ViewsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = frmview.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ViewsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ViewsEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getPopupCanvas().isSuperTypeOf(
					domainElement.eClass())) {
				return PopupCanvasEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getCanvas().isSuperTypeOf(
					domainElement.eClass())) {
				return CanvasEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getWindow().isSuperTypeOf(
					domainElement.eClass())) {
				return WindowEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTabPage().isSuperTypeOf(
					domainElement.eClass())) {
				return TabPageEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getTabCanvas().isSuperTypeOf(
					domainElement.eClass())) {
				return TabCanvasEditPart.VISUAL_ID;
			}
			break;
		case PopupCanvasPopupCanvasViewElementCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getViewPort().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewPortEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getViewArea().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewAreaEditPart.VISUAL_ID;
			}
			break;
		case ViewPortViewPortViewPortTriggerCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getViewPortTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewPortTriggerEditPart.VISUAL_ID;
			}
			break;
		case CanvasCanvasViewElementCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getViewPort().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewPortEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getViewArea().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewAreaEditPart.VISUAL_ID;
			}
			break;
		case WindowWindowViewElementCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getViewPort().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewPortEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getViewArea().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewAreaEditPart.VISUAL_ID;
			}
			break;
		case TabPageTabPageViewElementCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getViewPort().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewPortEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getViewArea().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewAreaEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = frmview.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!ViewsEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ViewsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = frmview.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ViewsEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ViewsEditPart.VISUAL_ID:
			if (PopupCanvasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CanvasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WindowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabCanvasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PopupCanvasEditPart.VISUAL_ID:
			if (PopupCanvasNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PopupCanvasPopupCanvasViewElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasEditPart.VISUAL_ID:
			if (CanvasNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CanvasCanvasViewElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WindowEditPart.VISUAL_ID:
			if (WindowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WindowWindowViewElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabPageEditPart.VISUAL_ID:
			if (TabPageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabPageTabPageViewElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabCanvasEditPart.VISUAL_ID:
			if (TabCanvasNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewPortEditPart.VISUAL_ID:
			if (ViewPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewPortViewPortViewPortTriggerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewPortTriggerEditPart.VISUAL_ID:
			if (ViewPortTriggerFakeMethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewAreaEditPart.VISUAL_ID:
			if (ViewAreaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PopupCanvasPopupCanvasViewElementCompartmentEditPart.VISUAL_ID:
			if (ViewPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewPortViewPortViewPortTriggerCompartmentEditPart.VISUAL_ID:
			if (ViewPortTriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CanvasCanvasViewElementCompartmentEditPart.VISUAL_ID:
			if (ViewPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WindowWindowViewElementCompartmentEditPart.VISUAL_ID:
			if (ViewPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabPageTabPageViewElementCompartmentEditPart.VISUAL_ID:
			if (ViewPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewAreaEditPart.VISUAL_ID == nodeVisualID) {
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
		if (DomainPackage.eINSTANCE.getViewInheritance().isSuperTypeOf(
				domainElement.eClass())) {
			return ViewInheritanceEditPart.VISUAL_ID;
		}
		if (DomainPackage.eINSTANCE.getTabPagesInheritance().isSuperTypeOf(
				domainElement.eClass())) {
			return TabPagesInheritanceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Views element) {
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
		case PopupCanvasPopupCanvasViewElementCompartmentEditPart.VISUAL_ID:
		case ViewPortViewPortViewPortTriggerCompartmentEditPart.VISUAL_ID:
		case CanvasCanvasViewElementCompartmentEditPart.VISUAL_ID:
		case WindowWindowViewElementCompartmentEditPart.VISUAL_ID:
		case TabPageTabPageViewElementCompartmentEditPart.VISUAL_ID:
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
		case ViewsEditPart.VISUAL_ID:
			return false;
		case TabCanvasEditPart.VISUAL_ID:
		case ViewPortTriggerEditPart.VISUAL_ID:
		case ViewAreaEditPart.VISUAL_ID:
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
			return frmview.diagram.part.DomainVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return frmview.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return frmview.diagram.part.DomainVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return frmview.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return frmview.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return frmview.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
