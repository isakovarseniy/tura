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
package org.apache.felix.gogo.jline.command;

import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.configuration.dsl.commons.DownloadChromeSeleniumWebDriver;

public class InstallChromeDriver extends InstallCommand{
	
	public void run() {
  		new DownloadChromeSeleniumWebDriver()
			.setDriverVersion(System.getProperty(ConfigConstants.CHROMEDRIVERVERSION))
			.setTargetDirectory(ConfigConstants.RESOURCE_HOME)
			.download();
	}

}
