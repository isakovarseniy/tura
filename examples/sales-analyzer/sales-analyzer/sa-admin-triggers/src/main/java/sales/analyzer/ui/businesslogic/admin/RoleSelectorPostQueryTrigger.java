package sales.analyzer.ui.businesslogic.admin;

import java.util.List;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.RoleSelectorArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;


@Alternative
@Priority(10)
@Selector("admin.administration")
@PostQuery("roleSelector")

public class RoleSelectorPostQueryTrigger implements PostQueryTrigger {

	@Inject
	ELResolver elResolver;

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
	    
	    
		DataControl dcRef = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.roleReference}");
		List<Object > ls =   dcRef.getScroller();
		Role role = (Role) obj;
		boolean found = false;
		for (Object o : ls) {
			RoleReference ref = (RoleReference) o;
			if (ref.getRole() !=null && ref.getRole().getId().equals(role.getId())) {
				new RoleSelectorArtifitialFieldsAdapter((ObjectControl) obj).setSelected(true);
				found =true;
				break;
			}
		}
		if (!found) {
		    new RoleSelectorArtifitialFieldsAdapter((ObjectControl) obj).setSelected(false);
		}
	}

}
