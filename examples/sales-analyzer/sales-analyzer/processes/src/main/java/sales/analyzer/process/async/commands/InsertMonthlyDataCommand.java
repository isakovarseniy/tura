package sales.analyzer.process.async.commands;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.drools.core.process.instance.WorkItem;
import org.kie.api.executor.Command;
import org.kie.api.executor.CommandContext;
import org.kie.api.executor.ExecutionResults;

import sales.analyzer.process.commons.Constants;

public class InsertMonthlyDataCommand implements Command {
	
	private static final Logger LOGGER = Logger.getLogger(InsertMonthlyDataCommand.class.getName());
	
	@Override
	public ExecutionResults execute(CommandContext context) throws Exception {
		boolean executionError = false;
		try {
			WorkItem workitem = (WorkItem) context.getData(Constants.PARAM_HASH);
			Date processingDate = (Date) workitem.getParameter(Constants.PARAM_FILE_PROCESSING_DATE);

			SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = sdfr.format(processingDate);

			String job = Constants.TALEND_JOB_ROOT+Constants.LOAD_MONTHLY_DATA_JOB;
			job = job.replace("${data}", dateString).replace("${session}" ,new Long ( workitem.getProcessInstanceId()).toString());

			LOGGER.info(job);

			String[] args = new String[] {"/bin/sh", "-c", job};
			Process process = new ProcessBuilder(args).start();

			StreamReader streamGobbler = new StreamReader(process.getInputStream(), System.out::println);
			Executors.newSingleThreadExecutor().submit(streamGobbler);
			int exitCode = process.waitFor();
			assert exitCode == 0;
		} catch (Throwable e) {
			executionError = true;
		}
		ExecutionResults results = new ExecutionResults();
		results.setData(Constants.EXECUTION_ERROR, executionError); 
		return results;
	}

}
