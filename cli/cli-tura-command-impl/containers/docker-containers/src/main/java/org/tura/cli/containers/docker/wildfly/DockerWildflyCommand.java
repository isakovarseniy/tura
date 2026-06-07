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

package org.tura.cli.containers.docker.wildfly;

import java.util.List;

import org.tura.cli.containers.ContainerType;
import org.tura.cli.jboss.IWildFlyCommand;

public class DockerWildflyCommand implements IWildFlyCommand{


    @Override
    public ContainerType getContainerType() {
        return ContainerType.DOCKER;
    }


    @Override
    public void runJbossCli(String containerId, List<String> properties, String jboss_home, String cliFile) throws Exception {
        new DockerWildflyRunJbossCli().runJbossCli(containerId,properties,jboss_home,cliFile);
    }

    
    
}
