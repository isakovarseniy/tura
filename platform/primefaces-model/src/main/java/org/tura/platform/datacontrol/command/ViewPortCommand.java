package org.tura.platform.datacontrol.command;

public abstract class ViewPortCommand {
	
	protected String port; 
	public  void setCurrentViewPort(String port){
		this.port = port;
	}
	public abstract Object execute(); 

}
