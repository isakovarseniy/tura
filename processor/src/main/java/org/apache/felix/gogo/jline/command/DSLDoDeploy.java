/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.gogo.jline.command;

import org.tura.configuration.dsl.jboss.DoDeploy;

import picocli.CommandLine.Option;

public class DSLDoDeploy extends DSLCommand{

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;
	@Option(names = "--targetName", required = true)
	private String targetName;
	@Option(names = "--srcResource", required = true)
	private String srcResource;
	
	
	@Override
	public Object execute() throws Exception {
        new DoDeploy(jboss_home,targetName)
        .setSourceResource( srcResource)
        .doDeployExploaded();

		return null;
	}

}
