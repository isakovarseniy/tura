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
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.PermissionArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.Permission;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;



@Alternative
@Priority(10)
@Selector("admin.administration")
@PostQuery("permission")

public class PermissionPostQueryTrigger implements PostQueryTrigger{

	@Inject
	ELResolver elResolver;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		DataControl dcRef = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.permissionReferences}");
		List<Object > ls =   dcRef.getScroller();
		Permission perm = (Permission) obj;
		boolean found = false;
		for (Object o : ls) {
			PermissionReferences ref = (PermissionReferences) o;
			if (ref.getPermission() !=null && ref.getPermission().getObjId().equals(perm.getObjId())) {
				new PermissionArtifitialFieldsAdapter((ObjectControl) obj).setSelected(true);
				found =true;
				break;
			}
		}
		if (!found) {
		    new PermissionArtifitialFieldsAdapter((ObjectControl) obj).setSelected(false);
		}
	}

}
