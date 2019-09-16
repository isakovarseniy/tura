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
package org.tura.configuration.dsl.commons;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FilenameUtils;
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

			Path link = Paths.get(this.targetDirectory + "/apache-maven");

			File[] matchingFiles = new File(this.targetDirectory).listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.startsWith("apache-maven");
				}
			});

			for (File f : matchingFiles) {
				if (!f.isDirectory()){
					continue;
				}
				Path trg = f.toPath();
				if (Files.exists(link)) {
					Files.delete(link);
				}
				Files.createSymbolicLink(link, trg);

				new File(this.targetDirectory + "/apache-maven/bin/mvn").setExecutable(true);
				new File(this.targetDirectory + "/apache-maven/bin/mvnDebug").setExecutable(true);

			}

		}

	}

}
