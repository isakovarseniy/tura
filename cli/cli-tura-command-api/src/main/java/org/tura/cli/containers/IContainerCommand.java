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

package org.tura.cli.containers;

import java.util.List;

public interface IContainerCommand {

    ContainerType  getContainerType();

    Object config(String cmd, String network, String user, String alias, List<String> portMapper,
            List<String> volumesMapping, List<String> vars);

    Object createContainer(String name, String registry, String tag, String var) throws Exception;

    Object findContainer(String name ) throws Exception;

    Object findImage(String registry, String tag) throws Exception;

    Object createNetwork(String network) throws Exception;

    Object logWatch(List<String> names) throws Exception;

    Object pullImage(String registry, String tag);

    Object removeContainer(String name, String id);

    Object removeImage(String registry, String tag);

    Object startContainer(String name, String id);

    Object stopContainer(String name, String id);

    Object commitContainer(String registry, String tag , String command, String id);

    Object copyFile(String targetLocation, String targetName ,String sourceResource, String containerId, boolean unzip,String var) throws Exception;

    Object removeFile(String targetLocation, String containerId,String var) throws Exception;

    Object mkdir(String targetLocation, String containerId,String var) throws Exception;

    Object generateArtifact(List<String> properties, String artifactTargetLocation, String artifactName,
            String templateLocation, String containerId,String var) throws Exception;

    Object executeCommand(String containerId, String var ,String command) throws Exception;


    



}
