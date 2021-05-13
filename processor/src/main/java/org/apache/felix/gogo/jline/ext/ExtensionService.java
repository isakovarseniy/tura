/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.ext;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;

import org.apache.felix.service.command.CommandProcessor;
import org.tura.configuration.dsl.commons.ConfigConstants;

public class ExtensionService {

	private ServiceLoader<ProcessorExtension> loader;
	private static ExtensionService service;
	public static List<String> initScripts = new ArrayList<>();

	private ExtensionService() {
		loader = ServiceLoader.load(ProcessorExtension.class);
	}

	public static ExtensionService getInstance() {
		if (service == null) {
			service = new ExtensionService();
		}
		return service;
	}

	public void initExtension(CommandProcessor processor) throws IOException {

		Iterator<ProcessorExtension> iterator = loader.iterator();
		while (iterator.hasNext()) {
			ProcessorExtension ext = iterator.next();
			ext.initProcessor(processor);
			linkDirectories(ext.getDirMap());
			Collection<String> list = ext.getInitScripts();
			if (list != null) {
				initScripts.addAll(ext.getInitScripts());
			}
		}
	}

	private void linkDirectories(Map<String, String> dirMap) throws IOException {
		for (String key : dirMap.keySet()) {
			Path link = Paths.get(ConfigConstants.TURA_CONFIG_REPOSITORY, key);
			if (link.toFile().exists()) {
				continue;
			}
			Path src = Paths.get(dirMap.get(key));
			
			//Fix wrong behavior on MacOS
			try {
				Files.createSymbolicLink(link, src);
			} catch (FileAlreadyExistsException e) {

			}
		}
	}

}