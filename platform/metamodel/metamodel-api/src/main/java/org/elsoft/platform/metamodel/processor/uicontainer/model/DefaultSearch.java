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
package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.UUID;

import org.elsoft.platform.metamodel.MetamodelTypeOfTypes;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CreateDefaultSearchDAO;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;

public class DefaultSearch {

	private String field;
	private String comparator;
	private String value;
	private IndependentType type;
	private String typeName;
	private String expression;
	private String uuid = UUID.randomUUID().toString();

	public DefaultSearch(CreateDefaultSearchDAO command, RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf
				.getTypeDefinitionHandler().clean()
				.searchString("typeOfType",
						MetamodelTypeOfTypes.Primitive.name())
				.searchString("typeName", command.getTypeName()).seek();

		setField(command.getColumnName());
		setComparator(command.getComparator());
		setValue(command.getValue());
		setType( new IndependentType(tdh.getObject()));
		setExpression(command.getExpression());
		setTypeName(command.getTypeName());
		
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getComparator() {
		return comparator;
	}

	public void setComparator(String comparator) {
		this.comparator = comparator;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public IndependentType getType() {
		return type;
	}

	public void setType(IndependentType type) {
		this.type = type;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
