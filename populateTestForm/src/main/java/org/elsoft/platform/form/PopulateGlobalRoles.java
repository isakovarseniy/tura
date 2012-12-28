package org.elsoft.platform.form;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.security.CreateRoleMapperDAO;
import org.elsoft.platform.metamodel.objects.command.security.CreateRoleMapperHolderDAO;
import org.elsoft.platform.metamodel.objects.security.ApplicationRoleDAO;
import org.elsoft.platform.metamodel.objects.security.GlobalRoleDAO;
import org.elsoft.platform.metamodel.objects.suite.ApplicationDAO;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.security.command.CreateRoleMapper;
import org.elsoft.platform.metamodel.processor.security.command.CreateRoleMapperHolder;
import org.elsoft.platform.metamodel.processor.security.model.RoleMapperHolder;
import org.elsoft.platform.metamodel.suite.ApplicationHandler;
import org.elsoft.platform.metamodel.suite.ApplicationRoleHandler;
import org.elsoft.platform.metamodel.suite.GlobalRoleHandler;

public class PopulateGlobalRoles {


	public void execute(RepositoryFactory rf) throws Exception {

		GlobalRoleHandler globalRole = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getGlobalRole();

		GlobalRoleDAO Administrator =  globalRole.addGlobalRole("Administrator");
		GlobalRoleDAO Guest =  globalRole.addGlobalRole("Guest");
		GlobalRoleDAO PowerUser = globalRole.addGlobalRole("Power User");
		GlobalRoleDAO User = globalRole.addGlobalRole("User");

		ApplicationHandler apph = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek();
		ApplicationDAO app = apph.getObject();
		ApplicationRoleHandler arh = apph.getApplicationRole();

		ApplicationRoleDAO administrator =  arh.addApplicationRole("administrator");
		ApplicationRoleDAO guest =  arh.addApplicationRole("guest");
		ApplicationRoleDAO poweruser =  arh.addApplicationRole("power-user");
		ApplicationRoleDAO user =  arh.addApplicationRole("user");
	    
	 
		ArrayList<CommandDAO> program = new ArrayList<CommandDAO>();

		CreateRoleMapperHolderDAO holder = new CreateRoleMapperHolderDAO();
		holder.setUUID("Security_mapping");
		holder.setCommandExecutor(CreateRoleMapperHolder.class.getName());
		program.add(holder);
 	
		CreateRoleMapperDAO roleMap = new CreateRoleMapperDAO();
		roleMap.setParentUUID(holder.getUUID());
		roleMap.setDomain("Manufacturing");
		roleMap.setFunctionalDomain("BackOffice");
		roleMap.setApplication("HR");
		roleMap.setRefGlobalRole(Administrator.getObjId());
		roleMap.setRefApplicationRole(administrator.getObjId());
		roleMap.setCommandExecutor(CreateRoleMapper.class.getName());
		program.add(roleMap);
		
		roleMap = new CreateRoleMapperDAO();
		roleMap.setParentUUID(holder.getUUID());
		roleMap.setDomain("Manufacturing");
		roleMap.setFunctionalDomain("BackOffice");
		roleMap.setApplication("HR");
		roleMap.setRefGlobalRole(PowerUser.getObjId());
		roleMap.setRefApplicationRole(poweruser.getObjId());
		roleMap.setCommandExecutor(CreateRoleMapper.class.getName());
		program.add(roleMap);
		
		roleMap = new CreateRoleMapperDAO();
		roleMap.setParentUUID(holder.getUUID());
		roleMap.setDomain("Manufacturing");
		roleMap.setFunctionalDomain("BackOffice");
		roleMap.setApplication("HR");
		roleMap.setRefGlobalRole(User.getObjId());
		roleMap.setRefApplicationRole(user.getObjId());
		roleMap.setCommandExecutor(CreateRoleMapper.class.getName());
		program.add(roleMap);

		roleMap = new CreateRoleMapperDAO();
		roleMap.setParentUUID(holder.getUUID());
		roleMap.setDomain("Manufacturing");
		roleMap.setFunctionalDomain("BackOffice");
		roleMap.setApplication("HR");
		roleMap.setRefGlobalRole(Guest.getObjId());
		roleMap.setRefApplicationRole(guest.getObjId());
		roleMap.setCommandExecutor(CreateRoleMapper.class.getName());
		program.add(roleMap);

		
		Iterator<CommandDAO> itr = program.iterator();
		HashMap<String, Object> ctx = new Processor().executor(rf, itr);
		
		RoleMapperHolder roleHolder = (RoleMapperHolder) ctx.get("Security_mapping");
		apph.saveRoleMapper(app, roleHolder);
	}

}
