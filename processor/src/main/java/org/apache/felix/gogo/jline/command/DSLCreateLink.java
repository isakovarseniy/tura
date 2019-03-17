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

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import picocli.CommandLine.Option;

public class DSLCreateLink extends DSLCommand{

	@Option(names = "--targetDirectory", required = true)
	private String targetDirectory; 
	@Option(names = "--sourceDirectory", required = true)
	private String sourceDirectory;
	@Option(names = "--linkName", required = true)
	private String linkName;

	@Override
	public Object execute() throws Exception {
		
		File dir =  new File(this.sourceDirectory);
        if ( !dir.exists()) {
            dir.mkdirs();
        }

		Path link = Paths.get(this.sourceDirectory , linkName);
		
		if (!Files.exists(link)) {
			Path trg =   Paths.get(targetDirectory);
			Files.createSymbolicLink(link, trg);
		}
		return null;
	}
	
	
}
