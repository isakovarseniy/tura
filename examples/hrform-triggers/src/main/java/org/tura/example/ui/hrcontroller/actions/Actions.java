package org.tura.example.ui.hrcontroller.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.persistence.TuraObject;
import org.tura.platform.primefaces.lib.EventAccessor;

public class Actions implements EventAccessor {
	private ActionEvent event;

	@Inject
	private transient Logger logger;

	@Inject
	ELResolver elResolver;

	@Inject
	@Selector("hrmanager.hrcontroller")
	CommandStack commandStack;

	@SuppressWarnings("rawtypes")
	public void openCompanyDetailsPopup() {
		try {
			Object[] row = (Object[]) event.getComponent().getAttributes()
					.get("param1");

			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactoryHrManagerHRController.popupCompanyDCProvider}");

			IBeanFactory bf = (IBeanFactory) elResolver
					.getValue("#{beanFactoryHrManagerHRController}");
			bf.setCmpId(((TuraObject) (row[2])).getObjId());
			dc.forceRefresh();
			dc.cleanShifter();

			dc.getCommandStack().savePoint();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void saveApplication() {
		try {
			commandStack.commitCommand();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rallbackApplication() {
		try {
			commandStack.rallbackCommand();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void createRow(IDataControl datacontrol) {

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
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void applyChanges() {

	}

	@SuppressWarnings("rawtypes")
	public void rallbackChanges() {

		try {
			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactoryHrManagerHRController.popupCompanyDCProvider}");
			dc.getCommandStack().rallbackSavePoint();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

}
