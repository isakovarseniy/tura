/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.uuiclient.lib;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.commons.TuraException;

public class SystemLibrary {

    private transient Logger logger = Logger.getLogger(SystemLibrary.class.getName());

    @Inject
	ELResolver elResolver;

    
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
	
	public Boolean not(Boolean val) {
		return !val;
	}
	
	
    public void changeLanguage(String language) {
		elResolver.setValue("#{sessionLocale}", language);
    }	
	
}
