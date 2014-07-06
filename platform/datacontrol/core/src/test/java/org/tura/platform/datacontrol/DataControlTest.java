package org.tura.platform.datacontrol;

import static org.junit.Assert.fail;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;

public class DataControlTest {
	
	private EntityManager em;

	public DataControlTest() throws ParseException{
		
		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HRServices", config.getProperties()); 
		em=emf.createEntityManager();
		new DepartmentsInit(em).init();
		new EmployesesInit(em).init();
	
	}
	
	
	@Test
	public void test() {
		//  fail("Not yet implemented");
	}

}
