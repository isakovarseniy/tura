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

package org.tura.processor.connection;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

import org.apache.commons.io.FileUtils;
import org.tura.configuration.dsl.commons.ConfigConstants;

public class PlatformURLConnection extends URLConnection {
	
	protected PlatformURLConnection(URL url) {
		super(url);
	}

	@Override
	public void connect() throws IOException {

	}
	
	@Override
    public InputStream getInputStream() throws IOException {
		if (ConfigConstants.roots == null) {
			Path lnk = Paths.get(ConfigConstants.TURA_WORKING_DIRECTORY, ConfigConstants.TEMPLATES_ROOT_LINK);
			File f = lnk.toFile();
			if (f.exists()) {
				ConfigConstants.roots  = FileUtils.readFileToString(f, Charset.defaultCharset());
			}else {
				ConfigConstants.roots="";
			}
		}
		if (ConfigConstants.roots != null && !"".equals(ConfigConstants.roots)) {
			StringTokenizer tokenizer = new StringTokenizer( ConfigConstants.roots, ":");
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				if (token != null && !"".equals(token)) {
					String template = Paths.get(token, url.getPath()).toString();
					if (Paths.get(token, url.getPath()).toFile().exists()) {
						url = new URL("file", "localhost", template);
						return url.openConnection().getInputStream();
					}
				}
			}
		}
		
		String template = Paths.get(ConfigConstants.TURA_HOME, url.getPath()).toString();
		url = new URL("file", "localhost", template);
		return url.openConnection().getInputStream();
    }

}
