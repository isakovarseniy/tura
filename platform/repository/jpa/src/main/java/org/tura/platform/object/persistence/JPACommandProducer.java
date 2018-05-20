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
package org.tura.platform.object.persistence;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.object.persistence.data.ConnectData;
import org.tura.platform.object.persistence.data.DisconnectData;
import org.tura.platform.object.persistence.data.PersistData;
import org.tura.platform.object.persistence.data.RemoveData;
import org.tura.platform.object.persistence.data.UpdateData;
import org.tura.platform.object.persistence.operation.RelEnul;
import org.tura.platform.repository.core.CommandProducer;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Internal;

public class JPACommandProducer extends RepositoryHelper implements CommandProducer {

	private String registry;
	public JPACommandProducer(String registry){
		this.registry = registry;
		
	}
	
	public Object getPrimaryKey(RepoKeyPath pk) throws RepositoryException {
		RepoObjectKey objKey = pk.getPath().get(0);
		String repositoryClass = objKey.getType();
		Mapper mapper = findMapper(repositoryClass);
		return mapper.getPrimaryKey(objKey);

	}

	public String getPersistanceClassName(RepoKeyPath pk) throws RepositoryException {
		String repositoryClass = pk.getPath().get(0).getType();
		return Registry.getInstance().findPersistanceClass(repositoryClass);
	}
	
	public boolean isItJPAClass(RepoKeyPath pk) throws Exception{
		String className = getPersistanceClassName(pk); 
		return JPAObjectRegistry.getInstance().getRegistry(registry).isClassRegistered(className);
	}
	

	public String getRelationType(RepoKeyPath pk, String property) throws Exception {
		String className = pk.getPath().get(0).getType();
		Class<?> clazz = Class.forName(className);
		String methodName = "get" + WordUtils.capitalize(property);
		Method m = clazz.getMethod(methodName, new Class<?>[] {});
		Annotation a = m.getAnnotation(Association.class);
		if (a == null) {
			a = m.getAnnotation(Internal.class);
		}
		if (a == null) {
			throw new RepositoryException("Method is not annootated");
		}
		String relationType = null;
		if (a instanceof Association) {
			relationType = ((Association) a).type();
		}
		if (a instanceof Internal) {
			relationType = ((Internal) a).type();
		}
		if ("One2Many".equals(relationType)) {
			if (findAnnotationType(m)) {
				return "One2Many";
			} else {
				return "Many2One";
			}
		}
		return relationType;
	}

	@Override
	public List<Object> removeObject(Object repositoryObject) throws RepositoryException {
		ArrayList<Object> list = new ArrayList<>();
		RemoveData data = new RemoveData();

		Mapper mapper = findMapper(repositoryObject.getClass().getName());
		Object persistanceObject = mapper.copyFromRepository2Persistence(repositoryObject);
		data.setObject(persistanceObject);

		list.add(data);
		return list;
	}

	@Override
	public List<Object> removeInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Object> addObject(Object repositoryObject) throws RepositoryException {
		ArrayList<Object> list = new ArrayList<>();
		PersistData data = new PersistData();

		Mapper mapper = findMapper(repositoryObject.getClass().getName());
		Object persistanceObject = mapper.copyFromRepository2Persistence(repositoryObject);
		data.setObject(persistanceObject);

		list.add(data);
		return list;
	}

