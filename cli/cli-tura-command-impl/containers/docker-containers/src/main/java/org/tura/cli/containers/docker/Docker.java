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

package org.tura.cli.containers.docker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URI;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.tura.cli.ConfigConstants;
import org.tura.cli.OSHelper;
import org.tura.cli.containers.ContainerConfig;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.async.ResultCallback;
import com.github.dockerjava.api.command.ExecCreateCmd;
import com.github.dockerjava.api.command.ExecCreateCmdResponse;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.api.model.Image;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.httpclient5.ApacheDockerHttpClient;
import com.github.dockerjava.transport.DockerHttpClient;


public class Docker {

	protected DockerClient dockerClient;
	

	public Docker(  ){
	}

	public Object get(String val ) throws Exception{
		return System.getProperty(val);
	}

	protected void _init() {
	  try{	
		if ( dockerClient != null){
			return;
		}

		String dockerHost = null;
		if (OSHelper.isMac()) {
			dockerHost = (String) this.get(ConfigConstants.KEY_DOCKER_HOST_MAC);
		}
		if (OSHelper.isWindows()) {
			dockerHost = (String) this.get(ConfigConstants.KEY_DOCKER_HOST_WIN);;
		}
        DockerHttpClient  dockerHttpClient =  new ApacheDockerHttpClient.Builder()
                            .dockerHost( new URI(dockerHost))
                            .build();

		dockerClient = DockerClientBuilder.getInstance()
		                .withDockerHttpClient(dockerHttpClient)
		    			.build();
	  }catch(Exception e){
		throw new RuntimeException();
	  }
	}

	protected Container findContainer(String cn) {
		List<Container> containers = dockerClient.listContainersCmd().withShowAll(true).exec();
		for (Container c : containers) {
			List<String> list = new ArrayList<String>(Arrays.asList(c.getNames()));
			if (list.contains("/" + cn)) {
				return c;
			}
		}
		return null;
	}

	protected Image findImage(String cn) {
		List<Image> images = dockerClient.listImagesCmd().withShowAll(true).exec();
		for (Image c : images) {
			if (c.getRepoTags() == null) {
				continue;
			}
			List<String> tags = Arrays.asList(c.getRepoTags());
			if (tags.contains(cn)) {
				return c;
			}
		}
		return null;
	}

	public void copyFilesToDocker(String containerId, String source, String targetDir,  boolean unzip, String var) throws Exception {
		_init();
		String targetArtifact = Paths.get(source).getFileName().toString();
		dockerClient.copyArchiveToContainerCmd(containerId).withRemotePath(targetDir).withHostResource(source).exec();
		if ( unzip){
	        List<String> lcmd = new ArrayList<>();
	        lcmd.add("sh");
	        lcmd.add("-c");
	        lcmd.add(String.format( "unzip %s/%s -d %s",targetDir,targetArtifact,targetDir));
	        String[] cmd =   lcmd.toArray(new String[3]);
			
			cmd(containerId, cmd ,null,false,var);
		}

	}

	public void copyFilesFromDocker(String containerId, String source, String targetDir) throws Exception {
		_init();
    	InputStream inStream = 	dockerClient.copyArchiveFromContainerCmd(containerId,source).exec() ;
        FileOutputStream fos = new FileOutputStream(new File(targetDir));
        IOUtils.copy(inStream, fos);
        fos.close();            
	}


	public void mkdir(String containerId, String targetDir,String var) throws Exception {
		cmd(containerId,new String[]{"mkdir", "-p", targetDir},null, false,var);
	}

	public void rm(String containerId, String targetDir,String var) throws Exception {
		cmd(containerId,new String[]{"rm", "-Rf", targetDir},null,false,var);
	}

	public Object cmd(String containerId, String[] cmd, PrintStream stream,boolean isBinaryOutput) throws Exception {
		return cmd(containerId,cmd,stream,isBinaryOutput,null);
	}


	public Object cmd(String containerId, String[] cmd, PrintStream stream, boolean isBinaryOutput , String var) throws Exception {
		_init();

		ContainerConfig conf = null;
		if (var != null) {
			conf = (ContainerConfig) get(var);
		}

		boolean attached = false;
		if ( stream != null ) {
			attached = true;
		}
		ExecCreateCmd execmd = dockerClient.execCreateCmd(containerId)
				.withAttachStdout(attached)
				.withAttachStderr(attached)
				.withCmd(cmd);
		if ( conf != null && conf.getUser() != null ){
			execmd.withUser(conf.getUser());
		}

		ExecCreateCmdResponse exe = execmd.exec();


		dockerClient.execStartCmd(exe.getId()).exec(new ResultCallback.Adapter<Frame>() {
			@Override
			public void onNext(Frame frame) {
				if (isBinaryOutput) {
					try {
						stream.write(frame.getPayload());
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}else {
					stream.println(frame.toString());
				}
				super.onNext(frame);
			}
		}).awaitCompletion();

		while (true) {
			Long code = dockerClient.inspectExecCmd(exe.getId()).exec().getExitCodeLong();
			if (code == null ) {
				Thread.sleep(1000);
			}else {
				return code;
			}
		}
	}

}
