package org.tura.platform.primefaces.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;

public class OptionsModel {

	private DataControl<?> datacontrol;
	private String label;
	private String value;
	private List<Object[]> options;
	private Logger logger;

	public OptionsModel(DataControl<?> datacontrol, Logger logger) {
		this.datacontrol = datacontrol;
		this.logger = logger;
		datacontrol.addEventLiteners(new RecordListener());

	}

	public OptionsModel setLabel(String label) {
		this.label = label;
		return this;
	}
	
	public OptionsModel setValue(String value) {
		this.value = value;
		return this;
	}

	public List<Object[]> getOptions() {
		if (options != null)
			return options;

		options = new ArrayList<>();

		try {
			datacontrol.getCurrentObject();
			List<?> scroler = datacontrol.getScroller();

			Iterator<?> itr = scroler.iterator();
			while (itr.hasNext()) {
				Object obj = itr.next();
				Object objLabel = Reflection.call(obj, label);
				Object objValue = Reflection.call(obj, value);
				options.add(new Object[] { objLabel, objValue });
			}

		} catch (Exception e) {
			logger.fine(e.getMessage());
		}

		return options;

	}

	class RecordListener implements EventListener {

		@Override
		public void handleEventListener(Event event) throws TuraException {
			if (event instanceof MasterRowChangedEvent || event instanceof RowRemovedEvent) {
				options = null;
			}
		}
	}

}
