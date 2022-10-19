/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sales.analyzer.process.async.commands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.drools.core.process.instance.WorkItem;
import org.kie.api.executor.Command;
import org.kie.api.executor.CommandContext;
import org.kie.api.executor.ExecutionResults;

import routines.system.api.TalendJob;
import sales.analyzer.process.commons.Constants;

public abstract class RunInteranllyTalendJobCommand implements Command {

	public abstract TalendJob getTalendJob();
	
	
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

			TalendJob r =  getTalendJob();
			r.runJobInTOS(args);

		} catch (Throwable e) {
			executionError = true;
		}
		ExecutionResults results = new ExecutionResults();
		results.setData(Constants.EXECUTION_ERROR, executionError); 
		return results;
	}
	
}
