/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.cdi;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeforeBeanDiscovery;
import javax.enterprise.inject.spi.Extension;

import org.tura.platform.uuiclient.annotations.UUIClientScoped;

public class UUIClientScopeExtension implements Extension {

	public void beforeBeanDiscovery(@Observes BeforeBeanDiscovery bbd) {
		bbd.addScope(UUIClientScoped.class, true, false);
	}

	public void afterBeanDiscovery(@Observes AfterBeanDiscovery abd) {
		abd.addContext( new UUIClientScopeContext());
	}
}