package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.GrantedRoleProperty;
import org.eclipse.e4.xwt.elsoft.types.OperetionTypeProperty;
import org.eclipse.e4.xwt.elsoft.types.RolesProperty;
import org.eclipse.swt.widgets.Composite;

public class SecurityTrigger extends Composite{
	private RolesProperty roles;
	private OperetionTypeProperty operation;
	private GrantedRoleProperty granted;

	
	public SecurityTrigger(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
	}

	


	public OperetionTypeProperty getOperation() {
		return operation;
	}




	public void setOperation(OperetionTypeProperty operation) {
		this.operation = operation;
	}




	public GrantedRoleProperty getGranted() {
		return granted;
	}




	public void setGranted(GrantedRoleProperty granted) {
		this.granted = granted;
	}




	protected void checkSubclass() {
	}

	
	public RolesProperty getRoles() {
		return roles;
	}

	public void setRoles(RolesProperty roles) {
		this.roles = roles;
	}


}
