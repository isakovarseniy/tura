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
package org.elsoft.platform.metamodel.objects.recipe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.elsoft.platform.metamodel.objects.ELsoftObject;

@Entity(name = "ModelMapping")
@Table(name = "model_mapping")
public class ModelMappingDAO extends ELsoftObject{
	
	@Column(name="MODEL_NAME")
	private String modelName;

	@Column(name="PROGRAM_REF")
	private Long programRef;
	
	@Column(name="ARTIFACT_CALCULATOR")
	private String artifactCalculator;

	public Long getProgramRef() {
		return programRef;
	}

	public void setProgramRef(Long programRef) {
		this.programRef = programRef;
	}

	public String getArtifactCalculator() {
		return artifactCalculator;
	}

	public void setArtifactCalculator(String artifactCalculator) {
		this.artifactCalculator = artifactCalculator;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	
}
