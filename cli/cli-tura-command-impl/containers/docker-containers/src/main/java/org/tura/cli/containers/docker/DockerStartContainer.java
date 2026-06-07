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

package org.tura.cli.containers.docker;

import com.github.dockerjava.api.model.Container;


public class DockerStartContainer extends Docker{


   public Object execute(String name,String id ) {
       _init();
       
      if(id!=null){
         dockerClient.startContainerCmd(id).exec();
         return null;
      }
      if(name!=null){
         Container cn=findContainer(name);
         if( cn != null && cn.getStatus().contains("Exited")){
            dockerClient.startContainerCmd(cn.getId()).exec();
            return null;
         }
      }
      throw new IllegalArgumentException("One of parameters name|id should be defined");
   }   
}

