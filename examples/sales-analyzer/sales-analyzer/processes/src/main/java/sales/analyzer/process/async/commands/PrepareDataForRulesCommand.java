package sales.analyzer.process.async.commands;

import sales.analyzer.process.commons.Constants;

public class PrepareDataForRulesCommand  extends RunTalendJobCommand {

	public String getJob() {
		return System.getProperty(Constants.TALEND_JOB_ROOT)+Constants.PREPARE_DATA_JOB;
	}	
	
}
