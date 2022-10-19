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

package sales.analyzer.ui.businesslogic.etlcontroller;

import org.tura.platform.uuiclient.annotations.KeyTransformer;
import org.tura.platform.uuiclient.rest.client.commands.KeyConverter;

@KeyTransformer(id = "873bdcf3-2ae0-42fa-8252-33a59760b984")
public class ProcessKeyConverter implements KeyConverter{

	@Override
	public String getKey(Object obj) {
		org.tura.salesanalyzer.serialized.jbpm.EtlProcess process = (org.tura.salesanalyzer.serialized.jbpm.EtlProcess) obj;
		return process.getId()+"."+process.getFileProcessingDate();
	}

}
