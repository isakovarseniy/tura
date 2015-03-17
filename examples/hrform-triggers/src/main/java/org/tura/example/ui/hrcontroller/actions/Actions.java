package org.tura.example.ui.hrcontroller.actions;

import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.persistence.TuraObject;
import org.tura.platform.primefaces.lib.EventAccessor;

public class Actions implements EventAccessor {
	private ActionEvent event;

	@Inject
	ELResolver elResolver;

	@Inject
	CommandStack commandStack;

	@SuppressWarnings("rawtypes")
	public void openCompanyDetailsPopup() {
		try {
			Object[] row = (Object[]) event.getComponent().getAttributes()
					.get("param1");

			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactory.popupCompanyDCProvider}");

			Object bf = elResolver.getValue("#{beanFactory}");
			Reflection.call(bf, "setCmpId", ((TuraObject) (row[2])).getObjId());
			dc.forceRefresh();
			dc.cleanShifter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("");
	}

	public void saveApplication() {
		try {
			commandStack.commitCommand();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("");
	}

	
	public void rallbackApplication() {
		try {
			DataControl dc;
			commandStack.rallbackCommand();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("");
	}

	
	
	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

}
