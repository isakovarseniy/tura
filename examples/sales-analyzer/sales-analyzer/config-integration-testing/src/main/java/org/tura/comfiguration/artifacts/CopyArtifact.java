package org.tura.comfiguration.artifacts;

import java.io.File;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyArtifact<T> {
	
	protected String srcResource;
	protected String targetLocation;
	protected String targetName;
	protected String application;
	protected String serverType;
	
	
	@SuppressWarnings({ "unchecked" })
	public T setApplication(String application) {
		this.application = application;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T setServerType(String serverType) {
		this.serverType = serverType;
		return (T) this;
	}

	
	@SuppressWarnings("unchecked")
	public T setSourceResource(String srcResource) {
		this.srcResource=srcResource;
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T setTargetLocation(String targetLocation) {
		this.targetLocation=targetLocation;
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T setTargetName(String targetName) {
		this.targetName=targetName;
		return (T) this;
	}
	
	
	public void copyFromClassPath() throws Exception {
		InputStream in=null;
		try {
		in  = this.getClass().getClassLoader().getResourceAsStream(srcResource);
		
		File f = new File(targetLocation);
		f.mkdirs();

	    Path to = Paths.get(targetLocation+"/"+targetName);
	    
	    CopyOption[] options = new CopyOption[]{
	    	      StandardCopyOption.REPLACE_EXISTING
	    	    }; 
	    
		Files.copy(in,to,options);
		}finally {
			if (in != null ) {
				in.close();
			}
		}
	}
	
	public void copyFromExternal() throws Exception {
		File f = new File(targetLocation);
		f.mkdirs();

		Path from = Paths.get(srcResource);
	    Path to = Paths.get(targetLocation+"/"+targetName);
	    
	    CopyOption[] options = new CopyOption[]{
	    	      StandardCopyOption.REPLACE_EXISTING
	    	    }; 
	    
		Files.copy(from,to,options);
	}

}
