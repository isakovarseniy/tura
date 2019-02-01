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

import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.model.Bind;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.Ports;
import com.github.dockerjava.api.model.Ports.Binding;
import com.github.dockerjava.api.model.Volume;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "createContainer")
public class DockerCreateContainer extends DockerCommand implements SessionAware {

	@Option(names = "--name")
	private String name;

	@Option(names = "--registry", required = true)
	private String registry;

	@Option(names = "--tag", required = true)
	private String tag;

	@Option(names = "--var")
	private String var;

	private CommandSession session;

	@Override
	public Object execute() {
		_init();
		DockerConfig conf = null;
		if (var != null) {
			conf = (DockerConfig) session.get(var);
		}

		CreateContainerCmd cmd = dockerClient.createContainerCmd(registry + ":" + tag);

		if (conf != null && conf.getUser() != null) {
			cmd = cmd.withUser(conf.getUser());
		}
		if (name != null) {
			cmd = cmd.withName(name);
		}

		if (conf != null && conf.getCmd() != null) {
			cmd = cmd.withCmd(conf.getCmd());
		}

		if (conf != null) {
			if (conf.getPortMapper() != null) {
				Ports portBindings = new Ports();
				List<ExposedPort> expPorts = new ArrayList<>();
				for (String str : conf.getPortMapper()) {
					String[] ports = str.split(":");
					if (ports.length != 2) {
						throw new IllegalArgumentException("Wrong port definition " + str);
					}

					ExposedPort dPort = ExposedPort.tcp(new Integer(ports[1]));
					expPorts.add(dPort);
					portBindings.bind(dPort, Binding.bindPort(new Integer(ports[0])));
				}
				cmd.withExposedPorts(expPorts.toArray(new ExposedPort[] {}));
				cmd.withPortBindings(portBindings);
			}
			if (conf.getVolumesMapping() != null) {
				List<Bind> bindings = new ArrayList<>();
				for (String str : conf.getVolumesMapping()) {
					String[] volumes = str.split(":");
					if (volumes.length != 2) {
						throw new IllegalArgumentException("Wrong volume definition " + str);
					}

					Volume volume = new Volume(volumes[1]);
					bindings.add(new Bind(volumes[0], volume, rw));
				}
				cmd.withBinds(bindings.toArray(new Bind[] {}));
			}
		}
		if (conf != null && conf.getNetwork() != null) {
			cmd.withNetworkMode(conf.getNetwork());
		}
		if (conf != null && conf.getAlias() != null) {
			cmd.withAliases(conf.getAlias());
		}

		CreateContainerResponse container = cmd.exec();
		dockerClient.startContainerCmd(container.getId()).exec();
		return container.getId();
	}

	@Override
	public void setSession(CommandSession session) {
		this.session = session;
	}

}
