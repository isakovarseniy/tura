/*
 * 
 */
package typedefinition.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import typedefinition.diagram.edit.policies.Many2ManyItemSemanticEditPolicy;

/**
 * @generated
 */
public class Many2ManyEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 104004;

	/**
	 * @generated
	 */
	public Many2ManyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Many2ManyItemSemanticEditPolicy());
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
		return new Many2ManyFigure();
	}

	/**
	 * @generated
	 */
	public Many2ManyFigure getPrimaryShape() {
		return (Many2ManyFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class Many2ManyFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public Many2ManyFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(THIS_FORE);

			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 20, 65, 126);

}
