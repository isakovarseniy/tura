/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import org.tura.platform.repository.core.CommandStackEventSubscribers;
import java.io.Serializable;
import org.tura.platform.uuiclient.annotations.UUIClientScoped;
import javax.enterprise.inject.Alternative;
import javax.annotation.Priority;
import org.tura.platform.repository.cdi.ClientProxyCommandStackEventSubscribers;

@UUIClientScoped
@Alternative
@Priority(0)
@ClientProxyCommandStackEventSubscribers("mmdesigner.shared")
public class CdiClientProxyCommandStackEventSubscribers extends CommandStackEventSubscribers
    implements Serializable {

  private static final long serialVersionUID = 1L;
}
