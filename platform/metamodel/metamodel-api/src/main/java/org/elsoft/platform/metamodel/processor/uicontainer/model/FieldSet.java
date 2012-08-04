package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.ArrayList;
import java.util.HashMap;

import org.elsoft.platform.metamodel.objects.command.form.ui.CreateFieldSetDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateFieldSet;

public class FieldSet extends UIElement implements ChildrenOwner {

	
	public FieldSet(CreateFieldSetDAO command,HashMap<String, Object> context){
		this.setCss(command.getCss());
		this.setCssClass(command.getCssClass());
		setUuid(command.getUUID());
		context.put(command.getUUID(), this);
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateFieldSet.save(ch, getParentUuid(), this);		
        super.serialize(ch);  
	}
	public ArrayList<UIElement> getChildrens() {
		return super.getChildrens();
	}

	public void addChild(UIElement child) {
		child.setParentUuid(getUuid());
		this.getChildrens().add(child);
	}

	@Override
	public String getUiElementType() {
		return "FieldSet";
	}

}
