/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.tura.metamodel.commons.QueryHelper;

import artifact.ConfigVariable;
import artifact.ConfigVariableWithNickName;
import recipe.Component;
import recipe.Configuration;
import recipe.Infrastructure;
import recipe.Ingredient;
import recipe.ModelMapper;
import recipe.Property;
import recipe.Recipe;
import recipe.RecipeFactory;
import recipe.RecipePackage;

public class ConfigVarDialog {
	private HashSet<ConfigVariable> configVar = new HashSet<ConfigVariable>();

	public void runDialog(Configuration config) {

		Set<ConfigVariable> set = propertiesList(config);
		Shell newShell = new Shell(Display.getCurrent() == null ? Display.getDefault() : Display.getCurrent(), SWT.NO_TRIM );
		ListSelectionDialog dlg = new ListSelectionDialog(newShell, set, new ArrayContentProvider(),
				new ConfigVarLabelProvider(), "Select configuration variables:");
		dlg.setTitle("Variables Selection");
		List<Object> result = new ArrayList<>();
		if (dlg.open() == Window.OK) {
			result = Arrays.asList(dlg.getResult());
			Session session = SessionManager.INSTANCE.getSession(config);
			EditingDomain editingDomain = session.getTransactionalEditingDomain();
	
			
			ArrayList<Property> properties = new ArrayList<Property>();
			for (Object obj : result){
				Property property = RecipeFactory.eINSTANCE.createProperty();
				property.setUid(UUID.randomUUID().toString());
				property.setConfVarRef((ConfigVariable) obj);
				properties.add(property);
			}
			
			editingDomain.getCommandStack().execute(
					AddCommand.create(editingDomain,config,
							RecipePackage.eINSTANCE.getConfiguration_Properties(), properties));
		}
	}

	public Set<ConfigVariable> propertiesList(Configuration config) {
		try {
			ArrayList<Property> available = new ArrayList<Property>();
			QueryHelper helper = new QueryHelper();

			if (config == null)
				return configVar;
			available.addAll(config.getProperties());

			// go up
			Configuration cnf = config;
			while (helper.getConfigExtensionUp(cnf) != null) {
				cnf = helper.getConfigExtensionUp(cnf);
				available.addAll(cnf.getProperties());

			}

			// go down
			cnf = config;
			while (helper.getConfigExtensionDown(cnf) != null) {
				cnf = helper.getConfigExtensionDown(cnf);
				available.addAll(cnf.getProperties());
			}

			// get recipe
			Infrastructure infra = helper.findInfrastructure(cnf) ;
			if (infra != null) {
				Recipe recipe = helper.findRecipe(infra);
				if (recipe != null){
					for (Ingredient ingridient : recipe.getIngredients()) {
						searchConfigParameters(ingridient.getComponents());
					}
	
					for (Property p : available) {
						configVar.remove(p.getConfVarRef());
					}
				}
			}
		} catch (Exception e) {
			LogUtil.log(e);

		}

		return configVar;

	}

	private void searchConfigParameters(List<Component> components) {

		for (Component component  : components) {
			for ( ModelMapper mapper : component.getMappers()) {
				if (mapper.getArtifactRef() == null)
					continue;
				
				Collection<ConfigVariableWithNickName> map = mapper.getArtifactRef().getConfigVariables();

					for (ConfigVariableWithNickName cnfVar : map) {
						this.configVar.add(cnfVar.getVarRef());
					}
			}
		}

	}

	class ConfigVarLabelProvider extends LabelProvider {
		public String getText(Object element) {
			return element == null ? "" : ((ConfigVariable) element).getName();//$NON-NLS-1$
		}

	}

}
