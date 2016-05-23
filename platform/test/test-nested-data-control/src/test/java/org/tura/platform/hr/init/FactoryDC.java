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
package org.tura.platform.hr.init;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.elsoft.platform.hr.objects.EmployeesDAO;
import org.elsoft.platform.hr.objects.complex.model.CityObject;
import org.elsoft.platform.hr.objects.complex.model.CountryObject;
import org.elsoft.platform.hr.objects.complex.model.DepartmentsObject;
import org.elsoft.platform.hr.objects.complex.model.EmployeeObject;
import org.elsoft.platform.hr.objects.complex.model.FileObject;
import org.elsoft.platform.hr.objects.complex.model.StateObject;
import org.elsoft.platform.hr.objects.complex.model.StreetObject;
import org.elsoft.platform.hr.objects.complex.model.VehicleObject;
import org.hibernate.cfg.Configuration;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.CreateCommand;
import org.tura.platform.datacontrol.command.DeleteCommand;
import org.tura.platform.datacontrol.command.SearchCommand;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.turaservice.InsertCommandTuraService;
import org.tura.platform.datacontrol.command.turaservice.NestedDeleteCommand;
import org.tura.platform.datacontrol.command.turaservice.NestedInsertCommand;
import org.tura.platform.datacontrol.command.turaservice.NestedSearchCommand;
import org.tura.platform.datacontrol.command.turaservice.NestedUpdateCommand;
import org.tura.platform.datacontrol.command.turaservice.UpdateCommandTuraService;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.hr.controls.DepartmentsDC;
import org.tura.platform.hr.controls.EmployeesDC;
import org.tura.platform.object.TuraObject;
import org.tura.platform.repository.Repository;
import org.tura.platform.services.JPAService;
import org.tura.platform.test.Factory;
import org.tura.platform.tura.complex.domain.livecycle.CityObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.CompanyObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.CountryObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.DepartmentObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.EmployeeObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.FileObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.StateObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.StreetObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.VehicleObjectLiveCycle;
import org.tura.platform.tura.complex.domain.provider.ComplexObjectTuraProvider;

import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.SelectQuery.Order;

public class FactoryDC implements Factory{

	private ELResolver elResolver;
	private EntityManager em;
	private CommandStack sc;
	private Repository repository ;

	public FactoryDC(String unit) {

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(
				unit, config.getProperties());
		em = emf.createEntityManager();


		repository = new Repository();
		JPAService service = new JPAService();

		ComplexObjectTuraProvider provider = new ComplexObjectTuraProvider(repository);
		provider.setObjectLiveCycle(CityObject.class.getName(), new CityObjectLiveCycle(service)); 

		provider.setObjectLiveCycle(CityObject.class.getName(), new CityObjectLiveCycle(service)); 
		provider.setObjectLiveCycle(CompanyObjectLiveCycle.class.getName(), new CompanyObjectLiveCycle(service)); 
		provider.setObjectLiveCycle(CountryObject.class.getName(), new CountryObjectLiveCycle(service)); 
		provider.setObjectLiveCycle(DepartmentsObject.class.getName(), new DepartmentObjectLiveCycle(service)); 
		provider.setObjectLiveCycle(EmployeeObject.class.getName(), new EmployeeObjectLiveCycle(service)); 
		provider.setObjectLiveCycle(FileObject.class.getName(), new FileObjectLiveCycle(service)); 
		provider.setObjectLiveCycle(StateObject.class.getName(), new StateObjectLiveCycle(service)); 
		provider.setObjectLiveCycle(StreetObject.class.getName(), new StreetObjectLiveCycle(service)); 
		provider.setObjectLiveCycle(VehicleObject.class.getName(), new VehicleObjectLiveCycle(service)); 

		service.setEntityManager(em);
		provider.setService(service);
		
		elResolver = new ELResolverImpl();

	}

	public void initCommandStack(){
		sc = new LocalCommandStack(em);
	}
	
