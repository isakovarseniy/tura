package org.tura.configuration.dsl.commons;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.ExecCreateCmdResponse;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.core.command.ExecStartResultCallback;

public class Docker {
    
    private static DockerClient dockerClient;

    public static void copyFilesToDocker(String containerId, String sourceDir, String targetDir,
            String artifact) {
        dockerClient.copyArchiveToContainerCmd(containerId).withRemotePath(targetDir)
                .withHostResource(sourceDir + "/" + artifact).exec();

    }

    public static void mkdir(String containerId, String targetDir) throws InterruptedException {
        ExecCreateCmdResponse exe = dockerClient.execCreateCmd(containerId).withCmd("mkdir", "-p", targetDir)
                .exec();

        dockerClient.execStartCmd(exe.getId()).exec(new ExecStartResultCallback() {
            @Override
            public void onNext(Frame frame) {
                super.onNext(frame);
            }
        }).awaitCompletion();

    }
    
    
}
