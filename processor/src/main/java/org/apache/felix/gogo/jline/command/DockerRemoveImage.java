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
    public void run() {
        ListImagesCmd ls = dockerClient.listImagesCmd();
        ls.withImageNameFilter(registry + ":" + tag);
        List<Image> imgs = ls.exec();
        if (imgs == null || imgs.size() == 0) {
            System.out.println("Image  " + registry + ":" + tag + " not found");
            return;
        }
        for (Image im : imgs) {
            dockerClient.removeImageCmd(im.getId()).withForce(true).exec();
        }

    }

}

