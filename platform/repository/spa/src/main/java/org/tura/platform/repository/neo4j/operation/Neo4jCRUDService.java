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

import java.util.Collection;

import org.neo4j.ogm.cypher.Filters;
import org.neo4j.ogm.session.Session;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.jpa.operation.JpaControl;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class Neo4jCRUDService extends CRUDProvider {

	private Neo4jSessionProvider neo4jSessionProvider;
	private SequenceProvider sequenceProvider;
	

	public Neo4jCRUDService(SpaObjectRegistry spaRegistry, String registryName, Registry registry,
			Neo4jSessionProvider neo4jSessionProvider, SequenceProvider sequenceProvider) {
		super(spaRegistry, registryName, registry);
		this.neo4jSessionProvider = neo4jSessionProvider;
		this.sequenceProvider = sequenceProvider;
	}

	public Session getSession() {
		return neo4jSessionProvider.getSession();
	}

	@Override
	public void setAdapterLoader(AdapterLoader loader) {

	}

	@Override
	public void execute(SpaControl control) throws Exception {
		if (control.getLevel().equals(OperationLevel.INSERT)) {

			initPk(control.getObject(), control.getType());
//			long start = Calendar.getInstance().getTimeInMillis();
			getSession().save(control.getObject());
//			long end = Calendar.getInstance().getTimeInMillis();
//			System.out.println("Save = create "+ (end - start));
			
			mapPk(control.getType(), control.getObject(), control.getKey());
			return;
		}
		if (control.getLevel().equals(OperationLevel.UPDATE)) {

			getSession().save(control.getObject());

			return;
		}
		if (control.getLevel().equals(OperationLevel.DELETE)) {
			Class<?> controlType = Class.forName(control.getType());
			Object pk = findPK(control.getKey(), control.getType());
			Object master = findObjectByPk(pk,controlType);
			getSession().delete(master);
			return;
		}

		if (control.getLevel().equals(OperationLevel.CONNECT)) {
			if (control instanceof JpaControl) {
				JpaControl jpaControl = (JpaControl) control;

				Class<?> masterType = Class.forName(jpaControl.getType());
				Object pk = findPK(jpaControl.getKey(), jpaControl.getType());
				Object master = findObjectByPk(pk,masterType);

				Class<?> detailType = Class.forName(jpaControl.getDetailType());
				pk = findPK(jpaControl.getDetailPk(), jpaControl.getDetailType());
				Object detail = findObjectByPk(pk,detailType);

				try {
  				   jpaControl.getOperation().connect(master, detail, jpaControl.getMasterProperty());
				}catch( NoSuchMethodException e) {
					return;
				}
				
				getSession().save(master);
				getSession().save(detail);
				
			}
			if (control instanceof Neo4jLink) {
				Neo4jLink link = (Neo4jLink) control;

				Class<?> masterType = Class.forName(link.getMasterType());
				Object pk = findPK(link.getMasterPk(), link.getMasterType());
				Object master = findObjectByPk(pk,masterType);

				Class<?> detailType = Class.forName(link.getDetailType());
				pk = findPK(link.getDetailPk(), link.getDetailType());
				Object detail = findObjectByPk(pk,detailType);

				link.getRelation().connect(master, detail);

				getSession().save(master);
				getSession().save(detail);
				

			}
			return;
		}

		if (control.getLevel().equals(OperationLevel.DISCONNECT)) {
			if (control instanceof JpaControl) {
				JpaControl jpaControl = (JpaControl) control;

				Class<?> masterType = Class.forName(jpaControl.getType());
				Object pk = findPK(jpaControl.getKey(), jpaControl.getType());
				Object master = findObjectByPk(pk,masterType);

				Class<?> detailType = Class.forName(jpaControl.getDetailType());
				pk = findPK(jpaControl.getDetailPk(), jpaControl.getDetailType());
				Object detail = findObjectByPk(pk,detailType);
         
				try {
				     jpaControl.getOperation().disconnect(master, detail, jpaControl.getMasterProperty());
			     }catch( NoSuchMethodException e) {
				    return;
			     }

				getSession().save(master);
				getSession().save(detail);
			}
			if (control instanceof Neo4jLink) {
				Neo4jLink link = (Neo4jLink) control;

				Class<?> masterType = Class.forName(link.getMasterType());
				Object pk = findPK(link.getMasterPk(), link.getMasterType());
				Object master = findObjectByPk(pk,masterType);

				Class<?> detailType = Class.forName(link.getDetailType());
				pk = findPK(link.getDetailPk(), link.getDetailType());
				Object detail = findObjectByPk(pk,detailType);

				link.getRelation().disconnect(master, detail);

				getSession().save(master);
				getSession().save(detail);

			}
			return;
		}

		throw new Exception("Unknown operation");

	}

	private Object findObjectByPk(Object pk, Class<?> objectClass) {
		Filters filters = ((FilterBuilder) pk).getPKSearch();
		Collection<?> results = getSession().loadAll(objectClass, filters);
		if (results != null && results.iterator().hasNext()) {
			return results.iterator().next();
		}
		return null;
	}

	
	public void initPk(Object obj, String  type) throws RepositoryException {
		Class<?> repositoryClass = helper.findRepositoryClass(type);
		Neo4jObjectInit mapper = (Neo4jObjectInit) helper.findMapper(repositoryClass.getName());
		mapper.initObject(obj, sequenceProvider );
	}
	
	
	
}
