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
package org.elsoft.platform.metamodel.processor.datasource.model;

import java.util.HashMap;
import java.util.UUID;

import org.elsoft.platform.metamodel.objects.type.PropertyDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.types.PropertyHandler;

public class Field {

	private String uuid = UUID.randomUUID().toString();
	private String name;
	private IndependentType type;
	private boolean optLock=false;
	private boolean pk=false;

	public boolean isOptLock() {
		return optLock;
	}

	public void setOptLock(boolean optLock) {
		this.optLock = optLock;
	}

	public boolean isPk() {
		return pk;
	}

	public void setPk(boolean pk) {
		this.pk = pk;
	}


	public Field(PropertyDAO property,TypeDAO type,HashMap<String, Object> context, String datalinkUUID ,String classifier) {
        init(property,type, context,  datalinkUUID);
		uuid=datalinkUUID+"."+ classifier +"."+property.getPropertyName();
		context.put(uuid, this);
	}	
	
	public Field(PropertyDAO property,TypeDAO type,HashMap<String, Object> context, String datalinkUUID ) {
         init(property,type, context,  datalinkUUID);
 		 context.put(uuid, this);
	}

	private void init(PropertyDAO property,TypeDAO type,HashMap<String, Object> context, String datalinkUUID ){
		this.type = new IndependentType(type);
		name=property.getPropertyName();
		uuid=datalinkUUID+"."+property.getPropertyName();

		Object j = property.getPrimaryKey();
		if (( j != null)&&(property.getPrimaryKey() ))
			this.setPk(true);

		j=property.getOptLock();
		if (( j != null)&&(property.getOptLock() ))
			this.setOptLock(true);
		
	}

	public Field(PropertyHandler ph, PropertyDAO property) {
		type = new IndependentType(ph.getTypeDefinitionHandler());
        name = property.getPropertyName();
		Object j = property.getPrimaryKey();
		if (( j != null)&&(property.getPrimaryKey() ))
			this.setPk(true);

		j=property.getOptLock();
		if (( j != null)&&(property.getOptLock() ))
			this.setOptLock(true);
        
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IndependentType getType() {
		return type;
	}

	public void setType(IndependentType type) {
		this.type = type;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
