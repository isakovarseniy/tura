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

package org.tura.example.ui.hrmanager.testform1.triggers;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.example.ui.hrmanager.testform1.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.hr.objects.serialization.Department;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.events.EventAware;

public class W5Actions implements EventAware {
	EventDescription event;

	private transient Logger logger = Logger.getLogger(W5Actions.class.getName());

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("viewmodelTestForm1")
	ViewModel viewModel;

	@Inject
	@ClientProxyRepo("hrmanager.testform1")
	private CpaRepository repository;

	
	@SuppressWarnings("rawtypes")
	public void openDepartment() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerTestForm1}");
			Department dept = (Department) bf.getDepartment().getCurrentObject();
			DataControl dc = (DataControl) bf.getDepartmentEditor();

			repository.getStackProvider().get().savePoint();			
			dc.setIsoleted(true);

			bf.setDepartmentId(dept.getObjId());
			dc.forceRefresh();

			bf.setEditMode(true);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void createDepartment() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerTestForm1}");

			DataControl dc = (DataControl) bf.getDepartmentEditor();

			repository.getStackProvider().get().savePoint();			
			dc.setIsoleted(true);

			Department cmp = (Department) dc.createObject();

			bf.setDepartmentId(cmp.getObjId());

			bf.setEditMode(true);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

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

	@SuppressWarnings("rawtypes")
	public void applyChanges() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerTestForm1}");
			DataControl dc = (DataControl) bf.getDepartmentEditor();
			dc.setIsoleted(false);
			bf.setEditMode(false);

		} catch (TuraException e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rallbackChanges() {

		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerTestForm1}");
            repository.getStackProvider().get().rallbackCommand();
			bf.setEditMode(false);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}


	@Override
	public void setEvent(EventDescription event) {
		this.event = event;
	}

}
