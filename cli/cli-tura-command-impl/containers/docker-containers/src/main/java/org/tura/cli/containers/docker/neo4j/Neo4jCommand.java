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

package org.tura.cli.containers.docker.neo4j;

import org.tura.cli.containers.ContainerType;
import org.tura.cli.neo4j.INeo4jCommand;

public class Neo4jCommand implements INeo4jCommand{

    @Override
    public ContainerType getContainerType() {
        return ContainerType.DOCKER;
    }


    @Override
    public Object dump(String dump, String storage, String name) {
        return new Neo4jDBDump().execute(dump,storage,name);
    }

    @Override
    public Object uploaddump(String dump, String storage, String name) {
        return new Neo4jUploadDump().execute(dump,storage,name);
    }

    @Override
    public Object healthCheck(String name, String host, int rpt) {
        return new Neo4jHealthCheck(host,rpt).execute();
    }

	
}
