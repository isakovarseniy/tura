/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamReader implements Runnable {
	private InputStream inputStream;
	private Class<?> loggerName;
	private boolean isError;

	public StreamReader(InputStream inputStream, Class<?> loggerName, boolean isError) {
		this.inputStream = inputStream;
		this.loggerName = loggerName;
		this.isError = isError;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		Logger log = LoggerFactory.getLogger(loggerName);

		String inputLine;
		try {
			while ((inputLine = reader.readLine()) != null) {
				if (isError) {
					log.error(inputLine);
				}else {
					log.info(inputLine);
				}
			}
		} catch (IOException e) {

		}
	}
}