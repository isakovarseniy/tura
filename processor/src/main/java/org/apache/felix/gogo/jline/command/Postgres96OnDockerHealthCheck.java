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