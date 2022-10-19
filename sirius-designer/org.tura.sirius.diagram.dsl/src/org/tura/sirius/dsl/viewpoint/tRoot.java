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

package org.tura.sirius.dsl.viewpoint;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.sirius.viewpoint.description.DescriptionFactory;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.tura.sirius.dsl.config.ConfigProvider;

public class tRoot {
	public static String MIGRATION_VERSION = "10.1.3.201511131800";
	public static HashMap<String, Object> context = new HashMap<String, Object>();
	private Group group;
	private ConfigProvider configurator;

	public tRoot(String name, ConfigProvider configurator) {
		this.group = DescriptionFactory.eINSTANCE.createGroup();
		this.group.setName(name);
		this.group.setVersion(MIGRATION_VERSION);
		this.configurator = configurator;
	}

	public tViewPoint addViewPoint(String name, String fileExtension) {
		Viewpoint viewpoint = DescriptionFactory.eINSTANCE.createViewpoint();
		viewpoint.setName(name);
		viewpoint.setModelFileExtension(fileExtension);
		this.group.getOwnedViewpoints().add(viewpoint);
		return new tViewPoint(viewpoint, this.configurator);
	}

	public void save(String fileName) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("odesign", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI.createURI(fileName + ".odesign"));

		resource.getContents().add(this.group);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
