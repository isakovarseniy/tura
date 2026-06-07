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

package org.tura.platform.repository.cdi;

import java.lang.annotation.Annotation;

import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaRepositoryProvider;

public class CdiClientCpaRepositoryProvider implements CpaRepositoryProvider{

	private static final long serialVersionUID = 1L;
 	private String selector;
	
	public CdiClientCpaRepositoryProvider(String selector) {
		this.selector = selector;
	}

  @Override
  public CpaRepository get() {
	  ClientProxyRepo qualifier =
        new ClientProxyRepo() {

          @Override
          public Class<? extends Annotation> annotationType() {
            return org.tura.platform.repository.cdi.ClientProxyRepo.class;
          }

          @Override
          public String value() {
            return selector;
          }
        };
    return org.omnifaces.util.Beans.getReference(CpaRepository.class, qualifier);
  }
}
	
