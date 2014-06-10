/*
 * 
 */
package canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import canvas.diagram.edit.commands.ButtonCreateCommand;
import canvas.diagram.edit.commands.CheckBoxCreateCommand;
import canvas.diagram.edit.commands.DropDownSelectionCreateCommand;
import canvas.diagram.edit.commands.InputTextCreateCommand;
import canvas.diagram.edit.commands.LabelCreateCommand;
import canvas.diagram.edit.commands.LayerHolder3CreateCommand;
import canvas.diagram.edit.commands.OutputTextCreateCommand;
import canvas.diagram.edit.commands.TableCreateCommand;
import canvas.diagram.edit.commands.TreeCreateCommand;
import canvas.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class LayerHolderLayerHolderChildrenCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LayerHolderLayerHolderChildrenCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.LayerHolder_1602003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Button_1603017 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (DomainElementTypes.DropDownSelection_1603002 == req
				.getElementType()) {
			return getGEFWrapper(new DropDownSelectionCreateCommand(req));
		}
		if (DomainElementTypes.Table_1603008 == req.getElementType()) {
			return getGEFWrapper(new TableCreateCommand(req));
		}
		if (DomainElementTypes.LayerHolder_1603019 == req.getElementType()) {
			return getGEFWrapper(new LayerHolder3CreateCommand(req));
		}
		if (DomainElementTypes.InputText_1603004 == req.getElementType()) {
			return getGEFWrapper(new InputTextCreateCommand(req));
		}
		if (DomainElementTypes.OutputText_1603006 == req.getElementType()) {
			return getGEFWrapper(new OutputTextCreateCommand(req));
		}
		if (DomainElementTypes.CheckBox_1603007 == req.getElementType()) {
			return getGEFWrapper(new CheckBoxCreateCommand(req));
		}
		if (DomainElementTypes.Tree_1603016 == req.getElementType()) {
			return getGEFWrapper(new TreeCreateCommand(req));
		}
		if (DomainElementTypes.Label_1603005 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
