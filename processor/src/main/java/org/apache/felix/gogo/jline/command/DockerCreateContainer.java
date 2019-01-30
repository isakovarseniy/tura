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

import static com.github.dockerjava.api.model.AccessMode.rw;

import java.util.ArrayList;
import java.util.List;

import org.apache.felix.gogo.jline.SessionAware;
import org.apache.felix.service.command.CommandSession;
import org.tura.configuration.dsl.commons.ConfigConstants;

import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.model.Bind;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.Ports;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.api.model.Ports.Binding;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;


@Command(name = "createContainer")
public class DockerCreateContainer extends DockerCommand implements SessionAware{

    @Option(names = "--name")
    private String name;

    @Option(names = "--registry", required = true)
    private String registry;
    
    @Option(names = "--tag", required = true)
    private String tag;
    
    private CommandSession session;
    
    
    @Override
    public void run() {
    	_init();
    	DockerConfig conf =  (DockerConfig) session.get(ConfigConstants.DOCKER_CONFIG);
    	
		CreateContainerCmd cmd = dockerClient.createContainerCmd(registry + ":" + tag);
		
		if (conf.getUser() != null) {
			cmd = cmd.withUser(conf.getUser());
		}
		if (name != null) {
			cmd = cmd.withName(name);
		}

		if (conf.getCmd() != null) {
			cmd = cmd.withCmd(conf.getCmd() );
		}

		Ports portBindings = new Ports();
		List<ExposedPort> expPorts = new ArrayList<>();
		for (Integer key : portMapper.keySet()) {
			ExposedPort dPort = ExposedPort.tcp(portMapper.get(key));
			expPorts.add(dPort);
			portBindings.bind(dPort, Binding.bindPort(key));
		}
		cmd.withExposedPorts(expPorts.toArray(new ExposedPort[] {}));
		cmd.withPortBindings(portBindings);

		List<Bind> bindings = new ArrayList<>();
		for (String key : volumesMapping.keySet()) {
			Volume volume = new Volume(volumesMapping.get(key));
			bindings.add(new Bind(key, volume, rw));
		}
		cmd.withBinds(bindings.toArray(new Bind[] {}));

		if (conf.getNetwork() != null) {
			cmd.withNetworkMode(conf.getNetwork());
		}
		if (conf.getAlias() != null) {
			cmd.withAliases(conf.getAlias());
		}

		CreateContainerResponse container = cmd.exec();
		dockerClient.startContainerCmd(container.getId()).exec();
    	
    }

    @Override
    public void setSession(CommandSession session) {
        this.session = session;
    }

    
    
}

