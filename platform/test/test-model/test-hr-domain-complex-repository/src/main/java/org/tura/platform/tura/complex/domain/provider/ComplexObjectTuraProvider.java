/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.tura.complex.domain.provider;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.elsoft.platform.hr.objects.CityDAO;
import org.elsoft.platform.hr.objects.CompanyDAO;
import org.elsoft.platform.hr.objects.CountryDAO;
import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.elsoft.platform.hr.objects.EmployeesDAO;
import org.elsoft.platform.hr.objects.FileDAO;
import org.elsoft.platform.hr.objects.StateDAO;
import org.elsoft.platform.hr.objects.StreetDAO;
import org.elsoft.platform.hr.objects.VehicleDAO;
import org.elsoft.platform.hr.objects.complex.model.CityObject;
import org.elsoft.platform.hr.objects.complex.model.CompanyObject;
import org.elsoft.platform.hr.objects.complex.model.CountryObject;
import org.elsoft.platform.hr.objects.complex.model.DepartmentsObject;
import org.elsoft.platform.hr.objects.complex.model.EmployeeObject;
import org.elsoft.platform.hr.objects.complex.model.FileObject;
import org.elsoft.platform.hr.objects.complex.model.StateObject;
import org.elsoft.platform.hr.objects.complex.model.StreetObject;
import org.elsoft.platform.hr.objects.complex.model.VehicleObject;
import org.elsoft.platform.hr.objects.jpa.simple.model.CityJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.CompanyJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.CountryJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.DepartmentJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.EmployeeJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.FileJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.StateJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.StreetJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.VehicleJPA;
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.model.RepositoryException;
import org.tura.platform.repository.DataProvider;
import org.tura.platform.repository.Repository;
import org.tura.platform.services.JPAService;

public class ComplexObjectTuraProvider implements DataProvider {

	private HashMap<String, String> persistenceClassMapper = new HashMap<>();
	private HashMap<String, String> domainModelClassMapper = new HashMap<>();
	private HashMap<String, ObjectLiveCycle> objectLiveCycle = new HashMap<>();

	private JPAService service;

	public ComplexObjectTuraProvider(Repository repository) {
		init(repository);
	}

	public ComplexObjectTuraProvider() {
	}

	public void setRepository(Repository repository) {
		init(repository);
	}

	public void setObjectLiveCycle(String name, ObjectLiveCycle liveCycle){
		liveCycle.setProvider(this);
		objectLiveCycle.put(name, liveCycle);
	}

