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
package org.tura.configuration.dsl.jboss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.tura.configuration.dsl.commons.CopyArtifact;
import org.zeroturnaround.zip.ZipUtil;

public class DoDeploy extends CopyArtifact<DoDeploy> {

	private static String targetPath = "${JBOSS_HOME}/standalone/deployments";

	public DoDeploy(String jboss_home, String targetName) {
		this.setTargetLocation(targetPath.replace("${JBOSS_HOME}", jboss_home));
		this.setTargetName(targetName);
	}

	public void doDeploy() throws Exception {
		copyFromExternal();
	}

	public void doDeployExploaded() throws Exception {
		FileUtils.deleteDirectory(new File(targetLocation + "/" + targetName));
		ZipUtil.unpack(new File(srcResource), new File(targetLocation + "/" + targetName));
		touch(new File(targetLocation + "/" + targetName + ".dodeploy"));
	}

	public static void touch(File file) throws IOException {
		long timestamp = System.currentTimeMillis();
		touch(file, timestamp);
	}

	public static void touch(File file, long timestamp) throws IOException {
		if (!file.exists()) {
			new FileOutputStream(file).close();
		}

		file.setLastModified(timestamp);
	}

}
