package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.elsoft.platform.hr.objects.EmployeesDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.datacontrol.pool.Pool;
import org.tura.platform.datacontrol.pool.PoolCommand;
import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.FactoryDC;

public class MasterDetailDataControlPoolTest {

	private static EntityManager em;
	private static FactoryDC factory;

	private static Logger logger;

	@BeforeClass
	public static void beforeClass(){
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
//		ConsoleHandler handler = new ConsoleHandler();
//		handler.setFormatter(new LogFormatter());
//		logger.addHandler(handler);
//		logger.setLevel(Level.INFO);

		factory = new FactoryDC("MasterDetail");
		em = factory.getEntityManager();
		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	@AfterClass
	public static void afterClass() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
	    ArrayList<PoolElement> p = getPoolElement();
	    p.clear();				
	}
	
	
	@After
	public  void after() {
		
	    ArrayList<PoolElement> p;
		try {
			p = getPoolElement();
		    p.clear();		
		} catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}	
	
	@Test
	public void t1_getApplyCreateModification() {
		try {
			factory.initCommandStack();
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
			
			DepartmentsDAO dep =  dcd.getCurrentObject();

			EmployeesDAO newrow = new EmployeesDAO();
			newrow.setObjId(123L);
			newrow.setParentId(dep.getObjId());
			
	        Pager<?> pager = getPager(dce);
	        
	        PoolElement e = new PoolElement(newrow, dce.getObjectKey(newrow), dce.getBaseClass(), PoolCommand.C.name(), "1");
	        pager.addCommandt(e);
	        
			EmployeesDAO rowe = dce.getCurrentObject();

			assertEquals( new Long(123L),rowe.getObjId());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	
	private Pager<?> getPager(DataControl<?> dc) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
        Field field = DataControl.class.getDeclaredField("pager");
        field.setAccessible(true);
        return (Pager<?>) field.get(dc);	
	}

	@SuppressWarnings("unchecked")
	private static ArrayList<PoolElement> getPoolElement() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
        Field field = Pool.class.getDeclaredField("poolElement");
        field.setAccessible(true);
        return (ArrayList<PoolElement>) field.get(Pool.class);	
		
	}
	
}
