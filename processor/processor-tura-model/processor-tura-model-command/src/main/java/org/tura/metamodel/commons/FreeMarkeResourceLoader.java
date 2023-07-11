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

package org.tura.metamodel.commons;

import java.net.URI;
import java.net.URL;

import freemarker.cache.URLTemplateLoader;

public class FreeMarkeResourceLoader extends URLTemplateLoader {

	@Override
	protected URL getURL(String filePath) {
		URI uri;
		try {
			uri = new URI(filePath);
			return uri.toURL();
		} catch (Exception e) {
		}
		return null;
	}
}
