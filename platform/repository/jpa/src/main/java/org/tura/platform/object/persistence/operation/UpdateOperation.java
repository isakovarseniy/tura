/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.object.persistence.operation;

import java.lang.reflect.Method;

import javax.persistence.EntityManager;

import org.apache.commons.lang.WordUtils;

public class UpdateOperation implements JPAOperation {

	EntityManager em;
	Object pk;
	String className;
	String property;
	Object value;

	public EntityManager getEntityManager() {
		return em;
	}

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public Object getPk() {
		return pk;
	}

	public void setPk(Object pk) {
		this.pk = pk;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public void execute() throws Exception {
		Object object = em.find(Class.forName(getClassName()), getPk());
		String name = "set" + WordUtils.capitalize(getProperty());
		Method m = object.getClass().getDeclaredMethod(name, getValue().getClass());
		m.invoke(object, getValue());
	}

}
