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
