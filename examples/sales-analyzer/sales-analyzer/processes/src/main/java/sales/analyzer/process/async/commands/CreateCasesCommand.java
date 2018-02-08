package sales.analyzer.process.async.commands;

import etl.create_cases_0_1.Create_cases;
import routines.system.api.TalendJob;

public class CreateCasesCommand  extends RunInteranllyTalendJobCommand {

	@Override
	public TalendJob getTalendJob() {
		return new  Create_cases();
	}

}
