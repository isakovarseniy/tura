/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.repository.spa;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Connection;
import org.tura.platform.repository.core.annotation.Link;
import org.tura.platform.repository.persistence.ConnectionProcessor;
import org.tura.platform.repository.triggers.PreQueryTrigger;

import com.octo.java.sql.exp.Operator;

public class ExternalConnectionPreQueryTrigger implements PreQueryTrigger{

	private static final long serialVersionUID = 6052186755597096364L;
	protected Registry registry;

	public ExternalConnectionPreQueryTrigger(Registry registry){
		this.registry = registry;
	}
	
	
	@Override
	public void preQueryTrigger(List<SearchCriteria> searchCriteria, List<OrderCriteria> order)throws Exception {
		RepositoryHelper helper = new RepositoryHelper(registry);
		
		SearchCriteria parentRepositoryObject  = helper.extractAndRemove(RepositoryObjectLoader.PARENT_REPOSITORY_OBJECT,searchCriteria);
		SearchCriteria parentChildRelation = helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION,searchCriteria);
		SearchCriteria parentPersistanceObject = helper.extractAndRemove(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT,searchCriteria);
	
		if (parentRepositoryObject !=null){
			Object obj = parentRepositoryObject.getValue();
			String methodName = "get" + WordUtils.capitalize((String) parentChildRelation.getValue());
			Method m = obj.getClass().getMethod(methodName);
			Connection connection = m.getAnnotation(Connection.class);
			Association association = m.getAnnotation(Association.class);
			if (connection != null){
				Map<String, Class<?>> h  = new ConnectionProcessor(connection,association).sortObject(obj.getClass(), null);
				if ( h.get(ConnectionProcessor.MASTER) != null){
					for (  Link lnk : connection.links()){
						SearchCriteria sc = new SearchCriteria();
						sc.setName(lnk.field2());
						sc.setComparator(Operator.EQ.name());
						String name = "get" + WordUtils.capitalize(lnk.field1());
						Object value = Reflection.call(parentRepositoryObject.getValue(), name);
						sc.setValue(value);
						searchCriteria.add(sc);
					}
				}else{
					for (  Link lnk : connection.links()){
						SearchCriteria sc = new SearchCriteria();
						sc.setName(lnk.field1());
						sc.setComparator(Operator.EQ.name());
						
						if (parentPersistanceObject != null  && parentPersistanceObject.getValue() != null){
							Object persistanceObject = parentPersistanceObject.getValue();
							String name = "get" + WordUtils.capitalize(lnk.field2());
							Object value = Reflection.call(persistanceObject, name);
							sc.setValue(value);
							searchCriteria.add(sc);
						}else{
							String name = "getTransient" + lnk.field2();
							Object repositoryObject = parentRepositoryObject.getValue();
							Object value = Reflection.call(repositoryObject, name);
							if (value == null){
								sc.setName(RepositoryObjectLoader.SKIP_QUERY);
								sc.setValue(true);
								searchCriteria.add(sc);
								return ;
							}
							sc.setValue(value);
							searchCriteria.add(sc);
						}
					}
				}
			}
		}
	}
}
