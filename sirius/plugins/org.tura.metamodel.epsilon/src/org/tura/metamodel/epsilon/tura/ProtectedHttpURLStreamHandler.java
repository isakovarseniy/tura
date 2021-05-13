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

package org.tura.metamodel.epsilon.tura;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.osgi.service.url.AbstractURLStreamHandlerService;

public class ProtectedHttpURLStreamHandler extends AbstractURLStreamHandlerService {
	private String TURA_LOCATION = turaLocation();
	private String roots = getRoots();

	public URLConnection openConnection(URL url) throws IOException {

		if (roots != null && !"".equals(roots)) {
			StringTokenizer tokenizer = new StringTokenizer( roots, ":");
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				if (token != null && !"".equals(token)) {
					String template = Paths.get(token, url.getPath()).toString();
					if (Paths.get(token, url.getPath()).toFile().exists()) {
						url = new URL("file", "localhost", template);
						return url.openConnection();
					}
				}
			}
		}
		
		String template = TURA_LOCATION + url.getPath();
		url = new URL("file", "localhost", template);
		return url.openConnection();
	}


	public static String turaLocation() {
		try {
			Path path = Paths.get(System.getProperty("user.home") + "/.tura/turaLink");
			return Files.readString(path, Charset.defaultCharset());
		} catch (Exception e) {
			LogUtil.log(e);
			return System.getProperty("user.home");
		}
	}
	
	public static String getRoots() {
		try {
			Path path = Paths.get(System.getProperty("user.home") + "/.tura/templateLink");
			return Files.readString(path, Charset.defaultCharset());
		} catch (Exception e) {
			LogUtil.log(e);
			return turaLocation();
		}
	}
	
	
}
