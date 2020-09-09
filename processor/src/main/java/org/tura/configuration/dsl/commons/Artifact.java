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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.felix.gogo.jline.command.DockerCommand;
import org.apache.felix.service.command.CommandSession;

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
	protected CommandSession session;

    
    public Artifact(CommandSession session) {
    	this.session = session;
    }
    
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
            if (!artifactTargerLocation.endsWith(File.separator)) {
                artifactTargerLocation = artifactTargerLocation+File.separator;
            }
            
        }
        generate();
        if (containerId != null){
        	DockerCommand cmd = new DockerCommand();
        	cmd.setSession(session);
        	cmd.mkdir(containerId, saveArtifactTargerLocation);
        	cmd.copyFilesToDocker( containerId , artifactTargerLocation+artifactName, saveArtifactTargerLocation,  artifactName);
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
        if ( ! resource.exists() ) {
        	return;
        }
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

