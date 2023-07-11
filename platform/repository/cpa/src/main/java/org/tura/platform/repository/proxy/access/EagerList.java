/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.proxy.access;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.JOSQLExpressionBuilder;
import org.tura.platform.repository.core.RelationType;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;

import com.octo.java.sql.query.SelectQuery;

public abstract class EagerList<T> extends ListOfObjects<T> implements  Closeable{

	private static final long serialVersionUID = -400260996428731683L;

	public EagerList() {
		
	}
	
	public EagerList( Class<T> objectType, CpaStorageProvider storageProvider,CpaRepository repository,RelationType cpaRelationType) {
		super( objectType,storageProvider,repository,cpaRelationType);
	}
	
	@SuppressWarnings("unchecked")
	public SearchResult<T> search(int index) throws Exception {
		SelectQuery select = DefaulQueryFactory.builder(getSearchCriteria(), getOrderCriteria(), getObjectType());
		String strQuery = select.toSql(new JOSQLExpressionBuilder());
		Map<String, Object> p = select.getParams();
		Query query = new Query();
		query.parse(strQuery);
		for (String var : p.keySet()) {
			if ("null".equals(p.get(var))) {
				query.setVariable(var, null);
				continue;
			}
			query.setVariable(var, p.get(var));
		}
		
		RepoKeyPath path = getParentKeyPath();
		String  property = getProperty();
		List<StorageControl> lst =  this.getRepository().getStorageProvider().getStorage().findDependencies(path, property,  this.cpaRelationType);
		QueryResults queryResults = query.execute(lst);
		
		List<T> array = new ArrayList<>();
		for (  Object o : queryResults.getResults()) {
			StorageControl sc = (StorageControl) o;
			if ( !ObjectStatus.Created.equals(sc.getStatus())  && !ObjectStatus.Inserted.equals(sc.getStatus()) && !ObjectStatus.Removed.equals(sc.getStatus())   ) {
				T proxy = (T) getRepository().factory(sc.getObject(), sc.getObject().getClass().getName());
				array.add(proxy);
			}
		}
		
		SearchResult<T> result = new SearchResult<>(array, array.size());
		return result;
	}

	@Override
	public void close() throws IOException {
	}



}
