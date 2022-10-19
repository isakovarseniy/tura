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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.tura.metamodel.commons.OSHelper;

public class PreProcessorURLConnection extends URLConnection {

	protected PreProcessorURLConnection(URL url) {
		super(url);
	}

	@Override
	public void connect() throws IOException {

	}

	@Override
	public InputStream getInputStream() throws IOException {
		String path = url.getPath().substring(3);
		URI uri = URI.create("file:"+path);
		
		String buffer = readScript(uri).toString();
		if (OSHelper.isWindows()) {
			buffer = buffer.replaceAll("\\r", "");
		}
		return new ByteArrayInputStream(buffer.getBytes(Charset.defaultCharset()));
	}

	public static CharSequence readScript(URI script) throws IOException {
		CharBuffer buf = CharBuffer.allocate(4096);
		StringBuilder sb = new StringBuilder();

		URLConnection conn = script.toURL().openConnection();

		try (InputStreamReader in = new InputStreamReader(conn.getInputStream())) {
			while (in.read(buf) > 0) {
				buf.flip();
				sb.append(buf);
				buf.clear();
			}
		}catch( Exception e) {
			e.printStackTrace();
		}
		finally {
			if (conn instanceof HttpURLConnection) {
				((HttpURLConnection) conn).disconnect();
			}
		}

		return sb;
	}

}
