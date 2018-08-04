package org.sales.analyzer.services.impl;

import org.tura.salesanalyzer.persistence.keycloak.RoleRef;
import org.tura.salesanalyzer.persistence.keycloak.User;

public class RoleRefAdapter extends RoleRef {

	private String role;
	private User user;

	public RoleRefAdapter(String role) {
		this.role = role;
		idDirectMapping = false;
		userDirectMapping = false;
		roleRefDirectMapping = false;
	}

	public String getObj() {
		return role;
	}

	@Override
	public Object getObject(String event) {
		throw new RuntimeException("Unsupported call");
	}

	@Override
	protected boolean delegateEquals(Object o) {
		if (o instanceof RoleRef) {
			Object pk1 = ((RoleRef) o).getId();
			Object pk2 = this.getId();
			return pk1.equals(pk2);
		}
		return false;
	}

	@Override
	protected String delegateGetId() {
		return role;
	}

	@Override
	protected void delegateSetId(String id) {
		this.role=id;
	}

	@Override
	protected User delegateGetUser() {
		return user;
	}

	@Override
	protected void delegateSetUser(User user) {
		this.user = user;
	}

	@Override
	protected void delegateSetRoleRef(String roleRef) {
		throw new RuntimeException("Prohibited to change primary key");
	}

	@Override
	protected String delegateGetRoleRef() {
		return role;
	}

}
