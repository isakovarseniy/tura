/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.setup;

import java.io.File;

import org.tura.cli.ConfigConstants;
import org.tura.cli.OSHelper;
import org.tura.cli.dsl.Wget;
import org.tura.cli.dsl.WgetStatus;
import org.zeroturnaround.zip.ZipUtil;

public class DownloadChromeSeleniumWebDriver {

	String targetDirectory = ConfigConstants.RESOURCE_HOME;
	OS os;
	
	public DownloadChromeSeleniumWebDriver(){
		if (OSHelper.isWindows() ) {
			os = OS.win;
		} else if (OSHelper.isMac() && OSHelper.isX86()) {
			os = OS.mac_x86;
		} else if (OSHelper.isMac() && OSHelper.isARM()) {
			os = OS.mac_arm;
		}else if (OSHelper.isUnix() ) {
			os = OS.linux;
		}			
	}
	
	public void download(String version ) throws Exception {

		File dir =  new File(this.targetDirectory);
        if ( !dir.exists()) {
            dir.mkdirs();
        }
		
		if (!new File(this.targetDirectory + "/" + os.fileName).exists()) {

			WgetStatus status = Wget.wGet(targetDirectory + "/" + os.fileName, os.url.replace("${version}", version), System.err);
			if (!status.equals(WgetStatus.Success)) {
				throw new RuntimeException("Error during downloadin chrome web driver");
			}
			ZipUtil.unpack(new File(this.targetDirectory + "/" + os.fileName), new File(this.targetDirectory));
			new File(this.targetDirectory + "/chromedriver" ).setExecutable(true);
		}

	}

	public enum OS {
		win("https://chromedriver.storage.googleapis.com/${version}/chromedriver_win32.zip","chromedriver_win32.zip"), 
		mac_x86("https://chromedriver.storage.googleapis.com/${version}/chromedriver_mac64.zip","chromedriver_mac64.zip"), 
		mac_arm("https://chromedriver.storage.googleapis.com/${version}/chromedriver_mac_arm64.zip","chromedriver_mac_arm64.zip"),
		linux("https://chromedriver.storage.googleapis.com/${version}/chromedriver_linux64.zip","chromedriver_linux64.zip");
		
		String url;
		String fileName;

		OS(String url, String fileName) {
			this.url = url;
			this.fileName = fileName;
		}
	}

	
}
