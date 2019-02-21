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
