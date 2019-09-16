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

import java.util.List;

import com.github.dockerjava.api.command.ListImagesCmd;
import com.github.dockerjava.api.model.Image;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "removeImage")
public class DockerRemoveImage extends DockerCommand {

    @Option(names = "--registry", required = true)
    private String registry;

    @Option(names = "--tag", required = true)
    private String tag;

    @Override
    public Object execute() {
        _init();
        ListImagesCmd ls = dockerClient.listImagesCmd();
        ls.withImageNameFilter(registry + ":" + tag);
        List<Image> imgs = ls.exec();
        if (imgs == null || imgs.size() == 0) {
            System.out.println("Image  " + registry + ":" + tag + " not found");
            return null;
        }
        for (Image im : imgs) {
            dockerClient.removeImageCmd(im.getId()).withForce(true).exec();
        }
        return null;

    }

}


