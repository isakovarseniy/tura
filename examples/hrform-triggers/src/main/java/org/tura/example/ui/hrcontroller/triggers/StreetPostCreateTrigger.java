/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.example.ui.hrcontroller.triggers;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.elsoft.platform.hr.objects.StreetDAO;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.PostCreateTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

@Alternative
@Priority(10)
@Selector("hrmanager.hrcontroller")
@PostCreate("street")
public class StreetPostCreateTrigger implements PostCreateTrigger {

	@Override
	public void execute(DataControl<?> datacontrol, Object obj)
			throws TuraException {
		((StreetDAO) obj).setName("NA");
	}

}