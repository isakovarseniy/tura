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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.felix.gogo.jline.Executable;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.ExecCreateCmdResponse;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.api.model.Image;
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

    protected Image findImage(String cn) {
        List<Image> images = dockerClient.listImagesCmd().withShowAll(true).exec();
        for (Image c : images) {
        	if ( c.getRepoTags() == null) {
        		continue;
        	}
        	List <String> tags = Arrays.asList(c.getRepoTags());
        	if ( tags.contains(cn)) {
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

