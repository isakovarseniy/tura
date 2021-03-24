/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.tree2tree.triggers;
import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.example.ui.hrmanager.tree2tree.datacontrol.CompanyArtifitialFieldsAdapter;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.hr.objects.serialization.Company;
import org.tura.platform.repository.core.ObjectControl;


@Alternative
@Priority(10)
@Selector("hrmanager.tree2tree")
@PostQuery("company")
public class CompanyPostQueryTrigger implements PostQueryTrigger{

	private static final long serialVersionUID = -6520411671041441997L;

	@Override
	public void execute(DataControl<?> datacontrol, Object obj)
			throws TuraException {
		Company company = (Company) obj;
		CompanyArtifitialFieldsAdapter af = new CompanyArtifitialFieldsAdapter( (ObjectControl) obj);
		af.setNameArtf(company.getCompanyName());
	}

}