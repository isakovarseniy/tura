package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.HashMap;

import org.elsoft.platform.metamodel.objects.command.form.ui.CreateFileUploaderDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventFileUpload;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateFileUploader;

public class FileUpLoader  extends InputElement{


	public FileUpLoader(CreateFileUploaderDAO command,HashMap<String, Object> context){
		this.setCss(command.getCss());
		this.setCssClass(command.getCssClass());
		setUuid(command.getUUID());
		context.put(command.getUUID(), this);
		
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateFileUploader.save(ch, getParentUuid(), this);		
		CreateEventFileUpload.save(ch, this.getUuid(), this);
        super.serialize(ch);  
	}

	@Override
	public String getUiElementType() {
		return "FileUpLoader";
	}


}
