package org.tura.platform.primefaces.lib;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.commons.TuraException;

public class SystemLibrary {

	@Inject
    private transient Logger logger;
	
	public void createRow(IDataControl dc) {
		try {
			dc.createObject();
		} catch (TuraException e) {
			logger.log(Level.INFO, e.getMessage(),e);
		}
	}

	public void removeRow(IDataControl dc) {
		try {
			dc.removeObject();
//			((DataControl<?>)dc).forceRefresh();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(),e);
		}
	}

}
