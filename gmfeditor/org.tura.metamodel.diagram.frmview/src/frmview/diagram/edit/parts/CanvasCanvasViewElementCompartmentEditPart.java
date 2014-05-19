/*
 * 
 */
package frmview.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.tura.metamodel.commons.editparts.HTMLLikeLayout;

import domain.HTMLLayerHolder;
import frmview.diagram.edit.policies.CanvasCanvasViewElementCompartmentCanonicalEditPolicy;
import frmview.diagram.edit.policies.CanvasCanvasViewElementCompartmentItemSemanticEditPolicy;
import frmview.diagram.part.DomainVisualIDRegistry;
import frmview.diagram.part.Messages;

/**
 * @generated
 */
public class CanvasCanvasViewElementCompartmentEditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1307004;

	/**
	 * @generated
	 */
	public CanvasCanvasViewElementCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.CanvasCanvasViewElementCompartmentEditPart_title;
	}

	/**
	 * @generated
	 */

	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		HTMLLikeLayout layout = new HTMLLikeLayout();

		NodeImpl node = (NodeImpl) this.getParent().getModel();
		Object model = node.getElement();

		if (model instanceof HTMLLayerHolder)
			layout.setColumns(((HTMLLayerHolder) model).getColumns());
		else
			layout.setColumns(1);

		result.getContentPane().setLayoutManager(layout);

		return result;
	}

	protected void handleNotificationEvent(Notification event) {

		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			if (event.getNotifier() instanceof HTMLLayerHolder
					&& event.getFeature() instanceof EAttribute) {
				EAttribute eAttribute = (EAttribute) event.getFeature();

				if (eAttribute.getName().equalsIgnoreCase("columns")) {
					ResizableCompartmentFigure figure = (ResizableCompartmentFigure) getFigure();
					HTMLLikeLayout layout = (HTMLLikeLayout) figure
							.getContentPane().getLayoutManager();
					layout.setColumns(event.getNewIntValue());
					figure.collapse();
					figure.expand();
				}
			}

			super.handleNotificationEvent(event);
		}

	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CanvasCanvasViewElementCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						DomainVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CanvasCanvasViewElementCompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

}
