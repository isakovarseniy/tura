/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.containers.docker;

import com.github.dockerjava.api.command.CommitCmd;


public class DockerCommitContainer extends Docker {


    public Object execute(String registry, String tag , String command, String id) {
        _init();
          
        CommitCmd cmd = dockerClient.commitCmd(id).withRepository(registry).withTag(tag);

        if (command != null) {
            cmd = cmd.withCmd(command.split(" "));
        }
        cmd.exec();
        return null;
    }

    
}


