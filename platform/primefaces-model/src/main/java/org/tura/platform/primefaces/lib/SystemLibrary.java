/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.primefaces.lib;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.commons.TuraException;

public class SystemLibrary {

    private Logger logger = Logger.getLogger(SystemLibrary.class.getName());
	
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
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(),e);
		}
	}

	public String style2Icon(String style){
		return style;
	}
	
    public void changeLanguage(String language) {
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(language));
    }	
	
}
