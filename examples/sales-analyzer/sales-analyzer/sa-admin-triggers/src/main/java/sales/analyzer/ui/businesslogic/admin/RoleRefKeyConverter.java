/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package sales.analyzer.ui.businesslogic.admin;

import org.tura.platform.uuiclient.annotations.KeyTransformer;
import org.tura.platform.uuiclient.rest.client.commands.KeyConverter;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;


@KeyTransformer(id = "0d068d89-4d4d-4a53-94d4-786a841be363")
public class RoleRefKeyConverter  implements KeyConverter{

	@Override
	public String getKey(Object obj) {
		RoleReference roleRef = (RoleReference) obj;
		return roleRef.getRole().getName();
	}

}
