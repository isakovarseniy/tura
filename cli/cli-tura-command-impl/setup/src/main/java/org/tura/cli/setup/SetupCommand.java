/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.setup;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Properties;

import org.tura.cli.dsl.Artifact;

public class SetupCommand implements ISetupCommand{

    @Override
    public void downloadChrome(String version ) throws Exception {
        new DownloadChromeSeleniumWebDriver().download(version);
    }

    
    @Override
    public Object generateArtifact(List<String> properties, String artifactTargetLocation , String artifactName, String templateLocation) throws Exception {
        Artifact dsl = new Artifact();
        dsl.setArtifactName(artifactName);
        dsl.setTemplateFile(templateLocation);

        if (artifactTargetLocation == null ){
            artifactTargetLocation = System.getProperty("java.io.tmpdir");
            if (!artifactTargetLocation.endsWith(File.separator)) {
                artifactTargetLocation = artifactTargetLocation+File.separator;
            }
        }
        dsl.setArtifactTargerLocation(artifactTargetLocation);

        if (properties != null) {
            for (String p : properties) {
                int index = p.indexOf(":");
                if ( index != -1) {
                    String key = p.substring(0,index);
                    String value = p.substring(index+1);
                    dsl.addProperties(key, value);
                }else {
                    throw new IllegalArgumentException("Wrong property " + p);
                }
            }
        }
        dsl.run();
        return null;
    }



    @Override
    public Object createPropertiesFile(String propertiesFileName, List<String> vars) throws Exception {
		Properties prop = new Properties();
		for (String str : vars) {
			int index = str.indexOf("=");

			String v0 = str.substring(0,index);
			String v1 = str.substring(index+1);
			prop.put(v0, v1);
		}		
		File f  = new File(propertiesFileName);
		FileOutputStream out = new FileOutputStream(f);
		prop.store(out, null);
		return null;
    }
    

}
