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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.tura.cli.dsl.HealthCheck;

public class Neo4jHealthCheck extends HealthCheck{

    String host;

    public Neo4jHealthCheck( String host, int rpt ) {
        super(rpt);
        this.host = host;
    }

    @Override
    public int call() {
        try {
            URL url = new URL(host);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
                for (String line; (line = reader.readLine()) != null;) {
                }
            }
            return 0;
        } catch (Throwable e) {
            return -1;
        }

    }

}
