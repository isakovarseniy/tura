/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.configuration.dsl.commons;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;

import org.apache.commons.io.FilenameUtils;
import org.apache.felix.gogo.jline.command.ExecuteExternalOperation;
import org.zeroturnaround.zip.ZipUtil;

public class DownloadMaven {

	String targetDirectory = ConfigConstants.RESOURCE_HOME;

	public void download() throws Exception {
		String url = System.getProperty(ConfigConstants.MAVENURL);
		String filename = FilenameUtils.getName(new URL(url).getPath());
		
		File dir =  new File(this.targetDirectory);
        if ( !dir.exists()) {
            dir.mkdirs();
        }

        if (!new File(this.targetDirectory + "/" + filename).exists()) {

			WgetStatus status = Wget.wGet(targetDirectory + "/" + filename, url);
			if (!status.equals(WgetStatus.Success)) {
				throw new RuntimeException("Error during downloadin maven");
			}
			ZipUtil.unpack(new File(this.targetDirectory + "/" + filename), new File(this.targetDirectory));

			File[] matchingFiles = new File(this.targetDirectory).listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.startsWith("apache-maven");
				}
			});

			for (File f : matchingFiles) {
				if (f.isDirectory()){
					f.renameTo(new File(this.targetDirectory + "/apache-maven"));
					new File(this.targetDirectory + "/apache-maven/bin/mvn").setExecutable(true);
					new File(this.targetDirectory + "/apache-maven/bin/mvnDebug").setExecutable(true);
					break;
				}

			}
			
			new ExecuteExternalOperation( this.targetDirectory + "/apache-maven/bin/mvn"+" help:evaluate -Dexpression=settings.localRepository  -q -DforceStdout> "+this.targetDirectory+"/../"+ConfigConstants.MAVEN_REPO_LINK )
			.execute();

		}

	}

}