	public DataControl<EmployeesDAO> initEmployees(String elPrefix)
			throws Exception {
		EmployeesDC employeesDS = new EmployeesDC();

		employeesDS.setElResolver(elResolver);
		employeesDS.getKeys().add("objId");
		employeesDS.setCommandStack(sc);
		employeesDS.setBaseClass(EmployeesDAO.class);
		sc.getPoolFlushAware().add(employeesDS);
		createCreateCommand(employeesDS, elPrefix + "employees",
				EmployeesDAO.class);
		createNestedInsertCommand(employeesDS, elPrefix + "employees",
				TuraObject.class);
		createNestedUpdateCommand(employeesDS, elPrefix + "employees",
				TuraObject.class);
		createNestedRemoveCommand(employeesDS, elPrefix + "employees",
				TuraObject.class);
		createNestedSearchCommand(employeesDS, elPrefix + "employees",EmployeesDAO.class);

		createQuery(employeesDS, EmployeesDAO.class.getCanonicalName());

		return employeesDS;
	}
	
	
	public DataControl<DepartmentsDAO> initDepartments(String elPrefix)
			throws Exception {
		DepartmentsDC departmentsDS = new DepartmentsDC();

		departmentsDS.setElResolver(elResolver);
		departmentsDS.getKeys().add("objId");
		departmentsDS.setCommandStack(sc);
		departmentsDS.setBaseClass(DepartmentsDAO.class);
		sc.getPoolFlushAware().add(departmentsDS);

		createCreateCommand(departmentsDS, elPrefix + "departments",
				DepartmentsDAO.class);
		createInsertCommand(departmentsDS, elPrefix + "departments",
				TuraObject.class);
		createUpdateCommand(departmentsDS, elPrefix + "departments",
				TuraObject.class);
		createRemoveCommand(departmentsDS, elPrefix + "departments",
				TuraObject.class);
		createSearchCommand(departmentsDS, elPrefix + "departments",DepartmentsDAO.class);

		createQuery(departmentsDS, DepartmentsDAO.class.getCanonicalName());

		return departmentsDS;
	}

	void createQuery(DataControl<?> control, String entity)
			throws QueryException {
		
	  ArrayList<OrderCriteria> ordc= new ArrayList<>();
	  OrderCriteria order = new OrderCriteria();
	  order.setName("objId");
	  order.setOrder(Order.ASC.name());
	  ordc.add(order);
	  
	  control.setOrderCriteria(ordc);
		
	}

	void createCreateCommand(DataControl<?> control, String expr, Class<?> clazz) {

		CreateCommand command = new CreateCommand(control);
		command.getProviders().put("TuraService", repository);

		CallParameter prm = new CallParameter();
		prm.setName("obj");
		prm.setClazz(String.class);
		prm.setValue(clazz.getName());
		command.getParameters().add(prm);

		control.setCreateCommand(command);
	}

	void createInsertCommand(DataControl<?> control, String expr, Class<?> clazz) {

		InsertCommandTuraService command = new InsertCommandTuraService(control);
		command.getProviders().put("TuraService", repository);

		CallParameter prm = new CallParameter();
		prm.setName("obj");
		prm.setClazz(clazz);
		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		control.setInsertCommand(command);
	}

	void createNestedInsertCommand(DataControl<?> control, String expr, Class<?> clazz) {

		NestedInsertCommand command = new NestedInsertCommand(control);
		command.getProviders().put("TuraService", repository);

		CallParameter prm = new CallParameter();
		prm.setName("mainObject");
		prm.setClazz(clazz);
//		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("parentObject");
		prm.setClazz(clazz);
//		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("dependentList");
		prm.setClazz(clazz);
		prm.setExpression("getEmployeeObject");
		command.getParameters().add(prm);
		
		
		prm = new CallParameter();
		prm.setName("obj");
		prm.setClazz(clazz);
		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		control.setInsertCommand(command);
	}	
	
	
	void createUpdateCommand(DataControl<?> control, String expr, Class<?> clazz) {

		UpdateCommandTuraService command = new UpdateCommandTuraService(control);
		command.getProviders().put("TuraService", repository);

		CallParameter prm = new CallParameter();
		prm.setName("obj");
		prm.setClazz(clazz);
		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		control.setUpdateCommand(command);
	}

	
	void createNestedUpdateCommand(DataControl<?> control, String expr, Class<?> clazz) {

		NestedUpdateCommand command = new NestedUpdateCommand(control);
		command.getProviders().put("TuraService", repository);

		CallParameter prm = new CallParameter();
		prm.setName("mainObject");
		prm.setClazz(clazz);
//		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("parentObject");
		prm.setClazz(clazz);
//		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("dependentList");
		prm.setClazz(clazz);
		prm.setExpression("getEmployeeObject");
		command.getParameters().add(prm);
		
		
		prm = new CallParameter();
		prm.setName("obj");
		prm.setClazz(clazz);
		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		control.setUpdateCommand(command);
	}	
	
