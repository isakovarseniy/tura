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
