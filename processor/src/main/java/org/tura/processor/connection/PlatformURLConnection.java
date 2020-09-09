/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.processor.connection;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

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
		
		String template = ConfigConstants.TURA_HOME+url.getPath();
		url = new URL("file", "localhost", template);
		return url.openConnection().getInputStream();
    }

}
