/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
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
