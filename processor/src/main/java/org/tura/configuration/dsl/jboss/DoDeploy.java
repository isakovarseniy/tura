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

package org.tura.configuration.dsl.jboss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.felix.service.command.CommandSession;
import org.tura.configuration.dsl.commons.CopyArtifact;
import org.zeroturnaround.zip.ZipUtil;

public class DoDeploy extends CopyArtifact<DoDeploy> {

	private static String targetPath = "${JBOSS_HOME}/standalone/deployments";

	public DoDeploy(String jboss_home, String targetName, CommandSession session) {
		super(session);
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
