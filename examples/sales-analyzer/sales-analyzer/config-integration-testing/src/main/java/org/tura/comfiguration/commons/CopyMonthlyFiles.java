package org.tura.comfiguration.commons;

import java.io.File;
import java.io.FileFilter;

import org.tura.comfiguration.artifacts.CopyArtifact;

public class CopyMonthlyFiles extends CopyArtifact<CopyMonthlyFiles> {

	private static String targetPath = System.getProperty("user.home");
	private static String sourceName = "${application}/assets/${file}";

	public CopyMonthlyFiles() {
		this.setTargetLocation(targetPath);
	}

	@Override
	public CopyMonthlyFiles setApplication(String application) {
		super.setApplication(application);
		return this;
	}

	@Override
	public void copyFromClassPath() throws Exception {

		File directory = new File(targetPath);

		File[] toBeDeleted = directory.listFiles(new FileFilter() {
			public boolean accept(File theFile) {
				if (theFile.isFile()) {
					return theFile.getName().startsWith("MonthlyData_2017");
				}
				return false;
			}
		});

		for (File deletableFile : toBeDeleted) {
			deletableFile.delete();
		}

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
