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

@Entity(name = "Packet")
@Table(name = "packet")
public class PacketDAO extends ELsoftObject{

	@Column(name="PACKET_NAME")
	private String packetName;
	
	@Column(name="BUILD_SCRIPT")
	private String buildScript;
	
	@Column(name="DEPLOYMENT_SCRIPT")
	private String deploymentScript;

	public String getBuildScript() {
		return buildScript;
	}

	public void setBuildScript(String buildScript) {
		this.buildScript = buildScript;
	}

	public String getDeploymentScript() {
		return deploymentScript;
	}

	public void setDeploymentScript(String deploymentScript) {
		this.deploymentScript = deploymentScript;
	}

	public String getPacketName() {
		return packetName;
	}

	public void setPacketName(String packetName) {
		this.packetName = packetName;
	}

}
