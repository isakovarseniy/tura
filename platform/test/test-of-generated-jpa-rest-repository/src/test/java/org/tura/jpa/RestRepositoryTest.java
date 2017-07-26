/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
package org.tura.jpa;

import static org.junit.Assert.fail;

import java.io.File;
import java.net.URL;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.tura.platform.repository.client.rest.RestClientRepository;

import objects.test.serialazable.jpa.Location;

@RunWith(Arquillian.class)
public class RestRepositoryTest {

	@Deployment
	public static WebArchive createDeployment() {
		File[] libs = Maven.resolver().loadPomFromFile("pom.xml")
				.resolve("org.tura.platform.test.generated-code:test-objects-restservice-repository:war:1.0")
				.withTransitivity().as(File.class);

		return ShrinkWrap.createFromZipFile(WebArchive.class, libs[0]);
	}

	@Test
	@RunAsClient
	public void test() {
		try {
			URL url = new URL("http://127.0.0.1:8080/test-objects-restservice-repository-1.0/");
			new RestClientRepository(url).create("Location");
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
