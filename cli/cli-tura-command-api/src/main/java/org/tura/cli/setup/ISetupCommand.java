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

import java.util.List;

public interface ISetupCommand {

    void downloadChrome( String version) throws Exception;
    
    public Object generateArtifact(List<String> properties, String artifactTargetLocation , String artifactName, String templateLocation) throws Exception;

    Object createPropertiesFile(String propertiesFileName, List<String> vars) throws Exception;
    

}
