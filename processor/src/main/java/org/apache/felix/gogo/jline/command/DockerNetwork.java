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

import java.util.List;

import com.github.dockerjava.api.model.Network;

import picocli.CommandLine.Option;

public class DockerNetwork extends DockerCommand{

    @Option(names = "--network", required = true)
    private String network;

    @Override
    public Object execute() {
    	_init();
    	List<	Network > list =  this.dockerClient.listNetworksCmd().exec();
    	boolean found = false;
    	for (Network n : list){
    		if ( network.equals( n.getName() )){
    			found = true;
    			break;
    		}
    	}
    	if( !found ){
        	this.dockerClient.createNetworkCmd().withName(network).exec();
    	}
        return null;
    }

}
