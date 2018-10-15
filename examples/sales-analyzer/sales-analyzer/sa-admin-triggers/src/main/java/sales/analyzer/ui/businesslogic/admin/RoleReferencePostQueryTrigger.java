package sales.analyzer.ui.businesslogic.admin;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;



@Alternative
@Priority(10)
@Selector("admin.administration")
@PostQuery("roleReference")

public class RoleReferencePostQueryTrigger extends  RoleRefTrigger {

}