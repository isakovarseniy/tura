/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.hrmanager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public  class RunExternalJob  {

	public static void execute(String... args) throws Exception {
		ExecutorService exErrorService = Executors.newSingleThreadExecutor();
		ExecutorService exInfoService = Executors.newSingleThreadExecutor();
		try {

			Process process = new ProcessBuilder(args).start();

			StreamReader infoStreamGobbler = new StreamReader(process.getInputStream(),  false);
			StreamReader errorStreamGobbler = new StreamReader(process.getErrorStream(),  true);
			exErrorService.submit(errorStreamGobbler);
			exInfoService.submit(infoStreamGobbler);

			int exitCode = process.waitFor();
			assert exitCode == 0;
		
		} finally {
			if (exInfoService != null)
				exInfoService.shutdownNow();
			if (exErrorService != null)
				exErrorService.shutdownNow();
		}
	}

}
