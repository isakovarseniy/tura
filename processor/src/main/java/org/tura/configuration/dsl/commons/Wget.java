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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import me.tongfei.progressbar.ProgressBar;

public class Wget {

	public static WgetStatus wGet(String saveAsFile, String urlOfFile) {
		InputStream httpIn = null;
		OutputStream fileOutput = null;
		OutputStream bufferedOut = null;
		try {
			// check the http connection before we do anything to the fs

			URL url = new URL(urlOfFile);
			URLConnection connection = url.openConnection();
			int size = connection.getContentLength();

			httpIn = new BufferedInputStream(connection.getInputStream());

			// prep saving the file
			fileOutput = new FileOutputStream(saveAsFile);
			bufferedOut = new BufferedOutputStream(fileOutput, 1024);
			byte data[] = new byte[1024];
			boolean fileComplete = false;
			int count = 0;
			try (ProgressBar pb = new ProgressBar(saveAsFile, size)) {

				while (!fileComplete) {
					count = httpIn.read(data, 0, 1024);
					if (count <= 0) {
						fileComplete = true;
					} else {
						bufferedOut.write(data, 0, count);
						pb.stepBy(count);
					}
				}
			}
		} catch (MalformedURLException e) {
			return WgetStatus.MalformedUrl;
		} catch (IOException e) {
			return WgetStatus.IoException;
		} finally {
			try {
				bufferedOut.close();
				fileOutput.close();
				httpIn.close();
			} catch (IOException e) {
				return WgetStatus.UnableToCloseOutputStream;
			}
		}
		return WgetStatus.Success;
	}

}