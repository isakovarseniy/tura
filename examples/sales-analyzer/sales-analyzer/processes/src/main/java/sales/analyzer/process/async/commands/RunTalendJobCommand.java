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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.drools.core.process.instance.WorkItem;
import org.kie.api.executor.Command;
import org.kie.api.executor.CommandContext;
import org.kie.api.executor.ExecutionResults;

import sales.analyzer.process.commons.Constants;

public abstract class RunTalendJobCommand implements Command {

	public abstract String getJob();

	@Override
	public ExecutionResults execute(CommandContext context) throws Exception {
		boolean executionError = false;
		ExecutorService exErrorService = Executors.newSingleThreadExecutor();
		ExecutorService exInfoService = Executors.newSingleThreadExecutor();
		try {
			WorkItem workitem = (WorkItem) context.getData(Constants.PARAM_HASH);
			Date processingDate = (Date) workitem.getParameter(Constants.PARAM_FILE_PROCESSING_DATE);

			SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = sdfr.format(processingDate);

			String job = getJob();
			job = job.replace("${data}", dateString).replace("${session}",
					new Long(workitem.getProcessInstanceId()).toString());

			String[] args = new String[] { "/bin/sh", "-c", job };
			Process process = new ProcessBuilder(args).start();

			StreamReader infoStreamGobbler = new StreamReader(process.getInputStream(), this.getClass(), false);
			StreamReader errorStreamGobbler = new StreamReader(process.getErrorStream(), this.getClass(), true);
			exErrorService.submit(errorStreamGobbler);
			exInfoService.submit(infoStreamGobbler);

			int exitCode = process.waitFor();
			assert exitCode == 0;
		} catch (Throwable e) {
			executionError = true;
		} finally {
			if (exInfoService != null)
				exInfoService.shutdownNow();
			if (exErrorService != null)
				exErrorService.shutdownNow();
		}
		ExecutionResults results = new ExecutionResults();
		results.setData(Constants.EXECUTION_ERROR, executionError);
		return results;
	}

}
