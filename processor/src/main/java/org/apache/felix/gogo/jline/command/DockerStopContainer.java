/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command;

import com.github.dockerjava.api.exception.NotModifiedException;
import com.github.dockerjava.api.model.Container;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "stopContainer")
public class DockerStopContainer extends DockerCommand {

    @Option(names = "--name")
    private String name;

    @Option(names = "--id")
    private String id;

    @Override
    public Object execute() {
        _init();
        
        if (id != null) {
            dockerClient.stopContainerCmd(id).exec();
            return null;
        }
        if (name != null) {
            Container cn = findContainer(name);
            if (cn  != null && !cn.getStatus().contains("Exited")) {
            	try {
                dockerClient.stopContainerCmd(cn.getId()).exec();
            	}catch(NotModifiedException e) {
            		// ignoring exception container already stopped 
            	}
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("One of parameters name|id should be defined");
    }

}


