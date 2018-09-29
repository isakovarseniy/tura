/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.h2.tools.Server;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.example.ui.nestedformpackage.hrcontroller.datacontrol.BeanFactory;
import org.tura.example.ui.nestedformpackage.hrcontroller.datacontrol.CompanyDC;
import org.tura.example.ui.nestedformpackage.hrcontroller.datacontrol.DepartmentDC;
import org.tura.example.ui.nestedformpackage.hrcontroller.datacontrol.EmployeeDC;
import org.tura.example.ui.nestedformpackage.hrcontroller.datacontrol.TreeRootCountryDC;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.TreePath;
import org.tura.platform.datacontrol.pool.PoolCommand;
import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.hr.init.CityInit;
import org.tura.platform.hr.init.CompanyInit;
import org.tura.platform.hr.init.CountryInit;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.StateInit;
import org.tura.platform.hr.init.StreetInit;
import org.tura.platform.hr.objects.serialization.Department;
import org.tura.platform.hr.objects.serialization.Employee;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;

public class NestedDCTest {

    private static Logger logger;
    private Weld w;
    private WeldContainer weld;
    private static Server server;

    @After
    public void after() {
        EntityManager em = weld.instance().select(EntityManager.class).get();
        if (em.isOpen())
            em.close();

        weld = null;
        w.shutdown();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        server.stop();
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        server = Server.createTcpServer().start();

        logger = Logger.getLogger("InfoLogging");
        logger.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new LogFormatter());
        logger.addHandler(handler);
        logger.setLevel(Level.INFO);
    }

    @Before
    public void before() {
        w = new Weld();
        weld = w.initialize();

        EntityManager em = weld.instance().select(EntityManager.class).get();

        em.getTransaction().begin();

        new CompanyInit(em).init();
        new CountryInit(em).init();
        new StateInit(em).init();
        new CityInit(em).init();
        new StreetInit(em).init();

        new DepartmentsInit(em).init();
        try {
            new EmployesesInit(em).init();
            em.getTransaction().commit();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

    }

    @Test
    public void nestedwithPoolingTest() {
        try {
            BeanFactory bf = weld.instance().select(BeanFactory.class).get();
            CompanyDC companyDC = bf.getCompany();
            companyDC.getCurrentObject();

            TreeRootCountryDC locationDC = bf.getTreeRootCountry();
            boolean isSet =
                locationDC.setCurrentPosition(new TreePath[] {
                        new TreePath(null, 0), new TreePath("country2state", 0),
                        new TreePath("state2city", 0),
                        new TreePath("city2street", 0)
                    });

            assertEquals(isSet, true);


            DepartmentDC departmentDC = bf.getDepartment();
            Department department = (Department) departmentDC.getCurrentObject();
            
            
            EmployeeDC emploeeDC = bf.getEmployee();
            emploeeDC.getCurrentObject();

            Pager<?> pager = getPager(emploeeDC);
            Employee newrow = getNewEmployee(pager);
            PoolElement e = new PoolElement(newrow, ((ObjectControl) newrow).getKey(), emploeeDC.getBaseClass(),
                    PoolCommand.C.name(), "1");
            pager.addCommand(e);

            Employee newrow1 = getNewEmployee(pager);
            newrow1.setObjId(newrow.getObjId());
            newrow1.setDepartment(department);
            e = new PoolElement(newrow1, ((ObjectControl) newrow1).getKey(), emploeeDC.getBaseClass(),
                    PoolCommand.U.name(), "1");
            pager.addCommand(e);
            
            departmentDC.nextObject();
            Employee employee = (Employee) emploeeDC.getCurrentObject();
            
            assertNotEquals(newrow1.getObjId(), employee.getObjId());
            
            departmentDC.prevObject();
            employee = (Employee) emploeeDC.getCurrentObject();
            assertEquals(newrow1.getObjId(), employee.getObjId());
            
            emploeeDC.nextObject();
            employee = (Employee) emploeeDC.getCurrentObject();
            assertNotEquals(newrow1.getObjId(), employee.getObjId());
            

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }

    private Pager<?> getPager(DataControl<?> dc)
            throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field field = DataControl.class.getDeclaredField("pager");
        field.setAccessible(true);
        return (Pager<?>) field.get(dc);
    }

    public Employee getNewEmployee(Pager<?> pager) throws Exception {
        Field field = pager.getClass().getDeclaredField("repository");
        field.setAccessible(true);
        Repository repository = (Repository) field.get(pager);

        return (Employee) repository.create(Employee.class.getName());
    }

}

