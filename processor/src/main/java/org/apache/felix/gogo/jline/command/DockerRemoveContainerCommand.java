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

import com.github.dockerjava.api.command.RemoveContainerCmd;
import com.github.dockerjava.api.exception.NotFoundException;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "removeContainer")
public class DockerRemoveContainerCommand extends DockerCommand {

    @Option(names = "--name")
    private String name;

    @Option(names = "--id")
    private String id;

    @Override
    public Object execute() {
        try {
            _init();
            if (id != null) {
                RemoveContainerCmd rm = dockerClient.removeContainerCmd(id);
                rm.withForce(true);
                rm.exec();
            } else {

                RemoveContainerCmd rm = dockerClient.removeContainerCmd(name);
                rm.withForce(true);
                rm.exec();
            }
        } catch (NotFoundException e) {
            System.out.println("Container " + name + " not found");
        }
        return null;
    }

}

