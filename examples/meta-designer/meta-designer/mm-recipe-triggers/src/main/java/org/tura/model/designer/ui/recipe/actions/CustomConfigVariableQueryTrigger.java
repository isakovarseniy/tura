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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.model.designer.repository.serialized.artifact.ConfigVariable;
import org.tura.model.designer.repository.serialized.artifact.ConfigVariableWithNickName;
import org.tura.model.designer.repository.serialized.recipe.Component;
import org.tura.model.designer.repository.serialized.recipe.ConfigExtension;
import org.tura.model.designer.repository.serialized.recipe.Configuration;
import org.tura.model.designer.repository.serialized.recipe.ConfigurationProxy;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.recipe.Property;
import org.tura.model.designer.repository.serialized.recipe.Recipe;
import org.tura.model.designer.repository.serialized.recipe.Recipes;
import org.tura.model.designer.ui.recipe.mmdesigner.recipe.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.annotations.CustomQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.QueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.proxy.access.ArrayListWithSearch;

@Alternative
@Priority(10)
@Selector("mmdesigner.recipe")
@CustomQuery("configVariable")
public class CustomConfigVariableQueryTrigger implements QueryTrigger {

	@Inject
	IBeanFactory bf;

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> execute(CpaRepository repository, Pager<T> pager) throws TuraException {
		Object obj = bf.getTreeRootRecipes().getCurrentObject();
		if (obj instanceof Configuration) {
			try {
				return (List<T>) propertiesList((Configuration) obj);
			} catch (Exception e) {
				throw new TuraException(e);
			}
		}
		return new ArrayListWithSearch<T>();
	}

	public List<ConfigVariable> propertiesList(Configuration config) throws Exception {

		List<Property> available = new ArrayList<Property>();
		List<ConfigVariable> configVar = new ArrayListWithSearch<ConfigVariable>();

		if (config == null) {
			return configVar;
		}

		Recipes recipes = (Recipes) ((ConfigurationProxy) config).eContainer();
		available.addAll(config.getProperties());

		// go up
		Configuration cnf = config;
		while (getConfigExtensionUp(cnf, recipes) != null) {
			cnf = getConfigExtensionUp(cnf, recipes);
			available.addAll(cnf.getProperties());
		}

		// go down
		cnf = config;
		while (getConfigExtensionDown(cnf, recipes) != null) {
			cnf = getConfigExtensionDown(cnf, recipes);
			available.addAll(cnf.getProperties());
		}

		// get recipe
		Recipe recipe = recipes.getRecipe();
		if (recipe != null) {
			for (Ingredient ingridient : recipe.getIngredients()) {
				searchConfigParameters(ingridient.getComponents(), configVar);
			}

			for (Property p : available) {
				configVar.remove(p.getConfVarRef());
			}
		}

		return configVar;

	}

	private void searchConfigParameters(List<Component> components, List<ConfigVariable> configVar) {

		for (Component component : components) {
			for (ModelMapper mapper : component.getMappers()) {
				if (mapper.getArtifactRef() == null)
					continue;

				List<ConfigVariableWithNickName> map = mapper.getArtifactRef().getConfigVariables();

				for (ConfigVariableWithNickName cnfVar : map) {
					configVar.add(cnfVar.getVarRef());
				}
			}
		}

	}

	public Configuration getConfigExtensionUp(Configuration config, Recipes recipes) throws Exception {

		if (getConfigExtensionGard(config, recipes)) {
			throw new Exception("Configuration cannot be sources for more then 1 configuration tree");
		}

		Collection<ConfigExtension> list = recipes.getConfigExtensions();
		Stream<ConfigExtension> stream = list.stream().filter(p -> config.getUid().equals(p.getSource().getUid()));

		List<Configuration> lst = new ArrayList<Configuration>();
		stream.forEach(p -> lst.add(p.getTarget()));

		if (lst.size() != 0)
			return lst.get(0);
		else
			return null;
	}

	public Configuration getConfigExtensionDown(Configuration config, Recipes recipes) throws Exception {

		if (getConfigExtensionGard(config, recipes)) {
			return null;
		}
		Collection<ConfigExtension> list = recipes.getConfigExtensions();
		Stream<ConfigExtension> stream = list.stream().filter(p -> config.getUid().equals(p.getTarget().getUid()));

		List<Configuration> lst = new ArrayList<Configuration>();
		stream.forEach(p -> lst.add(p.getSource()));

		if (lst.size() != 0)
			return lst.get(0);
		else
			return null;

	}

	public boolean getConfigExtensionGard(Configuration config, Recipes recipes) throws Exception {

		Collection<ConfigExtension> list = recipes.getConfigExtensions();
		Stream<ConfigExtension> stream = list.stream().filter(p -> config.getUid().equals(p.getSource().getUid()));

		if ((stream != null) && (stream.count() > 1)) {
			return true;
		} else {
			return false;
		}
	}

}
