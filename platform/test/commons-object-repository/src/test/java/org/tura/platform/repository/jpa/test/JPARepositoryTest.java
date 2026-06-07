/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.repository.jpa.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import objects.test.serialazable.jpa.Customer;
import objects.test.serialazable.jpa.Location;
import objects.test.serialazable.jpa.Order;
import objects.test.serialazable.jpa.Vehicle;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class JPARepositoryTest {

	private static StorageProvider storageProvider = StorageFactory.getStorage();

	@AfterAll
	public static void afterClass() throws Exception {
		storageProvider.stopServer();
	}

	@BeforeAll
	public static void beforeClass() throws Exception {
		storageProvider.startServer();
		storageProvider.initSession();

	}

	@SuppressWarnings({ "unchecked"})
	@Test
	public void t0003_insertIndependentObject() {
		try {

			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			Customer customer = (Customer) repository.create(Customer.class);
			customer.setCustomerName("Customer 1");
			repository.insert(customer, Customer.class);

			Location location = (Location) repository.create(Location.class);
			location.setCity("City");
			location.setStreet("Street");
			repository.insert(location, Location.class);

			customer.getLocation().add(location);

			Vehicle vehicle = (Vehicle) repository.create(Vehicle.class);
			vehicle.setModel("Honda");
			repository.insert(vehicle, Vehicle.class);

			Order order = (Order) repository.create(Order.class);
			order.setCustomer(customer);
			order.setVehicle(vehicle);

			stackProvider.get().commit();

			EntityManager em = (EntityManager) storageProvider.getSession();
			Query query = em.createQuery("from Location");
			List<org.tura.jpa.test.Location> listLocatioin = query.getResultList();
			org.tura.jpa.test.Location loc = listLocatioin.iterator().next();
			assertEquals(1, loc.getCustomer().size());

			query = em.createQuery("from Customer");
			List<org.tura.jpa.test.Customer> listCustomer = query.getResultList();
			org.tura.jpa.test.Customer ctr = listCustomer.iterator().next();
			assertEquals(1, ctr.getLocation().size());


			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Customer.class);
			List<Customer> cList = (List<Customer>) result.getSearchResult();
			assertEquals(1, cList.size());
			customer = cList.iterator().next();
			repository.remove(customer, Customer.class);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					Order.class);
			List<Order> oList = (List<Order>) result.getSearchResult();
			assertEquals(0, oList.size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
