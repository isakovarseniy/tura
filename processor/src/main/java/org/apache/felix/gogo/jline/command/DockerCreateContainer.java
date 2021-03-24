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

package org.apache.felix.gogo.jline.command;

import static com.github.dockerjava.api.model.AccessMode.rw;

import java.util.ArrayList;
import java.util.List;

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
public class DockerCreateContainer extends DockerCommand  {

	@Option(names = "--name")
	private String name;

	@Option(names = "--registry", required = true)
	private String registry;

	@Option(names = "--tag", required = true)
	private String tag;

	@Option(names = "--var")
	private String var;


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
					int index = str.indexOf(":");

					String v0 = str.substring(0,index);
					String v1 = str.substring(index+1);

					Volume volume = new Volume(v1);
					bindings.add(new Bind(v0, volume, rw));
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


}
