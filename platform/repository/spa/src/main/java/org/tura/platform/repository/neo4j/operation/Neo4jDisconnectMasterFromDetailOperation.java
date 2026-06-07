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

package org.tura.platform.repository.neo4j.operation;

import java.util.List;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.jpa.operation.JpaControl;
import org.tura.platform.repository.jpa.operation.JpaDisconnectMasterFromDetailOperation;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.persistence.PersistanceRelationBuilder;
import org.tura.platform.repository.persistence.RelOperation;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class Neo4jDisconnectMasterFromDetailOperation extends JpaDisconnectMasterFromDetailOperation {

	private static final long serialVersionUID = 1L;

	private RepoObjectKey masterPk;
	private RepoObjectKey detailPk;
	private String masterType;
	private String detailType;

	public Neo4jDisconnectMasterFromDetailOperation(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry, spaRegistry);
	}

	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		List<SpaControl> list = super.prepare();

		try {

			PersistanceMapper masterMapper = findPersistanceMapper(Class.forName(masterType));
			PersistanceMapper detailMapper = findPersistanceMapper(Class.forName(detailType));

			RelOperation relation = PersistanceRelationBuilder.build(Class.forName(masterType), getMasterProperty());

			if (relation != null) {

				JpaControl control = (JpaControl) list.get(0);
				Neo4jLink linkControl = Neo4jLink.getDisConnect(control.getObject(), control.getKey(), registryName);
				linkControl.setMasterPk(masterMapper.getPKey(masterPk));
				linkControl.setMasterType(getMasterClassName());
				linkControl.setDetailPk(detailMapper.getPKey(detailPk));
				linkControl.setDetailType(getDetailClassName());
				linkControl.setRelation(relation);

				list.add(linkControl);
			}

			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		boolean check = super.checkCommand(cmdType, parameters);
		if (check) {
			RepoKeyPath masterPk_ = (RepoKeyPath) parameters[0];
			masterPk = masterPk_.getPath().get(0);

			RepoKeyPath detailPk_ = (RepoKeyPath) parameters[2];
			detailPk = detailPk_.getPath().get(0);

			masterType = masterPk.getType();
			detailType = detailPk.getType();
		}

		return check;
	}

}
