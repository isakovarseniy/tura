package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateDrugAndDropDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDrugAndDrop;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;

public class DrugAndDropReader extends ItemReader {
	
	private String destination;
	private String source;
	private String updateOnDrop;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {

		source = xmlReader.getAttributeValue(null, "source");
		destination = xmlReader.getAttributeValue(null, "destination");
		updateOnDrop = xmlReader.getAttributeValue(null, "updateOnDrop");

		String dataSrcField = xmlReader.getAttributeValue(null,
				"expressionProperty");
		List<String> ls = this.expressionParser(dataSrcField);
		setDataControlId(Reader.idMAP.get(ls.get(0)));
		
		return this;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		CreateDrugAndDropDAO createDrugAndDrop = new CreateDrugAndDropDAO();
		createDrugAndDrop.setCommandExecutor(CreateDrugAndDrop.class.getName());
		createDrugAndDrop.setParentUUID(parent.getUuid());
		createDrugAndDrop.setUUID(getUuid());
		program.add(createDrugAndDrop);
		
		EventDAO event = new EventDAO();
		event.setCommandExecutor(CreateEventUIElement2UIElement.class
				.getName());
		event.setParentUUID(createDrugAndDrop.getUUID());
		event.setDstUUID(source);
		event.setEventType(MetamodelTriggerEventsType.Drugable
				.name());
		program.add(event);

		event = new EventDAO();
		event.setCommandExecutor(CreateEventUIElement2UIElement.class
				.getName());
		event.setParentUUID(createDrugAndDrop.getUUID());
		event.setDstUUID(destination);
		event.setEventType(MetamodelTriggerEventsType.Dropable
				.name());
		program.add(event);
		
		
		if (updateOnDrop != null) {
			StringTokenizer tokenizer = new StringTokenizer(
					updateOnDrop);
			while (tokenizer.hasMoreElements()) {
				String dst = tokenizer.nextToken();
				event = new EventDAO();
				event.setCommandExecutor(CreateEventUIElement2UIElement.class
						.getName());
				event.setParentUUID(createDrugAndDrop.getUUID());
				event.setDstUUID(dst);
				event.setEventType(MetamodelTriggerEventsType.OnItemDrop
						.name());
				program.add(event);
			}
		}
		
		
	}

}
