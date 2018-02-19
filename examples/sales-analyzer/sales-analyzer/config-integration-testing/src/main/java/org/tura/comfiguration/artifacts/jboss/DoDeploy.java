package org.tura.comfiguration.artifacts.jboss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.tura.comfiguration.artifacts.CopyArtifact;
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
