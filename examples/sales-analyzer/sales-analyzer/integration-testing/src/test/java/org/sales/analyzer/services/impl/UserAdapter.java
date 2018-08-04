package org.sales.analyzer.services.impl;

import java.util.ArrayList;

import org.keycloak.representations.idm.UserRepresentation;
import org.tura.salesanalyzer.persistence.keycloak.RoleRef;
import org.tura.salesanalyzer.persistence.keycloak.User;

public class UserAdapter extends User{

	
	private UserRepresentation userRepresentation;

	public UserAdapter(UserRepresentation userRepresentation) {
		this.userRepresentation = userRepresentation;
	  roleReferenceDirectMapping = false;
	}
	
	
	public UserRepresentation getObj() {
		return userRepresentation;
	}
	
	@Override
	public Object getObject(String event) {
		return userRepresentation;
	}

	@Override
	protected boolean delegateEquals(Object o) {
		if (o instanceof User){
			Object pk1 = ((User) o).getId();
			Object pk2 = this.getId();
			return pk1.equals(pk2);
		}
		return false;
	}

	@Override
	protected String delegateGetId() {
		throw new RuntimeException("Unsupported call");
	}

	@Override
	protected void delegateSetId(String id) {
		throw new RuntimeException("Unsupported call");
	}

	@Override
	protected String delegateGetFirstName() {
		throw new RuntimeException("Unsupported call");
	}

	@Override
	protected void delegateSetFirstName(String firstName) {
		throw new RuntimeException("Unsupported call");
	}

	@Override
	protected String delegateGetLastName() {
		throw new RuntimeException("Unsupported call");
	}

	@Override
	protected void delegateSetLastName(String lastName) {
		throw new RuntimeException("Unsupported call");
	}

	@Override
	protected String delegateGetUsername() {
		throw new RuntimeException("Unsupported call");
	}


	@Override
	protected void delegateSetUsername(String username) {
		throw new RuntimeException("Unsupported call");
	}
	
	
	
	@Override
	protected void delegateAddRoleReference(int i, RoleRef obj) {
		if (userRepresentation.getRealmRoles() == null) {
			userRepresentation.setRealmRoles(new ArrayList<>());
		}
		userRepresentation.getRealmRoles().add(obj.getRoleRef());
	}

	@Override
	protected RoleRef delegateRemoveRoleReference(int i) {
		String role = userRepresentation.getRealmRoles().remove(i);
		if (role != null) {
			new RoleRefAdapter(role);
		}
		return null;
	}

	@Override
	protected RoleRef delegateGetRoleReference(int i) {
		String role = userRepresentation.getRealmRoles().get(i);
		if (role != null) {
			new RoleRefAdapter(role);
		}
		return null;
	}

	@Override
	protected int delegateGetRoleReferenceSize() {
		if (userRepresentation.getRealmRoles() == null) {
			return 0;
		}
		return userRepresentation.getRealmRoles().size();
	}



}

