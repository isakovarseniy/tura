/*
 * 
 */
package control.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import control.diagram.edit.policies.DeploymentComponentDeplymentComponentItemSemanticEditPolicy;

/**
 * @generated
 */
public class DeploymentComponentDeplymentComponentEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1104002;

	/**
	 * @generated
	 */
	public DeploymentComponentDeplymentComponentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new DeploymentComponentDeplymentComponentItemSemanticEditPolicy());
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
		return new DeploymentComponentDeplymentComponentFigure();
	}

	/**
	 * @generated
	 */
	public DeploymentComponentDeplymentComponentFigure getPrimaryShape() {
		return (DeploymentComponentDeplymentComponentFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class DeploymentComponentDeplymentComponentFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public DeploymentComponentDeplymentComponentFigure() {
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
