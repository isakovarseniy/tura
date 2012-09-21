package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.HashMap;

import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICheckBoxDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUICheckBox;

public class CheckBox extends InputElement{

	public CheckBox(CreateUICheckBoxDAO command, HashMap<String, Object> context) {
		this.setCss(command.getCss());
		this.setCssClass(command.getCssClass());
		setUuid(command.getUUID());
		setLabel(command.getLabel());
		context.put(command.getUUID(), this);
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateUICheckBox.save(ch, getParentUuid(), this);
		super.serialize(ch);
	}

	@Override
	public String getUiElementType() {
		return "CheckBox";
	}

}
