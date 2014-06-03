/*
         http://wiki.eclipse.org/Equinox_Weaving_QuickStart
         
         Modify "Run"->"Run configuration"  for eclipse RCP Plugin
         Tab   "Arguments" -> "VM arguments"
         
         Run parameters for eclipse 
         -Dosgi.framework.extensions=org.eclipse.equinox.weaving.hook 
         -Daj.weaving.verbose=true 
         -Dorg.aspectj.weaver.showWeaveInfo=true 
         -Dorg.aspectj.osgi.verbose=true

*/
//package org.metamodel.tura;
//
//public aspect Interceptor {
//
//	pointcut setter(org.eclipse.core.internal.resources.ResourceInfo p): target(p) && (call(void setLocalSyncInfo(long)));
//	
//	
//	pointcut setterFileInfo(org.eclipse.core.filesystem.provider.FileInfo f): target(f) && (call(void setLastModified(long)))  ;
//	
//	
//	after(org.eclipse.core.internal.resources.ResourceInfo p): setter(p){
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//	}
//
//	after(org.eclipse.core.filesystem.provider.FileInfo f): setterFileInfo(f){
//		System.out.println( f.getLastModified()+"+++++++++++++++++++++");
//	}
//
//
//}
