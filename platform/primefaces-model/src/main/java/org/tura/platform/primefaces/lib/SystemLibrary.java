package org.tura.platform.primefaces.lib;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.commons.TuraException;

public class SystemLibrary {

	public void createRow(IDataControl dc) {
		try {
			dc.createObject();
		} catch (TuraException e) {
		}
	}

	public void removeRow(IDataControl dc) {
		try {
			dc.removeObject();
			((DataControl<?>)dc).forceRefresh();
		} catch (Exception e) {
		}
	}

}
