/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which is available at https://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.tura.configuration.dsl.commons;

import java.io.File;
import java.net.URL;

import freemarker.cache.ClassTemplateLoader;

public class FreeMarkeResourceLoader extends ClassTemplateLoader {
	
	@Override
	protected URL getURL(String filePath) {
		try {
			return new File(ConfigConstants.TURA_CONFIG_REPOSITORY+"/"+filePath).toURI().toURL();
		} catch (Exception e) {
		}
		return null;
	}
}
