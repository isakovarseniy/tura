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
package org.tura.example.ui.commons.service;

import javax.annotation.Priority;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.repository.ObjectProvider;
import org.tura.platform.services.JPAService;
import org.tura.platform.tura.simple.domain.provider.SimpleTuraProvider;


@ObjectProvider
@Alternative
@Priority(0)
@RequestScoped
public class SimpleTuraProviderProvider extends SimpleTuraProvider{
	   @Inject
		private JPAService service;


	    @Override
	    public JPAService getService() {
	        return service;
	    }
	   
}
