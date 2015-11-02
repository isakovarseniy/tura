/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * 
 */
package canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import canvas.diagram.edit.commands.ButtonCreateCommand;
import canvas.diagram.edit.commands.CheckBoxCreateCommand;
import canvas.diagram.edit.commands.DateCreateCommand;
import canvas.diagram.edit.commands.DropDownSelectionCreateCommand;
import canvas.diagram.edit.commands.ImageCreateCommand;
import canvas.diagram.edit.commands.InputTextCreateCommand;
import canvas.diagram.edit.commands.LabelCreateCommand;
import canvas.diagram.edit.commands.LayerHolder3CreateCommand;
import canvas.diagram.edit.commands.MessageElementCreateCommand;
import canvas.diagram.edit.commands.OutputTextCreateCommand;
import canvas.diagram.edit.commands.PasswordCreateCommand;
import canvas.diagram.edit.commands.TableCreateCommand;
import canvas.diagram.edit.commands.Tree2CreateCommand;
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
		if (DomainElementTypes.InputText_1603004 == req.getElementType()) {
			return getGEFWrapper(new InputTextCreateCommand(req));
		}
		if (DomainElementTypes.Password_1603032 == req.getElementType()) {
			return getGEFWrapper(new PasswordCreateCommand(req));
		}
		if (DomainElementTypes.OutputText_1603006 == req.getElementType()) {
			return getGEFWrapper(new OutputTextCreateCommand(req));
		}
		if (DomainElementTypes.DropDownSelection_1603002 == req
				.getElementType()) {
			return getGEFWrapper(new DropDownSelectionCreateCommand(req));
		}
		if (DomainElementTypes.Date_1603029 == req.getElementType()) {
			return getGEFWrapper(new DateCreateCommand(req));
		}
		if (DomainElementTypes.Table_1603008 == req.getElementType()) {
			return getGEFWrapper(new TableCreateCommand(req));
		}
		if (DomainElementTypes.Tree_1603016 == req.getElementType()) {
			return getGEFWrapper(new Tree2CreateCommand(req));
		}
		if (DomainElementTypes.LayerHolder_1603019 == req.getElementType()) {
			return getGEFWrapper(new LayerHolder3CreateCommand(req));
		}
		if (DomainElementTypes.CheckBox_1603007 == req.getElementType()) {
			return getGEFWrapper(new CheckBoxCreateCommand(req));
		}
		if (DomainElementTypes.Image_1603028 == req.getElementType()) {
			return getGEFWrapper(new ImageCreateCommand(req));
		}
		if (DomainElementTypes.Label_1603005 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		if (DomainElementTypes.MessageElement_1603034 == req.getElementType()) {
			return getGEFWrapper(new MessageElementCreateCommand(req));
		}
		if (DomainElementTypes.Button_1603017 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
