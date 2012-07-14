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
package org.elsoft.platform.metamodel.processor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.general.ArtifactTypeDAO;
import org.elsoft.platform.metamodel.suite.ScriptRunner;
import org.elsoft.platform.metamodel.RepositoryFactory;

public abstract class ArtifactCalculator {

	public HashMap<String, Object> calculate(RepositoryFactory rf,
			HashMap<String, Object> context, String modelname) throws Exception {

		HashMap<String, Object> outputContext = new HashMap<String, Object>();

		Iterator<Artifact> itr = getArtifactList(context.get(modelname),
				context, outputContext).iterator();
		while (itr.hasNext()) {
			HashMap<String, Object> inputContext = new HashMap<String, Object>();
			inputContext.putAll(context);

			Artifact artifact = itr.next();
			ArtifactTypeDAO artifactDAO = rf.getArtifactTypeHandler().clean()
					.searchString("artifactType", artifact.artifactType.name())
					.searchString("technology", getTechnology()).getObject();

			inputContext.put(PlatformConfig.MODEL_HOLDER, artifact.getModel());

			new ScriptRunner().run(artifactDAO.getTemplatePath(), inputContext);
		}

		return outputContext;
	}

	protected abstract List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,
			HashMap<String, Object> outputContext);

	protected abstract String getTechnology();

	public class Artifact {
		private Object model;
		private MetamodelArtifactType artifactType;

		public Artifact(MetamodelArtifactType artifactType, Object model) {
			this.artifactType = artifactType;
			this.model = model;
		}

		public Object getModel() {
			return model;
		}

		public void setModel(Object model) {
			this.model = model;
		}

		public MetamodelArtifactType getArtifactType() {
			return artifactType;
		}

		public void setArtifactType(MetamodelArtifactType artifactType) {
			this.artifactType = artifactType;
		}
	}

}
