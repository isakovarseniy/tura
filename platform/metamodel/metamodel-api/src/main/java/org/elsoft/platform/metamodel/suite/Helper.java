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
package org.elsoft.platform.metamodel.suite;

import java.util.HashMap;
import java.util.Iterator;

import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.recipe.ModelMappingDAO;
import org.elsoft.platform.metamodel.objects.recipe.PacketDAO;

public class Helper {

	protected HashMap<String, Object> generate(RepositoryFactory rf,
			String domain, String functionalDomain, String application, MetamodelPlatformLevel level,
			HashMap<String, Object> context, PacketHandler packetHandler) throws Exception {

		HashMap<String, Object> inputContext = new HashMap<String, Object>();
		inputContext.putAll(context);
		inputContext.put(PlatformConfig.DOMAIN_PARAMETER, domain);
		inputContext.put(PlatformConfig.FUNCTIONAL_DOMAIN_PARAMETER, functionalDomain);
		inputContext.put(PlatformConfig.APPLICATION_PARAMETER, application);
		inputContext.put(PlatformConfig.LAYER_PARAMETER, level);
		inputContext.put(PlatformConfig.REPOSITORYFACTORY_PARAMETER, rf);
		
		Iterator<PacketDAO> itrPac = packetHandler.cleanSearch().getList();
		while (itrPac.hasNext()) {
			PacketDAO packet = itrPac.next();

			context.putAll(packetHandler.generate(rf, domain,
					functionalDomain, application,level,inputContext));
			inputContext.putAll(context);

			
			Iterator<ModelMappingDAO> itr = packetHandler.getModelMappingHandler().cleanSearch().getList();
			while (itr.hasNext()) {
				ModelMappingDAO modelMapping = itr.next();
				HashMap<String, Object> outputContext = packetHandler.getModelMappingHandler().generate(
						modelMapping, inputContext,rf);
				context.putAll(outputContext);
				inputContext.putAll(outputContext);
			}
			if (packet.getBuildScript() != null){
				new ScriptRunner().run(packet.getBuildScript(), inputContext);
			}
			if (packet.getDeploymentScript() != null){
				new ScriptRunner().run(packet.getDeploymentScript(), inputContext);
			}
		}
		return context;
	}
	
	
}
