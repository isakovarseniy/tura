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

public class ConfigConstants {
	public static String KEY_TURA_WORKING_DIRECTORY= "TURA_WORKING_DIRECTORY";
	
	public static String KEY_TURA_WORKING_DIRECTORY_PATTERN ="TURA_WORKING_DIRECTORY_PATTERN";
	
	public static String KEY_TURA_HOME = "TURA_HOME";

	public static String KEY_DOCKER_HOST_WIN = "docker_host_win";
	
	public static String KEY_DOCKER_HOST_MAC = "docker_host_mac";
	
	public static String KEY_WORKSPACE = "WORKSPACE";
	
	public static String KEY_MODULES = "MODULES";

	public static String TURA_WORKING_DIRECTORY = System.getProperty(KEY_TURA_WORKING_DIRECTORY);

	public static String TURA_WORKING_DIRECTORY_PATTERN = System.getProperty(KEY_TURA_WORKING_DIRECTORY_PATTERN);
	
	public static String RESOURCE_HOME = TURA_WORKING_DIRECTORY+"/resources";
	
	public static String TURA_HOME = System.getProperty(KEY_TURA_HOME);

	public static String TURA_WORKSPACE = System.getProperty(KEY_WORKSPACE);
	
	public static String TURA_MODULES = System.getProperty(KEY_MODULES);
	
	public static String TURA_CONFIG_REPOSITORY=getTuraRepository();

    public static String KEY_DOCKER_HOST = "DOCKER_HOST";
	
    public static String DOCKER_HOST = System.getProperty(KEY_DOCKER_HOST);;
    
	public static String TURA_LINK = "turaLink";
    
	
	public static String getTuraRepository() {
		
		String repo_home = System.getProperty("REPO_HOME");
		if ( repo_home == null) {
			return TURA_HOME+"/cli/etc";
		}else {
			return repo_home;
		}
	}
	
	
	
}
