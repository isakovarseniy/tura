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

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ContainerConfig implements Serializable{

    private static final long serialVersionUID = 1L;
	private String cmd;
    private String network;
    private String user;
    private String alias;
    private List<String> portMapper;
    private List<String> volumesMapping;
    private List<String> vars;

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

    public String toString(){
       return  ToStringBuilder.reflectionToString(this);
    }

}
