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
package org.tura.platform.tura.simple.domain.provider;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.elsoft.platform.hr.objects.CityDAO;
import org.elsoft.platform.hr.objects.CompanyDAO;
import org.elsoft.platform.hr.objects.CountryDAO;
import org.elsoft.platform.hr.objects.Department2EntityDAO;
import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.elsoft.platform.hr.objects.EmployeesDAO;
import org.elsoft.platform.hr.objects.FileDAO;
import org.elsoft.platform.hr.objects.StateDAO;
import org.elsoft.platform.hr.objects.StreetDAO;
import org.elsoft.platform.hr.objects.VehicleDAO;
import org.elsoft.platform.hr.objects.jpa.simple.model.CityJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.CompanyJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.CountryJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.DepartmentJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.Dept2EmpJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.EmployeeJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.FileJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.StateJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.StreetJPA;
import org.elsoft.platform.hr.objects.jpa.simple.model.VehicleJPA;
import org.elsoft.platform.hr.objects.simple.model.City;
import org.elsoft.platform.hr.objects.simple.model.Company;
import org.elsoft.platform.hr.objects.simple.model.Country;
import org.elsoft.platform.hr.objects.simple.model.Dep2Entity;
import org.elsoft.platform.hr.objects.simple.model.Department;
import org.elsoft.platform.hr.objects.simple.model.Employee;
import org.elsoft.platform.hr.objects.simple.model.File;
import org.elsoft.platform.hr.objects.simple.model.State;
import org.elsoft.platform.hr.objects.simple.model.Street;
import org.elsoft.platform.hr.objects.simple.model.Vehicle;
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.TuraObject;
import org.tura.platform.object.model.RepositoryException;
import org.tura.platform.repository.DataProvider;
import org.tura.platform.repository.Repository;
import org.tura.platform.services.JPAService;


public class SimpleTuraProvider implements DataProvider {

	private HashMap<String, String> persistenceClassMapper = new HashMap<>();
	
	private HashMap<String, String> domainModelClassMapper = new HashMap<>();
	
	private JPAService service;

	public SimpleTuraProvider(Repository repository) {
		init(repository);
	}
	
	public SimpleTuraProvider() {
	}
	
	public void setRepository(Repository repository){
		init(repository);
	}
	
