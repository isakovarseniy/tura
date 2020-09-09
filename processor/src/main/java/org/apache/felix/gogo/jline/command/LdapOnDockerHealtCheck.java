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
