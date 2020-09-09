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

package sales.analyzer.ui.businesslogic.casemanagment;

import java.io.Serializable;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.annotations.MenuPostProcessingTrigger;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.MenuPostPocessingCommand;
import org.tura.platform.uuiclient.menu.AbsractMenuProvider;
import org.tura.platform.uuiclient.menu.DefaultMenuModel;
import org.tura.platform.uuiclient.menu.MenuElement;


@Alternative
@Priority(10)
@Selector("analysis.casemanager")
@MenuPostProcessingTrigger
public class MenuPostPocessor implements MenuPostPocessingCommand,Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	WorkItemMenuDynamic workItemMenu;

	@Override
	public void execute(DefaultMenuModel model, String menuId, AbsractMenuProvider provider) {
		
		if ( menuId.equals("tura5214fbad_aeb9_4d3e_b16c_3a945b89db6b")  ) {
			for ( MenuElement item : workItemMenu.getMenuItemsList()) {
				model.addItem(item);
			}
			return;
		}
	}

}
