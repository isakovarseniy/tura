package org.tura.platform.repository;

import org.tura.platform.datacontrol.ELResolver;

public class ObjectProcessor {

	private ELResolver elResolver;
	private Description description;
	
	public ELResolver getElResolver() {
		return elResolver;
	}
	public void setElResolver(ELResolver elResolver) {
		this.elResolver = elResolver;
	}
	public Description getDescription() {
		return description;
	}
	public void setDescription(Description description) {
		this.description = description;
	}
	
	public Object load(){
		return null;
	}
	
	public void save(){
		
	}
	
}
