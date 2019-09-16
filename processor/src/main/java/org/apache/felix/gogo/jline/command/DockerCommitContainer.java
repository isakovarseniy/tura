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

import com.github.dockerjava.api.command.CommitCmd;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "commitContainer")
public class DockerCommitContainer extends DockerCommand {

    @Option(names = "--registry", required = true)
    private String registry;
    
    @Option(names = "--tag", required = true)
    private String tag;
    
    @Option(names = "--cmd")
    private String command;

    @Option(names = "--id")
    private String id;
    
    
    @Override
    public Object execute() {
        _init();
          
        CommitCmd cmd = dockerClient.commitCmd(id).withRepository(registry).withTag(tag);

        if (command != null) {
            cmd = cmd.withCmd(command.split(" "));
        }
        cmd.exec();
        return null;
    }

    
}


