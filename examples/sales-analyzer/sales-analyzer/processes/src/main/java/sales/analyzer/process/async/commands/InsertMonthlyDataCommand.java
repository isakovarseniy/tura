package sales.analyzer.process.async.commands;

import sales.analyzer.process.commons.Constants;

public class InsertMonthlyDataCommand extends RunTalendJobCommand {
	
	public String getJob() {
		return System.getProperty(Constants.TALEND_JOB_ROOT)+Constants.LOAD_MONTHLY_DATA_JOB;
	}
}
