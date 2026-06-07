/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.cli.sa;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;


@Command(name = "copyMonthlyFiles"
         ,description="Copy Monthly files command"
		 ,headerHeading = "%nUsage:"
         ,synopsisHeading = "%n"		 
		 ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"
		 )
public class CopyMonthlyFilesCommand extends SaCommandResolver implements Callable<Object>{

	@Option(names = "--containerId")
	private String containerId;
	
	@Option(names = "--targetLocation")
	private String targetLocation;

	@Option(names = "--sourceResource", required = true)
	private String sourceResource;
	
	
	@Override
	public Object call() throws Exception {
		getSaCommand();
		if (saCommand == null){
			System.out.println("Provider not found");
			return null; 
		}
		Thread.currentThread().setContextClassLoader(saCommand.getClass().getClassLoader());
	    saCommand.copyMonthlyFiles(sourceResource,targetLocation,containerId);
		return null;


	}
	
}
