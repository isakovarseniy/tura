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

import com.github.dockerjava.api.model.Container;

import picocli.CommandLine.Option;

public class DockerFindContainer extends DockerCommand{

    @Option(names = "--name")
    private String name;

    
    
    @Override
    public Object execute() {
        _init();
        Container c = findContainer(name);
        if (c != null) {
            return true;
        }else {
            return false;
        }
    }
    
    
}

