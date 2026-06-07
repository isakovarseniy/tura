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

package sales.analyzer.ui.businesslogic.etlcontroller;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.annotations.UUIClientScoped;

public class RepoTransformProducer {

	  @Inject
	  @ClientProxyRepo("dataloader.etlcontroller")
	  private CpaRepository repository;
	
	    @Produces
		@ClientProxyRepo("Repository")
	    @UUIClientScoped
		public CpaRepository getTransport() {
			return repository;
		}
	
	
}
