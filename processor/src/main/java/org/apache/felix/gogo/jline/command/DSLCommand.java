/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command;

import org.apache.felix.gogo.jline.Executable;
import org.apache.felix.gogo.jline.SessionAware;
import org.apache.felix.service.command.CommandSession;

import picocli.CommandLine.Command;

@Command(name="dsl")
public class DSLCommand implements Executable, SessionAware {

	protected CommandSession session;

	@Override
	public void setSession(CommandSession session) {
		this.session = session;
	}
	
	@Override
	public Object execute() throws Exception {
		return null;
	}

}
