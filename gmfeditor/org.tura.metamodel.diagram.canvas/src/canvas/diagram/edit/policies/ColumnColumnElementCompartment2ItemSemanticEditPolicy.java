/*
 * 
 */
package canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import canvas.diagram.edit.commands.Button2CreateCommand;
import canvas.diagram.edit.commands.CheckBox2CreateCommand;
import canvas.diagram.edit.commands.DropDownSelection2CreateCommand;
import canvas.diagram.edit.commands.InputText2CreateCommand;
import canvas.diagram.edit.commands.Label2CreateCommand;
import canvas.diagram.edit.commands.LayerHolder2CreateCommand;
import canvas.diagram.edit.commands.OutputText2CreateCommand;
import canvas.diagram.edit.commands.Table2CreateCommand;
import canvas.diagram.edit.commands.TreeCreateCommand;
import canvas.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ColumnColumnElementCompartment2ItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ColumnColumnElementCompartment2ItemSemanticEditPolicy() {
		super(DomainElementTypes.Column_1603026);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.DropDownSelection_1603010 == req
				.getElementType()) {
			return getGEFWrapper(new DropDownSelection2CreateCommand(req));
		}
		if (DomainElementTypes.Table_1603021 == req.getElementType()) {
			return getGEFWrapper(new Table2CreateCommand(req));
		}
		if (DomainElementTypes.Tree_1603022 == req.getElementType()) {
			return getGEFWrapper(new TreeCreateCommand(req));
		}
		if (DomainElementTypes.LayerHolder_1603020 == req.getElementType()) {
			return getGEFWrapper(new LayerHolder2CreateCommand(req));
		}
		if (DomainElementTypes.InputText_1603012 == req.getElementType()) {
			return getGEFWrapper(new InputText2CreateCommand(req));
		}
		if (DomainElementTypes.OutputText_1603014 == req.getElementType()) {
			return getGEFWrapper(new OutputText2CreateCommand(req));
		}
		if (DomainElementTypes.CheckBox_1603015 == req.getElementType()) {
			return getGEFWrapper(new CheckBox2CreateCommand(req));
		}
		if (DomainElementTypes.Button_1603023 == req.getElementType()) {
			return getGEFWrapper(new Button2CreateCommand(req));
		}
		if (DomainElementTypes.Label_1603013 == req.getElementType()) {
			return getGEFWrapper(new Label2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
