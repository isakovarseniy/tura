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
		new File(targetLocation + "/" + targetName).mkdirs();		
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
