/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.hrmanager.testform2.triggers;

import java.util.Map;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.example.ui.hrmanager.testform2.datacontrol.FileArtifitialFieldsAdapter;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.ArtificialFieldInterceptor;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.hr.objects.serialization.File;
import org.tura.platform.repository.core.ObjectControl;

@Alternative
@Priority(10)
@Selector("hrmanager.testform2")
@PostQuery("file")
@PostCreate("file")
@ArtificialFieldInterceptor("file")

public class FilesTrigger  implements PostQueryTrigger,OnChangeArtificialFieldTrigger,PostCreateTrigger{

	private static final long serialVersionUID = -1642493965299697272L;

	@Override
	public void execute(DataControl<?> datacontrol, Object obj)
			throws TuraException {
		File file = (File) obj;
		FileArtifitialFieldsAdapter af = new FileArtifitialFieldsAdapter ((ObjectControl) obj);
		af.setNameArf(file.getFileName());
		
	}

	
	@Override
	public boolean onSet(Object obj, Map<String, Object> attributes, String field, Object value) throws TuraException {
		((File) obj).setFileName((String) value);
		return true;
	}

	@Override
	public Object[] onGet(Object obj, Map<String, Object> attributes, String field) throws TuraException {
		return new Object[] { ((File) obj).getFileName() };
	}


	@Override
	public void execute(DataControl<?> datacontrol, Object obj, Map<String, Object> attributes) throws TuraException {
		((File) obj).setFileName("NA");
	}

}