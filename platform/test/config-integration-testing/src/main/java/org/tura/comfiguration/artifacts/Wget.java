/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.comfiguration.artifacts;

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