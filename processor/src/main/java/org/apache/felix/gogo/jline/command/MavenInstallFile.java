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

import java.io.File;
import java.util.Collections;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;
import org.tura.configuration.dsl.commons.ConfigConstants;

import picocli.CommandLine.Option;

public class MavenInstallFile implements Runnable{

	@Option(names = "--file", description = "file location", required = true)
	private String file;
	
	@Option(names = "--groupId", description = "group id", required = true)
	private String groupId;
	
	@Option(names = "--artifactId", description = "artifact id", required = true)
	private String artifactId;
	
	@Option(names = "--version", description = "version", required = true)
	private String version;
	
	@Option(names = "--packaging", description = "packaging", required = true)
	private String packaging;
	
	
	@Override
	public void run() {
			
		InvocationRequest request = new DefaultInvocationRequest();
		request.setGoals( Collections.singletonList( "install:install-file" ) );
		
		String maven_option = "";
		if ( file != null){
			maven_option = maven_option+" -Dfile="+file;
		}
		
		if ( groupId != null){
			maven_option = maven_option+" -DgroupId="+groupId;
		}
		
		if ( artifactId != null){
			maven_option = maven_option+" -DartifactId="+artifactId;
		}

		if ( version != null){
			maven_option = maven_option+" -Dversion="+version;
		}
		
		if ( packaging != null){
			maven_option = maven_option+" -Dpackaging="+packaging;
		}
		
		request.setMavenOpts(maven_option);
		
		Invoker invoker = new DefaultInvoker();
		invoker.setMavenHome(new File(ConfigConstants.MAVEN_HOME));
		InvocationResult result;
		try {
			result = invoker.execute( request );
		} catch (MavenInvocationException e) {
			throw new RuntimeException(e);
		}
		 
		if ( result.getExitCode() != 0 )
		{
		    throw new IllegalStateException( "Build failed." );
		}		
		
	}

}
