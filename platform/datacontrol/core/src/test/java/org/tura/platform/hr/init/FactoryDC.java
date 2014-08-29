package org.tura.platform.hr.init;

import static com.octo.java.sql.query.Query.c;
import static com.octo.java.sql.query.Query.select;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;
import org.tura.platform.commons.jpa.TuraJPAEntityService;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.Command.CallParameter;
import org.tura.platform.datacontrol.command.CreateCommand;
import org.tura.platform.datacontrol.command.DeleteCommand;
import org.tura.platform.datacontrol.command.InsertCommand;
import org.tura.platform.datacontrol.command.SearchCommand;
import org.tura.platform.datacontrol.command.UpdateCommand;
import org.tura.platform.hr.controls.DepartmentsDC;
import org.tura.platform.hr.controls.EmployeesDC;
import org.tura.platform.hr.objects.DepartmentsDAO;
import org.tura.platform.hr.objects.EmployeesDAO;
import org.tura.platform.persistence.TuraObject;

import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.SelectQuery;

public class FactoryDC {

	private ELResolver elResolver;
	private EntityManager em;
	private CommandStack sc;
	private TuraJPAEntityService provider = new TuraJPAEntityService();

	public FactoryDC(String unit) {

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(
				unit, config.getProperties());
		em = emf.createEntityManager();
		provider.setEntityManager(em);

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

		createCreateCommand(employeesDS, elPrefix + "employees",
				EmployeesDAO.class);
		createInsertCommand(employeesDS, elPrefix + "employees",
				TuraObject.class);
		createUpdateCommand(employeesDS, elPrefix + "employees",
				TuraObject.class);
		createRemoveCommand(employeesDS, elPrefix + "employees",
				TuraObject.class);
		createSearchCommand(employeesDS, elPrefix + "employees",EmployeesDAO.class);

		createQuery(employeesDS, "EmployeesDAO");

		return employeesDS;
	}
	
	
	public DataControl<DepartmentsDAO> initDepartments(String elPrefix)
			throws Exception {
		DepartmentsDC departmentsDS = new DepartmentsDC();

		departmentsDS.setElResolver(elResolver);
		departmentsDS.getKeys().add("objId");
		departmentsDS.setCommandStack(sc);

		createCreateCommand(departmentsDS, elPrefix + "departments",
				DepartmentsDAO.class);
		createInsertCommand(departmentsDS, elPrefix + "departments",
				TuraObject.class);
		createUpdateCommand(departmentsDS, elPrefix + "departments",
				TuraObject.class);
		createRemoveCommand(departmentsDS, elPrefix + "departments",
				TuraObject.class);
		createSearchCommand(departmentsDS, elPrefix + "departments",DepartmentsDAO.class);

		createQuery(departmentsDS, "DepartmentsDAO");

		return departmentsDS;
	}

	void createQuery(DataControl<?> control, String entity)
			throws QueryException {
		SelectQuery query = select(c("x")).from(entity).as("x")
				.orderBy("objId");
		control.setDefaultQuery(query);
		
	}

	void createCreateCommand(DataControl<?> control, String expr, Class<?> clazz) {

		CreateCommand command = new CreateCommand(control);
		command.setProvider(provider);
		command.setMethod("create");

		CallParameter prm = command.new CallParameter();
		prm.setName("obj");
		prm.setClazz(String.class);
		prm.setValue(clazz.getName());
		command.getParameters().add(prm);

		control.setCreateCommand(command);
	}

	void createInsertCommand(DataControl<?> control, String expr, Class<?> clazz) {

		InsertCommand insertCommand = new InsertCommand(control);
		insertCommand.setProvider(provider);
		insertCommand.setMethod("insert");

		CallParameter prm = insertCommand.new CallParameter();
		prm.setName("obj");
		prm.setClazz(clazz);
		prm.setExpression(expr + ".currentObject");
		insertCommand.getParameters().add(prm);

		control.setInsertCommand(insertCommand);
	}

	void createUpdateCommand(DataControl<?> control, String expr, Class<?> clazz) {

		UpdateCommand command = new UpdateCommand(control);
		command.setProvider(provider);
		command.setMethod("update");

		CallParameter prm = command.new CallParameter();
		prm.setName("obj");
		prm.setClazz(clazz);
		prm.setExpression(expr + ".currentObject");
		command.getParameters().add(prm);

		control.setUpdateCommand(command);
	}

	void createRemoveCommand(DataControl<?> control, String expr, Class<?> clazz) {

		DeleteCommand command = new DeleteCommand(control);
		command.setProvider(provider);
		command.setMethod("remove");

		CallParameter prm = command.new CallParameter();
		prm.setName("obj");
		prm.setClazz(clazz);
		prm.setExpression(expr + ".currentObject");
		command.getParameters().add(prm);

		control.setDeleteCommand(command);
	}

	void createSearchCommand(DataControl<?> control, String expr,Class<?> clazz) {

		SearchCommand command = new SearchCommand(control);
		command.setProvider(provider);
		command.setMethod("find");

		CallParameter prm = command.new CallParameter();
		prm.setName("dslQuery");
		prm.setClazz(SelectQuery.class);
		prm.setExpression(expr + ".query");
		command.getParameters().add(prm);

		prm = command.new CallParameter();
		prm.setName("startIndex");
		prm.setClazz(Integer.class);
		prm.setExpression(expr + ".startIndex");
		command.getParameters().add(prm);

		prm = command.new CallParameter();
		prm.setName("endIndex");
		prm.setClazz(Integer.class);
		prm.setExpression(expr + ".endIndex");
		command.getParameters().add(prm);

		prm = command.new CallParameter();
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

}