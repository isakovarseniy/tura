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
package org.apache.felix.gogo.jline.command;

import org.tura.configuration.dsl.commons.DownloadMaven;

public class InstallMaven extends InstallCommand {

	public void run() {
		try {
			new DownloadMaven().download();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
