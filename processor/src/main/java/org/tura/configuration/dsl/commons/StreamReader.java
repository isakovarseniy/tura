/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.configuration.dsl.commons;

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
				} else {
					System.out.println(inputLine);
				}
			}
		} catch (IOException e) {

		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if ( inputStream != null) {
					inputStream.close();
				}
			} catch (Exception e) {
			}
		}
	}
}