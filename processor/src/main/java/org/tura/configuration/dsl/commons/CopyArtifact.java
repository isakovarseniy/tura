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

package org.tura.configuration.dsl.commons;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.FileUtils;
import org.apache.felix.gogo.jline.command.DockerCommand;
import org.apache.felix.service.command.CommandSession;

public class CopyArtifact<T> {

    protected String srcResource;
    protected String targetLocation;
    protected String targetName;
    protected String application;
    protected String serverType;
    protected String containerId;
	protected CommandSession session;

    
    public CopyArtifact(CommandSession session) {
    	this.session = session;
    }

    
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
            
        	DockerCommand cmd = new DockerCommand();
        	cmd.setSession(session);
            
        	cmd.mkdir(containerId, saveTargetLocation);
        	cmd.copyFilesToDocker(containerId, targetLocation, saveTargetLocation, targetName);
        }
    }

    public void copyFromExternal() throws Exception {
        if (containerId == null) {
            copyFromExternalNoContainer();
        } else {
        	if (targetName != null ) {
                String tmpLocation = System.getProperty("java.io.tmpdir");
                Files.copy(Paths.get(srcResource), Paths.get(tmpLocation, targetName), StandardCopyOption.REPLACE_EXISTING);
                srcResource = Paths.get(tmpLocation, targetName).toString();
        	}

        	DockerCommand cmd = new DockerCommand();
        	cmd.setSession(session);
        	
        	cmd.mkdir(containerId, targetLocation);
        	cmd.copyFilesToDocker(containerId, srcResource, targetLocation, targetName);
        	
        	if (targetName != null ) {
                new File(srcResource).delete();
        	}

        }
    }

	public void copyDirectoryExternal() throws IOException {
        if (containerId == null) {
           copyDirectoryExternalNoContainer();
        } else {
        	throw new UnsupportedOperationException();
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
    
    
    private void copyDirectoryExternalNoContainer() throws IOException {
    	FileUtils.copyDirectory(new File(this.srcResource), new File(this.targetLocation));
		
	}
 

}

