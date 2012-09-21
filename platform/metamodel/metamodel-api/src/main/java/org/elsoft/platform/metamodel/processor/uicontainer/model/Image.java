package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.HashMap;

import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIImageDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIImage;

public class Image extends InputElement{

	public Image(CreateUIImageDAO command, HashMap<String, Object> context) {
		this.setCss(command.getCss());
		this.setCssClass(command.getCssClass());
		setUuid(command.getUUID());
		setLabel(command.getLabel());
		context.put(command.getUUID(), this);
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateUIImage.save(ch, getParentUuid(), this);		
        super.serialize(ch);  
	}

	@Override
	public String getUiElementType() {
		return "Image";
	}
	
	
}
