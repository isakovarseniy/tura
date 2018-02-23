package org.tura.comfiguration.artifacts.jboss;

import java.io.File;

import org.tura.comfiguration.artifacts.CopyArtifact;
import org.zeroturnaround.zip.ZipUtil;

public class CopySalesAnalyzerDB extends CopyArtifact<CopySalesAnalyzerDB> {

	private static String targetPath = System.getProperty("user.home");
	private static String targetName = "SalesAnalyzerDB.h2.db";
	private static String sourceName = "${application}/assets/SalesAnalyzerDB.h2.db.zip";

	public CopySalesAnalyzerDB() {
		this.setTargetLocation(targetPath);
		this.setTargetName(targetName+".zip");
	}

	@Override
	public CopySalesAnalyzerDB setApplication(String application) {
		super.setApplication(application);
		this.setSourceResource(sourceName.replace("${application}", application));
		return this;
	}

	@Override
	public void copyFromClassPath() throws Exception {
		super.copyFromClassPath();
		ZipUtil.unpack(new File(this.targetLocation+"/"+targetName+".zip"), new File(this.targetLocation));
	}	
	
	
}
