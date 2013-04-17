package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateFileUploaderDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2CastTypeDAO;
import org.elsoft.platform.metamodel.objects.type.PropertyDAO;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2CastType;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventFileUpload;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetCurrentRow;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateFileUploader;

public class FileUploaderReader extends ItemReader{

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		EventDAO event = null;

		parent=setContext(parent);
		
		CreateFileUploaderDAO createFileUploader = new CreateFileUploaderDAO();
		createFileUploader.setCommandExecutor(CreateFileUploader.class.getName());
		createFileUploader.setParentUUID(parent.getUuid());
		createFileUploader.setUUID(getUuid());
		createFileUploader.setCss(getCssStyle());
		createFileUploader.setCssClass(getCssStyleClass());
		program.add(createFileUploader);

		event = new EventDAO();
		event.setCommandExecutor(CreateEventUIElement2Field.class.getName());
		event.setParentUUID(createFileUploader.getUUID());
		if (getCastObject() == null)
			event.setDstUUID(getDataControlId() + "." + getField());
		else {
			List<String> ls = this.expressionParser(getCastObject());
			Helper.findType(rf, ls.get(0), ls.get(1), ls.get(2), ls.get(3));
			PropertyDAO pr = rf.getTypeDefinitionHandler().getPropertyHandler()
					.cleanSearch().searchString("propertyName", getField())
					.getObject();

			if (pr == null)
				event.setDstUUID(getDataControlId() + "." + getField());
			else
				event.setDstUUID(getDataControlId() + "." + getCastObject()
						+ "." + getField());
		}
		program.add(event);

		
		if (getCastObject() != null) {
			CreateDataLink2CastTypeDAO cast = new CreateDataLink2CastTypeDAO();
			cast.setCommandExecutor(CreateDataLink2CastType.class.getName());
			cast.setParentUUID(getDataControlId());
			
		    List<String> ls = this.expressionParser(getCastObject());
		    cast.setDomain(ls.get(0)); 
		    cast.setFunctionalDomain(ls.get(1)); 
		    cast.setApplication(ls.get(2)); 
		    cast.setTypeName(ls.get(3)); 
		    
		    program.add(cast);
		}

		if (!isTableContext()) {
			event = new EventDAO();
			event.setCommandExecutor(CreateEventGetCurrentRow.class.getName());
			event.setParentUUID(createFileUploader.getUUID());
			event.setDstUUID(getDataControlId());
			program.add(event);
		}

		event = new EventDAO();
		event.setCommandExecutor(CreateEventFileUpload.class.getName());
		event.setParentUUID(createFileUploader.getUUID());
		event.setDstUUID(getDataControlId());
		event.setEventType(MetamodelTriggerEventsType.CreateEventFileUpload.name());
		program.add(event);
		
		
	}

}
