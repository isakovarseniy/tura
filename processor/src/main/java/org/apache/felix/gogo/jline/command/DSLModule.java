package org.apache.felix.gogo.jline.command;

import java.util.List;

import org.tura.configuration.dsl.jboss.Module;

import picocli.CommandLine.Option;

public class DSLModule extends DSLCommand{
	
	@Option(names = "--jboss_home", required = true)
	private String jboss_home;
	
	@Option(names = "--application", required = true)
	private String application;
	
	@Option(names = "--serverType", required = true)
	private String serverType;
	
	@Option(names = "--configPath", required = true)
	private List<String> configPath;
	
	@Option(names = "--property", required = true)
	private List<String> properties;
	
	@Option(names = "--container")
	private String container;

	@Option(names = "--relativeLocation", required = true)
	private String relativeLocation;
	

	@Override
	public Object execute() throws Exception {
		
		Module dsl = 
				new Module(jboss_home)
				.setApplication(application)
				.setServerType(serverType)
				.setContainerId(container)
				.setRelativeLocation(relativeLocation);
		
		for (String confPath : configPath){
			dsl.addConfigPath(confPath);
		}
		for (String p : properties){
			String[] ps = p.split(":");
			if (ps.length != 2){
				throw new IllegalArgumentException( "Wrong property "+p);
			}
			dsl.addProperties(ps[0], ps[1]);
		}
		dsl.run();
		
		return null;
	}
	
	
}