	void createRemoveCommand(DataControl<?> control, String expr, Class<?> clazz) {

		DeleteCommand command = new DeleteCommand(control);
		command.getProviders().put("TuraService", repository);

		CallParameter prm = new CallParameter();
		prm.setName("obj");
		prm.setClazz(clazz);
		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		control.setDeleteCommand(command);
	}

	
	void createNestedRemoveCommand(DataControl<?> control, String expr, Class<?> clazz) {

		NestedDeleteCommand command = new NestedDeleteCommand(control);
		command.getProviders().put("TuraService", repository);

		CallParameter prm = new CallParameter();
		prm.setName("mainObject");
		prm.setClazz(clazz);
//		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("parentObject");
		prm.setClazz(clazz);
//		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("dependentList");
		prm.setClazz(clazz);
		prm.setExpression("getEmployeeObject");
		command.getParameters().add(prm);
		
		
		prm = new CallParameter();
		prm.setName("obj");
		prm.setClazz(clazz);
		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		control.setDeleteCommand(command);
	}	
	
	
	void createSearchCommand(DataControl<?> control, String expr,Class<?> clazz) {

		SearchCommand command = new SearchCommand(control);
		command.getProviders().put("TuraService", repository);

		CallParameter prm = new CallParameter();
		prm.setName("searchCriteria");
		prm.setClazz(List.class);
		prm.setExpression("#{"+expr + ".searchCriteria"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("orderCriteria");
		prm.setClazz(List.class);
		prm.setExpression("#{"+expr + ".orderCriteria"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("startIndex");
		prm.setClazz(Integer.class);
		prm.setExpression("#{"+expr + ".startIndex"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("endIndex");
		prm.setClazz(Integer.class);
		prm.setExpression("#{"+expr + ".endIndex"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("objectClass");
		prm.setClazz(String.class);
		prm.setValue(clazz.getName());
		command.getParameters().add(prm);

		control.setSearchCommand(command);

	}

	void createNestedSearchCommand(DataControl<?> control, String expr, Class<?> clazz) {

		NestedSearchCommand command = new NestedSearchCommand(control);
		command.getProviders().put("TuraService", repository);

		CallParameter prm = new CallParameter();
		prm.setName("parentObject");
		prm.setClazz(clazz);
//		prm.setExpression("#{"+expr + ".currentObject"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("dependentList");
		prm.setClazz(String.class);
		prm.setExpression("getEmployeeObject");
		command.getParameters().add(prm);
		
		
		prm = new CallParameter();
		prm.setName("searchCriteria");
		prm.setClazz(List.class);
		prm.setExpression("#{"+expr + ".searchCriteria"+"}");
		command.getParameters().add(prm);

		prm = new CallParameter();
		prm.setName("orderCriteria");
		prm.setClazz(List.class);
		prm.setExpression("#{"+expr + ".orderCriteria"+"}");
		command.getParameters().add(prm);


		prm = new CallParameter();
		prm.setName("objectClass");
		prm.setClazz(String.class);
		prm.setValue(clazz.getName());
		command.getParameters().add(prm);
		
		
		control.setSearchCommand(command);
	}	
	
	
	
	public EntityManager getEntityManager() {
		return em;
	}

	class LocalCommandStack extends CommandStack {

		private EntityManager em;

		public LocalCommandStack(EntityManager em) {
			this.em = em;
		}

		@Override
		public void beginTransaction() {
			em.getTransaction().begin();

		}

		@Override
		public void commitTransaction() {
			em.getTransaction().commit();

		}

		@Override
		public void rallbackTransaction() {
			em.getTransaction().rollback();
		}

	}

	@Override
	public EmployeesDAO getNewEmployeesDAO() throws Exception {
		return new EmployeeObject();
	}


	@Override
	public DepartmentsDAO getNewDepartmentsDAO() throws Exception {
		return  new DepartmentsObject();
	}

}
