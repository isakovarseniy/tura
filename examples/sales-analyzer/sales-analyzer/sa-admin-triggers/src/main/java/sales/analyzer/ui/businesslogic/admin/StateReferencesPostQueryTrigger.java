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

package sales.analyzer.ui.businesslogic.admin;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.StateReferenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.StateReference;



@Alternative
@Priority(10)
@Selector("admin.administration")
@PostQuery("stateReference")

public class StateReferencesPostQueryTrigger  implements PostQueryTrigger{

	private static final long serialVersionUID = 4218008964196577774L;

	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		StateReference sr = (StateReference) obj;
		StateReferenceArtifitialFieldsAdapter af = new StateReferenceArtifitialFieldsAdapter( (ObjectControl) obj);
		if (sr.getUser()!= null) {
			af.setFirstName(sr.getUser().getFirstName());
			af.setLastName(sr.getUser().getLastName());
			af.setUserName(sr.getUser().getUsername());
		}
	}

}
