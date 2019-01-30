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

import com.github.dockerjava.api.model.Container;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name="startContainer")
public class DockerStartContainer extends DockerCommand{

   @Option(names="--name")
   private String name;

   @Option(names="--id")
   private String id;
   
   @Override
   public void run(){
   	_init();
	   
      if(id!=null){
         dockerClient.startContainerCmd(id).exec();
         return;
      }
      if(name!=null){
         Container cn=findContainer(name);
         if(cn.getStatus().contains("Exited")){
            dockerClient.startContainerCmd(cn.getId()).exec();
            return;
         }
      }
      throw new IllegalArgumentException("One of parameters name|id should be defined");
   }   
}
