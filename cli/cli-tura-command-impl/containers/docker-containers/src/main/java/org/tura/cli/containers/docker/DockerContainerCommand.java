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

import java.util.ArrayList;
import java.util.List;

import org.tura.cli.containers.ContainerConfig;
import org.tura.cli.containers.ContainerType;
import org.tura.cli.containers.IContainerCommand;

public class DockerContainerCommand implements IContainerCommand {

    @Override
    public ContainerType getContainerType() {
        return ContainerType.DOCKER;
    }

    @Override
    public Object config(String cmd, String network, String user, String alias, List<String> portMapper,
            List<String> volumesMapping, List<String> vars) {

        ContainerConfig conf  = new ContainerConfig();
        conf.setCmd(cmd);
        conf.setNetwork(network);
        conf.setUser(user);
        conf.setAlias(alias);
        conf.setPortMapper(portMapper);
        conf.setVolumesMapping(volumesMapping);
        conf.setVars(vars);
        return conf;

    }

    @Override
    public Object createContainer(String name, String registry, String tag, String var) throws Exception {
        return new DockerCreateContainer().execute(name,registry,tag, var);
    }

    @Override
    public Object findContainer(String name ) throws Exception{
        return new DockerFindContainer().execute(name);
    }

    @Override
    public Object createNetwork(String name) throws Exception {
        return new DockerCreateNetwork().execute(name);
    }

    @Override
    public Object findImage(String registry, String tag) throws Exception{
        return new DockerFindImage().execute(registry,tag);
    }

    @Override
    public Object logWatch(List<String> names) throws Exception{
        return new DockerLogWatcher().execute(names);
    }

    @Override
    public Object pullImage(String registry, String tag) {
        return new DockerPullImage().execute(registry,tag);
    }

    @Override
    public Object removeContainer(String name, String id) {
        return new DockerRemoveContainer().execute(name, id);
    }

    @Override
    public Object removeImage(String registry, String tag) {
        return new DockerRemoveImage().execute(registry, tag);
    }

    @Override
    public Object startContainer(String name, String id) {
        return new DockerStartContainer().execute(name,id);

    }

    @Override
    public Object stopContainer(String name, String id) {
        return new DockerStopContainer().execute(name,id);
    }

    @Override
    public Object commitContainer(String registry, String tag , String command, String id) {
        return new DockerCommitContainer().execute(registry, tag, command,id );
    }


    @Override
    public Object copyFile(String targetLocation , String targetName ,    String sourceResource, String containerId,
            boolean unzip,String var) throws Exception{
        return new DockerCopyFile().execute(targetLocation ,  targetName,  sourceResource, containerId,unzip,var);        
    }

    @Override
    public Object removeFile(String targetLocation, String containerId,String var) throws Exception {
        return new DockerRemoveFile().execute(targetLocation,  containerId,var);        
    }

    @Override
    public Object mkdir(String targetLocation, String containerId,String var) throws Exception {
        return new DockerMkDir().execute(targetLocation,  containerId,var);        
    }

    @Override
    public Object generateArtifact(List<String> properties, String artifactTargetLocation, String artifactName,
                String templateLocation, String containerId,String var) throws Exception{
            return new DockerGenerateArtifact().execute( properties,  artifactTargetLocation,  artifactName, templateLocation,  containerId,var);        
                    
        }

    @Override
    public Object executeCommand(String containerId, String var, String command) throws Exception {
        List<String> lcmd = new ArrayList<>();
        lcmd.add("sh");
        lcmd.add("-c");
        lcmd.add(command);

        String[] cmd = lcmd.toArray(new String[3]);

        new Docker( ).cmd(containerId, cmd,System.out,false,var);
        return null;
    }


    
}
