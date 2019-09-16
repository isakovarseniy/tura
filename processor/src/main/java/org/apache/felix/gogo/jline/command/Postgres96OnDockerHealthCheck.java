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