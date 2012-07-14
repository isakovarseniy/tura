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
package org.elsoft.platform.metamodel.processor.artifactcalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.MetamodelTypeOfTypes;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.processor.ArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder.TypeModelBuilder;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;

public class WSEJBArtifactCalculator extends ArtifactCalculator {

	@Override
	protected List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,
			HashMap<String, Object> outputContext) {

		ArrayList<Artifact> list = new ArrayList<Artifact>();
		IndependentType it = (IndependentType) model;

		it = new TypeModelBuilder().builder((RepositoryFactory) context
				.get(PlatformConfig.REPOSITORYFACTORY_PARAMETER),
				(String) context.get(PlatformConfig.DOMAIN_PARAMETER),
				(String) context
						.get(PlatformConfig.FUNCTIONAL_DOMAIN_PARAMETER),
				(String) context.get(PlatformConfig.APPLICATION_PARAMETER),
				(MetamodelPlatformLevel) context
						.get(PlatformConfig.LAYER_PARAMETER), it);

		if (MetamodelTypeOfTypes.Entity.name().equals(it.getTypeOftype()))
		   list.add(new Artifact(MetamodelArtifactType.ENTITY, it));

		if (MetamodelTypeOfTypes.Service.name().equals(it.getTypeOftype())){
			   list.add(new Artifact(MetamodelArtifactType.SESSIONBEAN, it));
			   list.add(new Artifact(MetamodelArtifactType.REMOTEINTERFACE, it));
			
		}
		
		return list;
	}

	@Override
	protected String getTechnology() {
		return "WS-EJB";
	}

}
