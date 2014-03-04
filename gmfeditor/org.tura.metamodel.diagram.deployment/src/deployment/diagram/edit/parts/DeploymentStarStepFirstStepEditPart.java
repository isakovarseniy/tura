/*
 * 
 */
package deployment.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import deployment.diagram.edit.policies.DeploymentStarStepFirstStepItemSemanticEditPolicy;

/**
 * @generated
 */
public class DeploymentStarStepFirstStepEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 904008;

	/**
	 * @generated
	 */
	public DeploymentStarStepFirstStepEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DeploymentStarStepFirstStepItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new DeploymentStarStepFirstStepFigure();
	}

	/**
	 * @generated
	 */
	public DeploymentStarStepFirstStepFigure getPrimaryShape() {
		return (DeploymentStarStepFirstStepFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class DeploymentStarStepFirstStepFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public DeploymentStarStepFirstStepFigure() {
			this.setLineStyle(Graphics.LINE_DASH);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
