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

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.tura.cli.dsl.Artifact;

public class DockerGenerateArtifact extends Docker {

    public Object execute(List<String> properties, String artifactTargetLocation, String artifactName,
            String templateLocation, String containerId, String var) throws Exception {
        Artifact dsl = new Artifact();
        dsl.setArtifactName(artifactName);
        dsl.setTemplateFile(templateLocation);

        String tmpArtifactTargetLocation = System.getProperty("java.io.tmpdir");
        if (!tmpArtifactTargetLocation.endsWith(File.separator)) {
            tmpArtifactTargetLocation = tmpArtifactTargetLocation + File.separator;
        }
        dsl.setArtifactTargerLocation(tmpArtifactTargetLocation);

        if (properties != null) {
            for (String p : properties) {
                int index = p.indexOf(":");
                if (index != -1) {
                    String key = p.substring(0, index);
                    String value = p.substring(index + 1);
                    dsl.addProperties(key, value);
                } else {
                    throw new IllegalArgumentException("Wrong property " + p);
                }
            }
        }
        dsl.run();
        this.mkdir(containerId, artifactTargetLocation,var);
        String trg = Paths.get(tmpArtifactTargetLocation,artifactName).toFile().getCanonicalPath();
        this.copyFilesToDocker(containerId, trg, artifactTargetLocation, false,var);

        return null;

    }

}
