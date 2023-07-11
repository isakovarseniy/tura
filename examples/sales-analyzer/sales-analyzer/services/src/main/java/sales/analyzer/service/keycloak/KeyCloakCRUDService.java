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

package sales.analyzer.service.keycloak;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.salesanalyzer.persistence.keycloak.RoleRef;
import org.tura.salesanalyzer.persistence.keycloak.User;

import sales.analyzer.commons.service.impl.UserAdapter;

public class KeyCloakCRUDService extends CRUDProvider{

	private AdapterLoader loader;
	private RealmResource realmResource;
	
	public KeyCloakCRUDService(RealmResource realmResource, SpaObjectRegistry spaRegistry, String registryName, Registry registry) {
		super(spaRegistry, registryName, registry);
		this.realmResource = realmResource;
	}
	
	
	public void setAdapterLoader(AdapterLoader loader) {
		this.loader = loader;
	}

	@Override
	public void execute(SpaControl control) throws Exception {
		if (control.getLevel().equals(OperationLevel.INSERT)) {
			insert(control);
			return;
		}
		if (control.getLevel().equals(OperationLevel.UPDATE)) {
			update(control);
			return;
		}
		if (control.getLevel().equals(OperationLevel.DELETE)) {
			delete(control);
			return;
		}
		throw new Exception("Unknown operation");
		
	}

	private void insert(SpaControl control) throws Exception {
		if (control.getObject() instanceof RoleRepresentation ) {
			insertRole(control);
		}
		if (control.getObject() instanceof User ) {
			insertUser(control);
		}
	}
	
	private void update(SpaControl control) throws Exception {
		if (control.getObject() instanceof RoleRepresentation ) {
			updateRole(control);
		}
		if (control.getObject() instanceof User ) {
			updateUser(control);
		}
	}
	
	private void delete(SpaControl control) throws Exception {
		if (control.getObject() instanceof RoleRepresentation ) {
			deleteRole(control);
		}
		if (control.getObject() instanceof User ) {
			deleteUser(control);
		}
	}
	
	
	private void insertRole(SpaControl control) throws Exception {
		RoleRepresentation role = (RoleRepresentation) control.getObject();
		realmResource.roles().create(role);
		RoleRepresentation createdRole = realmResource.roles().get(role.getName()).toRepresentation();
		role.setId(createdRole.getId());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void insertUser(SpaControl control) throws Exception {
		Map<String,Object> map = (Map) loader.unWrapObject(control.getObject());
		UserRepresentation user = (UserRepresentation) map.get("userRef");
		realmResource.users().create(user);
		List<UserRepresentation> ls = realmResource.users().search(user.getUsername(), null, null, null, 0,1);
		if ( ls == null || ls.size() == 0) {
			throw new RepositoryException("Error during user creation");
		}
		List<String>addRoles = (List<String>) map.get("addRole");
		
		user.setId( ls.get(0).getId());
		
		List <RoleRepresentation> add = new ArrayList<>();
		
		for ( String role : addRoles) {
			RoleRepresentation  rr  = realmResource.rolesById().getRole(role);
			add.add(rr);
		}
		realmResource.users().get(user.getId()).roles().realmLevel().add(add);
		
		ls = realmResource.users().search(user.getUsername(), null, null, null, 0,1);
		user  =  ls.get(0);
		control.setObject(loader.wrapObject(user));

	}
	
	private void updateRole(SpaControl control) throws Exception {
		RoleRepresentation role = (RoleRepresentation) control.getObject();
		realmResource.roles().get(role.getName()).update(role);

	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void updateUser(SpaControl control) throws Exception {
		Map<String,Object> map = (Map) loader.unWrapObject(control.getObject());
		UserRepresentation user = (UserRepresentation) map.get("userRef");
		List<String>addRoles = (List<String>) map.get("addRole");
		List<String>removeRoles = (List<String>) map.get("removeRole");
		realmResource.users().get(user.getId()).update(user);
		
		List <RoleRepresentation> add = new ArrayList<>();
		for ( String role : addRoles) {
			RoleRepresentation  rr  = realmResource.rolesById().getRole(role);
			add.add(rr);
			User u = (User) control.getObject();
			for(  RoleRef rf : u.getRoleReference()) {
				if(rf.getRoleRef().equals(role) ) {
					rf.setId(UserAdapter.roleId(u.getUsername(), rr.getName()));
					rf.setRoleId(rr.getId());
					rf.setRoleRef(rr.getId());
				}
			}
		}
		
		List <RoleRepresentation> remove = new ArrayList<>();
		for ( String role : removeRoles) {
			remove.add(realmResource.rolesById().getRole(role) );
		}
		realmResource.users().get(user.getId()).roles().realmLevel().add(add);
		realmResource.users().get(user.getId()).roles().realmLevel().remove(remove);
	}
	
	private void deleteRole(SpaControl control) throws Exception {
		RoleRepresentation role = (RoleRepresentation) control.getObject();
		realmResource.roles().deleteRole(role.getName());
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void deleteUser(SpaControl control) throws Exception {
		Map<String,Object> map = (Map) loader.unWrapObject(control.getObject());
		UserRepresentation user = (UserRepresentation) map.get("userRef");
		realmResource.users().delete(user.getId());
	}
}

