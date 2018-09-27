package sales.analyzer.ui.businesslogic.admin;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.PermissionReferencesArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;

@Alternative
@Priority(10)
@Selector("admin.administration")
@PostQuery("permissionReferences")
public class PermissionReferencesPostQueryTrigger implements PostQueryTrigger {

	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		PermissionReferences pr =  (PermissionReferences) obj;
		
		PermissionReferencesArtifitialFieldsAdapter ad = new PermissionReferencesArtifitialFieldsAdapter ((ObjectControl) pr);
		if (pr.getPermission() != null){
			ad.setPermissionDescription(pr.getPermission().getDescription());
			ad.setPermissionName(pr.getPermission().getName());
		}
	}

}
