package org.elsoft.platform.metamodel.processor.security.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.security.CreateRoleMapperDAO;
import org.elsoft.platform.metamodel.objects.security.ApplicationRoleDAO;
import org.elsoft.platform.metamodel.objects.security.GlobalRoleDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.security.model.RoleMapper;
import org.elsoft.platform.metamodel.processor.security.model.RoleMapperHolder;

public class CreateRoleMapper {
	public static String CREATEROLEMAPPER = "org.elsoft.platform.metamodel.objects.command.security.CreateRoleMapperDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		
		CreateRoleMapperDAO command = (CreateRoleMapperDAO)cmd;
		RoleMapper roleMapper =  new RoleMapper(command);
		
		
		GlobalRoleDAO globalRole = rf.getRoot().cleanSearch()
				.searchString("domainName", command.getDomain()).seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", command.getFunctionalDomain()).seek()
				.getGlobalRole().cleanSearch().searchLong("objId", command.getRefGlobalRole()).getObject();

		roleMapper.setGlobalRole(globalRole);
		
		ApplicationRoleDAO appRole = rf.getRoot().cleanSearch()
				.searchString("domainName", command.getDomain()).seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", command.getFunctionalDomain()).seek()
				.getApplicationHandler().cleanSearch()
			    .searchString("applicationName", command.getApplication()).seek()
                .getApplicationRole().cleanSearch().
				searchLong("objId", command.getRefApplicationRole()).getObject();
		roleMapper.setAppRole(appRole);

		RoleMapperHolder  mapperHolder = (RoleMapperHolder)context.get(command.getParentUUID());
		mapperHolder.addRoleMapper(roleMapper);
		
		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			CreateRoleMapperDAO role) {

		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEROLEMAPPER);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateRoleMapperDAO obj = (CreateRoleMapperDAO) dc.createObject();

		obj.setParentUUID(role.getParentUUID());
		obj.setRefApplicationRole(role.getRefApplicationRole());
		obj.setRefGlobalRole(role.getRefGlobalRole());
		obj.setDomain(role.getDomain());
		obj.setFunctionalDomain(role.getFunctionalDomain());
		obj.setApplication(role.getApplication());
		obj.setCommandExecutor(CreateRoleMapper.class.getName());
		
	}

}
