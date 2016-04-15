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
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.TuraObject;
import org.tura.platform.object.model.RepositoryException;
import org.tura.platform.repository.Repository;
import org.tura.platform.repository.RepositoryProvider;
import org.tura.platform.services.JPAService;

public class SimpleTuraProvider implements RepositoryProvider {

	private HashMap<String, String> classMapper = new HashMap<>();

	private JPAService service;

	public SimpleTuraProvider(Repository repository) {
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

		classMapper.put(CompanyDAO.class.getName(), CompanyJPA.class.getName());
		classMapper.put(CountryDAO.class.getName(), CountryJPA.class.getName());
		classMapper.put(StateDAO.class.getName(), StateJPA.class.getName());
		classMapper.put(CityDAO.class.getName(), CityJPA.class.getName());
		classMapper.put(StreetDAO.class.getName(), StreetJPA.class.getName());
		classMapper.put(DepartmentsDAO.class.getName(), DepartmentJPA.class.getName());
		classMapper.put(EmployeesDAO.class.getName(), EmployeeJPA.class.getName());
		classMapper.put(FileDAO.class.getName(), FileJPA.class.getName());
		classMapper.put(VehicleDAO.class.getName(), VehicleJPA.class.getName());
		classMapper.put(Department2EntityDAO.class.getName(), Dept2EmpJPA.class.getName());

	}

	public Object create(String objectClass) throws RepositoryException {
		try {
			String persistentClass = classMapper.get(objectClass);
			Object persistentObject = service.create(persistentClass);
			Object domainObject = Class.forName(objectClass).newInstance();
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
			String persistentClass = classMapper.get(objectClass);
			LazyList list = (LazyList<?>) service.find(searchCriteria, orderCriteria, startIndex, endIndex,
					persistentClass);

			long numberOfRows = service.findNumberOfRows(searchCriteria, orderCriteria, startIndex, endIndex,
					persistentClass);

			for (int i = 0; i < list.size(); i++) {
				Object domainObject = Class.forName(objectClass).newInstance();
				BeanUtils.copyProperties(domainObject, list.get(i));
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
			String persistentClass = classMapper.get(objectClass);
			Object persistentObject = Class.forName(persistentClass).newInstance();
			BeanUtils.copyProperties(persistentObject, request);
			service.update((TuraObject) request);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void insert(Object request, String objectClass) throws RepositoryException {
		try {
			String persistentClass = classMapper.get(objectClass);
			Object persistentObject = Class.forName(persistentClass).newInstance();
			BeanUtils.copyProperties(persistentObject, request);
			service.insert((TuraObject) request);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public void remove(Object request, String objectClass) throws RepositoryException {
		try {
			String persistentClass = classMapper.get(objectClass);
			Object persistentObject = Class.forName(persistentClass).newInstance();
			BeanUtils.copyProperties(persistentObject, request);
			service.remove((TuraObject) request);
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
