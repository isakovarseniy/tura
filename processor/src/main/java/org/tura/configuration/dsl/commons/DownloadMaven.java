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
