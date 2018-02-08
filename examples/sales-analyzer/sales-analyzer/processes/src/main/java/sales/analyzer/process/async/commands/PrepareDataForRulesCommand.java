package sales.analyzer.process.async.commands;

import sales.analyzer.process.commons.Constants;

public class PrepareDataForRulesCommand  extends RunTalendJobCommand {

	public String getJob() {
		return Constants.TALEND_JOB_ROOT+Constants.PREPARE_DATA_JOB;
	}	
	
}
