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

import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.processor.ArtifactCalculator;

public class WSEJBMavenArtifactCalculator extends ArtifactCalculator {

	@Override
	protected List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,
			HashMap<String, Object> outputContext) {
		ArrayList<Artifact> list = new ArrayList<Artifact>();

		list.add(new Artifact(MetamodelArtifactType.MAVENPOM_EAR, null,"WS-EJB"));
		list.add(new Artifact(MetamodelArtifactType.MAVENPOM_JAR, null,"WS-EJB"));
		list.add(new Artifact(MetamodelArtifactType.MAVENPOM_HIGHLAVEL, null,"WS-EJB"));

		return list;
	}

}
