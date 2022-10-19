/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.spa.operation;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.persistence.LinkProcessor;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.persistence.RelOperation;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;
import org.tura.platform.repository.spa.priority.LinkControl;

public class SpaLinkOperation extends SpaRepositoryCommand {

	private static final long serialVersionUID = 6790239342697299329L;
	protected RepoKeyPath extendedMasterPk;
	protected RepoObjectKey masterPk;
	protected RepoKeyPath extendedDetailPk;
	protected RepoObjectKey detailPk;
	protected List<List<String>> links;
	protected String masterType;
	protected String masterPersistanceType;
	protected String detailType;
	protected String detailPersistanceType;
	protected String extendedMasterType;
	protected String extendedDetailType;

	public SpaLinkOperation(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry, spaRegistry);
	}

	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try {

			SearchProvider spMaster = this.providerHash.get(masterPersistanceType);
			PersistanceMapper masterMapper = findPersistanceMapper(Class.forName(masterType));

			Object persistanceMasterObject = spMaster.find(masterMapper.getPKey(masterPk), Class.forName(masterPersistanceType));
			if (persistanceMasterObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + masterPk.toString());
			}

			SearchProvider spDetail = this.providerHash.get(detailPersistanceType);
			PersistanceMapper detailMapper = findPersistanceMapper(Class.forName(detailType));
			Object persistanceDetailObject = spDetail.find(detailMapper.getPKey(detailPk), Class.forName(detailPersistanceType));
			if (persistanceDetailObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + detailPk.toString());
			}

			RelOperation relation = new LinkProcessor(links);
			
			LinkControl linkControl = new LinkControl(persistanceMasterObject, masterMapper.getPKey(masterPk), OperationLevel.LINK,
					registryName);
			linkControl.setMasterPk(masterMapper.getPKey(masterPk));
			linkControl.setMasterType(persistanceMasterObject);
			linkControl.setDetailPk(detailMapper.getPKey(detailPk));
			linkControl.setDetailType(persistanceDetailObject);
			linkControl.setExtendedMasterPk(extendedMasterPk);
			linkControl.setExtendedDetailPk(extendedDetailPk);
			linkControl.setRelation(relation);

			List<SpaControl> list = new ArrayList<>();
			list.add(linkControl);
			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		extendedMasterPk = (RepoKeyPath) parameters[0];
		masterPk = extendedMasterPk.getPath().get(0);
		extendedDetailPk = (RepoKeyPath) parameters[1];
		detailPk = extendedDetailPk.getPath().get(0);
		links = (List<List<String>>) parameters[2];

		masterType = masterPk.getType();
		detailType = detailPk.getType();

		detailPersistanceType = registry.findPersistanceClass(detailType);
		masterPersistanceType = registry.findPersistanceClass(masterType);

		extendedMasterType = extendedMasterPk.getPath().get(extendedMasterPk.getPath().size() - 1).getType();
		extendedDetailType = extendedDetailPk.getPath().get(extendedDetailPk.getPath().size() - 1).getType();

		this.knownObjects.add(detailPersistanceType);
		this.knownObjects.add(masterPersistanceType);
		return true;

	}

}
