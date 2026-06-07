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

package org.tura.cli.dsl;

import java.net.URL;
import java.nio.file.Paths;

import org.tura.cli.ConfigConstants;

import freemarker.cache.ClassTemplateLoader;

public class FreeMarkeResourceLoader extends ClassTemplateLoader {
	
	@Override
	protected URL getURL(String filePath) {
		try {
			String workspace = System.getProperty(ConfigConstants.KEY_WORKSPACE);
			if (workspace == null ) {
				workspace = System.getProperty(ConfigConstants.KEY_TURA_HOME);
				workspace = Paths.get(workspace,"cli").toString();
			}
			return Paths.get(workspace,filePath).toUri().toURL();
		} catch (Exception e) {
		}
		return null;
	}
}
