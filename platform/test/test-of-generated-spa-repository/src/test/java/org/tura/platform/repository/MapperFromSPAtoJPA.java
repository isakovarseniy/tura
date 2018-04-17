package org.tura.platform.repository;

import java.util.HashMap;
import java.util.Map;

import org.tura.spa.test.Client;
import org.tura.spa.test.Customer;
import org.tura.spa.test.Department1;
import org.tura.spa.test.Department2;
import org.tura.spa.test.Employee1;
import org.tura.spa.test.Employee2;
import org.tura.spa.test.File;
import org.tura.spa.test.IndepObject1;
import org.tura.spa.test.IndepObject2;
import org.tura.spa.test.Location;
import org.tura.spa.test.MailAddress;
import org.tura.spa.test.Many2Many1A;
import org.tura.spa.test.Many2Many1B;
import org.tura.spa.test.Many2Many2A;
import org.tura.spa.test.Many2Many2B;
import org.tura.spa.test.One2Many1A;
import org.tura.spa.test.One2Many1B;
import org.tura.spa.test.One2Many2A;
import org.tura.spa.test.One2Many2B;
import org.tura.spa.test.One2Many3A;
import org.tura.spa.test.One2Many3B;
import org.tura.spa.test.One2One1A;
import org.tura.spa.test.One2One1B;
import org.tura.spa.test.One2One2A;
import org.tura.spa.test.One2One2B;
import org.tura.spa.test.One2One3A;
import org.tura.spa.test.One2One3B;
import org.tura.spa.test.One2One4A;
import org.tura.spa.test.One2One4B;
import org.tura.spa.test.Order;
import org.tura.spa.test.Person;
import org.tura.spa.test.Phone;
import org.tura.spa.test.Vehicle;
import org.tura.spa.test.VehiclePK;

import com.remondis.remap.Mapper;
import com.remondis.remap.Mapping;

public class MapperFromSPAtoJPA {

	public static Map<Class<?>, Mapping<?, ?>> mappers = new HashMap<>();

	static {
		try {
			mappers.put(Client.class, Mapping.from(Client.class).to(c(Client.class)));

			mappers.put(Customer.class, Mapping.from(Customer.class).to(c(Customer.class)));

			mappers.put(Department1.class, Mapping.from(Department1.class).to(c(Department1.class)));

			mappers.put(Department2.class, Mapping.from(Department2.class).to(c(Department2.class)));

			mappers.put(Employee1.class, Mapping.from(Employee1.class).to(c(Employee1.class)));

			mappers.put(Employee2.class, Mapping.from(Employee2.class).to(c(Employee2.class)));

			mappers.put(File.class, Mapping.from(File.class).to(c(File.class)));

			mappers.put(IndepObject1.class, Mapping.from(IndepObject1.class).to(c(IndepObject1.class)));

			mappers.put(IndepObject2.class, Mapping.from(IndepObject2.class).to(c(IndepObject2.class)));

			mappers.put(Location.class, Mapping.from(Location.class).to(c(Location.class)));

			mappers.put(MailAddress.class, Mapping.from(MailAddress.class).to(c(MailAddress.class)));

			mappers.put(Many2Many1A.class, Mapping.from(Many2Many1A.class).to(c(Many2Many1A.class)));

			mappers.put(Many2Many1B.class, Mapping.from(Many2Many1B.class).to(c(Many2Many1B.class)));

			mappers.put(Many2Many2A.class, Mapping.from(Many2Many2A.class).to(c(Many2Many2A.class)));

			mappers.put(Many2Many2B.class, Mapping.from(Many2Many2B.class).to(c(Many2Many2B.class)));

			mappers.put(One2Many1A.class, Mapping.from(One2Many1A.class).to(c(One2Many1A.class)));

			mappers.put(One2Many1B.class, Mapping.from(One2Many1B.class).to(c(One2Many1B.class)));

			mappers.put(One2Many2A.class, Mapping.from(One2Many2A.class).to(c(One2Many2A.class)));

			mappers.put(One2Many2B.class, Mapping.from(One2Many2B.class).to(c(One2Many2B.class)));

			mappers.put(One2Many3A.class, Mapping.from(One2Many3A.class).to(c(One2Many3A.class)));

			mappers.put(One2Many3B.class, Mapping.from(One2Many3B.class).to(c(One2Many3B.class)));

			mappers.put(One2One1A.class, Mapping.from(One2One1A.class).to(c(One2One1A.class)));

			mappers.put(One2One1B.class, Mapping.from(One2One1B.class).to(c(One2One1B.class)));

			mappers.put(One2One2A.class, Mapping.from(One2One2A.class).to(c(One2One2A.class)));

			mappers.put(One2One2B.class, Mapping.from(One2One2B.class).to(c(One2One2B.class)));

			mappers.put(One2One3A.class, Mapping.from(One2One3A.class).to(c(One2One3A.class)));

			mappers.put(One2One3B.class, Mapping.from(One2One3B.class).to(c(One2One3B.class)));

			mappers.put(One2One4A.class, Mapping.from(One2One4A.class).to(c(One2One4A.class)));

			mappers.put(One2One4B.class, Mapping.from(One2One4B.class).to(c(One2One4B.class)));

			mappers.put(Order.class, Mapping.from(Order.class).to(c(Order.class)));

			mappers.put(Person.class, Mapping.from(Person.class).to(c(Person.class)));

			mappers.put(Phone.class, Mapping.from(Phone.class).to(c(Phone.class)));

			mappers.put(Vehicle.class, Mapping.from(Vehicle.class).to(c(Vehicle.class)));

			mappers.put(VehiclePK.class, Mapping.from(VehiclePK.class).to(c(VehiclePK.class)));
		} catch (Exception e) {

		}

	}

	public static Mapper<?, ?> factory(Class<?> from, Class<?> to) throws Exception {

		Mapping<?, ?> m = mappers.get(from);

		@SuppressWarnings("unchecked")
		Mapping<Client, org.tura.jpa.test.Client> q = (Mapping<Client, org.tura.jpa.test.Client>) m;

		q.replace(Client::getName, org.tura.jpa.test.Client::getObjId).with(
				iToBMap -> {
					return	new Long(iToBMap);

		});

		for (Class<?> key : mappers.keySet()) {
			if (!key.equals(from)) {
				m.useMapper(mappers.get(key).mapper());
			}
		}

		return m.mapper();

	}

	public static Class<?> c(Class<?> clazz) throws ClassNotFoundException {
		return Class.forName(clazz.getName().replace(".spa.", ".jpa."));
	}

}
