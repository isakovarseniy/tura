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
package org.tura.platform.repository.core;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;

public interface PersistenceProvider {
	
   public void persist(Object entity) ;
   public void remove(Object entity) ;
   public <T> T find(Class<T> clazz , Object pk) ;
   public <T> T getPrimaryKey(Object entity) ;
   public List<?> findObjects(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,Integer endIndex, Object ...args )  throws Exception;
   public long findNumberOfRowsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria , Object ...args)  throws Exception;
   public void removeInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty);
   public void addInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty);
   public void disconnectMasterFromDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty);
   public void disconnectDetailFromMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty);
   public void connectMasterToDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty);
   public void connectDetailToMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk, String detailProperty);
   public void update(RepoKeyPath pk, String property, Object value);

}
