/*
 * 
 */
package roles.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import roles.diagram.edit.policies.GroupGroup2RoleItemSemanticEditPolicy;

/**
 * @generated
 */
public class GroupGroup2RoleEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1404005;

	/**
	* @generated
	*/
	public GroupGroup2RoleEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new GroupGroup2RoleItemSemanticEditPolicy());
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
		return new GroupGroup2RoleFigure();
	}

	/**
	* @generated
	*/
	public GroupGroup2RoleFigure getPrimaryShape() {
		return (GroupGroup2RoleFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class GroupGroup2RoleFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public GroupGroup2RoleFigure() {
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
