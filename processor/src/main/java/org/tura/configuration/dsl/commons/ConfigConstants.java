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
package org.tura.configuration.dsl.commons;

public class ConfigConstants {
	public static String TURA_WORKING_DIRECTORY= System.getProperty("user.home")+"/.tura";
	public static String RESOURCE_HOME = TURA_WORKING_DIRECTORY+"/resources";
	public static String MAVEN_HOME = RESOURCE_HOME+"/apache-maven";
	
	public static String TURA_HOME = "TURA_HOME";
	public static String TURA_CONFIG_REPOSITORY=System.getProperty(TURA_HOME)+"/processor/etc";
	
	
	public static String CHROMEDRIVERVERSION="chromedriverversion";
	public static String MAVENURL="mavenurl";
	public static String DOCKER_CONFIG = "DOCKER_CONFIG";
	
	
	
	
	
}
