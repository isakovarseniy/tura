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

    @Option(names = "--clear", required = true)
    private boolean clear;
    @Option(names = "--cmd", required = true)
    private String cmd;
    @Option(names = "--network", required = true)
    private String network;
    @Option(names = "--alias", required = true)
    private String alias;
    @Option(names = "--port",  required = true)
    private List<String> portMapper;
    @Option(names = "--volume",  required = true)
    private List<String> volumesMapping;
    private CommandSession session;


    
    
    @Override
    public void run() {
        if (clear) {
          session.put(ConfigConstants.DOCKER_CONFIG, new DockerConfig());
        }else {
              session.put(ConfigConstants.DOCKER_CONFIG, this);
        }
    }


    @Override
    public void setSession(CommandSession session) {
        this.session = session;
    }

    
    
}

