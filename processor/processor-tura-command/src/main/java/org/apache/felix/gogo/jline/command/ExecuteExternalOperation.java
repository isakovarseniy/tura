/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.lang.StringUtils;
import org.apache.felix.gogo.jline.utils.OSHelper;
import org.tura.configuration.dsl.commons.StreamReader;

public class ExecuteExternalOperation {

	private String job;

	public ExecuteExternalOperation(String job) {
		this.job = job;
	}

	public void execute() {
		ExecutorService exErrorService = Executors.newSingleThreadExecutor();
		ExecutorService exInfoService = Executors.newSingleThreadExecutor();
		try {

			String[] args = null;

			if ( OSHelper.isWindows()) {
		    	job = StringUtils.replace(job, "\\\n", " ");
				args = new String[] { "cmd", "/c", job };
		    }else {
				args = new String[] { "/bin/sh", "-c", job };
		    }
			
			Process process = new ProcessBuilder(args).start();

			StreamReader infoStreamGobbler = new StreamReader(process.getInputStream(),  false);
			StreamReader errorStreamGobbler = new StreamReader(process.getErrorStream(),  true);
			exErrorService.submit(errorStreamGobbler);
			exInfoService.submit(infoStreamGobbler);

			int exitCode = process.waitFor();
			if ( exitCode != 0 ) {
				System.out.println("Error during execution "+job);
				return;
			}
		} catch (Throwable e) {
			throw new RuntimeException(e);
		} finally {
			if (exInfoService != null)
				exInfoService.shutdownNow();
			if (exErrorService != null)
				exErrorService.shutdownNow();
		}
	}

}
