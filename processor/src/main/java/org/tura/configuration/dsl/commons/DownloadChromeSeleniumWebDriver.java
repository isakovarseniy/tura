/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.configuration.dsl.commons;

import java.io.File;

import org.tura.metamodel.commons.OSHelper;
import org.zeroturnaround.zip.ZipUtil;

public class DownloadChromeSeleniumWebDriver {

	String targetDirectory =ConfigConstants.RESOURCE_HOME;
	String version;
	OS os;
	
	public DownloadChromeSeleniumWebDriver(){
		if (OSHelper.isWindows()) {
			os = OS.win;
		} else if (OSHelper.isMac()) {
			os = OS.mac;
		} else if (OSHelper.isUnix()) {
			os = OS.linux;
		}		
	}
	
	public DownloadChromeSeleniumWebDriver setTargetDirectory(String targetDirectory) {
		this.targetDirectory = targetDirectory;
		return this;
	}

	public DownloadChromeSeleniumWebDriver setDriverVersion(String version) {
		this.version = version;
		return this;
	}

	public void download() {
		File dir =  new File(this.targetDirectory);
        if ( !dir.exists()) {
            dir.mkdirs();
        }
		
		if (!new File(this.targetDirectory + "/" + os.fileName).exists()) {

			WgetStatus status = Wget.wGet(targetDirectory + "/" + os.fileName, os.url.replace("${version}", version));
			if (!status.equals(WgetStatus.Success)) {
				throw new RuntimeException("Error during downloadin chrome web driver");
			}
			ZipUtil.unpack(new File(this.targetDirectory + "/" + os.fileName), new File(this.targetDirectory));
			new File(this.targetDirectory + "/chromedriver" ).setExecutable(true);
		}

	}

	public enum OS {
		win("https://chromedriver.storage.googleapis.com/${version}/chromedriver_win32.zip","chromedriver_win32.zip"), 
		mac("https://chromedriver.storage.googleapis.com/${version}/chromedriver_mac64.zip","chromedriver_mac64.zip"), 
		linux("https://chromedriver.storage.googleapis.com/${version}/chromedriver_linux64.zip","chromedriver_linux64.zip");

		String url;
		String fileName;

		OS(String url, String fileName) {
			this.url = url;
			this.fileName = fileName;
		}
	}

	
	public static void main(String[] args) {
  		new DownloadChromeSeleniumWebDriver()
			.setDriverVersion("2.40")
			.setTargetDirectory(ConfigConstants.RESOURCE_HOME)
			.download();

	}

	
}
