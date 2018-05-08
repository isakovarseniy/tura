package org.tura.platform.object.persistence.operation;

public enum RelEnul {

	One2One(new One2One()),
	One2Many(new One2Many()),
	Many2One(new Many2One()),
	Many2Many(new Many2Many());
	
	
	RelOperation operation ;
	RelEnul(RelOperation operation){
		this.operation = operation;
	}
	
	RelOperation getOperation(){
		return operation;
	}
	
	
}
