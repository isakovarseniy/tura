/*
 * 
 */
package typedefinition.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import typedefinition.diagram.edit.policies.One2OneItemSemanticEditPolicy;

/**
 * @generated
 */
public class One2OneEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 104002;

	/**
	 * @generated
	 */
	public One2OneEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new One2OneItemSemanticEditPolicy());
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
		return new One2OneFigure();
	}

	/**
	 * @generated
	 */
	public One2OneFigure getPrimaryShape() {
		return (One2OneFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class One2OneFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public One2OneFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 126, 84, 9);

}
