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
package org.tura.platform.datacontrol;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.tura.platform.datacontrol.annotations.ArtificialField;
import org.tura.platform.datacontrol.annotations.ArtificialFields;
import org.tura.platform.datacontrol.annotations.Connection;
import org.tura.platform.datacontrol.annotations.DefaultOrderBy;
import org.tura.platform.datacontrol.annotations.DefaultOrderBys;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriteria;
import org.tura.platform.datacontrol.annotations.DefaultSearchCriterias;
import org.tura.platform.datacontrol.annotations.Dependencies;
import org.tura.platform.datacontrol.annotations.Dependency;
import org.tura.platform.datacontrol.annotations.Key;
import org.tura.platform.datacontrol.annotations.Keys;
import org.tura.platform.datacontrol.annotations.Link;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.datacontrol.metainfo.Relation;

public class DataControlFactory {

	@Produces
	public List<String> getKeys(InjectionPoint injectionPoint) {
		ArrayList<String> list = new ArrayList<>();

		Keys annotation = injectionPoint.getAnnotated().getAnnotation(
				Keys.class);
		for (Key key : annotation.fields()) {
			list.add(key.field());
		}
		return list;

	}

	@Produces
	public List<ArtificialProperty> getArtificialProperties(
			InjectionPoint injectionPoint) throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		ArrayList<ArtificialProperty> list = new ArrayList<>();

		ArtificialFields annotation = injectionPoint.getAnnotated()
				.getAnnotation(ArtificialFields.class);

		for (ArtificialField field : annotation.fields()) {
			ArtificialProperty property = new ArtificialProperty();
			if (!"".equals(field.defaulValue())) {
				Constructor<?> constructor = field.type().getConstructor(
						String.class);
				property.setDefaultValue(constructor.newInstance(field
						.defaulValue()));
			}
			property.setType(field.type());
			property.setProperty(field.field());

			list.add(property);
		}
		return list;
	}

	@Produces
	public List<SearchCriteria> getSearchCriteria(InjectionPoint injectionPoint){

		DefaultSearchCriterias annotation = injectionPoint.getAnnotated().getAnnotation(
				DefaultSearchCriterias.class);


		ArrayList<SearchCriteria> ls = new ArrayList<>();
		for (DefaultSearchCriteria criteria : annotation.criterias()) {

			SearchCriteria c = new SearchCriteria();
			c.setClassName(criteria.type().getName());
			c.setComparator(criteria.comparator().name());
			c.setName(criteria.field());
			c.setValue(criteria.expression());
			
			ls.add(c);
			
		}

		return ls;
	}

	
	@Produces
	public List<OrderCriteria> getOrderCriteria(InjectionPoint injectionPoint){

		DefaultOrderBys annotation = injectionPoint.getAnnotated().getAnnotation(
				DefaultOrderBys.class);


		ArrayList<OrderCriteria> ls = new ArrayList<>();
		for (DefaultOrderBy  criteria : annotation.orders()) {

			OrderCriteria c = new OrderCriteria();
			c.setName(criteria.field());
			c.setOrder(criteria.order().name());
			
			ls.add(c);
			
		}

		return ls;
	}	
	


	@Produces
	public List<DependecyProperty> getDependencies(InjectionPoint injectionPoint) {

		Dependencies dependencies = injectionPoint.getAnnotated()
				.getAnnotation(Dependencies.class);

		ArrayList<DependecyProperty> list = new ArrayList<>();

		for (Dependency d : dependencies.dependency()) {
			DependecyProperty property = new DependecyProperty();
			property.setExpression(d.expression());
			list.add(property);
		}
		return list;
	}


	public static void buildConnection(DataControl<?> masterDC)
			throws IllegalArgumentException, IllegalAccessException, TuraException {

		Method[] methods = masterDC.getClass().getDeclaredMethods();
		for (Method method : methods) {
			method.setAccessible(true);
			Connection connection = method.getAnnotation(Connection.class);
			if (connection != null) {
				Relation relation = new Relation();
				relation.setChild(null);
				for (Link link : connection.links()) {
					relation.getLinks().add(
							new PropertyLink(link.field1(), link.field2()));
				}
				masterDC.addChildren(connection.connectionName(), relation);
			}
		}
	}
}
