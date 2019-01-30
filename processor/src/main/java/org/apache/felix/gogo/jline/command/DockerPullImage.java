package org.apache.felix.gogo.jline.command;

import com.github.dockerjava.api.command.PullImageCmd;
import com.github.dockerjava.core.command.PullImageResultCallback;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "pullImage")
public class DockerPullImage extends DockerCommand{

    @Option(names = "--registry", required = true)
    private String registry;

    @Option(names = "--tag", required = true)
    private String tag;

    @Override
    public void run() {
        PullImageCmd req = dockerClient.pullImageCmd(registry).withAuthConfig(dockerClient.authConfig());
        req.withTag(tag);
        PullImageResultCallback res = new PullImageResultCallback();
        res = req.exec(res);
        res.awaitSuccess();
    }
    
    
}

