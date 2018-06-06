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
package org.tura.platform.repository.mixed.test;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.triggers.PreQueryTrigger;

import com.octo.java.sql.exp.Operator;

public class PreQueryProcessor implements PreQueryTrigger{

	@Override
	public void preQueryTrigger(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria) throws Exception {
		RepositoryHelper helper = new RepositoryHelper();

		SearchCriteria parentPersistenceObject =   helper.extractAndRemove(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT,searchCriteria);
		SearchCriteria parentRepositoryObject  = helper.extractAndRemove(RepositoryObjectLoader.PARENT_REPOSITORY_OBJECT,searchCriteria);
		SearchCriteria parentChildRelation = helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION,searchCriteria);
		SearchCriteria parentChildRelationType = helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION_TYPE,searchCriteria);
		
		if (parentRepositoryObject != null){
			
			Object value = parentRepositoryObject.getValue();
			String simpleName = value.getClass().getSimpleName();
			QueryProcessor p = (QueryProcessor) Class.forName(PreQueryProcessor.class.getName()+"$"+simpleName+"Processor").newInstance();
			p.setParentChildRelation(parentChildRelation);
			p.setParentChildRelationType(parentChildRelationType);
			p.setParentPersistenceObject(parentPersistenceObject);
			p.setParentRepositoryObject(parentRepositoryObject);
			
			p.process(searchCriteria, orderCriteria);
		}
		
	}

	private abstract class QueryProcessor{
		@SuppressWarnings("unused")
		SearchCriteria parentPersistenceObject;
		SearchCriteria parentRepositoryObject;
		@SuppressWarnings("unused")
		SearchCriteria parentChildRelation;
		@SuppressWarnings("unused")
		SearchCriteria parentChildRelationType;
		
		protected  abstract  void process(List<SearchCriteria> searchCriteria, List<OrderCriteria> order) throws Exception;

		public void setParentPersistenceObject(SearchCriteria parentPersistenceObject) {
			this.parentPersistenceObject = parentPersistenceObject;
		}
		public void setParentRepositoryObject(SearchCriteria parentRepositoryObject) {
			this.parentRepositoryObject = parentRepositoryObject;
		}
		public void setParentChildRelation(SearchCriteria parentChildRelation) {
			this.parentChildRelation = parentChildRelation;
		}
		public void setParentChildRelationType(SearchCriteria parentChildRelationType) {
			this.parentChildRelationType = parentChildRelationType;
		}
	}
	
	@SuppressWarnings("unused")
	private class D1Processor extends QueryProcessor{

		@Override
		protected void process(List<SearchCriteria> searchCriteria, List<OrderCriteria> order) throws Exception {
			Object value = Reflection.call(parentRepositoryObject.getValue(), "getObjId");
			SearchCriteria sc = new SearchCriteria();
			sc.setName("parentId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(value);
			searchCriteria.add(sc);
		}
		
	}
	
	@SuppressWarnings("unused")
	private class A1Processor extends QueryProcessor{

		@Override
		protected void process(List<SearchCriteria> searchCriteria, List<OrderCriteria> order) throws Exception {
			Object value = Reflection.call(parentRepositoryObject.getValue(), "getObjId");
			SearchCriteria sc = new SearchCriteria();
			sc.setName("parentId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(value);
			searchCriteria.add(sc);
		}
		
	}
	

	@SuppressWarnings("unused")
	private class C1Processor extends QueryProcessor{

		@Override
		protected void process(List<SearchCriteria> searchCriteria, List<OrderCriteria> order) throws Exception {
			Object value = Reflection.call(parentRepositoryObject.getValue(), "getObjId");
			SearchCriteria sc = new SearchCriteria();
			sc.setName("parentId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(value);
			searchCriteria.add(sc);
		}
		
	}

	
	@SuppressWarnings("unused")
	private class B1Processor extends QueryProcessor{

		@Override
		protected void process(List<SearchCriteria> searchCriteria, List<OrderCriteria> order) throws Exception {
			Object value = Reflection.call(parentRepositoryObject.getValue(), "getObjId");
			SearchCriteria sc = new SearchCriteria();
			sc.setName("parentId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(value);
			searchCriteria.add(sc);
		}
		
	}
	
	
}
