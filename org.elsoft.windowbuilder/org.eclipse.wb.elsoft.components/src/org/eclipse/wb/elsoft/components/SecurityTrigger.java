package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.GrantedRoleProperty;
import org.eclipse.e4.xwt.elsoft.types.OperetionTypeProperty;
import org.eclipse.e4.xwt.elsoft.types.RolesProperty;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Layout;

public class SecurityTrigger extends Item {
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

	public Point computeSize(int wHint, int hHint, boolean changed) {
		return new Point(0, 0);
	}

	public Layout getLayout () {
		return null;
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
