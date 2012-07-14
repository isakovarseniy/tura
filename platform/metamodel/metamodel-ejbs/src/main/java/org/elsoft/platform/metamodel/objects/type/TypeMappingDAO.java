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
package org.elsoft.platform.metamodel.objects.type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.elsoft.platform.metamodel.objects.ELsoftObject;

@Entity(name = "TypeMapping")
@Table(name = "type_mapping")
public class TypeMappingDAO extends ELsoftObject {

	@Column(name = "TYPE_REFERENCE")
	private Long typeReference;

	@Column(name = "DSTDOMAIN")
	private String targetDomain;

	@Column(name = "DSTFUNCTIONALDOMAIN")
	private String targetFunctionalDomain;

	@Column(name = "DSTAPPLICATION")
	private String targetApplication;

	@Column(name = "DSTLAYER")
	private String targetLayer;
	
	@Column(name = "RESPACKAGENAME")
	private String resPackageName;

	
	@Column(name = "RESTYPENAME")
	private String resTypeName;
	
	@Column(name = "ARTIFACT_NAME")
	private String artifactName;

	@Column(name = "GROUP_NAME")
	private String groupName;
	
	@Column(name = "ARTIFACT_VERSION")
	private String artifactVersion;



	public String getArtifactName() {
		return artifactName;
	}


	public void setArtifactName(String artifactName) {
		this.artifactName = artifactName;
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public String getArtifactVersion() {
		return artifactVersion;
	}


	public void setArtifactVersion(String artifactVersion) {
		this.artifactVersion = artifactVersion;
	}


	public String getTargetDomain() {
		return targetDomain;
	}


	public void setTargetDomain(String targetDomain) {
		this.targetDomain = targetDomain;
	}


	public String getTargetFunctionalDomain() {
		return targetFunctionalDomain;
	}


	public void setTargetFunctionalDomain(String targetFunctionalDomain) {
		this.targetFunctionalDomain = targetFunctionalDomain;
	}


	public String getTargetApplication() {
		return targetApplication;
	}


	public void setTargetApplication(String targetApplication) {
		this.targetApplication = targetApplication;
	}



	public String getTargetLayer() {
		return targetLayer;
	}


	public void setTargetLayer(String targetLayer) {
		this.targetLayer = targetLayer;
	}


	public String getResPackageName() {
		return resPackageName;
	}


	public void setResPackageName(String resPackageName) {
		this.resPackageName = resPackageName;
	}


	public String getResTypeName() {
		return resTypeName;
	}


	public void setResTypeName(String resTypeName) {
		this.resTypeName = resTypeName;
	}


	public Long getTypeReference() {
		return typeReference;
	}


	public void setTypeReference(Long typeReference) {
		this.typeReference = typeReference;
	}

}
