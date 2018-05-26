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
package org.tura.platform.repository.spa.operation;

import java.util.List;

import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.spa.RepositoryCommandType;
import org.tura.platform.repository.spa.SearchProvider;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class DefaultConnectMasterToDetailOperation implements SpaRepositoryCommand{

	private RepoKeyPath masterPk;
	private String masterProperty;
	private RepoKeyPath detailPk;
	private String detailProperty;
	
	
	@Override
	public List<String> getListOfKnownObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SpaControl> prepare() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSearchProvider(String className, SearchProvider provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) {
		masterPk = (RepoKeyPath) parameters[0];
		masterProperty = (String) parameters[1];
		detailPk = (RepoKeyPath) parameters[2];
		detailProperty = (String) parameters[3];
		return true;
	}

}
