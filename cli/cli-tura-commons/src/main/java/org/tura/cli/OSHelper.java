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

package org.tura.cli;

public class OSHelper {
	
	
	private static String os_name = System.getProperty("os.name").toLowerCase();
	private static String os_arch = System.getProperty("os.arch").toLowerCase();

	
	
	public static boolean isX86() {
		return (os_arch.indexOf("x86") >= 0 || os_arch.indexOf("amd") >= 0  );
	}

	public static boolean isARM() {
		return (os_arch.indexOf("aarch") >= 0  );
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
}
