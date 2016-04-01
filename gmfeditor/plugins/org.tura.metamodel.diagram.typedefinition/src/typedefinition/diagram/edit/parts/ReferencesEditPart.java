/*
 * 
 */
package typedefinition.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import typedefinition.diagram.edit.policies.ReferencesItemSemanticEditPolicy;

/**
 * @generated
 */
public class ReferencesEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 104006;

	/**
	 * @generated
	 */
	public ReferencesEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ReferencesItemSemanticEditPolicy());
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
		return new ReferencesFigure();
	}

	/**
	 * @generated
	 */
	public ReferencesFigure getPrimaryShape() {
		return (ReferencesFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ReferencesFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ReferencesFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 126, 84, 9);

}
