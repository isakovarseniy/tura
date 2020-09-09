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

package org.tura.metamodel.processor;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;

import recipe.Infrastructure;
import recipe.Recipe;

public class MetamodelDeploymentJob extends Job {

	public static String CONSOLE_NAME = "Metamodel output";
	private IEditorPart editorPart;
	private Infrastructure infrastructure;
	private String job1 = Util.turaLocation()+"processor/tura-gogo.sh";
	private String job2 = "-c tura:build --recipeId ${recipeId} --infraId ${infraId} --modelFile ${file}";
	

	public IEditorPart getEditorPart() {
		return editorPart;
	}

	public void setEditorPart(IEditorPart editorPart) {
		this.editorPart = editorPart;
	}

	public Infrastructure getInfrastructure() {
		return infrastructure;
	}

	public void setInfrastructure(Infrastructure infrastructure) {
		this.infrastructure = infrastructure;
	}

	public MetamodelDeploymentJob(String name) {
		super(name);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		final PrintStream oldOut = System.out;
		final PrintStream olderr = System.err;

		try {
			Recipe recipe = new QueryHelper().getRecipe(infrastructure);

			MessageConsole myConsole = findConsole(CONSOLE_NAME);
			MessageConsoleStream out = myConsole.newMessageStream();

			System.setOut(new PrintStream(out));
			System.setErr(new PrintStream(out));

			boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
			Process process;

			XMIResource res  =  (XMIResource) infrastructure.eResource();
			String s = res.getURI().toPlatformString(false);
			StringTokenizer token = new StringTokenizer(s,"//");
			String projectName = token.nextToken() ;
			String resourcePath = s.substring(projectName.length()+1);
			
			IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
			IProject p  = workspace.getRoot().getProject(projectName);
			String  path = new File(  p.getLocation().toFile(), resourcePath).getPath();
			
			
			job1 = job1.replace("${user_home}" , System.getProperty("user.home"));
			job2 = job2.replace("${recipeId}" , recipe.getUid());
			job2 = job2.replace("${infraId}" , infrastructure.getUid());
			job2 = job2.replace("${file}" , path);
			
			
			if (isWindows) {
				process = Runtime.getRuntime().exec( new String[] {job1,job2} );
			} else {
				process = Runtime.getRuntime().exec(new String[] {job1,job2});
			}


			StreamPumper inputPumper = new StreamPumper(process.getInputStream());
			StreamPumper errorPumper = new StreamPumper(process.getErrorStream());

			// starts pumping away the generated output/error
			inputPumper.start();
			errorPumper.start();

			// Wait for everything to finish
			process.waitFor();
			inputPumper.join();
			errorPumper.join();
			process.destroy();

			System.out.println("Execution result : " + process.exitValue());
			if (process.exitValue() != 0) {
				System.err.println("Exception during generation ");
				throw new Exception("Exception during generation ");
			}

		} catch (Exception e) {
			LogUtil.log(e);
		} finally {
			System.setOut(oldOut);
			System.setErr(olderr);
		}
		return Status.OK_STATUS;
	}


	public MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();

		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	class StreamPumper extends Thread {
		private BufferedReader din;
		private boolean endOfStream = false;
		private static final int SLEEP_TIME = 5;

		public StreamPumper(InputStream is) {
			this.din = new BufferedReader(new InputStreamReader(is));
		}

		private void outputLog(String line) {
			System.out.println(line);
		}

		public void pumpStream() throws IOException {
			if (!endOfStream) {
				String line = din.readLine();

				if (line != null) {
					outputLog(line);
				} else {
					endOfStream = true;
				}
			}
		}

		public void run() {
			try {
				try {
					while (!endOfStream) {
						pumpStream();
						sleep(SLEEP_TIME);
					}
				} catch (InterruptedException ie) {
					// ignore
				}
				din.close();
			} catch (IOException ioe) {
				// ignore
			}
		}
	}

}
