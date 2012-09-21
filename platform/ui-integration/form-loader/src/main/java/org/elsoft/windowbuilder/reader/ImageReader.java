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
package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;


import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIImageDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetCurrentRow;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIImage;

public class ImageReader extends ItemReader {

	private String label;
	private boolean tableContext = false;

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		if ((getIdObject() != null) && (!getIdObject().equals(""))) {
			setUuid( getIdObject());
		}
		
		EventDAO event = null;
		if (parent instanceof TableColumnReader) {
			label = ((TableColumnReader) parent).getLabel();
			tableContext = true;
			parent=((TableColumnReader) parent).getParent();
			setDataControlId(((TableReader)parent).getDataControlId());
		}

		if (parent instanceof TreeColumnReader) {
			label = ((TreeColumnReader) parent).getLabel();
			tableContext = true;
			parent=((TreeColumnReader) parent).getParent();
			setDataControlId(((TreeReader)parent).getDataControlId());
		}
		
		
		CreateUIImageDAO creatUIImage = new CreateUIImageDAO();
		creatUIImage.setCommandExecutor(CreateUIImage.class.getName());
		creatUIImage.setParentUUID(parent.getUuid());
		creatUIImage.setUUID(getUuid());
		creatUIImage.setLabel(label);
		creatUIImage.setCss(getCssStyle());
		creatUIImage.setCssClass(getCssStyleClass());
		program.add(creatUIImage);

		event = new EventDAO();
		event.setCommandExecutor(CreateEventUIElement2Field.class.getName());
		event.setParentUUID(creatUIImage.getUUID());
		event.setDstUUID(getDataControlId() + "." + getField());
		program.add(event);

		if (!tableContext) {
			event = new EventDAO();
			event.setCommandExecutor(CreateEventGetCurrentRow.class.getName());
			event.setParentUUID(creatUIImage.getUUID());
			event.setDstUUID(getDataControlId());
			program.add(event);
		}

	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
