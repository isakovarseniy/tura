/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.cpa;

import java.lang.annotation.Annotation;
import java.util.List;

import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.cpa.operation.CpaCommandProducer;
import org.tura.platform.repository.cpa.operation.CpaRepositoryCommand;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.RemoveObjectData;
import org.tura.platform.repository.data.RemoveTopObjectData;

public class ClientObjectRemover extends RepositoryHelper {

	private static final long serialVersionUID = 1249426574813818922L;

	private SearchProvider searchProvider;

	public ClientObjectRemover(SearchProvider searchProvider) {
		this.searchProvider = searchProvider;
	}

	public void remove(RemoveTopObjectData change) {
		throw new UnsupportedOperationException();

	}

	public void remove(RemoveObjectData change) {
		throw new UnsupportedOperationException();
	}

	public void remove(RemoveContainmentObjectData data) throws Exception {
		Annotation annotation = getMasterAnnotation(data.getMasterPk(), data.getMasterProperty());
		if (annotation instanceof Association) {
			throw new UnsupportedOperationException();
		} else {
			updateInternal(data.getMasterPk(), data.getMasterProperty(), data.getObject(), data.getDetailProperty());
		}
	}

	private void updateInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty)
			throws Exception {
		CpaCommandProducer cmp = new CpaCommandProducer(searchProvider);
		List<CpaRepositoryCommand> commands = cmp.removeInternal(masterPk, masterProperty, detailObject,detailProperty);
		for (CpaRepositoryCommand cmd : commands) {
			cmd.prepare();
		}

	}

}
