/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
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
package org.tura.comfiguration.commons;

import org.tura.comfiguration.artifacts.CopyArtifact;

public class CopySalesAnalyzerDB extends CopyArtifact<CopySalesAnalyzerDB> {

	private static String targetPath = System.getProperty("user.home");
	private static String targetName = "SalesAnalyzerDB.dump";
	private static String sourceName = "${application}/assets/SalesAnalyzerDB.dump";

	public CopySalesAnalyzerDB() {
		this.setTargetLocation(targetPath);
		this.setTargetName(targetName);
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
//		ZipUtil.unpack(new File(this.targetLocation+"/"+targetName+".zip"), new File(this.targetLocation));
	}	
	
	
}
