package sales.analyzer.ui.businesslogic.admin;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.RoleReferenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;



@Alternative
@Priority(10)
@Selector("admin.administration")
@PostQuery("roleReference")

public class RoleReferencePostQueryTrigger implements PostQueryTrigger {

	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		RoleReference rr =  (RoleReference) obj;
		
		RoleReferenceArtifitialFieldsAdapter ad = new RoleReferenceArtifitialFieldsAdapter ((ObjectControl) rr);
		if (rr.getRole() != null){
			ad.setRoleName(rr.getRole().getName());
		}
	}
}