package org.tura.comfiguration.artifacts.docker;

import static com.github.dockerjava.api.model.AccessMode.rw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CommitCmd;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.ExecCreateCmdResponse;
import com.github.dockerjava.api.command.ListImagesCmd;
import com.github.dockerjava.api.command.PullImageCmd;
import com.github.dockerjava.api.command.RemoveContainerCmd;
import com.github.dockerjava.api.exception.NotFoundException;
import com.github.dockerjava.api.model.Bind;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.api.model.Image;
import com.github.dockerjava.api.model.Ports;
import com.github.dockerjava.api.model.Ports.Binding;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.command.ExecStartResultCallback;
import com.github.dockerjava.core.command.PullImageResultCallback;

public class Docker {

	private static DockerClient dockerClient;
	private String registry;
	private String version;
	private CreateContainerResponse container;
	private String[] cmd;
	private Map<Integer, Integer> portMapper = new HashMap<>();
	private Map<String, String> volumesMapping = new HashMap<>();
	private String network;
	private String containerName;
	private String alias;
	private CallBack callBack;

	public Docker() {
	}

	public Docker(CreateContainerResponse container) {
		this.container = container;
	}

	public Docker setRegistry(String registry) {
		this.registry = registry;
		return this;
	}

	public Docker setVersion(String version) {
		this.version = version;
		return this;
	}

	public Docker pullWildFlyImage() throws Exception {
		if (dockerClient == null) {
			build();
		}
		pullImage(registry, version);
		return this;
	}

	public Docker runContainer(String user) throws Exception {
		if (dockerClient == null) {
			build();
		}
		buildContainer(user);

		return this;
	}

	public Docker runContainer() throws Exception {
		if (dockerClient == null) {
			build();
		}
		buildContainer(null);

		return this;
	}

	public Docker stopContainer() throws Exception {
		if (dockerClient == null) {
			build();
		}
		dockerClient.stopContainerCmd(container.getId()).exec();
		return this;
	}

	public Docker stopContainerByName() throws Exception {
		if (dockerClient == null) {
			build();
		}
		Container cn = findContainer(containerName);
		if (cn.getStatus().contains("Up")){
			dockerClient.stopContainerCmd(cn.getId()).exec();
		}
		
		return this;
	}
	
	
	public Docker startContainer() throws Exception {
		if (dockerClient == null) {
			build();
		}
		dockerClient.startContainerCmd(container.getId()).exec();
		return this;
	}
	
	public Docker startContainerByName() throws Exception {
		if (dockerClient == null) {
			build();
		}
		Container cn = findContainer(containerName);
		if (cn.getStatus().contains("Exited")){
			dockerClient.startContainerCmd(cn.getId()).exec();
		}
		return this;
	}
	
	
	
	public Docker createImage(String repository, String tag) throws Exception {
		if (dockerClient == null) {
			build();
		}
		CommitCmd commit = dockerClient.commitCmd(container.getId()).withRepository(repository).withTag(tag);

		if (cmd != null) {
			commit = commit.withCmd(cmd);
		}
		commit.exec();

		return this;
	}

	public CreateContainerResponse getContainer() {
		return container;
	}

	public Docker fixOwnership(String targetDir, String ownership) throws Exception {
		ExecCreateCmdResponse exe = dockerClient.execCreateCmd(container.getId()).withAttachStdout(true)
				.withAttachStderr(true).withCmd("chown", "-R", ownership, targetDir).exec();

		dockerClient.execStartCmd(exe.getId()).exec(new ExecStartResultCallback() {
			@Override
			public void onNext(Frame frame) {
				super.onNext(frame);
			}
		}).awaitCompletion();

		return this;
	}

	public Docker portMapping(int hostPort, int dockerPort) {
		portMapper.put(hostPort, dockerPort);
		return this;
	}

	public Docker volumesMapping(String hostDir, String dockerDir) {
		volumesMapping.put(hostDir, dockerDir);
		return this;
	}

	public Docker dockerStarCommand(String... cmd) {
		this.cmd = cmd;
		return this;
	}

	public Docker setNetwork(String network) {
		this.network = network;
		return this;
	}

	public Docker setContainerName(String containerName) {
		this.containerName = containerName;
		return this;
	}

	public Docker setNetworkAlias(String alias) {
		this.alias = alias;
		return this;
	}

	public static void copyFilesToDocker(CreateContainerResponse container, String sourceDir, String targetDir,
			String artifact) {
		dockerClient.copyArchiveToContainerCmd(container.getId()).withRemotePath(targetDir)
				.withHostResource(sourceDir + "/" + artifact).exec();

	}

	public static void mkdir(CreateContainerResponse container, String targetDir) throws InterruptedException {
		ExecCreateCmdResponse exe = dockerClient.execCreateCmd(container.getId()).withCmd("mkdir", "-p", targetDir)
				.exec();

		dockerClient.execStartCmd(exe.getId()).exec(new ExecStartResultCallback() {
			@Override
			public void onNext(Frame frame) {
				super.onNext(frame);
			}
		}).awaitCompletion();

	}

	public void removeContainer() throws Exception {
		if (dockerClient == null) {
			build();
		}
		try {
			RemoveContainerCmd rm = dockerClient.removeContainerCmd(containerName);
			rm.withForce(true);
			rm.exec();
		} catch (NotFoundException e) {
			System.out.println("Container " + containerName + " not found");
		}
	}

	public void removeImage() throws Exception {
		if (dockerClient == null) {
			build();
		}
		ListImagesCmd ls = dockerClient.listImagesCmd();
		ls.withImageNameFilter(registry + ":" + version);
		List<Image> imgs = ls.exec();
		if (imgs == null || imgs.size() == 0) {
			System.out.println("Image  " + registry + ":" + version + " not found");
			return;
		}
		for (Image im : imgs) {
			dockerClient.removeImageCmd(im.getId()).withForce(true).exec();
		}
	}

	private void buildContainer(String user) {
		CreateContainerCmd cmd = dockerClient.createContainerCmd(registry + ":" + version);
		if (user != null) {
			cmd = cmd.withUser(user);
		}
		if (containerName != null) {
			cmd = cmd.withName(containerName);
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

		if (network != null) {
			cmd.withNetworkMode(network);
		}
		if (alias != null) {
			cmd.withAliases(alias);
		}

		container = cmd.exec();
		dockerClient.startContainerCmd(container.getId()).exec();
	}

	private void build() throws Exception {
		DefaultDockerClientConfig.Builder config = DefaultDockerClientConfig.createDefaultConfigBuilder();
		dockerClient = DockerClientBuilder.getInstance(config).build();
	}

	private void pullImage(String registry, String version) {
		PullImageCmd req = dockerClient.pullImageCmd(registry).withAuthConfig(dockerClient.authConfig());
		req.withTag(version);
		PullImageResultCallback res = new PullImageResultCallback();
		res = req.exec(res);
		res.awaitSuccess();
	}

	public Docker containerBuilder(CallBack callBack) {
		this.callBack = callBack;
		return this;
	}

	public Docker buildIfNotExists() throws Exception {
		if (dockerClient == null) {
			build();
		}
		Container cn = findContainer(containerName);

		if (cn == null ) {
			callBack.build();
		}

		return this;
	}

	private Container findContainer(String cn) {
		List<Container> containers = dockerClient.listContainersCmd().withShowAll(true).exec();
		for (Container c : containers) {
			List<String> list = new ArrayList<String>(Arrays.asList(c.getNames()));
			if (list.contains("/" + cn)) {
				return c;
			}
		}
		return null;
	}

}
