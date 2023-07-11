/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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

