/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sales.analyzer.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamReader implements Runnable {
	private InputStream inputStream;
	private boolean isError;

	public StreamReader(InputStream inputStream, boolean isError) {
		this.inputStream = inputStream;
		this.isError = isError;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

		String inputLine;
		try {
			while ((inputLine = reader.readLine()) != null) {
				if (isError) {
					System.err.println(inputLine);
				}else {
					System.out.println(inputLine);
				}
			}
		} catch (IOException e) {

		}
	}
}