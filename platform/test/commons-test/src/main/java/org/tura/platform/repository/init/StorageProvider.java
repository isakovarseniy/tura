/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.init;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaRepositoryProvider;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;

public interface StorageProvider {

	public void startServer() throws Exception;

	public void stopServer();
	
	public void beforeSuite() throws Exception;
	
	public void afterSuite() ;

	public void initSession();

	public void initData(String name, Object... params) throws Exception;

	public void startTransaction() throws Exception;

	public void commitTransaction() throws Exception;

	public void clean();

	public CpaRepositoryProvider getCpaRepositoryProvider() throws Exception;

	public CpaRepository getRepository() throws Exception;

	public CpaRepository getMetamodelRepository() throws Exception;

	public CpaRepository getMixRepository() throws Exception;

	public CpaRepository getSpaRepository() throws Exception;

	public CpaStorageProvider getCpaStorageProvider() throws Exception;

	public Registry getRegistry() throws Exception;

	public void clearSession() throws Exception;

	public Object getSession() throws Exception;

	public void setRelatioin(DataControl<?> ddc, DataControl<?> edc) throws TuraException;

	public DataControl<?> initDepartments(String elPrefix, String initializer) throws Exception;

	public DataControl<?> initEmployees(String elPrefix, String initializer) throws Exception;

	public Long cDept(Long id);

	public Long cEmp(Long id);
	
	public void setSequence(long seq);
	
	public void persist(Object obj);


}
