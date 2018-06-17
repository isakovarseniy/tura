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

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;

import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRegistryResolver;

public class CDISpaRegistryResolver implements SpaRegistryResolver{
	private static  Logger logger = Logger.getLogger(CDITransactionAdapter.class.getName());

	
	@Override
	public SpaObjectRegistry resolve() {
    	long start = System.currentTimeMillis();
		
		BeanManager bm = CDI.current().getBeanManager();
		@SuppressWarnings("unchecked")
		Bean<SpaObjectRegistry> bean = (Bean<SpaObjectRegistry>) bm.getBeans(SpaObjectRegistry.class).iterator().next();
		CreationalContext<?> ctx = bm.createCreationalContext(bean);
		SpaObjectRegistry registry = (SpaObjectRegistry) bm.getReference(bean, SpaObjectRegistry.class, ctx);
		
		long elapsedTimeMillis = System.currentTimeMillis()-start;
		logger.log (  Level.SEVERE,   " SpaObjectRegistry resolve "+new Long(elapsedTimeMillis));
		
		return registry;
	}

}
