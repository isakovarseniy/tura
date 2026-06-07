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

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;

import org.tura.platform.repository.cdi.CdiClientCommandStackEventSubscribersProvider;
import org.tura.platform.repository.cdi.CdiClientRegistryProvider;
import org.tura.platform.repository.cdi.ClientCommandStack;
import org.tura.platform.repository.core.CommandStack;
import org.tura.platform.uuiclient.annotations.SharedClientScoped;

@SharedClientScoped
@Alternative
@Priority(0)
@ClientCommandStack("mmdesigner.shared")
public class CdiClientCommandStack extends CommandStack implements Serializable {

  private static final long serialVersionUID = 1L;
  
  @PostConstruct
  public void init() {
	  this.setEventSubscribersProvider(new CdiClientCommandStackEventSubscribersProvider("mmdesigner.shared"));
	  this.setRegistryProvider(new CdiClientRegistryProvider("mmdesigner.shared"));
  }
  
  
}
