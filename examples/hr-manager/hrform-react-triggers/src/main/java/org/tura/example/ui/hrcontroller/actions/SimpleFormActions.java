/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.tura.example.ui.hrmanager.simpleform.datacontrol.HolderObjectArtifitialFieldsAdapter;
import org.tura.example.ui.hrmanager.simpleform.datacontrol.IBeanFactory;
import org.tura.example.ui.hrmanager.simpleform.viewmodel.IViewPortHolder;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.hr.objects.serialization.HolderObject;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.MultiSelectOptionsModel;
import org.tura.platform.uuiclient.model.Options;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;
import org.tura.platform.uuiclient.rest.client.commands.ClearForm;
import org.tura.platform.uuiclient.rest.client.commands.ClientCommand;
import org.tura.platform.uuiclient.rest.client.commands.DownloadFile;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.client.commands.UpdateMessage;
import org.tura.platform.uuiclient.rest.events.EventAware;

public class SimpleFormActions implements EventAware {

	@Inject
	ELResolver elResolver;
	private transient Logger logger = Logger.getLogger(SimpleFormActions.class.getName());

	@Inject
	ResponseState responseState;

	@Inject
	@Named("viewmodelSimpleForm")
	ViewModel viewModel;

	@Inject
	@Named("viewPortHolderHrManagerSimpleForm")
	IViewPortHolder viewPort;

	EventDescription event;

