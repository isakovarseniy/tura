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

import org.apache.felix.service.command.CommandSession;

public class ArtifactGenerator extends Artifact<ArtifactGenerator>{

    public ArtifactGenerator( String artifactTargetLocation, String artifactName, String template, CommandSession session) {
    	super(session);
		this.setArtifactTargerLocation(artifactTargetLocation);
		this.setArtifactName(artifactName);
		this.setTemplateFile(template);
    }
    
	
	
    protected void collectProperties() throws Exception {
    }
	
}
