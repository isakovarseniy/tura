package sales.analyzer.ui.businesslogic.admin;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.CityRefeenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.CityRefeence;

@Alternative
@Priority(10)
@Selector("admin.administration")
@PostQuery("cityRefeence")

public class CityReferencesPostQueryTrigger  implements PostQueryTrigger{

	@Override
	public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {
		CityRefeence sr = (CityRefeence) obj;
		CityRefeenceArtifitialFieldsAdapter af = new CityRefeenceArtifitialFieldsAdapter( (ObjectControl) obj);
		if (sr.getUser()!= null) {
			af.setFirstName(sr.getUser().getFirstName());
			af.setLastName(sr.getUser().getLastName());
			af.setUserName(sr.getUser().getUsername());
		}
	}

}
