/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDisplayFieldSpecifier;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetOptionsList;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateResultFieldSpecifier;

public abstract class OptionsInputElement extends InputElement {
	private DataLink optionsSrcLnk;
	private ArrayList<DisplayField> displayedFields = new ArrayList<DisplayField>();
	private ArrayList<ReturnResult> returnResult = new ArrayList<ReturnResult>();

	public DataLink getOptionsSrcLnk() {
		return optionsSrcLnk;
	}

	public void setOptionsSrcLnk(DataLink optionsSrcLnk) {
		this.optionsSrcLnk = optionsSrcLnk;
	}

	public void addDisplayField(String label, String expression) {

		this.displayedFields.add(new DisplayField(label, expression));
	}

	public void addReturnResult(String srcExpr, String trgExp) {

		this.returnResult.add(new ReturnResult(srcExpr, trgExp));

	}

	public ArrayList<DisplayField> getDisplayedFields() {
		return displayedFields;
	}

	public ArrayList<ReturnResult> getReturnResult() {
		return returnResult;
	}

	public void setGetOptionsList(EventDAO command,
			HashMap<String, Object> context) throws Exception {

		setOptionsSrcLnk((DataLink) context.get(command.getDstUUID()));
		this.getOptionsSrcLnk().addTrigger(
				this.getUiElementType(),
				MetamodelTriggerEventsType.valueOf(command.getEventType())
						.name());
		this.getOptionsSrcLnk().addTrigger(this.getUiElementType(),
				MetamodelTriggerEventsType.CreateEventGetCurrentRow.name());

	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateEventGetOptionsList.save(ch, getUuid(), this);
		Iterator<DisplayField> itrDis = displayedFields.iterator();
		while (itrDis.hasNext()) {
			CreateDisplayFieldSpecifier.save(ch, getUuid(), itrDis.next());
		}

		Iterator<ReturnResult> itrRes = returnResult.iterator();
		while (itrRes.hasNext()) {
			CreateResultFieldSpecifier.save(ch, getUuid(), itrRes.next());
		}

		super.serialize(ch);
	}



}
