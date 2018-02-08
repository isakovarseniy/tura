package sales.analyzer.process.async.commands;

import sales.analyzer.process.commons.Constants;

public class InsertMonthlyDataCommand extends RunTalendJobCommand {
	
	public String getJob() {
		return Constants.TALEND_JOB_ROOT+Constants.LOAD_MONTHLY_DATA_JOB;
	}
}
