/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.cdi.starter;

import java.lang.annotation.Annotation;

import org.omnifaces.util.Beans;
import org.tura.platform.repository.cdi.ServerProxyRepo;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.ProxyRepositoryProvider;

public class CdiServerProxyRepositoryProvider implements   ProxyRepositoryProvider{

	@Override
	public ProxyFactory get() {
		ServerProxyRepo qualifier  = new  ServerProxyRepo() {
			@Override
			public Class<? extends Annotation> annotationType() {
				return ServerProxyRepo.class;
			}
		};
		return Beans.getReference(ProxyFactory.class,qualifier);
	}

}
