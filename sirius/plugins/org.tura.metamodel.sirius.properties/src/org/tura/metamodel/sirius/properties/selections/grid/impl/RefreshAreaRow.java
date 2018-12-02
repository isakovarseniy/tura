package org.tura.metamodel.sirius.properties.selections.grid.impl;

import form.AreaRef;
import form.MenuItem;
import form.NickNamed;

public class RefreshAreaRow{
	
	private AreaRef  ref;
	private NickNamed element;
	private String THIS;
	
	public RefreshAreaRow( AreaRef  ref){
		this.ref = ref;
	}
	public RefreshAreaRow( NickNamed  element){
		this.element = element;
	}		
	
	public RefreshAreaRow( NickNamed  element, String THIS ){
		this.element = element;
		this.THIS = THIS;
	}			
	
	public RefreshAreaRow( MenuItem  menuItem, String THIS ){
		this.THIS = THIS;
	}			

	
	
	public void setRef(AreaRef  ref){
		this.ref=ref;
	}
	
	public AreaRef  getRef(){
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
	
	public NickNamed getNickNamed(){
		return element;
	}
	
	public void setNickNamed(NickNamed element){
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
	
	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof RefreshAreaRow)){
			return false;
		}
		RefreshAreaRow r = (RefreshAreaRow) obj;
		return this.getNickName().equals(r.getNickName());
		
	}
	
	
}