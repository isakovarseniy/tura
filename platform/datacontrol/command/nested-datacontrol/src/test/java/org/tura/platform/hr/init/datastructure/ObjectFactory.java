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
package org.tura.platform.hr.init.datastructure;

public class ObjectFactory {
	
	private static Long sequence = 0L;
	
	public static Department createDepartment(String departmentIName){
		Department department = new Department();
		department.setDepartmentId(sequence);
		department.setDepartmentIName(departmentIName);
		sequence++;
		return department;
	}

	public static Employee createEmployee(String firstName , String lastName){
		Employee employee = new Employee();
		employee.setEmployeeId(sequence);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		sequence++;
		return employee;
	}
	
	public static Location createLocation(String country , String state , String city, String street){
		Location location = new Location();
		location.setLocationId(sequence);
		location.setCountry(country);
		location.setState(state);
		location.setCity(city);
		location.setStreet(street);
		sequence++;
		return location;
	}
	
	public static Email createEmail(String address ){
		Email email = new Email();
		email.setEmailId(sequence);
		email.setAddress(address);
		sequence++;
		return email;
	}	
	
	public static Telephone createTelephone(String number ){
		Telephone telephone = new Telephone();
		telephone.setTelephoneId(sequence);
		telephone.setNumber(number);
		sequence++;
		return telephone;
	}	
	
}
