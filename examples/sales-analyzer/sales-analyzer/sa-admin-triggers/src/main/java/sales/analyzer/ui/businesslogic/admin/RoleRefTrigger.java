package sales.analyzer.ui.businesslogic.admin;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.RoleReferenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

public class RoleRefTrigger  implements PostQueryTrigger {

	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		RoleReference rr =  (RoleReference) obj;
		Role role = rr.getRole();
		User user = rr.getUser();
		
		ObjectControl oc =  (ObjectControl) obj;
		RoleReference r = (RoleReference) oc.getWrappedObject();
		r.setId( user.getUsername()+ "-" +  role.getName());
		
		RoleReferenceArtifitialFieldsAdapter ad = new RoleReferenceArtifitialFieldsAdapter ((ObjectControl) rr);
		if (rr.getRole() != null){
			ad.setRoleName(rr.getRole().getName());
		}
	}

}
