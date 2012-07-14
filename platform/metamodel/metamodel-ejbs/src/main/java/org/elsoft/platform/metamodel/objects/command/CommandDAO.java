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
package org.elsoft.platform.metamodel.objects.command;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.elsoft.platform.AnyTypeAdapter;
import org.elsoft.platform.metamodel.objects.ELsoftObject;

@Entity(name = "Command")
@Table(name = "command")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="OBJ_TYPE", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("COMMAND")
@XmlJavaTypeAdapter(AnyTypeAdapter.class)

public class CommandDAO extends ELsoftObject{
	@Column(name="PARENT_UUID")
	private String parentUUID;
	
	@Column(name="COMMAND_EXECUTOR")
	private String commandExecutor;

	@Column(name="UUID")
	private String UUID;

	public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}
	
	public String getParentUUID() {
		return parentUUID;
	}

	public void setParentUUID(String parentUUID) {
		this.parentUUID = parentUUID;
	}

	public String getCommandExecutor() {
		return commandExecutor;
	}

	public void setCommandExecutor(String commandExecutor) {
		this.commandExecutor = commandExecutor;
	}

}
