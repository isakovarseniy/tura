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

public class LdapOnDockerHealtCheck extends HealthCheck{

	
    @Option(names = "--name")
    private String name;
	
    @Option(names = "--repeats")
    private int rpt;

    @Option(names = "--user")
    private String user;
    
    @Option(names = "--password")
    private String password;
    
    @Option(names = "--baseDn")
    private String baseDn;
    
    
	@Override
	public String getCommand() {
        return String.format( "docker exec %s  sh -c \"ldapsearch -x -D %s -w %s -H ldap://localhost -b %s -s sub \\\"(objectClass=user)\\\"\" ",name,user,password,baseDn);
	}

    @Override
    public int getNumberOrRepeats() {
        return rpt;
    }

}