	public void nextRecord() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerSimpleForm}");
			DataControl<?> dc = (DataControl<?>) bf.getDepartment();
			dc.nextObject();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void prevRecord() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerSimpleForm}");
			DataControl<?> dc = (DataControl<?>) bf.getDepartment();
			dc.prevObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void checkMultiselect() {
		System.out.println();
	}

	public void submitForm() {
		try {
			List<ClientCommand> program = new ArrayList<ClientCommand>();

			UpdateMessage cmd = new UpdateMessage();
			cmd.setTarget(IBeanFactory.INPUTTEXT.replaceAll("tura", "").replaceAll("_", "\\-"));
			cmd.setSeverity("error");
			cmd.setMessage("Error");
			cmd.setDetails((String) elResolver.getValue("#{SimpleForm['INPUT_TEXT_VALIDATION_ERROR']}"));
			program.add(cmd);

			cmd = new UpdateMessage();
			cmd.setTarget(IBeanFactory.CHECKBOX.replaceAll("tura", "").replaceAll("_", "\\-"));
			cmd.setSeverity("error");
			cmd.setMessage("Error");
			cmd.setDetails((String) elResolver.getValue("#{SimpleForm['CHECKBOX_VALIDATION_ERROR']}"));
			program.add(cmd);

			cmd = new UpdateMessage();
			cmd.setTarget(IBeanFactory.PASSWORD.replaceAll("tura", "").replaceAll("_", "\\-"));
			cmd.setSeverity("error");
			cmd.setMessage("Error");
			cmd.setDetails((String) elResolver.getValue("#{SimpleForm['PASSWORD_VALIDATION_ERROR']}"));
			program.add(cmd);

			cmd = new UpdateMessage();
			cmd.setTarget(IBeanFactory.INPUTTEXTARIA.replaceAll("tura", "").replaceAll("_", "\\-"));
			cmd.setSeverity("error");
			cmd.setMessage("Error");
			cmd.setDetails((String) elResolver.getValue("#{SimpleForm['TEXTARIA_VALIDATION_ERROR']}"));
			program.add(cmd);

			cmd = new UpdateMessage();
			cmd.setTarget(IBeanFactory.MESSAGES.replaceAll("tura", "").replaceAll("_", "\\-"));
			cmd.setSeverity("error");
			cmd.setMessage("Error");
			cmd.setDetails((String) elResolver.getValue("#{SimpleForm['CHECKBOX_VALIDATION_ERROR']}"));
			program.add(cmd);

			cmd = new UpdateMessage();
			cmd.setTarget(IBeanFactory.MESSAGES.replaceAll("tura", "").replaceAll("_", "\\-"));
			cmd.setSeverity("error");
			cmd.setMessage("Error");
			cmd.setDetails((String) elResolver.getValue("#{SimpleForm['PASSWORD_VALIDATION_ERROR']}"));
			program.add(cmd);

			cmd = new UpdateMessage();
			cmd.setTarget(IBeanFactory.MESSAGES.replaceAll("tura", "").replaceAll("_", "\\-"));
			cmd.setSeverity("error");
			cmd.setMessage("Error");
			cmd.setDetails((String) elResolver.getValue("#{SimpleForm['TEXTARIA_VALIDATION_ERROR']}"));
			program.add(cmd);

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerSimpleForm}");
			HolderObject oh = (HolderObject) bf.getHolderObject().getCurrentObject();
			HolderObjectArtifitialFieldsAdapter adapter = new HolderObjectArtifitialFieldsAdapter((ObjectControl) oh);
			adapter.setOutputField(UUID.randomUUID().toString());
			adapter.setImageField("https://picsum.photos/id/252/200/300");

			responseState.addValidationError(program);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void onDepartmentIdChange() {
		try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerSimpleForm}");
			EventParameter param = event.findParameter("newValue");
			
			Integer prm = null;
			if ( param.getValue() instanceof Integer) {
				prm = (Integer) param.getValue();
			}
			if (param.getValue() instanceof String ) {
				prm = Integer.parseInt( ( String)(param.getValue()));
			}

			bf.setDeptId(prm.longValue());

			DataControl dc = (DataControl) bf.getDropDownEmployee();
			dc.forceRefresh();

			Options opt = (Options) viewModel.getModel(IBeanFactory.DROPDOWNEMP, null, null);
			if (opt != null) {
				opt.clean();
			}

			opt = (Options) viewModel.getModel(IBeanFactory.RADIOEMP, null, null);
			if (opt != null) {
				opt.clean();
			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@Override
	public void setEvent(EventDescription event) {
		this.event = event;

	}

	public void submitSelection() {
		try {

			MultiSelectOptionsModel model = (MultiSelectOptionsModel) viewModel.getModel(IBeanFactory.MULTISELECT, null,
					null);
			List<Object> selected = model.getSelected();

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerSimpleForm}");
			HolderObject oh = (HolderObject) bf.getHolderObject().getCurrentObject();
			HolderObjectArtifitialFieldsAdapter adapter = new HolderObjectArtifitialFieldsAdapter((ObjectControl) oh);

			if (selected != null) {
				String str = "";
				for (Object obj : selected) {
					str += obj.toString();
				}
				adapter.setMultiselectDisplay(str);
			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void submitOfGridUpdate() {
		System.out.println("!!!!");
	}

	public void canvase1Switch() {
		viewPort.setSwitchPort("/hrmanager/simpleform/canvas1");
	}

	public void canvase2Switch() {
		viewPort.setSwitchPort("/hrmanager/simpleform/canvas2");

	}

	public void initPopup() {

		ClearForm cmd = new ClearForm();
		cmd.setTarget("9cf9f1b4-2822-48de-a4ae-44a380f74066");

		OpenPopup cmd1 = new OpenPopup();
		cmd1.setTarget("9cf9f1b4-2822-48de-a4ae-44a380f74066");

		responseState.addCommand(cmd);
		responseState.addCommand(cmd1);

	}

	public void acceptPopup() {

		HidePopup cmd = new HidePopup();
		cmd.setTarget("9cf9f1b4-2822-48de-a4ae-44a380f74066");

		responseState.addCommand(cmd);

	}

	public void cancelPopup() {

		HidePopup cmd = new HidePopup();
		cmd.setTarget("9cf9f1b4-2822-48de-a4ae-44a380f74066");

		responseState.addCommand(cmd);

	}

	public void createDepartment() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerSimpleForm}");
			bf.getDepartment().createObject();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	public void onFileUpload() {
		try {
			Map<String, InputStream> files = (Map<String, InputStream>) this.elResolver.getValue("#{turaFiles}");

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerSimpleForm}");
			HolderObject oh = (HolderObject) bf.getHolderObject().getCurrentObject();
			HolderObjectArtifitialFieldsAdapter adapter = new HolderObjectArtifitialFieldsAdapter((ObjectControl) oh);

			adapter.setMultiselectDisplay( Integer.valueOf(files.size()).toString());

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void onFileDownload() {
		try {

			DownloadFile cmd = new DownloadFile();
			cmd.setTarget("https://picsum.photos/id/252/200/300");
			responseState.addCommand(cmd);
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void errorEmulator() throws Exception {
		throw new Exception("Exception emulator");
		
	}
	
	
	public void poll() {
		try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryHrManagerSimpleForm}");
			HolderObject oh = (HolderObject) bf.getHolderObject().getCurrentObject();
			HolderObjectArtifitialFieldsAdapter adapter = new HolderObjectArtifitialFieldsAdapter((ObjectControl) oh);
			adapter.setMultiselectDisplay(UUID.randomUUID().toString());

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		
	}
	
	
}
