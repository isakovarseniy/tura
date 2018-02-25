package org.tura.comfiguration.artifacts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecuteArtifact {

	private List<String> arguments = new ArrayList<>();
	
	
	public ExecuteArtifact addArguments(String  ...args) {
		for (String a : args) {
			arguments.add(a);
		}
	   return this;	
	}
	
	public void run() throws Exception {
		boolean executionError = false;
		ExecutorService exErrorService = Executors.newSingleThreadExecutor();
		ExecutorService exInfoService = Executors.newSingleThreadExecutor();
		try {

			Process process = new ProcessBuilder(arguments).start();

			StreamReader infoStreamGobbler = new StreamReader(process.getInputStream(), this.getClass(), false);
			StreamReader errorStreamGobbler = new StreamReader(process.getErrorStream(), this.getClass(), true);
			exErrorService.submit(errorStreamGobbler);
			exInfoService.submit(infoStreamGobbler);

			int exitCode = process.waitFor();
			assert exitCode == 0;
		} catch (Throwable e) {
			executionError = true;
		} finally {
			if (exInfoService != null)
				exInfoService.shutdownNow();
			if (exErrorService != null)
				exErrorService.shutdownNow();
		}
		if (executionError) {
			throw new Exception("Execution exception");
		}
	}
}
