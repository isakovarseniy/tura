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

import java.io.File;

import org.tura.comfiguration.artifacts.Wget;
import org.tura.comfiguration.artifacts.WgetStatus;
import org.zeroturnaround.zip.ZipUtil;

public class DownloadChromeSeleniumWebDriver {

	String targetDirectory;
	String version;
	OS os;
	private static String os_name = System.getProperty("os.name").toLowerCase();
	
	public DownloadChromeSeleniumWebDriver(){
		if (isWindows()) {
			os = OS.win;
		} else if (isMac()) {
			os = OS.mac;
		} else if (isUnix()) {
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

	public static boolean isWindows() {

		return (os_name.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (os_name.indexOf("mac") >= 0);

	}

	public static boolean isUnix() {

		return (os_name.indexOf("nix") >= 0 || os_name.indexOf("nux") >= 0 || os_name.indexOf("aix") > 0 );
		
	}

	public static boolean isSolaris() {

		return (os_name.indexOf("sunos") >= 0);

	}
	
	public static void main(String[] args) {
  		new DownloadChromeSeleniumWebDriver()
			.setDriverVersion("2.40")
			.setTargetDirectory(System.getProperty("user.home"))
			.download();

	}

	
}
