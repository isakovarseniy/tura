package org.tura.your-application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.felix.gogo.jline.ext.ProcessorExtension;
import org.apache.felix.service.command.CommandProcessor;

public class YourProcessorExtension implements ProcessorExtension{

	public static String APP_HOME = "APP_HOME";
	public static String APP_CONFIG_REPOSITORY = System.getProperty(APP_HOME)+"/processor-extension/etc";
	
	
	@Override
	public void initProcessor(CommandProcessor processor) {
		
	}

	@Override
	public Map<String, String> getDirMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("your-app", APP_CONFIG_REPOSITORY+ "/your-app");
		return map;
	}

	@Override
	public Collection<String> getInitScripts() {
		ArrayList<String> list = new ArrayList<>();
		list.add(APP_CONFIG_REPOSITORY+"/your-init-gogo");
		return list;
	}

}
