package org.tura.platform.hr.objects;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.tura.platform.persistence.TuraObject;

@Entity(name = "StateDAO")
@Table(name = "STATEDAO")
public class StateDAO extends TuraObject implements Serializable{

	private static final long serialVersionUID = 9170577160751644132L;

	   @Column(name = "STATENAME")
	    private String stateName;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	 	
	
	
}
