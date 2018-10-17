package sales.analyzer.commons.service.impl;

import org.tura.salesanalyzer.persistence.keycloak.RoleRef;
import org.tura.salesanalyzer.persistence.keycloak.User;

public class RoleRefAdapter extends RoleRef {

	private String roleRef;
	private User user;
	private String id;
	private String roleId;

	public RoleRefAdapter( String roleRef, String id) {
		this.id = id;
		this.roleRef = roleRef;
		this.roleId = roleRef;
		idDirectMapping = false;
		userDirectMapping = false;
		roleRefDirectMapping = false;
		roleIdDirectMapping = false;
		
	}

	public String getObj() {
		return roleRef;
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
		return id;
	}

	@Override
	protected void delegateSetId(String id) {
		this.id = id;
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
		this.roleRef=roleRef;
	}

	@Override
	protected String delegateGetRoleRef() {
		return roleRef;
	}

	@Override
	protected String delegateGetRoleId() {
		return roleId;
	}

	@Override
	protected void delegateSetRoleId(String roleId) {
		this.roleId = roleId;
	}

}

