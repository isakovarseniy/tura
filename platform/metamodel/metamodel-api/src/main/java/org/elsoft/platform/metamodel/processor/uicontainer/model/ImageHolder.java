package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.HashMap;

import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.processor.datasource.model.Field;

public interface ImageHolder {
	public void setUIElement2ImageHolderField(EventDAO command, HashMap<String, Object> context)  throws Exception;
	public void setUIElement2ImageHolderLnk(EventDAO command, HashMap<String, Object> context)  throws Exception;
	public DataLink getImageSrcLnk();
	public Field getImageSrcField();
	
	
}
