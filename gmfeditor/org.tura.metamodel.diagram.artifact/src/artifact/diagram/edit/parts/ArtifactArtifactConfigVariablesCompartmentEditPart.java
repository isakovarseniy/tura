/*
 * 
 */
package artifact.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.tura.metamodel.commons.editparts.HTMLLikeLayout;

import artifact.diagram.edit.policies.ArtifactArtifactConfigVariablesCompartmentCanonicalEditPolicy;
import artifact.diagram.edit.policies.ArtifactArtifactConfigVariablesCompartmentItemSemanticEditPolicy;
import artifact.diagram.part.DomainVisualIDRegistry;
import artifact.diagram.part.Messages;

/**
 * @generated
 */
public class ArtifactArtifactConfigVariablesCompartmentEditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 707001;

	/**
	 * @generated
	 */
	public ArtifactArtifactConfigVariablesCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.ArtifactArtifactConfigVariablesCompartmentEditPart_title;
	}

	/**
	 * @generated
	 */

	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		HTMLLikeLayout layout = new HTMLLikeLayout();
		layout.setColumns(5);
		result.getContentPane().setLayoutManager(layout);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ArtifactArtifactConfigVariablesCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						DomainVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new ArtifactArtifactConfigVariablesCompartmentCanonicalEditPolicy());
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
