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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamReader implements Runnable {
	private InputStream inputStream;
	private boolean isError;

	public StreamReader(InputStream inputStream,  boolean isError) {
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