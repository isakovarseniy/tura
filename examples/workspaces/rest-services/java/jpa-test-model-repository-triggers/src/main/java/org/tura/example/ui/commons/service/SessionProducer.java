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

package org.tura.example.ui.commons.service;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;

import org.neo4j.ogm.config.FileConfigurationSource;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

@ApplicationScoped
public class SessionProducer {

	private SessionFactory sessionFactory;
	public static String OGM_PROPERTIES_FILE ="ogm.properties.file";


	@Produces
	@RequestScoped
	protected Session createEntityManager() {
		return sessionFactory.openSession();
	}

	@PostConstruct
	public void init() {
		String ogmFile = System.getProperty(OGM_PROPERTIES_FILE);

		FileConfigurationSource configurationSource = new FileConfigurationSource(ogmFile);
		org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder(
				configurationSource).build();
		sessionFactory = new SessionFactory(configuration, "org.tura.jpa.test");

	}

}