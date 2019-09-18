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
package org.tura.configuration.dsl.jboss;

import org.tura.configuration.dsl.commons.Artifact;

public class LdapPropertyFileForTesitng extends Artifact<LdapPropertyFileForTesitng>{

    private static String artifactPath = System.getProperty("user.home");
    private static String artifactName = "ldap.properties";
    
    private static String templatePath="${application}/templates/ldap.properties";
	
	public LdapPropertyFileForTesitng() {
		    this.setArtifactTargerLocation(artifactPath);
			this.setArtifactName(artifactName);
			this.setTemplateFile(templatePath);
			this.setServerType("");
	}
	
   @Override
	public LdapPropertyFileForTesitng setApplication(String application) {
		super.setApplication(application);
		this.setTemplateFile(this.templateFile.replace("${application}", application));
		return this;
	}

		

}
