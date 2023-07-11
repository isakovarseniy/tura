/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.lang.text.StrSubstitutor;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.epsilon.eol.types.EolClasspathNativeTypeDelegate;
import org.tura.metamode.tura.TuraInstantiator;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.model.designer.repository.serialized.recipe.Configuration;
import org.tura.model.designer.repository.serialized.recipe.HashProperty;
import org.tura.model.designer.repository.serialized.recipe.KeyValuePair;
import org.tura.model.designer.repository.serialized.recipe.Property;

public class TuraCommand {

	public static boolean initURL = false;
	private static TuraInstantiator turaInstantiator;
	public static Model model;

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

	public Model createTuraModel() throws Exception {
		if (model == null) {
			turaInstantiator = new TuraInstantiator();

			org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();
			config.addResource("META-INF/persistence.xml");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Metamodel", config.getProperties());
			turaInstantiator.em = emf.createEntityManager();

			model = turaInstantiator.createTuraModel(turaInstantiator.em);
		}
		return model;
	}

	protected void getConfiguratioin(Configuration conf, HashMap<String, Object> configuration) {
		QueryHelper helper = new QueryHelper(model);
		try {
			if (conf != null) {

				Map<String, String> values = new HashMap<String, String>();
				for (Object k : System.getProperties().keySet()) {
					String key = (String) k;
					values.put(key, System.getProperty(key));
				}
				for (Property prop : conf.getProperties()) {
					values.put(prop.getConfVarRef().getName(), prop.getValue());
				}

				StrSubstitutor sub = new StrSubstitutor(values);

				for (Property prop : conf.getProperties()) {
					configuration.put(prop.getConfVarRef().getName(), sub.replace(prop.getValue()));
				}

				for (HashProperty prop : conf.getHashProperties()) {
					HashMap<String, String> hash = new HashMap<String, String>();

					for (KeyValuePair pair : prop.getHash())
						hash.put(pair.getKeyCode(), pair.getValue());

					configuration.put(prop.getConfHashRef().getName(), hash);
				}

				if (helper.getConfigExtensionUp(conf) != null)
					getConfiguratioin(helper.getConfigExtensionUp(conf), configuration);
			}
		} catch (Exception e) {

		}
	}

}
