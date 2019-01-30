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
