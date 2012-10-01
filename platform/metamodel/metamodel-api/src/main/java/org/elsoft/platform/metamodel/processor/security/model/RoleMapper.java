package org.elsoft.platform.metamodel.processor.security.model;

import org.elsoft.platform.metamodel.objects.command.security.CreateRoleMapperDAO;
import org.elsoft.platform.metamodel.objects.security.ApplicationRoleDAO;
import org.elsoft.platform.metamodel.objects.security.GlobalRoleDAO;

public class RoleMapper extends CreateRoleMapperDAO {

	private GlobalRoleDAO globalRole;
	private ApplicationRoleDAO appRole;
	
	public RoleMapper(CreateRoleMapperDAO role){
		setParentUUID(role.getParentUUID());
		setRefApplicationRole(role.getRefApplicationRole());
		setRefGlobalRole(role.getRefGlobalRole());
		setDomain(role.getDomain());
		setFunctionalDomain(role.getFunctionalDomain());
		setApplication(role.getApplication());
		
	}

	public GlobalRoleDAO getGlobalRole() {
		return globalRole;
	}

	public void setGlobalRole(GlobalRoleDAO globalRole) {
		this.globalRole = globalRole;
	}

	public ApplicationRoleDAO getAppRole() {
		return appRole;
	}

	public void setAppRole(ApplicationRoleDAO appRole) {
		this.appRole = appRole;
	}
	
}
