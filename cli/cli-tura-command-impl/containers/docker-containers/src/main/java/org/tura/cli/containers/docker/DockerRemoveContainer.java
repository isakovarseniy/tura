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

import com.github.dockerjava.api.command.RemoveContainerCmd;
import com.github.dockerjava.api.exception.NotFoundException;


public class DockerRemoveContainer extends Docker {


    public Object execute(String name,String id) {
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

