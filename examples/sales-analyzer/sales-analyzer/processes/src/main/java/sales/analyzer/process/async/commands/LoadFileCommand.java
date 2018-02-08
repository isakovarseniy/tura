package sales.analyzer.process.async.commands;

import sales.analyzer.process.commons.Constants;

public class LoadFileCommand extends RunTalendJobCommand {
	
	public String getJob() {
		return Constants.TALEND_JOB_ROOT+Constants.VALIDATION_JOB;
	}

}
