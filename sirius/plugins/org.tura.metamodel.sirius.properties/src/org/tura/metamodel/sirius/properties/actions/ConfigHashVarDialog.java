/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.sirius.properties.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.tura.metamodel.commons.QueryHelper;

import artifact.ConfigHash;
import artifact.ConfigHashWithNickName;
import recipe.Component;
import recipe.Configuration;
import recipe.HashProperty;
import recipe.Infrastructure;
import recipe.Ingredient;
import recipe.ModelMapper;
import recipe.Recipe;
import recipe.RecipeFactory;
import recipe.RecipePackage;

public class ConfigHashVarDialog {
	private HashSet<ConfigHash> configVar = new HashSet<ConfigHash>();

	public List<?> runDialog(Configuration config) {

		Set<ConfigHash> set = propertiesList(config);
		ListSelectionDialog dlg = new ListSelectionDialog(Display.getCurrent().getActiveShell(), set, new ArrayContentProvider(),
				new ConfigVarLabelProvider(), "Select configuration variables:");
		dlg.setTitle("Hash Variables Selection");
		List<Object> result = new ArrayList<>();
		if (dlg.open() == Window.OK) {
			result = Arrays.asList(dlg.getResult());
			Session session = SessionManager.INSTANCE.getSession(config);
			EditingDomain editingDomain = session.getTransactionalEditingDomain();
	
			
			ArrayList<HashProperty> properties = new ArrayList<HashProperty>();
			for (Object obj : result){
				HashProperty property = RecipeFactory.eINSTANCE.createHashProperty();
				property.setUid(UUID.randomUUID().toString());
				property.setConfHashRef((ConfigHash) obj);
				properties.add(property);
			}
			
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain,config,
							RecipePackage.eINSTANCE.getConfiguration_HashProperties(), properties));
		}

		return result;
	}

	public Set<ConfigHash> propertiesList(Configuration config) {
		try {
			ArrayList<HashProperty> available = new ArrayList<HashProperty>();
			QueryHelper helper = new QueryHelper();

			if (config == null)
				return configVar;
			available.addAll(config.getHashProperties());

			// go up
			Configuration cnf = config;
			while (helper.getConfigExtensionUp(cnf) != null) {
				cnf = helper.getConfigExtensionUp(cnf);
				available.addAll(cnf.getHashProperties());

			}

			// go down
			cnf = config;
			while (helper.getConfigExtensionDown(cnf) != null) {
				cnf = helper.getConfigExtensionDown(cnf);
				available.addAll(cnf.getHashProperties());
			}

			// get recipe
			Infrastructure infra = helper.findInfrastructure(cnf) ;
			if (infra != null) {
				Recipe recipe = helper.findRecipe(infra);
				if (recipe != null){
					for (Ingredient ingridient : recipe.getIngredients()) {
						searchConfigParameters(ingridient.getComponents());
					}
	
					for (HashProperty p : available) {
						configVar.remove(p.getConfHashRef());
					}
				}
			}
		} catch (Exception e) {

		}

		return configVar;

	}

	private void searchConfigParameters(List<Component> components) {

		for (Component component  : components) {
			for ( ModelMapper mapper : component.getMappers()) {
				if (mapper.getArtifactRef() == null)
					continue;
				
				Collection<ConfigHashWithNickName> map = mapper.getArtifactRef().getConfigHashes();

				for (ConfigHashWithNickName cnfVar :  map) {
					this.configVar.add(cnfVar.getHash());
				}
			}
		}

	}	

	class ConfigVarLabelProvider extends LabelProvider {
		public String getText(Object element) {
			return element == null ? "" : ((ConfigHash) element).getName();//$NON-NLS-1$
		}
	}

}
