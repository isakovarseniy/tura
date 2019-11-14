package org.tura.metamodel.commons;

public class OSHelper {
	
	
	private static String os_name = System.getProperty("os.name").toLowerCase();

	
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
