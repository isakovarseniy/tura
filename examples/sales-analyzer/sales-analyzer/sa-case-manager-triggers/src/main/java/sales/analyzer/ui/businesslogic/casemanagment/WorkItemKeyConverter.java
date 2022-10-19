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

package sales.analyzer.ui.businesslogic.casemanagment;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.annotations.KeyTransformer;
import org.tura.platform.uuiclient.rest.client.commands.KeyConverter;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.TaskArtifitialFieldsAdapter;


@KeyTransformer(id = "104d965f-253d-4210-8bfa-0577367e9cec")
public class WorkItemKeyConverter implements KeyConverter{
	
	
	private transient Logger logger = Logger.getLogger(ActionsCaseManagement.class.getName());

	@Override
	public String getKey(Object obj) {
		try {
		TaskArtifitialFieldsAdapter adapter = new TaskArtifitialFieldsAdapter((ObjectControl) obj);
		return adapter.getCaseId();
		}catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
			return null;
		}
	}
	
}
