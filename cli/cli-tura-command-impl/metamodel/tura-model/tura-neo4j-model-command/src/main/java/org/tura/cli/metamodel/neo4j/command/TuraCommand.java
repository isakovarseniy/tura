/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.metamodel.neo4j.command;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.text.StrSubstitutor;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.epsilon.eol.types.EolClasspathNativeTypeDelegate;
import org.neo4j.ogm.config.ConfigurationSource;
import org.neo4j.ogm.config.FileConfigurationSource;
import org.neo4j.ogm.session.SessionFactory;
import org.tura.epsilon.model.TuraModel;
import org.tura.metamode.tura.TuraInstantiator;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.model.designer.repository.serialized.recipe.Configuration;
import org.tura.model.designer.repository.serialized.recipe.HashProperty;
import org.tura.model.designer.repository.serialized.recipe.KeyValuePair;
import org.tura.model.designer.repository.serialized.recipe.Property;

public class TuraCommand {

	public static boolean initURL = false;
	private static TuraInstantiator turaInstantiator;
	public static TuraModel model;

	protected URI getFileURI(String fileName) throws URISyntaxException {
		URI uri = Paths.get(fileName).toUri();
		return uri;
	}

	protected IEolModule createEolModule(IModel model) {
		IEolModule module = new EolModule();
		module.getContext().getModelRepository().addModel(model);
		module.getContext().getNativeTypeDelegates().add(new EolClasspathNativeTypeDelegate());
		return module;
	}

	public Model createTuraModel(String propertiesFilePath) throws Exception {
		if (model == null) {
			turaInstantiator = new TuraInstantiator();

			ConfigurationSource configurationSource = new FileConfigurationSource(propertiesFilePath);
			org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder(configurationSource)
					.build();
			SessionFactory sessionFactory = new SessionFactory(configuration, "org.tura.model.designer.repository.neoj4");
			
			model = turaInstantiator.createTuraModel(sessionFactory.openSession());
		}else {
			model.cleanCache();
		}
		return model;
	}

	protected void getConfiguratioin(List<Configuration> confList, HashMap<String, Object> configuration, String configBranch) {
		QueryHelper helper = new QueryHelper();
		try {
			if (confList != null) {

				Map<String, String> values = new HashMap<String, String>();
				for (Object k : System.getProperties().keySet()) {
					String key = (String) k;
					values.put(key, System.getProperty(key));
				}
				for (Configuration conf : confList) {
					for (Property prop : conf.getProperties()) {
						values.put(prop.getConfVarRef().getName(), prop.getValue());
					}
				}

				StrSubstitutor sub = new StrSubstitutor(values);

				for (Configuration conf : confList) {
					for (Property prop : conf.getProperties()) {
						configuration.put(prop.getConfVarRef().getName(), sub.replace(prop.getValue()));
					}
				}

				for (Configuration conf : confList) {
					for (HashProperty prop : conf.getHashProperties()) {
						HashMap<String, String> hash = new HashMap<String, String>();

						for (KeyValuePair pair : prop.getHash())
							hash.put(pair.getKeyCode(), pair.getValue());

						configuration.put(prop.getConfHashRef().getName(), hash);
					}
				}

				for (Configuration conf : confList) {
					if (helper.getConfigExtensionUp(conf) != null)
						getConfiguratioin(helper.getBranchedConfigExtensionUp(conf, configBranch), configuration,configBranch);
				}
			}
		} catch (Exception e) {

		}
	}

}
