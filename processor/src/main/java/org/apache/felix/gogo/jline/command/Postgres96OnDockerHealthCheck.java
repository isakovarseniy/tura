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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Postgres96OnDockerHealthCheck extends DockerCommand {

	public String getCommand() {
		return " docker exec sa-pg sh -c \"/usr/lib/postgresql/9.6/bin/psql -U postgres postgres -c 'SELECT 1;' \" ";
	}

	@Override
    public Object execute() {

		for (int i = 0; i < 10; i++) {
			ExecutorService exErrorService = Executors.newSingleThreadExecutor();
			ExecutorService exInfoService = Executors.newSingleThreadExecutor();
			try {
				System.out.println(String.format("Attempt  %s", i) );
				
				String job = getCommand();

				String[] args = new String[] { "/bin/sh", "-c", job };
				Process process = new ProcessBuilder(args).start();

				StreamReader infoStreamGobbler = new StreamReader(process.getInputStream());
				StreamReader errorStreamGobbler = new StreamReader(process.getErrorStream());
				exErrorService.submit(errorStreamGobbler);
				exInfoService.submit(infoStreamGobbler);

				int exitCode = process.waitFor();
				if (exitCode == 0) {
						return null;
				}
				Thread.sleep(2000);

			} catch (Exception e) {
				throw new RuntimeException(e);
			} finally {
				if (exInfoService != null)
					exInfoService.shutdownNow();
				if (exErrorService != null)
					exErrorService.shutdownNow();
			}
		}
		throw new RuntimeException("Server did not started");
	}

	private class StreamReader implements Runnable {
		private InputStream inputStream;
		private StringBuilder builder = new StringBuilder();

		public StreamReader(InputStream inputStream) {
			this.inputStream = inputStream;
		}

		@Override
		public void run() {
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

			String inputLine;
			try {
				while ((inputLine = reader.readLine()) != null) {
					builder.append(inputLine);
				}
			} catch (IOException e) {

			}
		}
		public String toString() {
			return builder.toString();
		}
	}

	
}
