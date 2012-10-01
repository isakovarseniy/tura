package org.elsoft.platform.metamodel.processor.security.model;

import java.util.ArrayList;
import java.util.Iterator;

import org.elsoft.platform.metamodel.objects.command.security.CreateRoleMapperHolderDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.security.command.CreateRoleMapper;
import org.elsoft.platform.metamodel.processor.security.command.CreateRoleMapperHolder;

public class RoleMapperHolder extends CreateRoleMapperHolderDAO {
	private ArrayList<RoleMapper> roles = new ArrayList<RoleMapper>();

	public RoleMapperHolder(CreateRoleMapperHolderDAO cmd) {
		setUUID(cmd.getUUID());
	}

	protected void serialize(CommandHandler ch) throws Exception {
		CreateRoleMapperHolder.save(ch, null, this);
		
		Iterator<RoleMapper> itr = roles.iterator();
		while (itr.hasNext()){
			CreateRoleMapper.save(ch, this.getUUID(), itr.next());
		}
	}

	public void addRoleMapper(RoleMapper role) {
		roles.add(role);
	}

	public ArrayList<RoleMapper> getRoles() {
		return roles;
	}
	
}
