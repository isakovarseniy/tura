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

import java.util.List;

import org.tura.configuration.dsl.commons.JobPropertyFile;

import picocli.CommandLine.Option;

public class DSLJobPropertyFile  extends DSLCommand{

	@Option(names = "--application", required = true)
	private String application; 
	@Option(names = "--relativeLocation", required = true)
	private String relativeLocation; 
	@Option(names = "--artifact", required = true)
	private String artifact; 
	@Option(names = "--property")
	private List<String> properties;
	
	
	@Override
	public Object execute() throws Exception {

		JobPropertyFile dsl =  
				new JobPropertyFile(artifact)
		               .setApplication(application)
                       .setRelativeLocation(relativeLocation);
		
		if (properties != null) {
			for (String p : properties) {
				String[] ps = p.split(":");
				if (ps.length != 2) {
					throw new IllegalArgumentException("Wrong property " + p);
				}
				dsl.addProperties(ps[0], ps[1]);
			}
		}
		dsl.run();
		
		return null;
	}

}
