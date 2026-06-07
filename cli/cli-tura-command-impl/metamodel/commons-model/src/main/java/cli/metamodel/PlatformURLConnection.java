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

package cli.metamodel;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Paths;

import org.tura.cli.ConfigConstants;

public class PlatformURLConnection extends URLConnection {

	protected PlatformURLConnection(URL url) {
		super(url);
	}

	@Override
	public void connect() throws IOException {

	}

	@Override
	public InputStream getInputStream() throws IOException {
		String workspace = System.getProperty(ConfigConstants.KEY_WORKSPACE);

		if (workspace != null) {
			File  template = Paths.get(workspace, url.getPath()).toFile();
			if (template.exists()) {
				url = new URL("file", "localhost", template.getAbsolutePath());
				return url.openConnection().getInputStream();
			}
		}

		String template = Paths.get(ConfigConstants.TURA_HOME, url.getPath()).toString();
		url = new URL("file", "localhost", template);
		return url.openConnection().getInputStream();
	}

}
