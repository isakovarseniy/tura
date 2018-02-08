package sales.analyzer.process.async.commands;

import etl.run_rules_0_1.Run_rules;
import routines.system.api.TalendJob;

public class RunBusinessRules extends RunInteranllyTalendJobCommand {
	@Override
	public TalendJob getTalendJob() {
		return new  Run_rules();
	}

}
