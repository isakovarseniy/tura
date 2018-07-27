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
package org.tura.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.tura.platform.test.ClassStructureTestUtils.findMethod;

import java.util.Collection;

import org.junit.Test;
import org.tura.domain.test.Client;
import org.tura.domain.test.MailAddress;
import org.tura.domain.test.Phone;

public class DomainModelTest {

	
	@Test
	public void checkClientClass(){
		
		assertEquals(10, Client.class.getDeclaredMethods().length);
		
		assertTrue(findMethod( Client.class,"getName" ));
		assertTrue(findMethod( Client.class,"setName",new Class[]{String.class} ));

		assertTrue(findMethod( Client.class,"getClientId" ));
		assertTrue(findMethod( Client.class,"setClientId",new Class[]{Long.class} ));
		
		assertTrue(findMethod( Client.class,"getPhone" ));
		assertTrue(findMethod( Client.class,"setPhone",new Class[]{Collection.class} ));

		assertTrue(findMethod( Client.class,"getHomeAddress" ));
		assertTrue(findMethod( Client.class,"setHomeAddress",new Class[]{MailAddress.class} ));
		
		assertTrue(findMethod( Client.class,"getBusinessAddress" ));
		assertTrue(findMethod( Client.class,"setBusinessAddress",new Class[]{MailAddress.class} ));
		
		
	}
	
	
	@Test
	public void checkPhoneClass(){
		
		assertEquals(4, Phone.class.getDeclaredMethods().length);
		
		assertTrue(findMethod( Phone.class,"getPhone" ));
		assertTrue(findMethod( Phone.class,"setPhone",new Class[]{String.class} ));

		assertTrue(findMethod( Phone.class,"getClient" ));
		assertTrue(findMethod( Phone.class,"setClient",new Class[]{Client.class} ));
		
	}
	
	
	@Test
	public void checkMailAddressClass(){
		
		assertEquals(4, MailAddress.class.getDeclaredMethods().length);
		
		assertTrue(findMethod( MailAddress.class,"getAddress" ));
		assertTrue(findMethod( MailAddress.class,"setAddress",new Class[]{String.class} ));

		assertTrue(findMethod( MailAddress.class,"getClient" ));
		assertTrue(findMethod( MailAddress.class,"setClient",new Class[]{Client.class} ));
		
	}
	
	
}
