/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
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


