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

package org.tura.platform.repository.core.relatioin;

import java.util.List;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.Rule;

public class ConnectObjectRule extends RepositoryHelper implements Rule {

	private static final long serialVersionUID = 5892314698278679928L;
	List<Object> masterChanges;
	Repository masterProvider;

	List<Object> detailChanges;
	Repository detailProvider;
	
	
	public ConnectObjectRule(Registry registry){
		super(registry);
	}

	public List<Object> getMasterChanges() {
		return masterChanges;
	}

	public void setMasterChanges(List<Object> masterChanges) {
		this.masterChanges = masterChanges;
	}

	public Repository getMasterProvider() {
		return masterProvider;
	}

	public void setMasterProvider(Repository masterProvider) {
		this.masterProvider = masterProvider;
	}

	public List<Object> getDetailChanges() {
		return detailChanges;
	}

	public void setDetailChanges(List<Object> detailChanges) {
		this.detailChanges = detailChanges;
	}

	public Repository getDetailProvider() {
		return detailProvider;
	}

	public void setDetailProvider(Repository detailProvider) {
		this.detailProvider = detailProvider;
	}

	@Override
	public void execute() throws Exception {
		masterProvider.applyChanges(getMasterChanges());
		detailProvider.applyChanges(getDetailChanges());
	}

}
