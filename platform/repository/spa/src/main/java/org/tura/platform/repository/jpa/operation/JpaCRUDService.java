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

package org.tura.platform.repository.jpa.operation;

import javax.persistence.EntityManager;

import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class JpaCRUDService extends CRUDProvider {
	
	private EntityManagerProvider entityManagerProvider;

	public JpaCRUDService(SpaObjectRegistry spaRegistry, String registryName, Registry registry,EntityManagerProvider entityManagerProvider) {
		super( spaRegistry,  registryName,  registry);
		this.entityManagerProvider = entityManagerProvider;
	}

	public EntityManager getEm() {
		return entityManagerProvider.getEntityManager();
	}
	
	@Override
	public void setAdapterLoader(AdapterLoader loader) {

	}

	@Override
	public void execute(SpaControl control) throws Exception {
		if (control.getLevel().equals(OperationLevel.INSERT)) {
			
			nillPk(control.getObject(), control.getType());
			getEm().persist(control.getObject());
			getEm().flush();

			mapPk(control.getType(), control.getObject(), control.getKey());
			return;
		}
		if (control.getLevel().equals(OperationLevel.UPDATE)) {
			getEm().merge(control.getObject());
			return;
		}
		if (control.getLevel().equals(OperationLevel.DELETE)) {
			Class<?> controlType = Class.forName(control.getType());
			Object master = getEm().find(controlType, control.getKey());
			getEm().remove(master);
			return;
		}

		if (control.getLevel().equals(OperationLevel.CONNECT)) {
			JpaControl jpaControl = (JpaControl) control;

			Class<?> masterType = Class.forName(jpaControl.getType());
			Object pk = findPK(jpaControl.getKey(), jpaControl.getType());
			Object master = getEm().find(masterType, pk);

			Class<?> detailType = Class.forName(jpaControl.getDetailType());
			pk = findPK(jpaControl.getDetailPk(), jpaControl.getDetailType());
			Object detail = getEm().find(detailType, pk);

			jpaControl.getOperation().connect(master, detail, jpaControl.getMasterProperty());
			return;
		}

		if (control.getLevel().equals(OperationLevel.DISCONNECT)) {
			JpaControl jpaControl = (JpaControl) control;

			Class<?> masterType = Class.forName(jpaControl.getType());
			Object pk = findPK(jpaControl.getKey(), jpaControl.getType());
			Object master = getEm().find(masterType, pk);

			Class<?> detailType = Class.forName(jpaControl.getDetailType());
			pk = findPK(jpaControl.getDetailPk(), jpaControl.getDetailType());
			Object detail = getEm().find(detailType, pk);

			jpaControl.getOperation().disconnect(master, detail, jpaControl.getMasterProperty());
			return;
		}

		throw new Exception("Unknown operation");

	}


}
