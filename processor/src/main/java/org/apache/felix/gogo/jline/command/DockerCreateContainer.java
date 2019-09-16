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
			if (conf.getVars()!= null ) {
				cmd.withEnv(conf.getVars().toArray(new String[conf.getVars().size()]));
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
