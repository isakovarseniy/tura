package org.tura.example.ui.hrcontroller.actions;

import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
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
	}

	public void saveApplication() {
		try {
			commandStack.commitCommand();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void rallbackApplication() {
		try {
			commandStack.rallbackCommand();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createChildRow(IDataControl datacontrol) {
		try {
			TreeDataControl tdc = (TreeDataControl) datacontrol;
			BeanWrapper w = ((BeanWrapper) Reflection.call(
					tdc.getCurrentObject(), "getWrapper"));
			DataControl<?> dc = w.getDatacontrol();
			String rel = dc.getRelationsName().iterator().next();
			if (rel != null)
				tdc.createChildObject(rel);
		} catch (Exception e) {

		}
	}

	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

}
