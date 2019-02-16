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
package org.tura.configuration.dsl.sa;

import java.io.File;
import java.io.FileFilter;

import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.configuration.dsl.commons.CopyArtifact;

public class CopyMonthlyFiles extends CopyArtifact<CopyMonthlyFiles> {

	private  String targetPath = ConfigConstants.RESOURCE_HOME;
	private  String sourceName = "${application}/assets/${file}";

	public CopyMonthlyFiles() {
		this.setTargetLocation(targetPath);
		this.setSourceResource(sourceName);
	}

	public CopyMonthlyFiles setRelativePath(String relativePath) {
		targetPath = targetPath + File.separator + relativePath;
		this.setTargetLocation(targetPath);
		return this;
	}

	@Override
	public CopyMonthlyFiles setApplication(String application) {
		super.setApplication(application);
		return this;
	}

	private void deleteFiles() {
		File directory = new File(targetPath);

		File[] toBeDeleted = directory.listFiles(new FileFilter() {
			public boolean accept(File theFile) {
				if (theFile.isFile()) {
					return theFile.getName().startsWith("MonthlyData_2017");
				}
				return false;
			}
		});
		if (toBeDeleted != null) {

			for (File deletableFile : toBeDeleted) {
				deletableFile.delete();
			}
		}
	}

	@Override
	public void copyFromExternal() throws Exception {
		deleteFiles();
		sourceName = ConfigConstants.TURA_CONFIG_REPOSITORY + File.separator + sourceName;

		this.setTargetName("MonthlyData_2017-02-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-02-01.csv"));
		super.copyFromExternal();

		this.setTargetName("MonthlyData_2017-03-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-03-01.csv"));
		super.copyFromExternal();

		this.setTargetName("MonthlyData_2017-04-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-04-01.csv"));
		super.copyFromExternal();

		this.setTargetName("MonthlyData_2017-05-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-05-01.csv"));
		super.copyFromExternal();

		this.setTargetName("MonthlyData_2017-06-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-06-01.csv"));
		super.copyFromExternal();

		this.setTargetName("MonthlyData_2017-07-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-07-01.csv"));
		super.copyFromExternal();

		this.setTargetName("MonthlyData_2017-08-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-08-01.csv"));
		super.copyFromExternal();

		this.setTargetName("MonthlyData_2017-09-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-09-01.csv"));
		super.copyFromExternal();

		this.setTargetName("MonthlyData_2017-10-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-10-01.csv"));
		super.copyFromExternal();

		this.setTargetName("MonthlyData_2017-11-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-11-01.csv"));
		super.copyFromExternal();

	}

	@Override
	public void copyFromClassPath() throws Exception {

		deleteFiles();

		this.setTargetName("MonthlyData_2017-02-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-02-01.csv"));
		super.copyFromClassPath();

		this.setTargetName("MonthlyData_2017-03-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-03-01.csv"));
		super.copyFromClassPath();

		this.setTargetName("MonthlyData_2017-04-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-04-01.csv"));
		super.copyFromClassPath();

		this.setTargetName("MonthlyData_2017-05-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-05-01.csv"));
		super.copyFromClassPath();

		this.setTargetName("MonthlyData_2017-06-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-06-01.csv"));
		super.copyFromClassPath();

		this.setTargetName("MonthlyData_2017-07-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-07-01.csv"));
		super.copyFromClassPath();

		this.setTargetName("MonthlyData_2017-08-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-08-01.csv"));
		super.copyFromClassPath();

		this.setTargetName("MonthlyData_2017-09-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-09-01.csv"));
		super.copyFromClassPath();

		this.setTargetName("MonthlyData_2017-10-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-10-01.csv"));
		super.copyFromClassPath();

		this.setTargetName("MonthlyData_2017-11-01.csv");
		this.setSourceResource(
				sourceName.replace("${application}", application).replace("${file}", "MonthlyData_2017-11-01.csv"));
		super.copyFromClassPath();

	}

}
