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
