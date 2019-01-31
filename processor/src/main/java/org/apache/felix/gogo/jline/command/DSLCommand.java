package org.apache.felix.gogo.jline.command;

import org.apache.felix.gogo.jline.Executable;

import picocli.CommandLine.Command;

@Command(name="dsl")
public class DSLCommand implements Executable {

	@Override
	public Object execute() throws Exception {
		return null;
	}

}
