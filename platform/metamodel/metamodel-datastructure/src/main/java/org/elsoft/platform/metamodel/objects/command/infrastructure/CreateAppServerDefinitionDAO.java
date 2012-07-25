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
package org.elsoft.platform.metamodel.objects.command.infrastructure;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.elsoft.platform.metamodel.objects.command.CommandDAO;

@Entity(name = "CreateAppServerDefinition")
@Table(name = "createappserverdefinition")
@DiscriminatorValue("CREATEAPPSERVERDEFINITION")
@XmlRootElement
public class CreateAppServerDefinitionDAO extends CommandDAO {

	@Column(name = "PROPERTY_NAME")
	private String propertyName;


	@Column(name = "HOST")
	private String host;

	@Column(name = "HTTP_PORT")
	private String httpPort;

	@Column(name = "MANAGEMENT_PORT")
	private String managementPort;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getHttpPort() {
		return httpPort;
	}

	public void setHttpPort(String httpPort) {
		this.httpPort = httpPort;
	}

	public String getManagementPort() {
		return managementPort;
	}

	public void setManagementPort(String managementPort) {
		this.managementPort = managementPort;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}


}
