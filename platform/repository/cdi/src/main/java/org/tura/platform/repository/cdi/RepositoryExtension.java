/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
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
package org.tura.platform.repository.cdi;

import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessBean;

@ApplicationScoped
public class RepositoryExtension implements Extension {

	private ArrayList<Bean<?>> dataProviderBeans = new ArrayList<>();
	private ArrayList<Bean<?>> customQueryBeans = new ArrayList<>();
	private ArrayList<Bean<?>> repositoryTriggersBeans = new ArrayList<>();

	public <T> void collect(@Observes ProcessBean<T> event) {
		if (event.getAnnotated().isAnnotationPresent(ObjectProvider.class)) {
			dataProviderBeans.add(event.getBean());
		}
		
		if (event.getAnnotated().isAnnotationPresent(CustomQuery.class)) {
			customQueryBeans.add(event.getBean());
		}
		
		if (event.getAnnotated().isAnnotationPresent(RepositoryTriggers.class)) {
			repositoryTriggersBeans.add(event.getBean());
		}
		
	}
	

	public ArrayList<Bean<?>> getDataProviderBeans() {
		return dataProviderBeans;
	}

	
	public ArrayList<Bean<?>> getCustomQueryBeans() {
		return customQueryBeans;
	}


	public ArrayList<Bean<?>> getRepositoryTriggersBeans() {
		return repositoryTriggersBeans;
	}


	

}
