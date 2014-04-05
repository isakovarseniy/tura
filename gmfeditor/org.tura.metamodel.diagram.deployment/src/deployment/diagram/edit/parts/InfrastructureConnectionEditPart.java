/*
 * 
 */
package deployment.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import deployment.diagram.edit.policies.InfrastructureConnectionItemSemanticEditPolicy;

/**
 * @generated
 */
public class InfrastructureConnectionEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 904011;

	/**
	 * @generated
	 */
	public InfrastructureConnectionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InfrastructureConnectionItemSemanticEditPolicy());
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
		return new InfrastructureConnectionFigure();
	}

	/**
	 * @generated
	 */
	public InfrastructureConnectionFigure getPrimaryShape() {
		return (InfrastructureConnectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InfrastructureConnectionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public InfrastructureConnectionFigure() {
			this.setLineWidth(2);

		}

	}

}
