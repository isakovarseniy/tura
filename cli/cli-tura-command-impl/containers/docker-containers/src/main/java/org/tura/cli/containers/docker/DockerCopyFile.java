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

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class DockerCopyFile extends Docker {
	

    public Object execute(String targetLocation, String targetName,  String sourceResource, String containerId,
            boolean unzip,String var) throws Exception {
        _init();

        this.mkdir(containerId, targetLocation,var);
    	if (targetName != null ) {
            String tmpLocation = System.getProperty("java.io.tmpdir");
            Files.copy(Paths.get(sourceResource), Paths.get(tmpLocation, targetName), StandardCopyOption.REPLACE_EXISTING);
            sourceResource = Paths.get(tmpLocation, targetName).toString();
    	}
        
        
        this.copyFilesToDocker(containerId, sourceResource,  targetLocation,unzip,var);
        return null;

    }


}
