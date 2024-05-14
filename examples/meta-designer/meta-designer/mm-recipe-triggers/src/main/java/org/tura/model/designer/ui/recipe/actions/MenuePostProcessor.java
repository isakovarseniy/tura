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

package org.tura.model.designer.ui.recipe.actions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.model.designer.ui.recipe.mmdesigner.recipe.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.MenuPostProcessingTrigger;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.MenuPostPocessingCommand;
import org.tura.platform.uuiclient.menu.AbsractMenuProvider;
import org.tura.platform.uuiclient.menu.DefaultMenuItem;
import org.tura.platform.uuiclient.menu.DefaultMenuModel;
import org.tura.platform.uuiclient.menu.MenuElement;

@Alternative
@Priority(10)
@Selector("mmdesigner.recipe")
@MenuPostProcessingTrigger
public class MenuePostProcessor implements MenuPostPocessingCommand, Serializable {

	private static final long serialVersionUID = 1L;

	private transient Logger logger = Logger.getLogger(RecipeViewActions.class.getName());

	@Inject
	@Named("beanFactoryMmdesignerRecipe")
	IBeanFactory bf;
	
	@Inject
	ELResolver elResolver;


	@Override
	public void execute(DefaultMenuModel model, String menuId, AbsractMenuProvider provider) {
		try {
			if (menuId.equals("tura9ea3f035_74d9_49d0_92fe_c70fbbf85095")) {
				List<MenuElement> array = new ArrayList<MenuElement>();
				array.addAll(model.getItems());
				model.getItems().clear();
				for (MenuElement item : array) {
					DefaultMenuItem it = (DefaultMenuItem) item;
					if ( it.isRendered()) {
						model.addItem(item);
					}
				}
				return;
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

}
