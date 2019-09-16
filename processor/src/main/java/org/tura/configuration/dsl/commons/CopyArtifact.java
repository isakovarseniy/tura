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
package org.tura.configuration.dsl.commons;

import java.io.File;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.felix.gogo.jline.command.DockerCommand;

public class CopyArtifact<T> {

    protected String srcResource;
    protected String targetLocation;
    protected String targetName;
    protected String application;
    protected String serverType;
    protected String containerId;

    @SuppressWarnings({ "unchecked" })
    public T setApplication(String application) {
        this.application = application;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T setServerType(String serverType) {
        this.serverType = serverType;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T setSourceResource(String srcResource) {
        this.srcResource = srcResource;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T setTargetName(String targetName) {
        this.targetName = targetName;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T setContainer(String containerId) {
        this.containerId = containerId;
        return (T) this;
    }

    public void copyFromClassPath() throws Exception {
        if (containerId == null) {
            copyFromClassPathNoContainer();
        } else {
            String saveTargetLocation = targetLocation;
            targetLocation = System.getProperty("java.io.tmpdir");
            copyFromClassPathNoContainer();
            new DockerCommand().mkdir(containerId, saveTargetLocation);
            new DockerCommand().copyFilesToDocker(containerId, targetLocation, saveTargetLocation, targetName);
        }
    }

    public void copyFromExternal() throws Exception {
        if (containerId == null) {
            copyFromExternalNoContainer();
        } else {
            new DockerCommand().mkdir(containerId, targetLocation);
            new DockerCommand().copyFilesToDocker(containerId, srcResource, targetLocation, targetName);
        }
    }

    private void copyFromClassPathNoContainer() throws Exception {
        InputStream in = null;
        try {
            in = this.getClass().getClassLoader().getResourceAsStream(srcResource);

            File f = new File(targetLocation);
            f.mkdirs();

            Path to = Paths.get(targetLocation + "/" + targetName);

            CopyOption[] options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING };

            Files.copy(in, to, options);
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

    private void copyFromExternalNoContainer() throws Exception {
        File f = new File(targetLocation);
        f.mkdirs();

        Path from = Paths.get(srcResource);
        Path to = Paths.get(targetLocation + "/" + targetName);

        CopyOption[] options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING };

        Files.copy(from, to, options);
    }

}

