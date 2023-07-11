/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command;

import java.util.List;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "config")
public class DockerConfig extends DockerCommand {

    @Option(names = "--cmd")
    private String cmd;
    @Option(names = "--network")
    private String network;
    @Option(names = "--user")
    private String user;
    @Option(names = "--alias")
    private String alias;
    @Option(names = "--port")
    private List<String> portMapper;
    @Option(names = "--volume")
    private List<String> volumesMapping;
    @Option(names = "--var")
    private List<String> vars;
    
    
    @Override
    public Object execute() {
        return this;
    }


    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }


    public String getNetwork() {
        return network;
    }


    public void setNetwork(String network) {
        this.network = network;
    }


    public String getUser() {
        return user;
    }


    public void setUser(String user) {
        this.user = user;
    }


    public String getAlias() {
        return alias;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }


    public List<String> getPortMapper() {
        return portMapper;
    }


    public void setPortMapper(List<String> portMapper) {
        this.portMapper = portMapper;
    }


    public List<String> getVolumesMapping() {
        return volumesMapping;
    }


    public void setVolumesMapping(List<String> volumesMapping) {
        this.volumesMapping = volumesMapping;
    }


	public List<String> getVars() {
		return vars;
	}


	public void setVars(List<String> vars) {
		this.vars = vars;
	}

    
    
}


