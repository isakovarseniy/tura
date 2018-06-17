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
package org.tura.example.ui.commons.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.tura.platform.hr.objects.serialization.InitJPARepository;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.spa.SpaRepository;


@Alternative
@Priority(0)
public class RepositoryProducer {
	
	private static  Logger logger = Logger.getLogger(RepositoryProducer.class.getName());

	
    @Produces
	public Repository getRepository(InjectionPoint injectionPoint) throws Exception {
    	long start = System.currentTimeMillis();

		Registry.newInstance();
		Registry.getInstance().setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		Repository repository = new BasicRepository();
		
		InitJPARepository init = new InitJPARepository(new SpaRepository());
		if ( !init.isInitialized()){
			init.initClassMapping();
			init.initCommandProducer();
			init.initProvider();
			init.initEntityManagerProvider(new CDIEntityManagerProvider());
			init.initialized();
		}
		Registry.getInstance().setTransactrionAdapter( new CDITransactionAdapter());
    	
		long elapsedTimeMillis = System.currentTimeMillis()-start;
		logger.log (  Level.SEVERE,   " getRepository "+new Long(elapsedTimeMillis));
		
    	return repository;
	}
	
}
