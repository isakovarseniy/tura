/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

public class ConfigConstants {
	public static String KEY_TURA_WORKING_DIRECTORY= "TURA_WORKING_DIRECTORY";
	public static String KEY_TURA_WORKING_DIRECTORY_PATTERN ="TURA_WORKING_DIRECTORY_PATTERN";
	public static String KEY_TURA_HOME = "TURA_HOME";
	
	public static String TURA_WORKING_DIRECTORY = System.getProperty(KEY_TURA_WORKING_DIRECTORY);
	public static String TURA_WORKING_DIRECTORY_PATTERN = System.getProperty(KEY_TURA_WORKING_DIRECTORY_PATTERN);
	public static String RESOURCE_HOME = TURA_WORKING_DIRECTORY+"/resources";
	
	public static String MAVEN_HOME = RESOURCE_HOME+"/apache-maven";
	
	public static String TURA_HOME = System.getProperty(KEY_TURA_HOME);
	public static String TURA_CONFIG_REPOSITORY=TURA_HOME+"/processor/etc";
	
	
	public static String CHROMEDRIVERVERSION="chromedriverversion";
	public static String MAVENURL="mavenurl";
	public static String DOCKER_CONFIG = "DOCKER_CONFIG";
	
	public static String TURA_LINK = "turaLink";
	
	public static String MAVEN_REPO_LINK = "mvnRepoLink";
	
	
	
	
	
}
