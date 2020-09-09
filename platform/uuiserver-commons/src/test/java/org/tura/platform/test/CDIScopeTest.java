/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.UUID;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;
import org.tura.platform.uuiclient.cdi.FileScopeStore;
import org.tura.platform.uuiclient.cdi.Scope;
import org.tura.platform.uuiclient.cdi.UUIClientScopeContext;

public class CDIScopeTest {

	static String session = UUID.randomUUID().toString();

	@Test
	public void activateScopeTest1() {
		Weld w = new Weld();
		try {
			WeldContainer weld = w.initialize();

			UUIClientScopeContext ctx = new UUIClientScopeContext();
			ctx.setStorage(new FileScopeStore(System.getProperty("java.io.tmpdir")));

			Scope scope = new Scope("application.formname", session);
			ctx.activate(scope, true);

			TestBean bean = weld.instance().select(TestBean.class).get();
			bean.setField1("test1");

			ctx.passivate(scope);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			w.shutdown();
		}

	}

	@Test
	public void activateScopeTest2() {
		Weld w = new Weld();
		try {
			WeldContainer weld = w.initialize();

			UUIClientScopeContext ctx = new UUIClientScopeContext();
			ctx.setStorage(new FileScopeStore(System.getProperty("java.io.tmpdir")));

			Scope scope = new Scope("application.formname", session);
			ctx.activate(scope, false);

			TestBean bean = weld.instance().select(TestBean.class).get();
			assertEquals("test1", bean.getField1());

			ctx.passivate(scope);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			w.shutdown();
		}

	}

	@Test
	public void generateKey() {
		try {
			KeyGenerator keyGen = KeyGenerator.getInstance("AES");
			SecureRandom random = new SecureRandom(); // cryptograph. secure random
			keyGen.init(random);
			SecretKey secretKey = keyGen.generateKey();

			String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
			System.out.println(encodedKey);
		} catch (Exception e) {
			fail();
		}

	}

}
