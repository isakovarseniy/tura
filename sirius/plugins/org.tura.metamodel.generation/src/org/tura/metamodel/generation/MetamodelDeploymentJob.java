/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.generation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.tura.metamodel.commons.QueryHelper;

import recipe.DeploymentComponent;
import recipe.Infrastructure;
import recipe.Recipe;

public class MetamodelDeploymentJob extends Job {

	public static String CONSOLE_NAME = "Metamodel output";
	private IEditorPart editorPart;
	private Infrastructure infrastructure;

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

			if (recipe.getDeplymentStep() == null || recipe.getDeplymentStep().size() == 0) {
				notifyError("Deployment Sequence is not defined properly");
				return Status.OK_STATUS;
			}

			if (recipe.getStartSeq() == null) {
				notifyError("Start step  is not defined");
				return Status.OK_STATUS;
			}

			MessageConsole myConsole = findConsole(CONSOLE_NAME);
			MessageConsoleStream out = myConsole.newMessageStream();

			System.setOut(new PrintStream(out));
			System.setErr(new PrintStream(out));

			DeploymentComponent component = recipe.getStartSeq().getFirstStep();

			int i = 0;
			for (; component != null; component = component.getDeploymentComponentLink(), i++) {
			}

			component = recipe.getStartSeq().getFirstStep();

			monitor.beginTask("Component deployment" , i);

			while (component != null) {

				monitor.subTask( component.getMapper().getName());

				if (!component.isSkip() &&  component.getMapper().getArtifactExecutionString() != null) {
					System.out.println("Execution: " + component.getMapper().getArtifactExecutionString());
					Process proc = Runtime.getRuntime().exec(component.getMapper().getArtifactExecutionString());

					StreamPumper inputPumper = new StreamPumper(proc.getInputStream());
					StreamPumper errorPumper = new StreamPumper(proc.getErrorStream());

					// starts pumping away the generated output/error
					inputPumper.start();
					errorPumper.start();

					// Wait for everything to finish
					proc.waitFor();
					inputPumper.join();
					errorPumper.join();
					proc.destroy();

					System.out.println("Execution result : " + proc.exitValue());
					if (proc.exitValue() != 0) {
						System.err.println("Exception during deployment " + component.getName());
						throw new Exception("Exception during deployment " + component.getName());
					}

				} else {
					System.err.println(component.getName() + " has empty execution string");
				}
				component = component.getDeploymentComponentLink();
				monitor.worked(1);
			}
		} catch (Exception e) {
			LogUtil.log(e);
		} finally {
			System.setOut(oldOut);
			System.setErr(olderr);
		}
		return Status.OK_STATUS;
	}

	private void notifyError(final String message) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog dialog = new MessageDialog(Display.getDefault().getActiveShell(), "Tura", null, message,
						MessageDialog.ERROR, new String[] { "Ok" }, 0);
				dialog.open();
			}
		});

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
