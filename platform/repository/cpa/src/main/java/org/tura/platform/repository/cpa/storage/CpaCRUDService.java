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

package org.tura.platform.repository.cpa.storage;

import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.cpa.operation.CatalogObjectControl;
import org.tura.platform.repository.cpa.operation.CpaControl;
import org.tura.platform.repository.cpa.operation.CpaUpdateStorageControl;
import org.tura.platform.repository.cpa.operation.KeyCorrectionControl;
import org.tura.platform.repository.cpa.operation.NotificationObjectControl;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class CpaCRUDService extends CRUDProvider {

	private CpaStorage cpaStorage;

	public CpaCRUDService(SpaObjectRegistry spaRegistry, String registryName, Registry registry,
			CpaStorage cpaStorage) {
		super(spaRegistry, registryName, registry);
		this.cpaStorage = cpaStorage;
	}

	@Override
	public void setAdapterLoader(AdapterLoader loader) {

	}

	protected PersistanceMapper findPersistanceMapper(Class<?> persistanceClass) throws RepositoryException {
		String repositoryClassName = registry.findRepositoryClass(persistanceClass);

		PersistanceMapper mapper = spaRegistry.getRegistry(registryName).findMapper(persistanceClass.getName(),
				repositoryClassName);
		if (mapper == null) {
			throw new RepositoryException(
					"PersistanceMapper not found from " + persistanceClass.getName() + " to " + repositoryClassName);
		}
		return mapper;
	}

	@Override
	public void execute(SpaControl control) throws Exception {
		PersistanceMapper mapper = findPersistanceMapper(control.getTypeClass());

		if (control instanceof CpaUpdateStorageControl) {
			updateStorageControlStatus(control, mapper);
			return;
		}
		if (control.getLevel().equals(OperationLevel.INSERT)) {
			insert(control, mapper);
			return;
		}
		if (control.getLevel().equals(OperationLevel.CREATE)) {
			create(control, mapper);
			return;
		}
		if (control.getLevel().equals(OperationLevel.LOAD)) {
			load(control, mapper);
			return;
		}
		if (control.getLevel().equals(OperationLevel.UNLOAD)) {
			unload(control, mapper);
			return;
		}

		if (control.getLevel().equals(OperationLevel.UPDATE)) {
			update(control, mapper);
			return;
		}
		if (control.getLevel().equals(OperationLevel.DELETE)) {
			delete(control, mapper);
			return;
		}

		if (control.getLevel().equals(OperationLevel.CONNECT)) {
			connect(control, mapper);
			return;
		}

		if (control.getLevel().equals(OperationLevel.DISCONNECT)) {
			disconnect(control, mapper);
			return;
		}
		if (control.getLevel().equals(OperationLevel.OPERATION)) {
			if (control instanceof KeyCorrectionControl) {
				keyCorrection(control, mapper);
				return;
			}
			if (control instanceof CatalogObjectControl) {
				catalogObject(control, mapper);
				return;
			}
		}
		if (control.getLevel().equals(OperationLevel.NOTIFICATION)) {
			notifyObject(control, mapper);
			return;
		}		
		
		throw new Exception("Unknown operation");
	}

	private void notifyObject(SpaControl control, PersistanceMapper mapper) throws Exception {
		NotificationObjectControl notificationControl = (NotificationObjectControl) control;
		cpaStorage.notifyListners(notificationControl.getNotificationSourceObject(), notificationControl.getNotificationType(), notificationControl.getSourceId());
	}

	private void catalogObject(SpaControl control, PersistanceMapper mapper) throws Exception {
		cpaStorage.catalogObject(control.getObject(), control.getTypeClass(), mapper);
	}

	private void keyCorrection(SpaControl control, PersistanceMapper mapper) throws Exception {
		KeyCorrectionControl keyControl = (KeyCorrectionControl) control;
		cpaStorage.correctCreatedObjects(control.getObject(), control.getTypeClass(), mapper, keyControl.getMasterMapper(), keyControl.getMaster());
	}

	private void updateStorageControlStatus(SpaControl control, PersistanceMapper mapper) throws Exception {
		CpaUpdateStorageControl cpaControl = (CpaUpdateStorageControl) control;
		cpaStorage.updateStatus(control.getKey(), (String) (cpaControl.getValue()), control.getTypeClass(), mapper);
	}

	private void load(SpaControl control, PersistanceMapper mapper) throws Exception {
		cpaStorage.load(control.getKey(), control.getObject(), control.getTypeClass(), mapper);
	}

	private void unload(SpaControl control, PersistanceMapper mapper) throws Exception {
		cpaStorage.unload(control.getKey(), control.getObject(), control.getTypeClass(), mapper);
	}

	private void create(SpaControl control, PersistanceMapper mapper) throws Exception {
		cpaStorage.create(control.getKey(), control.getObject(), control.getTypeClass(), mapper);
		return;
	}

	private void disconnect(SpaControl control, PersistanceMapper mapper) throws Exception {
		CpaControl cpaControl = (CpaControl) control;
		PersistanceMapper detailMapper = findPersistanceMapper(cpaControl.getDetailType());
		PersistanceMapper extDetailMapper = findPersistanceMapper(cpaControl.getExtendedDetailObject().getClass());
		PersistanceMapper extMasterMapper = findPersistanceMapper(cpaControl.getExtendedMasterObject().getClass());

		cpaStorage.disconnect(cpaControl.getKey(), cpaControl.getTypeClass(), mapper, cpaControl.getRelationId(),
				cpaControl.getDetailPk(), cpaControl.getDetailType(), detailMapper, cpaControl.getCpaRelationType(),
				cpaControl.getExtendedMasterObject(), extMasterMapper, cpaControl.getExtendedDetailObject(),
				extDetailMapper);
	}

	private void connect(SpaControl control, PersistanceMapper mapper) throws Exception {
		CpaControl cpaControl = (CpaControl) control;
		PersistanceMapper detailMapper = findPersistanceMapper(cpaControl.getDetailType());
		PersistanceMapper extDetailMapper = findPersistanceMapper(cpaControl.getExtendedDetailObject().getClass());
		PersistanceMapper extMasterMapper = findPersistanceMapper(cpaControl.getExtendedMasterObject().getClass());

		cpaStorage.connect(cpaControl.getKey(), cpaControl.getTypeClass(), mapper, cpaControl.getRelationId(),
				cpaControl.getDetailPk(), cpaControl.getDetailType(), detailMapper, cpaControl.getCpaRelationType(),
				cpaControl.getExtendedMasterObject(), extMasterMapper, cpaControl.getExtendedDetailObject(),
				extDetailMapper,cpaControl.isLazy());
	}

	private void delete(SpaControl control, PersistanceMapper mapper) throws Exception {
		CpaMapper cpaMapper = (CpaMapper) mapper;
		Boolean isAttached = cpaMapper.getAttached(control.getObject());
		if (isAttached != null && cpaMapper.getAttached(control.getObject())) {
			cpaStorage.remove(control.getKey(), control.getObject(), control.getTypeClass(), mapper);
		} else {
			cpaStorage.unload(control.getKey(), control.getObject(), control.getTypeClass(), mapper);
		}
	}

	private void update(SpaControl control, PersistanceMapper mapper) throws Exception {
		cpaStorage.update(control.getKey(), control.getObject(), control.getTypeClass(), mapper);

	}

	private void insert(SpaControl control, PersistanceMapper mapper) throws Exception {
		cpaStorage.insert(control.getKey(), control.getObject(), control.getTypeClass(), mapper);
	}

}
