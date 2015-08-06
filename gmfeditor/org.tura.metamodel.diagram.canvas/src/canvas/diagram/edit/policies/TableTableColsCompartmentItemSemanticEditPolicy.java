/*
* 
*/
package canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import canvas.diagram.edit.commands.ColumnCreateCommand;
import canvas.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class TableTableColsCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TableTableColsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Table_1603008);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Column_1603024 == req.getElementType()) {
			return getGEFWrapper(new ColumnCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
