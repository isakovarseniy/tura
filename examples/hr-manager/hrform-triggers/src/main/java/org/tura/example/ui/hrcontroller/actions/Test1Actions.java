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
package org.tura.example.ui.hrcontroller.actions;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import org.tura.example.ui.hrmanager.testform1.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.hr.objects.serialization.ProxyRepository;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.primefaces.lib.FileUploadEventAccessor;
import org.tura.platform.repository.core.Repository;

public class Test1Actions implements EventAccessor , FileUploadEventAccessor{
	private ActionEvent event;
	private FileUploadEvent fileUploadEvent;
	private transient Logger logger = Logger.getLogger(Actions.class.getName());

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("hrmanager.testform1")
	CommandStack commandStack;

	@Inject
	Repository repository;

	
	
	public void saveApplication() {
		try {
			CommandStackProvider sp = new CommandStackProvider();
			sp.setCommandStack(commandStack);

			ProxyRepository proxyRepository = new ProxyRepository(repository, sp);

			proxyRepository.applyChanges(null);
			commandStack.commitSavePoint();
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
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

	@Override
	public void setEvent(FileUploadEvent fileUploadEvent) {
		this.fileUploadEvent = fileUploadEvent;
	}

}
