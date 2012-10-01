package org.elsoft.platform.metamodel.objects.command.security;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.elsoft.platform.metamodel.objects.command.CommandDAO;

@Entity(name = "RoleMapperHolder")
@Table(name = "role_Mapper_holder")
@DiscriminatorValue("ROLEMAPPERHOLDER")
@XmlRootElement
public class CreateRoleMapperHolderDAO extends CommandDAO {

}
