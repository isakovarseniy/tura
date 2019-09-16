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
package org.apache.felix.gogo.jline.command;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

			String[] args = new String[] { "/bin/sh", "-c", job };
			Process process = new ProcessBuilder(args).start();

			StreamReader infoStreamGobbler = new StreamReader(process.getInputStream(),  false);
			StreamReader errorStreamGobbler = new StreamReader(process.getErrorStream(),  true);
			exErrorService.submit(errorStreamGobbler);
			exInfoService.submit(infoStreamGobbler);

			int exitCode = process.waitFor();
			assert exitCode == 0;
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
