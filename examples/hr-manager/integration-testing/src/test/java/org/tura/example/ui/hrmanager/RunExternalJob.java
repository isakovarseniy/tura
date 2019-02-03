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
