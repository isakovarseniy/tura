/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
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
package org.tura.comfiguration.artifacts;

import java.io.File;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.tura.comfiguration.artifacts.docker.Docker;

import com.github.dockerjava.api.command.CreateContainerResponse;

public class CopyArtifact<T> {

	protected String srcResource;
	protected String targetLocation;
	protected String targetName;
	protected String application;
	protected String serverType;
	protected CreateContainerResponse container;

	@SuppressWarnings({ "unchecked" })
	public T setApplication(String application) {
		this.application = application;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setServerType(String serverType) {
		this.serverType = serverType;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setSourceResource(String srcResource) {
		this.srcResource = srcResource;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setTargetLocation(String targetLocation) {
		this.targetLocation = targetLocation;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setTargetName(String targetName) {
		this.targetName = targetName;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setContainer(CreateContainerResponse container) {
		this.container = container;
		return (T) this;
	}

	public void copyFromClassPath() throws Exception {
		if (container == null) {
			copyFromClassPathNoContainer();
		} else {
			String saveTargetLocation = targetLocation;
			targetLocation = System.getProperty("java.io.tmpdir");
			copyFromClassPathNoContainer();
			Docker.mkdir(container, saveTargetLocation);
			Docker.copyFilesToDocker(container, targetLocation, saveTargetLocation, targetName);
		}
	}

	public void copyFromExternal() throws Exception {
		if (container == null) {
			copyFromExternalNoContainer();
		} else {
			Docker.mkdir(container, targetLocation);
			Docker.copyFilesToDocker(container, new File(srcResource).getParent(), targetLocation, targetName);
		}
	}

	private void copyFromClassPathNoContainer() throws Exception {
		InputStream in = null;
		try {
			in = this.getClass().getClassLoader().getResourceAsStream(srcResource);

			File f = new File(targetLocation);
			f.mkdirs();

			Path to = Paths.get(targetLocation + "/" + targetName);

			CopyOption[] options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING };

			Files.copy(in, to, options);
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

	private void copyFromExternalNoContainer() throws Exception {
		File f = new File(targetLocation);
		f.mkdirs();

		Path from = Paths.get(srcResource);
		Path to = Paths.get(targetLocation + "/" + targetName);

		CopyOption[] options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING };

		Files.copy(from, to, options);
	}

}
