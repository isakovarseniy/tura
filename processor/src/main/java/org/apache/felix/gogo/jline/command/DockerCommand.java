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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.felix.gogo.jline.Executable;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.ExecCreateCmdResponse;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.command.ExecStartResultCallback;

import picocli.CommandLine.Command;

@Command(name = "docker")
public class DockerCommand implements Executable {
    protected DockerClient dockerClient;

    @Override
    public Object execute() {
        return null;
    }

    protected void _init() {
        DefaultDockerClientConfig.Builder config = DefaultDockerClientConfig.createDefaultConfigBuilder();
        dockerClient = DockerClientBuilder.getInstance(config).build();
    }

    protected Container findContainer(String cn) {
        List<Container> containers = dockerClient.listContainersCmd().withShowAll(true).exec();
        for (Container c : containers) {
            List<String> list = new ArrayList<String>(Arrays.asList(c.getNames()));
            if (list.contains("/" + cn)) {
                return c;
            }
        }
        return null;
    }

    public void copyFilesToDocker(String containerId, String source, String targetDir, String targetArtifact) {
        _init();

        dockerClient.copyArchiveToContainerCmd(containerId).withRemotePath(targetDir).withHostResource(source).exec();

    }

    public void mkdir(String containerId, String targetDir) throws InterruptedException {
        _init();
        ExecCreateCmdResponse exe = dockerClient.execCreateCmd(containerId).withCmd("mkdir", "-p", targetDir).exec();

        dockerClient.execStartCmd(exe.getId()).exec(new ExecStartResultCallback() {
            @Override
            public void onNext(Frame frame) {
                super.onNext(frame);
            }
        }).awaitCompletion();

    }

}

