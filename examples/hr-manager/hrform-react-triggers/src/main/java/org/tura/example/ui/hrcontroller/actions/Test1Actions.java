/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.hrcontroller.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.tura.example.ui.hrmanager.testform1.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.events.EventAware;

public class Test1Actions implements EventAware {
	EventDescription event;
	private transient Logger logger = Logger.getLogger(Actions.class.getName());

	@Inject
	ELResolver elResolver;

	@Inject
	@ClientProxyRepo("hrmanager.testform1")
	private CpaRepository repository;

	
	
	public void saveApplication() {
		try {
			repository.getStackProvider().get().commit();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rallbackApplication() {
		try {
			repository.getStackProvider().get().rallbackCommand();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	
	public void  addRowToDepartment() {
		try {
			IBeanFactory bf  = (  IBeanFactory ) elResolver.getValue("#{beanFactoryHrManagerTestForm1}");
			bf.getDepartment().createObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	public void removeRowFromDepartment(){
		try {
			IBeanFactory bf  = (  IBeanFactory ) elResolver.getValue("#{beanFactoryHrManagerTestForm1}");
			bf.getDepartment().removeObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		
		
	}
	public void addRowToEmpl(){
		try {
			IBeanFactory bf  = (  IBeanFactory ) elResolver.getValue("#{beanFactoryHrManagerTestForm1}");
			bf.getEmployee().createObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	public void removeRowFromEmployee(){
		try {
			IBeanFactory bf  = (  IBeanFactory ) elResolver.getValue("#{beanFactoryHrManagerTestForm1}");
			bf.getEmployee().removeObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	public void fileUpload() {
		
	}
	

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;
	}

}
