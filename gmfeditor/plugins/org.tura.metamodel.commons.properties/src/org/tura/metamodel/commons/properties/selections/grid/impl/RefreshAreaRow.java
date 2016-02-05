package org.tura.metamodel.commons.properties.selections.grid.impl;

public class RefreshAreaRow{
	
	private domain.AreaRef  ref;
	private domain.NickNamed element;
	private String THIS;
	
	public RefreshAreaRow( domain.AreaRef  ref){
		this.ref = ref;
	}
	public RefreshAreaRow( domain.NickNamed  element){
		this.element = element;
	}		
	
	public RefreshAreaRow( domain.NickNamed  element, String THIS ){
		this.element = element;
		this.THIS = THIS;
	}			
	
	
	public void setRef(domain.AreaRef  ref){
		this.ref=ref;
	}
	
	public domain.AreaRef  getRef(){
		return ref;
	}
	
	public void setTHIS(String THIS){
		this.THIS=THIS;
	}
	
	public String getNickName(){
		if ( THIS != null)
			return THIS;
		
		if (ref == null && element != null) {
			return element.getNickname();
		}
		else{
			return ref.getArea().getNickname();
		}
		
	}
	
	public domain.NickNamed getNickNamed(){
		return element;
	}
	
	public void setNickNamed(domain.NickNamed element){
		this.element=element;;
	}
	
	public int getGroup(){
		if (ref != null)
			return ref.getGroup();
		else 
			return -1;
	}
	
	public void setGroup( int group){
		if (ref != null)
			 ref.setGroup(group);
	}
	
	
	public boolean isRefreshedArea (){
		if (ref != null)
			 return true;
		return false; 
				
	}
	
}