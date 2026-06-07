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

package org.tura.cli.sa.containers.docker;

import java.util.ArrayList;
import java.util.List;

import org.tura.cli.containers.docker.Docker;


public class CopyMonthlyFiles  {

	private  String sourceName = "${workspace}/etc/${application}/assets/${file}";
	private Docker docker;

	public CopyMonthlyFiles( Docker docker){
		this.docker = docker;
	}

	public void copyFromExternal(String sourceResource, String containerId , String targetLocation) throws Exception {
		
        List<String> lcmd = new ArrayList<>();
        lcmd.add("sh");
        lcmd.add("-c");
        lcmd.add("mkdir -p " + targetLocation);

        String[] cmd = lcmd.toArray(new String[3]);

        docker.cmd(containerId, cmd,System.out,false,null);
		
		
		sourceName = sourceResource+"/${file}";

		docker.copyFilesToDocker( containerId,  sourceName.replace("${file}", "MonthlyData_2017-02-01.csv"),  targetLocation,  false,null);

		docker.copyFilesToDocker( containerId,  sourceName.replace("${file}", "MonthlyData_2017-03-01.csv"),  targetLocation,  false,null);

		docker.copyFilesToDocker( containerId,  sourceName.replace("${file}", "MonthlyData_2017-04-01.csv"),  targetLocation,  false,null);

		docker.copyFilesToDocker( containerId,  sourceName.replace("${file}", "MonthlyData_2017-05-01.csv"),  targetLocation,  false,null);

		docker.copyFilesToDocker( containerId,  sourceName.replace("${file}", "MonthlyData_2017-06-01.csv"),  targetLocation,  false,null);

		docker.copyFilesToDocker( containerId,  sourceName.replace("${file}", "MonthlyData_2017-07-01.csv"),  targetLocation,  false,null);

		docker.copyFilesToDocker( containerId,  sourceName.replace("${file}", "MonthlyData_2017-08-01.csv"),  targetLocation,  false,null);

		docker.copyFilesToDocker( containerId,  sourceName.replace("${file}", "MonthlyData_2017-09-01.csv"),  targetLocation,  false,null);

		docker.copyFilesToDocker( containerId,  sourceName.replace("${file}", "MonthlyData_2017-10-01.csv"),  targetLocation,  false,null);

		docker.copyFilesToDocker( containerId,  sourceName.replace("${file}", "MonthlyData_2017-11-01.csv"),  targetLocation,  false,null);

	}


}
