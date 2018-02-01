package sales.analyzer.process.async.commands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.drools.core.process.instance.WorkItem;
import org.kie.api.executor.Command;
import org.kie.api.executor.CommandContext;
import org.kie.api.executor.ExecutionResults;

import etl.run_rules_0_1.Run_rules;
import sales.analyzer.process.commons.Constants;

public class RunBusinessRules implements Command {

	@Override
	public ExecutionResults execute(CommandContext context) throws Exception {
		boolean executionError = false;
		try {

			WorkItem workitem = (WorkItem) context.getData(Constants.PARAM_HASH);
			Date processingDate = (Date) workitem.getParameter(Constants.PARAM_FILE_PROCESSING_DATE);

			SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = sdfr.format(processingDate);

			String[] args = new String[] { "--context=Default", "--context_param",
					"session=" + new Long(workitem.getProcessInstanceId()).toString(), "--context_param",
					"date=yyyy-MM-dd;" + dateString };

			Run_rules r = new  Run_rules();
			r.runJobInTOS(args);

		} catch (Throwable e) {
			executionError = true;
		}
		ExecutionResults results = new ExecutionResults();
		results.setData(Constants.EXECUTION_ERROR, executionError); 
		return results;
	}

}