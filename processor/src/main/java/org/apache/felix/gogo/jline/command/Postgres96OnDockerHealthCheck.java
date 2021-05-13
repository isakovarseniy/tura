/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command;

import picocli.CommandLine.Option;

public class Postgres96OnDockerHealthCheck extends HealthCheck {

    @Option(names = "--name")
    private String name;

    @Option(names = "--repeats")
    private int rpt;
    
    
    public String getCommand() {
        return String.format(" docker exec %s sh -c \"/usr/lib/postgresql/9.6/bin/psql -U postgres postgres -c 'SELECT 1;' \" ",name);
    }


    @Override
    public int getNumberOrRepeats() {
        return rpt;
    }

}