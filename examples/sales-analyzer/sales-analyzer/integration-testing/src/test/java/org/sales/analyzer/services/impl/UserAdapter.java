package org.sales.analyzer.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.tura.salesanalyzer.persistence.keycloak.RoleRef;
import org.tura.salesanalyzer.persistence.keycloak.User;

public class UserAdapter extends User {

	private UserRepresentation userRepresentation;
	private List<RoleRef> roles = new ArrayList<>();
	private List<RoleRef> addRoles = new ArrayList<>();
	private List<RoleRef> removeRoles = new ArrayList<>();

	public UserAdapter(UserRepresentation userRepresentation, RealmResource realmResource) {
		this.userRepresentation = userRepresentation;
		if (this.userRepresentation.getId() != null) {
			List<RoleRepresentation> realRoles = realmResource.users().get(this.userRepresentation.getId()).roles()
					.realmLevel().listAll();
			if (realRoles != null) {
				for (RoleRepresentation r : realRoles) {
					roles.add(new RoleRefAdapter(r.getName()));
				}
			}
		}
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
		if (o instanceof User) {
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
		roles.add(obj);
		addRoles.add(obj);
	}

	@Override
	protected RoleRef delegateRemoveRoleReference(int i) {
		RoleRef role = roles.remove(i);
		if (role != null) {
			if (addRoles.contains(role)) {
				addRoles.remove(role);
			} else {
				removeRoles.add(role);
			}
			return role;
		}
		return null;
	}

	@Override
	protected RoleRef delegateGetRoleReference(int i) {
		return roles.get(i);
	}

	@Override
	protected int delegateGetRoleReferenceSize() {
		return roles.size();
	}

	public List<RoleRef> getAddRoles() {
		return addRoles;
	}

	public List<RoleRef> getRemoveRoles() {
		return removeRoles;
	}

}

