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
