package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateDrugAndDropDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDrugAndDrop;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Service;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;

public class DrugAndDrop extends ActionElement implements PointerElement {

	private UIElement drugableElement;
	private UIElement dropableElement;
	private ArrayList<EventDAO> updateOnItemDrop = new ArrayList<EventDAO>();

	public UIElement getDrugableElement() {
		return drugableElement;
	}

	public UIElement getDropableElement() {
		return dropableElement;
	}

	public ArrayList<EventDAO> getUpdateOnItemDrop() {
		return updateOnItemDrop;
	}

	public DrugAndDrop(CreateDrugAndDropDAO command,
			HashMap<String, Object> context) {
		setUuid(command.getUUID());
		context.put(command.getUUID(), this);
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateDrugAndDrop.save(ch, getParentUuid(), this);
		if (this.getUiElement2ServiceEvent() != null)
			CreateEventUIElement2Service.save(ch, this);

		EventDAO event = new EventDAO();
		event.setCommandExecutor(CreateEventUIElement2UIElement.class.getName());
		event.setDstUUID(drugableElement.getUuid());
		event.setEventType(MetamodelTriggerEventsType.Drugable.name());
		CreateEventUIElement2UIElement.save(ch, getUuid(), event);

		event = new EventDAO();
		event.setCommandExecutor(CreateEventUIElement2UIElement.class.getName());
		event.setDstUUID(dropableElement.getUuid());
		event.setEventType(MetamodelTriggerEventsType.Dropable.name());
		CreateEventUIElement2UIElement.save(ch, getUuid(), event);

		Iterator<EventDAO> itr = updateOnItemDrop.iterator();
		while (itr.hasNext())
			CreateEventUIElement2UIElement.save(ch, getUuid(), itr.next());

	}

	@Override
	public void addReference(EventDAO event, HashMap<String, Object> context) {

		if (event.getEventType().equals(
				MetamodelTriggerEventsType.Drugable.name())) {
			drugableElement = (UIElement) context.get(event.getDstUUID());
			drugableElement.setDrugable(true);
		}
		if (event.getEventType().equals(
				MetamodelTriggerEventsType.Dropable.name())){
			dropableElement = (UIElement) context.get(event.getDstUUID());
			dropableElement.setDropable(true);
		}
		if (event.getEventType().equals(
				MetamodelTriggerEventsType.OnItemDrop.name())) {
			updateOnItemDrop.add(event);
		}
	}

	public String getUiElementType() {
		return "DrugAndDrop";
	}

}