	private  void init(Repository repository) {
		repository.addProvider(this, CompanyDAO.class.getName());
		repository.addProvider(this, CountryDAO.class.getName());
		repository.addProvider(this, StateDAO.class.getName());
		repository.addProvider(this, CityDAO.class.getName());
		repository.addProvider(this, StreetDAO.class.getName());
		repository.addProvider(this, DepartmentsDAO.class.getName());
		repository.addProvider(this, EmployeesDAO.class.getName());
		repository.addProvider(this, FileDAO.class.getName());
		repository.addProvider(this, VehicleDAO.class.getName());
		repository.addProvider(this, Department2EntityDAO.class.getName());

		repository.addProvider(this, Company.class.getName());
		repository.addProvider(this, Country.class.getName());
		repository.addProvider(this, State.class.getName());
		repository.addProvider(this, City.class.getName());
		repository.addProvider(this, Street.class.getName());
		repository.addProvider(this, Department.class.getName());
		repository.addProvider(this, Employee.class.getName());
		repository.addProvider(this, File.class.getName());
		repository.addProvider(this, Vehicle.class.getName());
		repository.addProvider(this, Dep2Entity.class.getName());
		
		
		persistenceClassMapper.put(CompanyDAO.class.getName(), CompanyJPA.class.getName());
		persistenceClassMapper.put(CountryDAO.class.getName(), CountryJPA.class.getName());
		persistenceClassMapper.put(StateDAO.class.getName(), StateJPA.class.getName());
		persistenceClassMapper.put(CityDAO.class.getName(), CityJPA.class.getName());
		persistenceClassMapper.put(StreetDAO.class.getName(), StreetJPA.class.getName());
		persistenceClassMapper.put(DepartmentsDAO.class.getName(), DepartmentJPA.class.getName());
		persistenceClassMapper.put(EmployeesDAO.class.getName(), EmployeeJPA.class.getName());
		persistenceClassMapper.put(FileDAO.class.getName(), FileJPA.class.getName());
		persistenceClassMapper.put(VehicleDAO.class.getName(), VehicleJPA.class.getName());
		persistenceClassMapper.put(Department2EntityDAO.class.getName(), Dept2EmpJPA.class.getName());


		persistenceClassMapper.put(Company.class.getName(), CompanyJPA.class.getName());
		persistenceClassMapper.put(Country.class.getName(), CountryJPA.class.getName());
		persistenceClassMapper.put(State.class.getName(), StateJPA.class.getName());
		persistenceClassMapper.put(City.class.getName(), CityJPA.class.getName());
		persistenceClassMapper.put(Street.class.getName(), StreetJPA.class.getName());
		persistenceClassMapper.put(Department.class.getName(), DepartmentJPA.class.getName());
		persistenceClassMapper.put(Employee.class.getName(), EmployeeJPA.class.getName());
		persistenceClassMapper.put(File.class.getName(), FileJPA.class.getName());
		persistenceClassMapper.put(Vehicle.class.getName(), VehicleJPA.class.getName());
		persistenceClassMapper.put(Dep2Entity.class.getName(), Dept2EmpJPA.class.getName());

		
		
		domainModelClassMapper.put(CompanyDAO.class.getName(), Company.class.getName());
		domainModelClassMapper.put(CountryDAO.class.getName(), Country.class.getName());
		domainModelClassMapper.put(StateDAO.class.getName(), State.class.getName());
		domainModelClassMapper.put(CityDAO.class.getName(), City.class.getName());
		domainModelClassMapper.put(StreetDAO.class.getName(), Street.class.getName());
		domainModelClassMapper.put(DepartmentsDAO.class.getName(), Department.class.getName());
		domainModelClassMapper.put(EmployeesDAO.class.getName(), Employee.class.getName());
		domainModelClassMapper.put(FileDAO.class.getName(), File.class.getName());
		domainModelClassMapper.put(VehicleDAO.class.getName(), Vehicle.class.getName());
		domainModelClassMapper.put(Department2EntityDAO.class.getName(), Dep2Entity.class.getName());

	
	
	}

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<?> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {

		try {
			String persistentClass = persistenceClassMapper.get(objectClass);
			List list = (List<?>) getService().find(searchCriteria, orderCriteria, startIndex, endIndex,
					persistentClass);

			long numberOfRows = getService().findNumberOfRows(searchCriteria, orderCriteria, persistentClass);

			String domainModelClass = domainModelClassMapper.get(objectClass);

			for (int i = 0; i < list.size(); i++) {
				Object domainObject = Class.forName(domainModelClass).newInstance();
				BeanUtilsBean.getInstance().getConvertUtils().register(false, false, 0);
				BeanUtilsBean.getInstance().copyProperties(domainObject, list.get(i));
				list.set(i, domainObject);
			}
			LazyList lazyList = new LazyList<>(list, numberOfRows, startIndex);

			return lazyList;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void update(Object request, String objectClass) throws RepositoryException {
		try {
			String persistentClass = persistenceClassMapper.get(objectClass);
			Object persistentObject = getService().findByPk(persistentClass, request);
			BeanUtils.copyProperties(persistentObject, request);
			getService().update((TuraObject) persistentObject);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void insert(Object request, String objectClass) throws RepositoryException {
		try {
			String persistentClass = persistenceClassMapper.get(objectClass);
			Object persistentObject = Class.forName(persistentClass).newInstance();
			BeanUtils.copyProperties(persistentObject, request);
			getService().insert((TuraObject) persistentObject);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void remove(Object request, String objectClass) throws RepositoryException {
		try {
			String persistentClass = persistenceClassMapper.get(objectClass);
			Object persistentObject = Class.forName(persistentClass).newInstance();
			BeanUtils.copyProperties(persistentObject, request);
			getService().remove((TuraObject) persistentObject);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public JPAService getService() {
		return service;
	}

	public void setService(JPAService service) {
		this.service = service;
	}


}
