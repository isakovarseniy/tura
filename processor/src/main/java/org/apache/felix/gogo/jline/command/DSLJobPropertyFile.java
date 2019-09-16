/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which is available at https://www.eclipse.org/legal/epl-v10.html
 *
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
