/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.configuration.dsl.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.felix.gogo.jline.command.DockerCommand;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class Artifact<T>  {

	private Properties properties = new Properties();
	protected String application;
	protected String serverType;
	protected ArrayList<String> cfgPath = new ArrayList<>();
	protected String templateFile;
	protected String artifactTargerLocation;
	protected String artifactName;
	protected String containerId;

	
	public void setTemplateFile(String templateFile) {
		this.templateFile = templateFile;
	}

	@SuppressWarnings("unchecked")
	public T setArtifactName(String artifactName) {
		this.artifactName = artifactName;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setArtifactTargerLocation(String artifactTargerLocation) {
		this.artifactTargerLocation = artifactTargerLocation;
		return (T) this;
	}

	@SuppressWarnings({ "unchecked" })
	public T setApplication(String application) {
		this.application = application;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setServerType(String serverType) {
		this.serverType = serverType;
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T addConfigPath(String path) {
		this.cfgPath.add(path);
		return (T) this;
	}
	@SuppressWarnings("unchecked")
	public T addProperties(String key, String value) {
		this.properties.put(key, value);
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T setContainerId( String containerId){
		this.containerId=containerId;
		return (T) this;
	}
	
	
	public void run() throws Exception{
		collectProperties();
		String saveArtifactTargerLocation = null;
		if (containerId != null){
			saveArtifactTargerLocation = artifactTargerLocation;
			artifactTargerLocation = System.getProperty("java.io.tmpdir");
		}
		generate();
		if (containerId != null){
			new DockerCommand().mkdir(containerId, saveArtifactTargerLocation);
			new DockerCommand().copyFilesToDocker( containerId , artifactTargerLocation+artifactName, saveArtifactTargerLocation,  artifactName);
		}
	}
	

	private void generate() throws Exception {
		FileWriter writer = null;
		try {

			/* Create and adjust the configuration */
			Configuration cfg = new Configuration();

			cfg.setObjectWrapper(new DefaultObjectWrapper());
			cfg.setDefaultEncoding("UTF-8");
			cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
			cfg.setTemplateLoader(new FreeMarkeResourceLoader());
			cfg.setLocalizedLookup(false);

			Template t = cfg.getTemplate(templateFile);

			File f = new File(artifactTargerLocation);
			f.mkdirs();

			writer = new FileWriter(   new File( new File(artifactTargerLocation) ,artifactName ));
			t.process(properties, writer);
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}

	protected void collectProperties() throws Exception {

		if (application == null || serverType == null || cfgPath == null) {
			return;
		}
		
		String path = ConfigConstants.TURA_CONFIG_REPOSITORY +"/" +  application + "/" + serverType + "/properties";
		File resource  = new File(path+"/default.properties");
		properties.load(new FileInputStream(resource));

		for (String configPath : cfgPath) {
			path = ConfigConstants.TURA_CONFIG_REPOSITORY+"/"+application + "/" + serverType + "/properties";
			StringTokenizer tokenizer = new StringTokenizer(configPath, "/");
			while (tokenizer.hasMoreElements()) {
				String part = tokenizer.nextToken();
				resource = new File( path + "/" + part + ".properties");
				if (!resource.exists()) {
					resource = new File(path + "/" + part + "/default.properties");
				}
				if (!resource.exists()) {
					throw new RuntimeException("Resource " + path + "/" + part + " not found");
				}
				properties.load(new FileInputStream(resource));
				path = path + "/" + part;
			}
		}
		
		for (Object k : properties.keySet()) {
			String key = (String) k;
			String value = properties.getProperty(key);
			while ( value.indexOf("${")  !=  -1 ) {
				int startIndex = value.indexOf("${") ;
				int endIndex = value.indexOf("}",startIndex);
				String subkey=value.substring(startIndex+2,endIndex);
				String subValue = properties.getProperty(subkey);
				if (subValue != null) {
					value =value.replace("${"+subkey+"}", subValue);
				}
			}
			properties.put(key, value);
		}
		
	}

}