	@Override
	public List<Object> addInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Object> disconnectMasterFromDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		
		try {
			List<Object> list = null;

			if (!isItJPAClass(detailPk)){
				list = handleExceptionDisconnectMasterFromDetail( masterPk,  masterProperty,  detailPk, detailProperty);
				return list;
			}
			
			
			list = new ArrayList<>();

			DisconnectData data = new DisconnectData();
			data.setMasterPk(getPrimaryKey(masterPk));
			data.setMasterProperty(masterProperty);
			data.setRelation(getRelationType(masterPk, masterProperty));
			data.setMasterClassName(getPersistanceClassName(masterPk));
			data.setDetailPk(getPrimaryKey(detailPk));
			data.setDetailClassName(getPersistanceClassName(detailPk));

			list.add(data);
			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);

		}
	}


	@Override
	public List<Object> disconnectDetailFromMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		try {

			List<Object> list = null;

			if (!isItJPAClass(masterPk)){
				list = handleExceptionDisconnectDetailFromMaster( masterPk,  masterProperty,  detailPk, detailProperty);
				return list;
			}
			
			list = new ArrayList<>();

			DisconnectData data = new DisconnectData();
			data.setMasterPk(getPrimaryKey(detailPk));
			data.setMasterProperty(detailProperty);
			data.setMasterClassName(getPersistanceClassName(detailPk));
			data.setRelation(getRelationType(detailPk, detailProperty));
			data.setDetailPk(getPrimaryKey(masterPk));
			data.setDetailClassName(getPersistanceClassName(masterPk));

			list.add(data);
			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);

		}

	}


	@Override
	public List<Object> connectMasterToDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		try {
			List<Object> list = null;

			if (!isItJPAClass(detailPk)){
				list = handleExceptionConnectMasterToDetail( masterPk,  masterProperty,  detailPk, detailProperty);
				return list;
			}

			list = new ArrayList<>();
			ConnectData data = new ConnectData();
			data.setMasterPk(getPrimaryKey(masterPk));
			data.setMasterProperty(masterProperty);
			data.setMasterClassName(getPersistanceClassName(masterPk));
			data.setRelation(getRelationType(masterPk, masterProperty));
			data.setDetailPk(getPrimaryKey(detailPk));
			data.setDetailClassName(getPersistanceClassName(detailPk));

			list.add(data);
			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);

		}
	}


	@Override
	public List<Object> connectDetailToMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		try {
			List<Object> list = null;

			if (!isItJPAClass(masterPk)){
				list = handleExceptionConnectDetailToMaster( masterPk,  masterProperty,  detailPk, detailProperty);
				return list;
			}

			list = new ArrayList<>();

			ConnectData data = new ConnectData();
			data.setMasterPk(getPrimaryKey(detailPk));
			data.setMasterProperty(detailProperty);
			data.setMasterClassName(getPersistanceClassName(detailPk));
			data.setRelation(getRelationType(detailPk, detailProperty));
			data.setDetailPk(getPrimaryKey(masterPk));
			data.setDetailClassName(getPersistanceClassName(masterPk));

			list.add(data);
			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);

		}

	}


	@Override
	public List<Object> update(RepoKeyPath pk, String property, Object value) throws RepositoryException {
		ArrayList<Object> list = new ArrayList<>();

		UpdateData data = new UpdateData();
		data.setProperty(property);
		data.setValue(value);
		data.setClassName(  getPersistanceClassName(pk));
		data.setPk(getPrimaryKey(pk));

		list.add(data);

		return list;
	}

	public List<?> findChildren(Object persistenceObject, String relationType, String property) throws Exception {

		if ("One2Many".equals(relationType)) {
			String methodName = "get" + WordUtils.capitalize((String) property);
			Method m = persistenceObject.getClass().getDeclaredMethod(methodName);
			if (findAnnotationType(m)) {
				relationType = "One2Many";
			} else {
				relationType = "Many2One";
			}
		}
		return RelEnul.valueOf(relationType).getOperation().getChildren(persistenceObject, property);

	}

	private boolean findAnnotationType(Method method) {
		boolean one2many = true;
		Type returnType = method.getGenericReturnType();
		if (returnType instanceof ParameterizedType) {
			ParameterizedType type = (ParameterizedType) returnType;
			if (  ((Class<?>) type.getRawType()).getName().equals(Collection.class.getName())
            ||
            ((Class<?>) type.getRawType()).getName().equals(List.class.getName())
					) {
				one2many = true;
			} else {
				one2many = false;
			}
		} else {
			one2many = false;
		}
		return one2many;

	}

	private List<Object> handleExceptionConnectMasterToDetail(RepoKeyPath masterPk, String masterProperty,
			RepoKeyPath detailPk, String detailProperty) {
		throw new UnsupportedOperationException();
	}
	
	private List<Object> handleExceptionConnectDetailToMaster(RepoKeyPath masterPk, String masterProperty,
			RepoKeyPath detailPk, String detailProperty) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	private List<Object> handleExceptionDisconnectDetailFromMaster(RepoKeyPath masterPk, String masterProperty,
			RepoKeyPath detailPk, String detailProperty) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	private List<Object> handleExceptionDisconnectMasterFromDetail(RepoKeyPath masterPk, String masterProperty,
			RepoKeyPath detailPk, String detailProperty) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	
}
