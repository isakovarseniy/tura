package sales.analyzer.process.async.commands;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.drools.core.process.instance.WorkItem;
import org.kie.api.executor.Command;
import org.kie.api.executor.CommandContext;
import org.kie.api.executor.ExecutionResults;

import sales.analyzer.process.commons.Constants;

public abstract class RunTalendJobCommand implements Command {

	public abstract String getJob();

	@Override
	public ExecutionResults execute(CommandContext context) throws Exception {
		boolean executionError = false;
		ExecutorService exErrorService = Executors.newSingleThreadExecutor();
		ExecutorService exInfoService = Executors.newSingleThreadExecutor();
		try {
			WorkItem workitem = (WorkItem) context.getData(Constants.PARAM_HASH);
			Date processingDate = (Date) workitem.getParameter(Constants.PARAM_FILE_PROCESSING_DATE);

			SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = sdfr.format(processingDate);

			String job = getJob();
			job = job.replace("${data}", dateString).replace("${session}",
					new Long(workitem.getProcessInstanceId()).toString());

			String[] args = new String[] { "/bin/sh", "-c", job };
			Process process = new ProcessBuilder(args).start();

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
		ExecutionResults results = new ExecutionResults();
		results.setData(Constants.EXECUTION_ERROR, executionError);
		return results;
	}

}
