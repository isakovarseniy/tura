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
package org.tura.platform.test;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.tura.platform.repository.Repository;
import org.tura.platform.tura.simple.domain.provider.SimpleTuraProvider;

@Alternative
@Priority(0)
public class RepositoryProducer {
	
	@Inject
	private TuraJPAEntityServiceService service;
	
    @Produces
	public Repository getRepository(InjectionPoint injectionPoint) {

		Repository repository = new Repository();
		SimpleTuraProvider provider = new SimpleTuraProvider(repository);
		provider.setService(service);
		
		return repository;
		
	}

}
