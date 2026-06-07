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

package org.tura.model.designer;

import java.io.Serializable;
import java.util.UUID;

import jakarta.enterprise.inject.Produces;

import org.tura.platform.repository.cdi.CdiClientCommandStackProvider;
import org.tura.platform.repository.cdi.CdiClientProxyCpaStorageEventSubscribersProvider;
import org.tura.platform.repository.cdi.CdiClientTypeInheritanceProvider;
import org.tura.platform.repository.cdi.ClientCpaStorage;
import org.tura.platform.repository.cpa.storage.CpaStorage;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.uuiclient.annotations.SharedClientScoped;

public class CdiClientCpaStorageProducer implements Serializable {

  private static final long serialVersionUID = 1L;

  @Produces
  @SharedClientScoped
  @ClientCpaStorage("mmdesigner.shared")
  public CpaStorage getCpaStorage() {
    CpaStorage cpaStorage = new CpaStorage(UUID.randomUUID().toString(), new CdiClientTypeInheritanceProvider());
    ProxyCommadStackProvider stackProvider = new CdiClientCommandStackProvider("mmdesigner.shared");
    cpaStorage.setCommadStackProvider(stackProvider);
    cpaStorage.setEventSubscriberesProvider( new CdiClientProxyCpaStorageEventSubscribersProvider("mmdesigner.shared"));
    return cpaStorage;
  }
}
