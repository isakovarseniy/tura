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

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.RoleReferenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

public class RoleRefTrigger  implements PostQueryTrigger {

	private static final long serialVersionUID = 6522044958148392582L;

	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		RoleReference rr =  (RoleReference) obj;
		Role role = rr.getRole();
		User user = rr.getUser();
		
		ObjectControl oc =  (ObjectControl) obj;
		RoleReference r = (RoleReference) oc.getWrappedObject();
		r.setId( user.getUsername()+ "-" +  role.getName());
		
		RoleReferenceArtifitialFieldsAdapter ad = new RoleReferenceArtifitialFieldsAdapter ((ObjectControl) rr);
		if (rr.getRole() != null){
			ad.setRoleName(rr.getRole().getName());
		}
	}

}
