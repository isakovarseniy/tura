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

import org.apache.felix.gogo.jline.SessionAware;
import org.apache.felix.service.command.CommandSession;

import com.github.dockerjava.api.command.CommitCmd;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "commitContainer")
public class DockerCommitContainer extends DockerCommand implements SessionAware{

    @Option(names = "--registry", required = true)
    private String registry;
    
    @Option(names = "--tag", required = true)
    private String tag;
    
    @Option(names = "--cmd")
    private String command;

    private CommandSession session;

    
    
    @Override
    public void run() {
    	_init();
    	
    	String id = "";

		CommitCmd cmd = dockerClient.commitCmd(id).withRepository(registry).withTag(tag);

		if (cmd != null) {
			cmd = cmd.withCmd(command.split(" "));
		}
		cmd.exec();
    	
    }



	@Override
	public void setSession(CommandSession session) {
		this.session = session;
		
	}
    
}

