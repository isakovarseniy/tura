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
package org.tura.processor.connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class PlatformURLConnection extends URLConnection {
	String ECLIPSE_URL_TEMPLATE="platform:/plugin/org.tura.metamodel.generation";
	String FILEBASE_REPO = "FILEBASE_REPO";
	

	protected PlatformURLConnection(URL url) {
		super(url);
	}

	@Override
	public void connect() throws IOException {

	}
	
	@Override
    public InputStream getInputStream() throws IOException {
		String srcurl = url.toString();
		String targetResource = srcurl.substring(ECLIPSE_URL_TEMPLATE.length()+1);
		String repo = System.getProperty(FILEBASE_REPO);
		if (repo != null){
			File directory = new File(repo);
			File f = new File(directory,targetResource );
			return new FileInputStream(f);
		}else{
			InputStream in  = this.getClass().getClassLoader().getResourceAsStream(targetResource);
			return in;
		}
		
    }

	

}
