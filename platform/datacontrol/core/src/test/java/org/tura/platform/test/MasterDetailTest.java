package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.FactoryDC;
import org.tura.platform.hr.objects.DepartmentsDAO;
import org.tura.platform.hr.objects.EmployeesDAO;

public class MasterDetailTest {

	private static EntityManager em;
	private static FactoryDC factory;

	private static Logger logger;

	static {
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new LogFormatter());
		logger.addHandler(handler);
		logger.setLevel(Level.INFO);

		factory = new FactoryDC();
		em = factory.getEntityManager();
		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getObject(){
		try {
			DataControl<DepartmentsDAO> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeesDAO> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			
			
			Relation relation = new Relation();
			relation.setParent(dcd);
			relation.setChild(dce);
			PropertyLink  link =   new PropertyLink ("objId", "parentId");
			relation.getLinks().add(link);
			
			dcd.addChildren("departmentsToemployees", relation);
			
			DepartmentsDAO rowd = dcd.getCurrentObject();
			dcd.nextObject();
			EmployeesDAO rowe = dce.getCurrentObject();
			
			assertEquals(rowd.getObjId(), new Long(10));
			assertEquals(rowe.getObjId(), new Long(201));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}

}