	public ObjectLiveCycle getObjectLiveCycle(String name){
		return this.findLiveCycle(name);
	}
	
	
	private void init(Repository repository) {
		repository.addProvider(this, CompanyDAO.class.getName());
		repository.addProvider(this, CompanyObject.class.getName());

		repository.addProvider(this,  CountryObject.class.getName());
		repository.addProvider(this,  StateObject.class.getName());
		repository.addProvider(this,  CityObject.class.getName());
		repository.addProvider(this,  StreetObject.class.getName());
		repository.addProvider(this,  DepartmentsObject.class.getName());
		repository.addProvider(this,  EmployeeObject.class.getName());
		repository.addProvider(this,  FileObject.class.getName());
		repository.addProvider(this,  VehicleObject.class.getName());
		
		repository.addProvider(this,  CountryDAO.class.getName());
		repository.addProvider(this,  StateDAO.class.getName());
		repository.addProvider(this,  CityDAO.class.getName());
		repository.addProvider(this,  StreetDAO.class.getName());
		repository.addProvider(this,  DepartmentsDAO.class.getName());
		repository.addProvider(this,  EmployeesDAO.class.getName());
		repository.addProvider(this,  FileDAO.class.getName());
		repository.addProvider(this,  VehicleDAO.class.getName());
		
		persistenceClassMapper.put(CompanyObject.class.getName(), CompanyJPA.class.getName());
		persistenceClassMapper.put(DepartmentsObject.class.getName(), DepartmentJPA.class.getName());

		
		persistenceClassMapper.put(CompanyDAO.class.getName(), CompanyJPA.class.getName());
		persistenceClassMapper.put(CountryDAO.class.getName(), CountryJPA.class.getName());
		persistenceClassMapper.put(StateDAO.class.getName(), StateJPA.class.getName());
		persistenceClassMapper.put(CityDAO.class.getName(), CityJPA.class.getName());
		persistenceClassMapper.put(StreetDAO.class.getName(), StreetJPA.class.getName());
		persistenceClassMapper.put(DepartmentsDAO.class.getName(), DepartmentJPA.class.getName());
		persistenceClassMapper.put(EmployeesDAO.class.getName(), EmployeeJPA.class.getName());
		persistenceClassMapper.put(FileDAO.class.getName(), FileJPA.class.getName());
		persistenceClassMapper.put(VehicleDAO.class.getName(), VehicleJPA.class.getName());
		
		
		domainModelClassMapper.put(CompanyDAO.class.getName(), CompanyObject.class.getName());
		domainModelClassMapper.put(CountryDAO.class.getName(), CountryObject.class.getName());
		domainModelClassMapper.put(StateDAO.class.getName(), StateObject.class.getName());
		domainModelClassMapper.put(CityDAO.class.getName(), CityObject.class.getName());
		domainModelClassMapper.put(StreetDAO.class.getName(), StreetObject.class.getName());
		domainModelClassMapper.put(DepartmentsDAO.class.getName(), DepartmentsObject.class.getName());
		domainModelClassMapper.put(EmployeesDAO.class.getName(), EmployeeObject.class.getName());
		domainModelClassMapper.put(FileDAO.class.getName(), FileObject.class.getName());
		domainModelClassMapper.put(VehicleDAO.class.getName(), VehicleObject.class.getName());

		domainModelClassMapper.put(CompanyObject.class.getName(), CompanyObject.class.getName());
		domainModelClassMapper.put(CountryObject.class.getName(), CountryObject.class.getName());
		domainModelClassMapper.put(StateObject.class.getName(), StateObject.class.getName());
		domainModelClassMapper.put(CityObject.class.getName(), CityObject.class.getName());
		domainModelClassMapper.put(StreetObject.class.getName(), StreetObject.class.getName());
		domainModelClassMapper.put(DepartmentsObject.class.getName(), DepartmentsObject.class.getName());
		domainModelClassMapper.put(EmployeeObject.class.getName(), EmployeeObject.class.getName());
		domainModelClassMapper.put(FileObject.class.getName(), FileObject.class.getName());
		domainModelClassMapper.put(VehicleObject.class.getName(), VehicleObject.class.getName());

	}

	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
			String persistentClass = persistenceClassMapper.get(objectClass);
			Object persistentObject = getService().create(persistentClass);
			String domainModelClass = domainModelClassMapper.get(objectClass);
			Object domainObject = Class.forName(domainModelClass).newInstance();
			BeanUtils.copyProperties(domainObject, persistentObject);
			return domainObject;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<?> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		try {
			String persistentClass = findPersistenseObject(objectClass);
			long numberOfRows = getService().findNumberOfRows(searchCriteria, orderCriteria, persistentClass);

			List list = (List<?>) getService().find(searchCriteria, orderCriteria, startIndex, new Long(numberOfRows).intValue(),
					persistentClass);


			String domainModelClass = findDomainObject(objectClass);
			ObjectLiveCycle liveCycle = findLiveCycle(domainModelClass);
			for (int i = 0; i < list.size(); i++) {
				Object domainObject = liveCycle.load(list.get(i));
				list.set(i, domainObject);
			}
			LazyList lazyList = new LazyList<>(list, numberOfRows, startIndex);

			return lazyList;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public void update(Object request, String objectClass) throws RepositoryException {
		try {
			String domainModelClass = findDomainObject(objectClass);
			ObjectLiveCycle liveCycle = findLiveCycle(domainModelClass);
			liveCycle.save(request);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public void insert(Object request, String objectClass) throws RepositoryException {
		try {
			String domainModelClass = findDomainObject(objectClass);
			ObjectLiveCycle liveCycle = findLiveCycle(domainModelClass);
			liveCycle.save(request);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public void remove(Object request, String objectClass) throws RepositoryException {
		try {
			String domainModelClass = findDomainObject(objectClass);
			ObjectLiveCycle liveCycle = findLiveCycle(domainModelClass);
			liveCycle.remove(request);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	private String findDomainObject(String name) {
		return domainModelClassMapper.get(name);
	}

	private String findPersistenseObject(String name) {
		return persistenceClassMapper.get(findDomainObject(name));
	}

	private ObjectLiveCycle findLiveCycle(String name) {
		return objectLiveCycle.get(findDomainObject(name));
	}

	public JPAService getService() {
		return service;
	}

	public void setService(JPAService service) {
		this.service = service;
	}
}
