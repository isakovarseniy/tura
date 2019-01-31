/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.gogo.jline.command;

import java.util.List;

import org.apache.felix.gogo.jline.SessionAware;
import org.apache.felix.service.command.CommandSession;
import org.tura.configuration.dsl.commons.ConfigConstants;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "config")
public class DockerConfig extends DockerCommand implements SessionAware{

    @Option(names = "--clear")
    private boolean clear;
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
    @Option(names = "--volume",  required = true)
    private List<String> volumesMapping;
    
    
    private CommandSession session;


    
    
    @Override
    public Object execute() {
        if (clear) {
          session.put(ConfigConstants.DOCKER_CONFIG, new DockerConfig());
        }else {
           session.put(ConfigConstants.DOCKER_CONFIG, this);
        }
        return null;
    }


    @Override
    public void setSession(CommandSession session) {
        this.session = session;
    }


    public boolean isClear() {
        return clear;
    }


    public void setClear(boolean clear) {
        this.clear = clear;
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

    
    
}


