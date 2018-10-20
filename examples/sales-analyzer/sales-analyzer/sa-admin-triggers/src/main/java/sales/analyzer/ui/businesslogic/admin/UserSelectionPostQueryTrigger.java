package sales.analyzer.ui.businesslogic.admin;

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
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.UserSelectionArtifitialFieldsAdapter;


@Alternative
@Priority(10)
@Selector("admin.administration")
@PostQuery("userSelection")
public class UserSelectionPostQueryTrigger implements PostQueryTrigger {

	@Inject
	ELResolver elResolver;

	
	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
	    new UserSelectionArtifitialFieldsAdapter((ObjectControl) obj).setSelected(false);

		
	}

}
